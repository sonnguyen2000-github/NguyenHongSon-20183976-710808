package com.example.aims;

import com.example.aims.controller.SceneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application{
    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("splash.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1366, 768);

        SceneController.bindMain(scene);
        SceneController.addScreen("home", FXMLLoader.load(HelloApplication.class.getResource("home.fxml")));
        SceneController.addScreen("cart", FXMLLoader.load(HelloApplication.class.getResource("cart.fxml")));
        SceneController.addScreen("invoice", FXMLLoader.load(HelloApplication.class.getResource("invoice.fxml")));
        SceneController.addScreen("payment", FXMLLoader.load(HelloApplication.class.getResource("payment.fxml")));
        SceneController.addScreen("payment_result", FXMLLoader.load(HelloApplication.class.getResource("payment_result.fxml")));
        SceneController.addScreen("rush", FXMLLoader.load(HelloApplication.class.getResource("rush.fxml")));
        SceneController.addScreen("delivery", FXMLLoader.load(HelloApplication.class.getResource("shipping.fxml")));

        stage.setTitle("Hello from AIMS!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}