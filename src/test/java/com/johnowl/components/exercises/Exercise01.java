package com.johnowl.components.exercises;

public class Exercise01 {

    public static void main(String[] args) {

        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource(Config.getFilePath());

        ISelection selection = new SelectionComponent();
        selection.connect(dataset);
        selection.setAttribute("diagnostic");
        selection.setOperator("=");
        selection.setValue("bacterial_infection");

        IProjection projection = new ProjectionComponent();
        projection.connect(selection);
        String[] attributes = {"name", "age"};
        projection.setAttributes(attributes);

        IConsole console = new ConsoleComponent();
        console.connect(projection);
        console.update();
    }
}
