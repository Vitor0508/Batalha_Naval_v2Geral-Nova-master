package bat;

import java.util.ArrayList;
import java.util.List;

import Model.Acertou;
import Model.Barco;
import Model.Couracado;
import Model.PortaAviao;
import Model.Posiciona;
import Model.Submarino;
import Model.Tabuleiro;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// import java.io.IOException;

public class App {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Posiciona posiciona = new Posiciona();
        Acertou acertou = new Acertou();

        Submarino submarino1 = new Submarino();
        Couracado couracado1 = new Couracado();
        PortaAviao portaAviao = new PortaAviao();

        Submarino submarino2 = new Submarino();
        Couracado couracado2 = new Couracado();

        Submarino submarino3 = new Submarino();

        ArrayList<Barco> barcos = new ArrayList<Barco>();

        barcos.add(submarino1);
        barcos.add(submarino2);
        barcos.add(submarino3);
        barcos.add(couracado1);
        barcos.add(couracado2);
        barcos.add(portaAviao);

        posiciona.setTabuleiro(tabuleiro);
        acertou.setTabuleiro(tabuleiro);
        acertou.setBarcos(barcos);

    
        posiciona.posicionaBarcovertical(submarino1, 5, 5);

        acertou.acertou(5, 5);
        acertou.acertou(5, 5);


        tabuleiro.mostrarTabuleiro();

    }

}

/**
 * JavaFX App
 */
// //public class App extends Application {

// // private static Scene scene;

// // @Override
// // public void start(Stage stage) throws IOException {
// // scene = new Scene(loadFXML("primary"), 640, 480);
// // stage.setScene(scene);
// // stage.show();
// // }

// // public static void setRoot(String fxml) throws IOException {
// // scene.setRoot(loadFXML(fxml));
// // }

// // private static Parent loadFXML(String fxml) throws IOException {
// // FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml +
// // ".fxml"));
// // return fxmlLoader.load();
// // }

// // public static void main(String[] args) {
// // launch();
// // }

// // }