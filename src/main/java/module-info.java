module com.example.wk5memorygame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wk5memorygame to javafx.fxml;
    exports com.example.wk5memorygame;
}