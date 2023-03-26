package com.example.seedclickerfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SeedClickerFX extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SeedClickerFX.class.getResource("scenebuild.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Seed Clicker FX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}