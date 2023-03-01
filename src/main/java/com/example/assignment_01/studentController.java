package com.example.assignment_01;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class studentController implements Initializable {


    /**
     * FXML labels
     */
    @FXML
    private ImageView imageview;

    @FXML
    private Label nameLabel;

    @FXML
    private Label numLabel;

    @FXML

    /**
    * button that shows instance of class
    */
    private void Next(ActionEvent event) {

       student card02 = new student("Bruce", "Wayne", "56789", "Swimming");
       imageview.setImage(card02.getImage());
       nameLabel.setText(card02.toString());
       numLabel.setText(card02.getStudentNum());

   }



   /**
   *instance of class
    */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        student card01 = new student("Aaron", "Girard", "12345", "Coding");
        imageview.setImage(card01.getImage());
        nameLabel.setText(card01.toString());
        numLabel.setText(card01.getStudentNum());


    }
}
