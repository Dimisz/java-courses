module com.example.hithere {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hithere to javafx.fxml;
    exports com.example.hithere;
}