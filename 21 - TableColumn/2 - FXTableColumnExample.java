import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FXTableColumnExample extends Application {

    public static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        // Sample data
        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("John", "Doe"),
                new Person("Jane", "Smith"),
                new Person("Bob", "Johnson")
        );

        // Table columns
        TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        // TableView
        TableView<Person> tableView = new TableView<>();
        tableView.setItems(data);
        tableView.getColumns().addAll(firstNameCol, lastNameCol);

        // Set up the scene
        Scene scene = new Scene(tableView, 300, 200);

        // Set up the stage
        primaryStage.setTitle("JavaFX TableColumn Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
