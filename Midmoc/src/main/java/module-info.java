module com.cse.midmoc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse.midmoc to javafx.fxml;
    exports com.cse.midmoc;
}