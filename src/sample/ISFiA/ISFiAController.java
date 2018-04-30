package sample.ISFiA;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ISFiAController implements Initializable{


    @FXML
    Button button0;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button0.setOnAction(mEventHandler0);


    }

    private EventHandler<ActionEvent> mEventHandler0 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/faculties/faculties.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("DSTU");
            stage.setScene(new Scene(root));
            stage.show();
            //строчка ниже скрывает старый экран
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

}
