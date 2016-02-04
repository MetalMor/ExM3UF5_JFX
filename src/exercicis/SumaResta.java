/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mor
 */
public class SumaResta extends Application {
    
    @Override
    public void start(Stage stage) {
        
        stage.setTitle("SumaResta");
        GridPane graella = new GridPane();
        graella.setAlignment(Pos.CENTER);
        graella.setHgap(10);
        graella.setVgap(10);
        graella.setPadding(new Insets(25, 25, 25, 25));
        
        Text titolEscena = new Text("Suma-Resta");
        titolEscena.setId("titol-escena");
        graella.add(titolEscena, 0, 0, 2, 1);
        
        TextField field1 = new TextField();
        graella.add(field1, 1, 1);
        
        TextField field2 = new TextField();
        graella.add(field2, 1, 2);
        
        Label nombre1 = new Label("Primer terme:");
        graella.add(nombre1, 0, 1);
        
        Label nombre2 = new Label("Segon terme:");
        graella.add(nombre2, 0, 2);
        
        
        
        Button btn1 = new Button();
        btn1.setText("Suma");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int resultat = Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText());
                Text sortida = new Text("Resultat: "+resultat);
                graella.add(sortida, 3, 1);
            }
        });
        graella.add(btn1, 2, 1);
        
        Button btn2 = new Button();
        btn2.setText("Resta");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int resultat = Integer.parseInt(field1.getText()) - Integer.parseInt(field2.getText());
                Text sortida = new Text("Resultat: "+resultat);
                graella.add(sortida, 3, 1);
            }
        });
        graella.add(btn2, 2, 2);
        
        Scene scene = new Scene(graella, 300, 250);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
