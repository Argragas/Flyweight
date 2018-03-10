package exemple;

import java.util.HashMap;
import java.util.Map;

/**
 * Fabrique de la classe {@link ObjetSpatial}.
 * @author Argragas
 *
 */
public class PoidsMoucheFactory {
private final String DEBRIS = "DEB";
int compteur = 0;

	private Map<String,IObjetSpatial> listObjSpa = new HashMap<String,IObjetSpatial>();
	


	/**
	 * Instancie un  {@link IObjetSpatial} seulement si listObjSpa ne contient pas une instance avec le même pays et l'ajoute à sa liste d'{@link ObjetSpatialPartage}.
	 * @param pValeur
	 * @param name 
	 * 
	 */
	public IObjetSpatial getObjetSpatial(String paysOrganisation, String name) {

		if(!listObjSpa.containsKey(paysOrganisation)) {	
			if (name.contains(DEBRIS)) {
				listObjSpa.put(paysOrganisation, new ObjetSpacialDebris(paysOrganisation));	
			} else {
				listObjSpa.put(paysOrganisation, new ObjetSpatial(paysOrganisation));
			}
		}else {
			if(DEBRIS.contains(name) &&!(listObjSpa.get(paysOrganisation) instanceof ObjetSpatial)){
			listObjSpa.put(paysOrganisation,  new ObjetSpacialDebris(paysOrganisation));
		}
		}
		nombreDebris(listObjSpa.get(paysOrganisation));
		return listObjSpa.get(paysOrganisation) ;
	}

	private void nombreDebris(IObjetSpatial obj) {
			if (obj.isDebris()) {
				compteur++;
			}				
	}

	public Map<String, IObjetSpatial> getListObjSpa() {
		return listObjSpa;
	}


	public void setListObjSpa(Map<String, IObjetSpatial> listObjSpa) {
		this.listObjSpa = listObjSpa;
	}

	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
}
