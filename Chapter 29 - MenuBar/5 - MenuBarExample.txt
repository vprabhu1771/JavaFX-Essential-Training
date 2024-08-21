package com.example.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the MenuBar
        MenuBar menuBar = new MenuBar();

        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        // Create menu items
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("Exit");

        MenuItem cutMenuItem = new MenuItem("Cut");
        MenuItem copyMenuItem = new MenuItem("Copy");
        MenuItem pasteMenuItem = new MenuItem("Paste");

        MenuItem aboutMenuItem = new MenuItem("About");

        // Add menu items to menus
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem, new SeparatorMenuItem(), exitMenuItem);
        editMenu.getItems().addAll(cutMenuItem, copyMenuItem, pasteMenuItem);
        helpMenu.getItems().addAll(aboutMenuItem);

        // Add menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Create the layout
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Create the scene
        Scene scene = new Scene(root, 400, 300);

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX MenuBar Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
