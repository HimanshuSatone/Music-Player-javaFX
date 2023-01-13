package com.example.musicplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class MusicPlayer extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("MainBody.fxml"));
        Scene scene = new Scene(root);

        //Application title and icon
        stage.setTitle("Musify");
        Image icon = new Image(new FileInputStream("C:\\Users\\Himanshu\\IdeaProjects\\MusicPlayer\\src\\main\\ExternalFiles\\icon.jpg"));
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}