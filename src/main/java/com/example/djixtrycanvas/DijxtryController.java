package com.example.djixtrycanvas;

import engine.Cities;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;

import java.util.ArrayList;

public class DijxtryController {
    @FXML
    private Canvas canvas;
    public void draw(ArrayList<Cities> temp ){
        var gc = canvas.getGraphicsContext2D();
        gc.beginPath();
        gc.moveTo(temp.get(0).getX(),temp.get(0).getY());
        for (Cities x : temp){
            gc.lineTo(x.getX(),x.getY());
            gc.stroke();
        }

    }


}