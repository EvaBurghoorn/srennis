package com.plantdetoekomst.srennis;

public class Tree {
    private String treeType;
    private Integer amount;

    public Tree(String treeType, Integer amount) {
        this.treeType = treeType;
        this.amount = amount;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTreeType() {
        return treeType;
    }

    public Integer getAmount() {
        return amount;
    }
}
