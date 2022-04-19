package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import java.io.IOException;


public class AntEaters extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Image anteater1 = new Image("C:\\Users\\chris\\IdeaProjects\\demo\\HelloFX\\src\\main\\java\\com\\example\\hellofx\\images\\anteater.png");

        stage.getIcons().add(anteater1);
        FXMLLoader fxmlLoader = new FXMLLoader(AntEaters.class.getResource("anteaterFXML.fxml"));
        Parent anteaterParent = fxmlLoader.load();
        Scene scene = new Scene(anteaterParent);
        AntEatersController controller = fxmlLoader.getController();

        stage.setTitle("Anteater bruh");
        stage.setResizable(false);

        stage.setWidth(750);
        stage.setHeight(600);
        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}