module com.example.gui_v2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gui_v2 to javafx.fxml;
    exports com.example.gui_v2;
}