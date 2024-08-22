import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TableViewExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TableView Example");

        // Create sample data
        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("John", "Doe", 25),
                new Person("Jane", "Smith", 30),
                new Person("Mike", "Johnson", 28),
                new Person("Emily", "Williams", 22)
        );

        // Create TableView
        TableView<Person> tableView = new TableView<>();
        TableColumn<Person, String> firstNameColumn = new TableColumn<>("First Name");
        TableColumn<Person, String> lastNameColumn = new TableColumn<>("Last Name");
        TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");

        // Bind columns to data model properties
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        tableView.getColumns().addAll(firstNameColumn, lastNameColumn, ageColumn);
        tableView.setItems(data);

        // Create and set up the scene
        Scene scene = new Scene(tableView, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static class Person {
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleIntegerProperty age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = new SimpleStringProperty(firstName);
            this.lastName = new SimpleStringProperty(lastName);
            this.age = new SimpleIntegerProperty(age);
        }

        public String getFirstName() {
            return firstName.get();
        }

        public String getLastName() {
            return lastName.get();
        }

        public int getAge() {
            return age.get();
        }
    }
}
