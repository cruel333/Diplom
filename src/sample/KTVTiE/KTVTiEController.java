package sample.KTVTiE;


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

public class KTVTiEController implements Initializable {

    @FXML
    Button button0;
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button0.setOnAction(mEventHandler);
        button1.setOnAction(mEventHandler1);


    }

    private EventHandler<ActionEvent> mEventHandler = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/faculties/faculties.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("DSTU");
            stage.setScene(new Scene(root1));
            stage.show();
            //строчка ниже скрывает старый экран
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    private EventHandler<ActionEvent> mEventHandler1 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/KTVTiE/courses.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("DSTU");
            stage.setScene(new Scene(root1));
            stage.show();
            //строчка ниже скрывает старый экран
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };


}
