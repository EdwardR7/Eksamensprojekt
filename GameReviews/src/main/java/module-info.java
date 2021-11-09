module org.openjfx.gamereviews {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.gamereviews to javafx.fxml;
    exports org.openjfx.gamereviews;
}
