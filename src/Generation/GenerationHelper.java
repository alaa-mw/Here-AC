package Generation;

import AST.HTML.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GenerationHelper {


    public static boolean hasNgFor(HtmlElement htmlElement){
        if (htmlElement.getOpenTag() != null && htmlElement.getOpenTag().getHtmlAttributeArray() != null) {
            for (HtmlAttribute attr : htmlElement.getOpenTag().getHtmlAttributeArray()) {
                if (attr instanceof NgFor) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasNgIf(HtmlElement htmlElement){
        for ( HtmlContentBody htmlContentBody: htmlElement.getHtmlContentBody()
             ) {
            if(htmlContentBody.getHtmlElement() != null) {
                for (HtmlAttribute attr : htmlContentBody.getHtmlElement().getOpenTag().getHtmlAttributeArray()) {
                    if (attr instanceof NgIF) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean hasEventBinding(HtmlElement htmlElement){
        if (htmlElement.getOpenTag() != null && htmlElement.getOpenTag().getHtmlAttributeArray() != null) {
            for (HtmlAttribute attr : htmlElement.getOpenTag().getHtmlAttributeArray()) {
                if (attr instanceof EventBinding) {
                    return true;
                }
            }
        }
        return false;
    }
    public static String getIdValueFromHtmlElement(HtmlElement htmlElement) {
        OpenTag openTag = htmlElement.getOpenTag();

        if (openTag.getHtmlAttributeArray() != null) {
            for (HtmlAttribute attr : openTag.getHtmlAttributeArray()) {
                if (attr instanceof BasicAttribute) {
                    BasicAttribute basicAttr = (BasicAttribute) attr;
                    String key = basicAttr.getIdentifier() != null ?
                            basicAttr.getIdentifier() :
                            basicAttr.getC_lass();

                    if ("id".equals(key)) {
                        return basicAttr.getStringLiteral().replace("\"", "");
                    }
                }
            }
        }
        return null; // لم يتم العثور على id
    }

    public static String[] splitNgFor(HtmlElement htmlElement) {

        OpenTag openTag = htmlElement.getOpenTag();

        if (openTag.getHtmlAttributeArray() != null) {
            for (HtmlAttribute attr : openTag.getHtmlAttributeArray()) {
                if (attr instanceof NgFor) {
                    NgFor ngFor = (NgFor) attr;
                    String expr = ngFor.getStringLiteral().replace("\"", "");
                    String[] parts = expr.split("\\s+");
//                    for (String p : parts
//                         ) {
//                        System.out.println(p+"\t");
//
//                    }
                    return parts;
                }
            }
        }
        return null;
    }

    public static String convertKebabToCamel(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] parts = str.split("-");
        return parts[0] + Arrays.stream(parts)
                .skip(1)
                .map(part -> part.substring(0, 1).toUpperCase() + part.substring(1))
                .collect(Collectors.joining());
    }

    public static Pair<String, List<String>> parseMethodCall(String methodCall) {
        // Regex to match method name and parameters
        System.out.println(methodCall);//"goToDetails(product.id)"
        Pattern pattern = Pattern.compile("^(\\w+)\\(([^)]*)\\)$");
        Matcher matcher = pattern.matcher(methodCall.trim());

        if (matcher.find()) {
            String methodName = matcher.group(1);  // e.g., "goToDetails"
            String paramsStr = matcher.group(2);   // e.g., "$event, product.id"

            // Split parameters (handle empty case)
            List<String> params = new ArrayList<>();
            if (!paramsStr.isEmpty()) {
                String[] parts = paramsStr.split("\\s*,\\s*");  // Split by comma + optional whitespace
                for (String param : parts) {
                    params.add(param.trim());
                }
            }

            return new Pair<>(methodName, params);
        } else {
            throw new IllegalArgumentException("Invalid method call format: " + methodCall); // but return exception
        }
    }

    // مساعدة لإزالة علامات الاقتباس من STRING_LITERAL
    public static String stripQuotes(String s) {
        return s.replaceAll("^\"|\"$", "")
                .replaceAll("^'|'$", "");
    }
    public static String PrintSetActiveNav(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("function setActiveNav(navId) {\n");
        sb.append("  document.querySelectorAll('nav a').forEach(x => x.classList.remove('active'));\n");
        sb.append("  if (navId) document.getElementById(navId).classList.add('active');\n");
        sb.append(" }\n\n");
        return sb.toString();
    }

    public static String PrintShowSection(List<String> itemShowSection) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("function showSection(section) {\n");

        sb.append("  [");
        for (int i = 0; i < itemShowSection.size(); i++) {
            sb.append(itemShowSection.get(i));
            if (i < itemShowSection.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("].forEach(s => s.style.display = 'none');\n");

        sb.append("  section.style.display = 'block';\n");
        sb.append("}\n\n");

        return sb.toString();
    }

    public static String parseMethodName(String methodCall) {
        //System.out.println(methodCall);
        Pattern pattern = Pattern.compile("^(\\w+)\\s*\\(");
        Matcher matcher = pattern.matcher(methodCall.trim());

        if (matcher.find()) {
            return matcher.group(1);
        } else {
            throw new IllegalArgumentException("Invalid method call format: " + methodCall);
        }
    }

    public  static String eventListenerShape(Map<String,ComponentModel> componentMap){
        String event = "input";
        String pointer = "e";

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, ComponentModel> entry : componentMap.entrySet()) {
            ComponentModel model = entry.getValue();
            List<ComponentEvent> events = model.getEvents();
            for (ComponentEvent eventModel : events) {
                if(eventModel.getButtonFunction() == null && eventModel.getId() == null){
                    sb.append(eventModel.getReference())
                            .append(".addEventListener('")
                            .append(event)
                            .append("', ")
                            .append(pointer)
                            .append(" => {\n");
                    sb.append("\t").append("formProduct[e.target] = e.target.value;").append("\n");
                    sb.append("  }\n"); // نهاية if
                    sb.append("});\n\n");
                }
            }
        }
        return sb.toString();
    }

    public static String createEventListener(Map<String, ComponentModel> componentMap) {

        String event = "click";
        String pointer = "e";

        StringBuilder sb = new StringBuilder();
        sb.append("\n\n").append("// ===== Generated Event Listener =====").append("\n\n");

        for (Map.Entry<String, ComponentModel> entry : componentMap.entrySet()) {
            ComponentModel model = entry.getValue();

            List<ComponentEvent> events = model.getEvents();

            for (ComponentEvent eventModel : events) {

                // ✅ تحقق من القيم قبل توليد الكود
                if (eventModel.getButtonFunction() == null || eventModel.getId() == null) {
                    continue; // تخطي هذا الحدث ولا تكتب له كود
                }

                sb.append(eventModel.getReference())
                        .append(".addEventListener('")
                        .append(event)
                        .append("', ")
                        .append(pointer)
                        .append(" => {\n");
                sb.append("  if (e.target.id === '").append(eventModel.getId()).append("') {\n");

                String _implements = findImplementByName(model.getFunctions(), eventModel.getButtonFunction());
                sb.append("\t").append(_implements).append("\n");

                sb.append("  }\n"); // نهاية if
                sb.append("});\n\n"); // نهاية addEventListener
            }
        }
        return sb.toString();
    }


    public static String findImplementByName(List<ComponentFunction> functions, String methodName) {
        if (functions == null || methodName == null) {
            return null;
        }

        for (ComponentFunction func : functions) {
            if (func != null && methodName.equals(func.getName())) {
                return func.getImplement();
            }
        }
        return null; // no function founded
    }


    public  static void test(Map<String, ComponentModel> myMap){
        for (Map.Entry<String, ComponentModel> entry : myMap.entrySet()) {
            String jsConst = myMap.get(entry.getKey()).getDomElement().getConstant();
            ComponentModel model = entry.getValue();

            System.out.println("===== test ======\n" + jsConst + "\n methods : " + model.getFunctions() + "\n event " + model.getEvents() );

        }
    }







}
