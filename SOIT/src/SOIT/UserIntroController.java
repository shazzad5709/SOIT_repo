/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 * FXML Controller class
 *
 * @author Shazzad
 */
public class UserIntroController implements Initializable {

    @FXML
    private Pane pnUserSignUp;
    @FXML
    private ImageView btnToSignIn;
    @FXML
    private Pane pnUserSignIn;
    @FXML
    private Button btnToSignUp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleMouseEvent(MouseEvent event) {
        if(event.getSource().equals(btnToSignIn)) {
            pnUserSignIn.toFront();
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource().equals(btnToSignUp)) {
            pnUserSignUp.toFront();
        }
    }
    
}
