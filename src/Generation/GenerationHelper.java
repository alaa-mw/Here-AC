package Generation;

import AST.HTML.*;

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

}
