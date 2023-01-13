package com.example.musicplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private Button nextButton;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button pauseButton;

    @FXML
    private Button playButton;

    @FXML
    private Button previousButton;

    @FXML
    private Button resetButton;

    @FXML
    private Label songLabel;

    @FXML
    private ProgressBar songProgressBar;

    @FXML
    private ComboBox<?> speedBox;

    @FXML
    private Slider volumeSlider;

    public void playMedia(ActionEvent event) {

    }

    public void pauseMedia(ActionEvent event) {

    }

    public void resetMedia(ActionEvent event) {

    }

    public void previousMedia(ActionEvent event) {

    }

    public void changeSpeed(ActionEvent event) {

    }

    public void nextMedia(ActionEvent event) {

    }

    public void beginTimer(){

    }

    public void cancelTimer(){


    }
}
