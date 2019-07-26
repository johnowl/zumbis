package com.johnowl.components.exercises;

public class Config {

    public static String getFilePath() {
        return ClassLoader.getSystemClassLoader()
                .getResource("zombie-health-spreadsheet-ml-training.csv")
                .getPath();
    }

}
