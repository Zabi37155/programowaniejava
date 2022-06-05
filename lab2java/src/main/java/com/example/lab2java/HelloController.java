package com.example.lab2java;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button BtnMain;
    int clickCounter = 0;


    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Klikniecie nr " + ++clickCounter);

    }
}