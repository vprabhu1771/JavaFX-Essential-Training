import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create some sample data
        ObservableList<String> items = FXCollections.observableArrayList(
                "Item 1", 
                "Item 2", 
                "Item 3", 
                "Item 4",
                "Item 5"
        );

        // Create a ListView and set its items
        ListView<String> listView = new ListView<>(items);

        // Create a layout and add the ListView to it
        VBox root = new VBox();
        root.getChildren().add(listView);

        // Create a scene and set the layout as its root
        Scene scene = new Scene(root, 300, 200);

        // Set the scene and show the stage
        primaryStage.setTitle("ListView Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
