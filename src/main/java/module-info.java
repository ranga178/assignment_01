module com.example.assignment_01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.assignment_01 to javafx.fxml;
    exports com.example.assignment_01;
}