package com.example.stages;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root,Color.BLACK);
        Image icon = new Image("file:/G:/Eight Trimester/AOOP LAB/Stages/src/icon.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Welcome to FX");
        stage.setWidth(420);
        stage.setHeight(420);
//        stage.setX(50);
//        stage.setY(40);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Pless q for escape");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        stage.setScene(scene);
        stage.show();
    }
}
