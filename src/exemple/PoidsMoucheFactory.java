package exemple;

import java.util.HashMap;
import java.util.Map;

/**
 * Fabrique de la classe {@link ObjetSpatial}.
 * @author Argragas
 *
 */
public class PoidsMoucheFactory {


	private Map<String,IObjetSpatial> listObjSpa = new HashMap<String,IObjetSpatial>();
	private Map<String, IObjetSpatial> listObjSpaNonPartage = new HashMap<String,IObjetSpatial>();;


	/**
	 * Instancie un  {@link IObjetSpatial} seulement si listObjSpa ne contient pas une instance avec le même pays et l'ajoute à sa liste d'{@link ObjetSpatialPartage}..
	 * @param pValeur
	 * 
	 */
	public void getObjetSpatial(String pValeur) {

		if(!listObjSpa.containsKey(pValeur)) {
			final IObjetSpatial nouveauIObjetSpatial = new ObjetSpacialPartage(pValeur);
			listObjSpa.put(pValeur, nouveauIObjetSpatial);	
		}
	}


/**
 * Instancie un {@link ObjetSpacialNonPartage} et l'ajoute à sa liste d'{@link ObjetSpatialNonPartage}.
 * @param pays
 * @param commentaire
 *
 */
	public void getObjetSpatialNonPartage(String pays, String commentaire) {
		 listObjSpaNonPartage.put(pays, new ObjetSpacialNonPartage( pays, commentaire));
		
	}
	
	
	public Map<String,IObjetSpatial> getListObjSpa() {
		return listObjSpa;
	}


	public Map<String, IObjetSpatial> getListObjSpaNonPartage() {
		return listObjSpaNonPartage;
	}

	public void setListObjSpaNonPartage(Map<String, IObjetSpatial> listObjSpaNonPartage) {
		this.listObjSpaNonPartage = listObjSpaNonPartage;
	}

	public void setListObjSpa(Map<String, IObjetSpatial> listObjSpa) {
		this.listObjSpa = listObjSpa;
	}

	
	
}
