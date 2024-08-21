package com.example.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Create a button
        Button button = new Button("Click Me!");


        // Create a layout pane and add the button to it
        StackPane root = new StackPane();

        root.getChildren().add(button);


        // Create a scene using the layout pane
        Scene scene = new Scene(root, 300, 200);


        // Set an event handler for the button
        button.setOnAction(event -> {

            System.out.println("Button clicked! Printing a message...");

        });


        // Set the scene for the primary stage
        primaryStage.setScene(scene);

        primaryStage.setTitle("JavaFX Button Example");


        // Show the stage
        primaryStage.show();
    }
}
