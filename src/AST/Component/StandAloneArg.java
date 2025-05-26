package AST.Component;

import AST.CustomStringBuilder;

public class StandAloneArg implements ComponentArguments {
    private String standAlone;
    private String bool;

    @Override
    public String getNameAttribute(){
        return "standalone";
    };

    public String getStandAlone() {
        return standAlone;
    }

    public void setStandAlone(String standAlone) {
        this.standAlone = standAlone;
    }

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }
    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("StandAloneArg {\n");

        if (standAlone != null) {
            sb.appendTab("standAlone = ").append(standAlone).append("\n");
        }
        if (bool != null) {
            sb.appendTab("bool = ").append(bool).append("\n");
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}

