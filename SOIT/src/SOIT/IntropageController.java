package SOIT;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;


public class IntropageController implements Initializable {

    @FXML
    private Pane pnSignUp;
    @FXML
    private ImageView btnToSignIn;
    @FXML
    private Pane pnSignIn;
    @FXML
    private Button btnToSignUp;
    @FXML
    private Button btnGetStarted;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private void handleButtonAction (ActionEvent event) {
        
        if(event.getSource().equals(btnToSignUp)) {
            pnSignUp.toFront();
        }
    }
    
    @FXML
    private void handleMouseEvent (MouseEvent event) {
        
        if(event.getSource().equals(btnToSignIn)) {
            pnSignIn.toFront();
        }
    }
}
