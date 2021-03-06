package com.bg;

import com.bg.sl.NiceSliderShow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * @author XDSSWAR
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //Create few Images
        Image i1=new Image(Objects.requireNonNull(getClass().getResource("/img/1.jpg")).toExternalForm());
        Image i2=new Image(Objects.requireNonNull(getClass().getResource("/img/2.jpg")).toExternalForm());
        Image i3=new Image(Objects.requireNonNull(getClass().getResource("/img/3.jpg")).toExternalForm());
        Image i4=new Image(Objects.requireNonNull(getClass().getResource("/img/4.jpg")).toExternalForm());

        //Create a NiceSliderShow Instance
        NiceSliderShow sliderShow=new NiceSliderShow();
        sliderShow.setImages(i1,i2,i3,i4);
        sliderShow.setPrefHeight(600);
        sliderShow.setPrefWidth(1024);
        //Initialize the SliderShow animation
        sliderShow.initSliderShow(4,4);
        //Set the Scene and Show
        stage.setScene(new Scene(sliderShow));
        stage.show();
    }
}
