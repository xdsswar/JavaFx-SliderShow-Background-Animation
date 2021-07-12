# JavaFx SliderShow Background Animation
This is a simple way to create a custom AnchorPane that can change its background image using FadeTransition.
# PS
This is JavaFx 11

# Usage

```java
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
        sliderShow.initSliderShow(2,4);
        //Set the Scene and Show
        stage.setScene(new Scene(sliderShow));
        stage.show();
    }

```

# Tip
If you like you can create the .jar file and import it in Scene Builder to use with fxml.
