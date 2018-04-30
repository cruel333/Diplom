package sample.FMP;



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

public class FMPController implements Initializable {

    @FXML
    Button button0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button0.setOnAction(mEventHandler);
    }


    private EventHandler<ActionEvent> mEventHandler = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/DSTU.fxml"));
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
