package com.example.aims.controller;

import javafx.fxml.FXML;

public class InvoiceController{
    @FXML
    protected void mouseClick(){
        SceneController.activate("payment");
    }
}
