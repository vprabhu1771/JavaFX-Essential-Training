import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuItemExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Create a menu bar
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

        // Add event listeners to menu items
        newMenuItem.setOnAction(e -> showAlert("New Menu Item Selected"));
        openMenuItem.setOnAction(e -> showAlert("Open Menu Item Selected"));
        saveMenuItem.setOnAction(e -> showAlert("Save Menu Item Selected"));
        exitMenuItem.setOnAction(e -> primaryStage.close());

        cutMenuItem.setOnAction(e -> showAlert("Cut Menu Item Selected"));
        copyMenuItem.setOnAction(e -> showAlert("Copy Menu Item Selected"));
        pasteMenuItem.setOnAction(e -> showAlert("Paste Menu Item Selected"));

        aboutMenuItem.setOnAction(e -> showAlert("About Menu Item Selected"));

        // Add menu items to menus
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem, exitMenuItem);
        editMenu.getItems().addAll(cutMenuItem, copyMenuItem, pasteMenuItem);
        helpMenu.getItems().addAll(aboutMenuItem);

        // Add menus to menu bar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Add menu bar to the top of the layout
        root.setTop(menuBar);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("JavaFX Menu Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Menu Item Event");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
