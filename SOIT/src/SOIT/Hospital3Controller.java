package SOIT;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Hospital3Controller implements Initializable {

    @FXML
    private StackPane stkReg;
    @FXML
    private Pane pnRegDone;
    @FXML
    private Button RegDoneToUp;
    @FXML
    private Pane pnReg;
    @FXML
    private ImageView RegToHos;
    @FXML
    private Button RegToRegDone;
    @FXML
    private StackPane stkHU;
    @FXML
    private StackPane stkUp;
    @FXML
    private Pane pnUpDone;
    @FXML
    private Button UpDoneToTable;
    @FXML
    private Pane pnUp;
    @FXML
    private ImageView UpToHos;
    @FXML
    private Button UpToUpDone;
    @FXML
    private Pane pnHos;
    @FXML
    private ImageView HosToHome;
    @FXML
    private Button HosToUp;
    @FXML
    private Button HosToReg;
    @FXML
    private Button HosToTable;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void bHosToReg (ActionEvent event) {
        if(event.getSource().equals(HosToReg)){
            stkReg.toFront();
            pnReg.toFront();
        }
    }

    @FXML
    private void bHosToUp (ActionEvent event) {
        if(event.getSource().equals(HosToUp)){
            stkUp.toFront();
            pnUp.toFront();
        }
    }

    @FXML
    private void bHosToTable (ActionEvent event) {
        if(event.getSource().equals(HosToTable)){
            
        }
    }

    @FXML
    private void backToHos(MouseEvent event) {
    }

    @FXML
    public void mHosToHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void bUpToUpDone (ActionEvent event) {
        pnUpDone.toFront();
    }

    @FXML
    private void mUptoHos (MouseEvent event) {
        pnHos.toFront();
    }

    @FXML
    private void bRegToRegDone (ActionEvent event) {
        pnRegDone.toFront();
    }

    @FXML
    private void mRegToHos (MouseEvent event) {
        stkHU.toFront();
        pnHos.toFront();
    }
    
    @FXML
    private void bRegDoneToUp (ActionEvent event) {
        stkHU.toFront();
        stkUp.toFront();
        pnUp.toFront();
    }
}
