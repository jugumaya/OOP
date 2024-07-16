module com.jugumaya.accountant {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jugumaya.gg to javafx.fxml;
    exports com.jugumaya.gg;
}