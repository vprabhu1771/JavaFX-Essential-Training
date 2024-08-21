import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ChoiceBox Example");

        // Create a ChoiceBox and add items
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Option 1", "Option 2", "Option 3", "Option 4");
        
        // Set a default selection
        choiceBox.setValue("Option 1");

        // Create a VBox layout to hold the ChoiceBox
        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox);

        // Create a Scene with the layout
        Scene scene = new Scene(layout, 300, 200);

        // Set the Scene to the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
