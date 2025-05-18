package AST.Component_Declaration;

import AST.CustomStringBuilder;

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
        sb.append("\n");
        if (importArg != null) {
            sb.appendTab("importArg=").append(importArg).append("\n");
        }
        if (templateArg != null) {
            sb.appendTab("templateArg=").append(templateArg).append("\n");
        }
        if (styleArg != null) {
            sb.appendTab("styleArg=").append(styleArg).append("\n");
        }
        if (selectorArg != null) {
            sb.appendTab("selectorArg=").append(selectorArg).append("\n");
        }
        if (standAloneArg != null) {
            sb.appendTab("standAloneArg=").append(standAloneArg).append("\n");
        }
        sb.appendTabCloseScope("}").append("\n");
        return sb.toString();
    }
}
