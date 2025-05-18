package AST.HTML;

import AST.CustomStringBuilder;

import java.util.ArrayList;

public class ImageAttribute {
     private String imageSrc;
     private String stringLiteral;
     private ArrayList<BasicAttribute> basicAttribute = new ArrayList<BasicAttribute>();//optional

     public String getImageSrc() {
          return imageSrc;
     }

     public void setImageSrc(String imageSrc) {
          this.imageSrc = imageSrc;
     }

     public String getStringLiteral() {
          return stringLiteral;
     }

     public void setStringLiteral(String stringLiteral) {
          this.stringLiteral = stringLiteral;
     }

     public ArrayList<BasicAttribute> getBasicAttribute() {
          return basicAttribute;
     }

     public void setBasicAttribute(ArrayList<BasicAttribute> basicAttribute) {
          this.basicAttribute = basicAttribute;
     }

     @Override
     public String toString() {
          CustomStringBuilder sb = new CustomStringBuilder();
          sb.appendTabOpenScope("ImageAttribute{").append('\n');

          if (imageSrc != null) {
               sb.appendTab("imageSrcKeyword=").append(imageSrc).append("\n");
          }

          if (stringLiteral != null) {
               sb.appendTab("imageSrcValue=").append(stringLiteral).append("\n");
          }

          if (!basicAttribute.isEmpty() && basicAttribute != null ) {
               sb.append(basicAttribute);
          }

          sb.appendTabCloseScope("}").append('\n');
          return sb.toString();
     }

}
