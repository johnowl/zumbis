package com.johnowl.components.exercises;

public interface IStatisticsProperties {

    int getSize();

    double[] getValueSet();

    void setValueSet(double[] valueSet);

    double getValueSet(int index);

    void setValueSet(int index, double value);

}
