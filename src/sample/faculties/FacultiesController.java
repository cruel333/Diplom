package sample.faculties;


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


public class FacultiesController implements Initializable {

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
    @FXML
    Button button7;
    @FXML
    Button button8;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button0.setOnAction(mEventHandler0);
        button1.setOnAction(mEventHandler1);
        button2.setOnAction(mEventHandler2);
        button3.setOnAction(mEventHandler3);
        button4.setOnAction(mEventHandler4);
        button5.setOnAction(mEventHandler5);
        button6.setOnAction(mEventHandler6);
        button7.setOnAction(mEventHandler7);
        button8.setOnAction(mEventHandler8);
    }

    // кнопка назад
    private EventHandler<ActionEvent> mEventHandler0 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/DSTU.fxml"));
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


    private EventHandler<ActionEvent> mEventHandler1 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/KTVTiE/KTVTiE.fxml"));
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

    private EventHandler<ActionEvent> mEventHandler2 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/IE/IE.fxml"));
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


    private EventHandler<ActionEvent> mEventHandler3 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/ISFiA/ISFiA.fxml"));
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


    private EventHandler<ActionEvent> mEventHandler4 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/RTiMT/RTiMT.fxml"));
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

    private EventHandler<ActionEvent> mEventHandler5 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/TF/TF.fxml"));
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

    private EventHandler<ActionEvent> mEventHandler6 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/NGiP/NGiP.fxml"));
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

    private EventHandler<ActionEvent> mEventHandler7 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/AS/AS.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("DSTU");
            stage.setScene(new Scene(root));
            stage.show();
            //строчка ниже скрывает старый экран
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }

    };

    private EventHandler<ActionEvent> mEventHandler8 = (ActionEvent event) -> {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/TDiSE/TDiSE.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("DSTU");
            stage.setScene(new Scene(root));
            stage.show();
            //строчка ниже скрывает старый экран
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }

    };

}