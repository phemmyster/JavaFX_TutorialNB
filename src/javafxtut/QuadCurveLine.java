/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtut;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author NERSTER-PC
 */
public class QuadCurveLine extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
       Group root = new Group();
       Scene scene = new Scene(root, 600,600,Color.FLORALWHITE);
       
       // first line
        Line line1 = new Line(200,20,300,20);
        line1.setStroke(Color.BLACK);
        root.getChildren().add(line1);
        primaryStage.setTitle("Drawing Lines and Quadcurves!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
