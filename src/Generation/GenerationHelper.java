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
        if (htmlElement.getOpenTag() != null && htmlElement.getOpenTag().getHtmlAttributeArray() != null) {
            for (HtmlAttribute attr : htmlElement.getOpenTag().getHtmlAttributeArray()) {
                if (attr instanceof NgIF) {
                    return true;
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
    public static String skipIdentifier(String identifier){
        String id=identifier;
        if(identifier.contains("Subject"))
            id=id.replace("Subject", "");
        if(identifier.contains("next"))
            id=id.replace("next","=");
        if(identifier.contains("value"))
            id=id.replace("value","");
        return id;
    }

    public static boolean skipDot(String identifier){
        if(identifier.contains("Subject"))
            return false;
        if(identifier.contains("next"))
            return false;
        if(identifier.contains("value"))
            return false;
        return true;
    }




}
