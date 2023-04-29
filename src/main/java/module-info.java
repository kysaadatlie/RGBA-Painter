module com.example.rgbapainter {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.rgbapainter to javafx.fxml;
    exports com.example.rgbapainter;
}