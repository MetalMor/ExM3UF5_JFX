package css;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Classe que implementa un login mitjançant JavaFX
 * explicació de la distribució del GridPane 
 * http://docs.oracle.com/javase/8/javafx/get-started-tutorial/img/login_gridlines_co.png
 * @author sergi grau
 * @version 1.0 8/02/2014
 */

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Login");
        GridPane graella = new GridPane(); // tabla marranota (remember HTML-5)
        graella.setAlignment(Pos.CENTER);
        graella.setHgap(10); // margen horizontal
        graella.setVgap(10); // margen vertical
        graella.setPadding(new Insets(25, 25, 25, 25)); // proporciones de la tabla
        // graella.setGridLinesVisible(true); // muestra el "esqueleto" de la tabla, en plan "inspecionar elemento" en mozilla

        
        // COLOCA LAS COSAS BUGERAMENTE EN FILAS/COLUMNAS COMO UN <tr><td> MARRANOTE
        Text titolEscena = new Text("Login"); // para poner textos
        titolEscena.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        graella.add(titolEscena, 0, 0, 2, 1);

        Label etiquetaUsuari = new Label("nom usuari:");
        graella.add(etiquetaUsuari, 0, 1);

        TextField campTextUsuari = new TextField(); // campo de texto libre para escribir
        graella.add(campTextUsuari, 1, 1);

        Label etiquetaPassword = new Label("Password:");
        graella.add(etiquetaPassword, 0, 2);

        PasswordField campPassword = new PasswordField(); // campo de contraseñas
        graella.add(campPassword, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10); // contenedor horizontal
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        graella.add(hbBtn, 1, 4);

        final Text textMissatge = new Text();
        graella.add(textMissatge, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                textMissatge.setFill(Color.RED);
                textMissatge.setText("En procés...");
            }
        });

        Scene escena = new Scene(graella, 300, 275);
        stage.setScene(escena);
        stage.show();
    }
}
