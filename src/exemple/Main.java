

public class FlyweightPatternMain {
    
 public static void main(String[] args) {
          System.out.println(" LET IT GO ");
 // Instancie la fabrique
 PoidsMoucheFabrique lFlyweightFactory = new PoidsMoucheFabrique();


//InitFichier
    final File file = CsvFileHelper.getResource("resources/OnOrbitByNorad.csv");
    List<String> lines = CsvFileHelper.readFile(file);
    
     System.out.println(" list : "+lines.size());
 }
}