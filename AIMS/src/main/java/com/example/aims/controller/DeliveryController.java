package com.example.aims.controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class DeliveryController{
    @FXML
    CheckBox rushCheckBox;

    @FXML
    protected void mouseClick(){
        if(rushCheckBox.isSelected()){
            SceneController.activate("rush");
        }else{
            SceneController.activate("invoice");
        }
    }
}
