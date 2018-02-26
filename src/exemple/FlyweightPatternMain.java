package exemple;


import java.io.File;
import java.util.List;
import  exemple.Fichier;

public class FlyweightPatternMain {
    
 public static void main(String[] args) {
          System.out.println(" LET IT GO ");
 // Instancie la fabrique
          PoidsMoucheFactory lFlyweightFactory = new PoidsMoucheFactory();


//InitFichier
    final File file = Fichier.getResource("src\\resources\\OnOrbitByNorad.csv");
    List<String> lines = Fichier.readFile(file);
    
     System.out.println(" list : "+lines.size());
 }
}