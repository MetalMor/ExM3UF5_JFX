package basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Classe que hereta de Application per a desplegar una aplicació FX
 * Stage és el contenidor principal del l'aplicació
 * @author sergi.grau@fje.edu
 * @version 2.0 12/01/2015
 */
public class Salutacio extends Application {
    
    @Override
    public void start(Stage stage) { // stage -> ventana
        stage.setTitle("primera aplicacio FX");
        Button btn = new Button(); // btn -> boton
        btn.setText("salutacio");
        btn.setOnAction(new EventHandler<ActionEvent>() { // listener asigna accion
            
            @Override
            public void handle(ActionEvent event) { // handle -> click
                System.out.println("Hola Mon!");
            }
        });
        
        StackPane arrel = new StackPane(); // arrel -> contenedor dentro de la ventana (StackPane!)
        arrel.getChildren().add(btn); // arrel contiene el boton btn
        
        Scene escena = new Scene(arrel, 300, 250); // contexto de la aplicacion
                                                    // new Scene(StackPane,width,length);
        
        stage.setTitle("Hello World!");
        stage.setScene(escena); // asigna el contexto a la ventana
        stage.show(); // muestra la movida
    }

    /**
     * El mètode main nomès funciona en cas que hi hagi algun problema
     * en el llençament de l'aplicació JavaFX
     * @param args 
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
