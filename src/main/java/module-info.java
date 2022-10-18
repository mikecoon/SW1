module mc.sw1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mc.sw1 to javafx.fxml;
    exports mc.sw1;
}