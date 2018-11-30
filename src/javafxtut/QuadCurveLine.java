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
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
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
        
        // second line : incline line
        Line line2 = new Line(200,20,180,100);
        line2.setStroke(Color.BLACK);
        root.getChildren().add(line2);
        
        // third line : incline line
         Line line3 = new Line(300,20,320,100);
        line3.setStroke(Color.BLACK);
        root.getChildren().add(line3);
        
        // quadcurve
        QuadCurve curve = new QuadCurve(180,100,245,50,320,100); // start x,y control x,y, end x,y!
        curve.setStroke(Color.BLACK);
        curve.setFill(Color.FLORALWHITE);
//        curve.setStartX(180);  // can make this one line of code 
//        curve.setStartY(100);
//        curve.setControlX(245);
//        curve.setControlY(50);
//        curve.setEndX(320);
//        curve.setEndY(100);
        root.getChildren().add(curve);   
        
       // Ecllipse face
       Ellipse face = new Ellipse(250,115,55,45);
       face.setStroke(Color.BLACK);
       face.setFill(Color.YELLOW);
//       face.setCenterX(250);
//        face.setCenterY(115);
//        face.setRadiusX(55);
//        face.setRadiusY(45);
        root.getChildren().add(face);
        
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
