package com.example.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DatePickerExample extends Application {

    @Override
    public void start(Stage primaryStage) {


        // Create a DatePicker
        DatePicker datePicker = new DatePicker();


        // Create a layout pane and add the DatePicker to it
        StackPane root = new StackPane();

        root.getChildren().add(datePicker);


        // Create a scene using the layout pane
        Scene scene = new Scene(root, 300, 200);


        // Set the scene in the stage
        primaryStage.setScene(scene);


        // Set the title of the stage
        primaryStage.setTitle("DatePicker Example");


        // Show the stage
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}