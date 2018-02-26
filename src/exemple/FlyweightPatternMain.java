package exemple;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import exemple.tools.Fichier;

/**
 * Class Main du projet.
 * @author Argragas
 *
 */
public class FlyweightPatternMain {
	
	static PoidsMoucheFactory flyweightFactory = new PoidsMoucheFactory();

	static List<IObjetSpatial> listLourde = new ArrayList<IObjetSpatial>();
	static File file;
	static List<String> lines;
	static long startTime;
	static long endTime;

	
	/**
	 * M�tode main du projet.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//lancment traitement par fichier de test
		testByFile("src\\exemple\\resources\\OnOrbitByNorad.csv");
		testByFile("src\\exemple\\resources\\NotOnOrbitByNorad.csv");
		testByFile("src\\exemple\\resources\\ObjSpatial.csv");
		

	}
	
	/**
	 * Traite le fichier dont le chemin est donn� en param�tre.
	 * Chaque ligne du fichier repr�sente un IObjetSpatial. Pour chaque ligne, la fabrique instancie un nouvel objet seulement si sa liste d'IObjetSpatial ne contient aucune instance dont le param�tre pays est �gal au param�tre donn�.
	 * @param filePath
	 */
	public static void testByFile(String filePath) {
		listLourde.clear();
		//InitFichier
				file = Fichier.getResource(filePath);
				lines = Fichier.readFile(file);

				
				startTime = System.nanoTime();
				// Here is the code to measure
				for (String obj : lines) {
					if (obj.split(",").length <= 4) {
						flyweightFactory.getObjetSpatial(obj.split(",")[2]);
					} else {						
						flyweightFactory.getObjetSpatialNonPartage(obj.split(",")[2],obj.split(",")[4]);
					}
					
				}
				// stop stopwatch
				endTime = System.nanoTime();
				
				
				System.out.println("M�thode avec FleyWeight : " + (endTime - startTime) + " ns");	


				startTime = System.nanoTime();
				// Here is the code to measure
				for (String objBis : lines) {
					listLourde.add(new ObjetSpacialPartage(objBis.split(",")[2]));
				}
				endTime = System.nanoTime();
				
				
				System.out.println("m�thode classique : " + (endTime - startTime) + " ns");
				System.out.println("--------------------");
				System.out.println("Taille Map : "+flyweightFactory.getListObjSpa().size());
				System.out.println("Taille MapBis : "+ listLourde.size());
				System.out.println("Taille MapNonPartag� : "+ flyweightFactory.getListObjSpaNonPartage().size());
				System.out.println("********************");
		
	}
}