package com.example.djixtrycanvas;

import engine.Start;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloDijxtry extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloDijxtry.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        Start startcalc = new Start();

        //importowanie controllera
        DijxtryController dc = fxmlLoader.getController();
        dc.draw(startcalc.start());

    }

    public static void main(String[] args) {
        launch();
    }
}