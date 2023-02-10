module com.example.anteater {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anteater to javafx.fxml;
    exports com.example.anteater;
}