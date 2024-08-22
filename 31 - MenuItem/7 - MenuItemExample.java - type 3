import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        newMenuItem.setOnAction(new NewMenuItemHandler());
        openMenuItem.setOnAction(new OpenMenuItemHandler());
        saveMenuItem.setOnAction(new SaveMenuItemHandler());
        exitMenuItem.setOnAction(new ExitMenuItemHandler(primaryStage));

        cutMenuItem.setOnAction(new CutMenuItemHandler());
        copyMenuItem.setOnAction(new CopyMenuItemHandler());
        pasteMenuItem.setOnAction(new PasteMenuItemHandler());

        aboutMenuItem.setOnAction(new AboutMenuItemHandler());

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

    private static class NewMenuItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showAlert("New Menu Item Selected");
        }
    }

    private static class OpenMenuItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showAlert("Open Menu Item Selected");
        }
    }

    private static class SaveMenuItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showAlert("Save Menu Item Selected");
        }
    }

    private static class ExitMenuItemHandler implements EventHandler<ActionEvent> {
        private final Stage stage;

        public ExitMenuItemHandler(Stage stage) {
            this.stage = stage;
        }

        @Override
        public void handle(ActionEvent event) {
            stage.close();
        }
    }

    private static class CutMenuItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showAlert("Cut Menu Item Selected");
        }
    }

    private static class CopyMenuItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showAlert("Copy Menu Item Selected");
        }
    }

    private static class PasteMenuItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showAlert("Paste Menu Item Selected");
        }
    }

    private static class AboutMenuItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showAlert("About Menu Item Selected");
        }
    }

    private static void showAlert(String message) {
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
