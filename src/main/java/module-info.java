module ru.bakery.bakery {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bakery.bakery to javafx.fxml;
    exports ru.bakery.bakery;
}