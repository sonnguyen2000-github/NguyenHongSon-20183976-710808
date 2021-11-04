package com.example.aims.controller;

import javafx.fxml.FXML;

public class HomeController{
    @FXML
    protected void mouseClick(){
        SceneController.activate("cart");
    }
}
