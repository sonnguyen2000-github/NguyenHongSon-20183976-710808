module com.example.aims {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aims to javafx.fxml;
    exports com.example.aims;
    opens com.example.aims.controller to javafx.fxml;
    exports com.example.aims.controller;
}