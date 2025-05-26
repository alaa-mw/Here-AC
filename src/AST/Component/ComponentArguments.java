package AST.Component;

import AST.CustomStringBuilder;
/*
public class ComponentArguments {
      private ImportArg importArg;
      private TemplateArg templateArg;
      private  StyleArg styleArg;
      private SelectorArg selectorArg ;
      private StandAloneArg standAloneArg;

    public ImportArg getImportArg() {
        return importArg;
    }

    public void setImportArg(ImportArg importArg) {
        this.importArg = importArg;
    }

    public TemplateArg getTemplateArg() {
        return templateArg;
    }

    public void setTemplateArg(TemplateArg templateArg) {
        this.templateArg = templateArg;
    }

    public StyleArg getStyleArg() {
        return styleArg;
    }

    public void setStyleArg(StyleArg styleArg) {
        this.styleArg = styleArg;
    }

    public SelectorArg getSelectorArg() {
        return selectorArg;
    }

    public void setSelectorArg(SelectorArg selectorArg) {
        this.selectorArg = selectorArg;
    }

    public StandAloneArg getStandAloneArg() {
        return standAloneArg;
    }

    public void setStandAloneArg(StandAloneArg standAloneArg) {
        this.standAloneArg = standAloneArg;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("ComponentArguments {\n");

        if (importArg != null)
            sb.append(importArg);

        if (templateArg != null)
            sb.append(templateArg);

        if (styleArg != null)
            sb.append(styleArg);

        if (selectorArg != null)
            sb.append(selectorArg);

        if (standAloneArg != null)
            sb.append(standAloneArg);

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}*/
public interface ComponentArguments{

public String getNameAttribute();


}
