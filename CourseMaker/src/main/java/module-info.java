module com.studentcoursemaker.coursemaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.studentcoursemaker.coursemaker to javafx.fxml;
    exports com.studentcoursemaker.coursemaker;
}