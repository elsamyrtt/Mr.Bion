module com.main.iguanan {
    requires transitive java.logging;
    requires org.lwjgl;
    requires org.lwjgl.glfw;
    requires org.lwjgl.opengl;
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
    
    opens com.main.iguanan to javafx.fxml;
    exports com.main.iguanan;
}
