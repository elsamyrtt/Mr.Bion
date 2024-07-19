module com.main.iguanan {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;

    opens com.main.iguanan to javafx.fxml;
    exports com.main.iguanan;
}
