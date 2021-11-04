package com.example.aims.controller;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

public class SceneController{
    static private final HashMap<String, Pane> screenMap = new HashMap<>();
    static private Scene main;

    public static void bindMain(Scene main){
        SceneController.main = main;
    }

    public static void addScreen(String name, Pane pane){
        screenMap.put(name, pane);
    }

    public static void removeScreen(String name){
        screenMap.remove(name);
    }

    public static void activate(String name){
        main.setRoot(screenMap.get(name));
    }
}
