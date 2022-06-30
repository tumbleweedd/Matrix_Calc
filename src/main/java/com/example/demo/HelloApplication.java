package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primatyStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("d.fxml"));
        primatyStage.setScene(new Scene(root, 876, 606));
        primatyStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}