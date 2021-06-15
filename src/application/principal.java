package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class principal {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="play"
    private Button play; // Value injected by FXMLLoader

    @FXML // fx:id="settings"
    private Button settings; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert play != null : "fx:id=\"play\" was not injected: check your FXML file 'Untitled'.";
        assert settings != null : "fx:id=\"settings\" was not injected: check your FXML file 'Untitled'.";
        
    }
}