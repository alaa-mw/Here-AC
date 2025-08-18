package Generation;

import AST.HTML.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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




}
