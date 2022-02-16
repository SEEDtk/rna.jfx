module org.theseed.rna.jfx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens org.theseed.rna.jfx to javafx.fxml;
    exports org.theseed.rna.jfx;
}
