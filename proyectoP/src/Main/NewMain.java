/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Random;
import Estructuras.List;
import Estructuras.ListaCircularDE;
import java.io.IOException;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ListIterator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Luci
 */
public class NewMain extends Application {

    /**
     * @param args the command line arguments
     * char na = (char) (r.nextInt(26) + 'a');
            System.out.println(na);
     */
    public static void main(String[] args) {
        Random r= new Random();
        List<String> letras = new ListaCircularDE<>();
        letras.addFirst("1");
        letras.addFirst("2");
        letras.addFirst("3");
        letras.addFirst("4");
        letras.addLast("20");
//        System.out.println(letras.removeFirst());
//        System.out.println(letras.removeLast());
//        System.out.println(letras.addFirst("4"));
//        System.out.println(letras.addLast("20"));
//        letras.add(3, "2,5");
//        letras.remove(4);
//        System.out.println(letras.get(3));
//        System.out.println(letras.set(3,"2.6"));
        letras.movehead(5);
        System.out.println("fIN DEL CODIGO");
        ListIterator<String> s = letras.listIterator();
        for (int i = 0; s != null && s.hasNext() && i < letras.size(); i++) {
            String t = s.next();
            System.out.println(t);
        }
        launch();
    }

    @Override
    public void start(Stage escenario) {
        try {
            Parent p = FXMLLoader.load(getClass().getResource("/Vista/FXML.fxml"));
            Scene sc = new Scene(p);
            escenario.setScene(sc);
            escenario.show();
            escenario.close();

        } catch (IOException ex) {
            System.out.println("gh");
        }

    }

}
