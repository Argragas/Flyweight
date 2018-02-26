package exemple;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import exemple.tools.Fichier;

public class FlyweightPatternMain {
	
	static PoidsMoucheFactory flyweightFactory = new PoidsMoucheFactory();

	static List<IObjetSpatial> listLourde = new ArrayList<IObjetSpatial>();

	public static void main(String[] args) {
		
		// Instancie la fabrique
		testByFile("src\\exemple\\resources\\OnOrbitByNorad.csv");
		testByFile("src\\exemple\\resources\\NotOnOrbitByNorad.csv");
		testByFile("src\\exemple\\resources\\ObjSpatial.csv");
		

	}
	
	public static void testByFile(String filePath) {
		listLourde.clear();
		//InitFichier
				final File file = Fichier.getResource(filePath);
				List<String> lines = Fichier.readFile(file);

				
				long startTime = System.nanoTime();
				// Here is the code to measure
				for (String obj : lines) {
					flyweightFactory.getObjetSpatial(obj.split(",")[2]);
				}
				// stop stopwatch
				long endTime = System.nanoTime();
				
				
				System.out.println("Méthode avec FleyWeight : " + (endTime - startTime) + " ns");	


				startTime = System.nanoTime();
				// Here is the code to measure
				for (String objBis : lines) {
					listLourde.add(new ObjetSpacialPartage(objBis.split(",")[2]));
				}
				endTime = System.nanoTime();
				
				
				System.out.println("méthode classique : " + (endTime - startTime) + " ns");
				System.out.println("---");
				System.out.println("Taille Map : "+flyweightFactory.getListObjSpa().size());
				System.out.println("Taille MapBis : "+ listLourde.size());
				System.out.println("********************");
		
	}
}