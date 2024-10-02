module sherrc._325_tipcalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens sherrc._325_tipcalc to javafx.fxml;
    exports sherrc._325_tipcalc;
}