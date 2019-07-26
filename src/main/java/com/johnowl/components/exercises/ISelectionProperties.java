package com.johnowl.components.exercises;

public interface ISelectionProperties {
    String getAttribute();
    void setAttribute(String attributeA);
    String getOperator();
    void setOperator(String operator);
    String getValue();
    void setValue(String value);
    boolean isNominalComparison();
    void setNominalComparison(boolean nominalComparison);
}
