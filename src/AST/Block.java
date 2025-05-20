package AST;

import AST.Property.BlockProperty;

import java.util.ArrayList;
import java.util.List;

public class Block {
    public List<BlockProperty> blockProperties = new ArrayList<>();
    public List<CommonStatement> commonStatements = new ArrayList<>();

    public List<ReturnStatement> returnStatements = new ArrayList<>();

    public List<BlockProperty> getBlockProperties() {
        return blockProperties;
    }

    public void setBlockProperties(List<BlockProperty> blockProperties) {
        this.blockProperties = blockProperties;
    }

    public List<CommonStatement> getCommonStatements() {
        return commonStatements;
    }

    public void setCommonStatements(List<CommonStatement> commonStatements) {
        this.commonStatements = commonStatements;
    }

    public List<ReturnStatement> getReturnStatements() {
        return returnStatements;
    }

    public void setReturnStatements(List<ReturnStatement> returnStatements) {
        this.returnStatements = returnStatements;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("Block {\n");

        if (blockProperties != null && !blockProperties.isEmpty()) {
            sb.append(blockProperties);
        }

        if (commonStatements != null && !commonStatements.isEmpty()) {
            sb.append(commonStatements);
        }

        if (returnStatements != null && !returnStatements.isEmpty()) {
            sb.append(returnStatements);
        }

        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }

}
