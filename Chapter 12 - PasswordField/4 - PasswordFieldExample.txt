package com.example.helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordFieldExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Login Form");

        VBox root = new VBox(10);

        root.setPadding(new Insets(10));


        // Create a label for the username field
        Label usernameLabel = new Label("Username");

        root.getChildren().add(usernameLabel);



        // Create a text field for the username field
        TextField usernameTextField = new TextField();

        usernameTextField.setPrefWidth(200);

        root.getChildren().add(usernameTextField);



        // Create a label for the password field
        Label passwordLabel = new Label("Password");

        root.getChildren().add(passwordLabel);


        // Create a password field for the password field
        PasswordField passwordField = new PasswordField();

        passwordField.setPrefWidth(200);

        root.getChildren().add(passwordField);


        // Create a login button
        Button loginButton = new Button("Login");

        root.getChildren().add(loginButton);


        // Add a handler for the login button
        loginButton.setOnAction(event -> {

            String username = usernameTextField.getText();
            String password = passwordField.getText();

            if (username.equals("admin") &&
                    password.equals("admin"))
            {
                System.out.println("Login successful!");
            }
            else
            {
                System.out.println("Login failed.");
            }

        });

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}