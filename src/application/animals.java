/**
 * Sample Skeleton for 'Untitled' Controller Class
 */
package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class animals {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	System.out.println("The initialization is complete");
    	System.out.println();
    }
}
