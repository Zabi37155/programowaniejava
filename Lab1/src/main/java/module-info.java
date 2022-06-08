module pl.lublin.wsei.java.cwiczenia.lab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.lab1 to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab1;
}