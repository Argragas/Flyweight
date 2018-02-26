package exemple;

import java.util.HashMap;
import java.util.Map;

public class PoidsMoucheFactory {


	private Map<String,IObjetSpatial> listObjSpa = new HashMap<String,IObjetSpatial>();


	public void initFactory(){


	}

	/**
	 * Retourne un "PoidsMouche" partagé
	 * Si la valeur passé en paramètre
	 * correspond à un "PoidsMouche" partagé déjà existant,
	 * on le retourne.
	 * Sinon on crée une nouvelle instance,
	 * on la stocke et on la retourne.
	 * @param pValeur Valeur du "PoidsMouche" désiré
	 * @return un "PoidsMouche"
	 */
	public IObjetSpatial getObjetSpatial(String pValeur) {

		if(listObjSpa.containsKey(pValeur)) {
			// System.out.println("--> Retourne un PoidsMouche (" + pValeur + ") partagé déjà existant");
			return listObjSpa.get(pValeur);
		}
		else {
			// System.out.println("--> Retourne un PoidsMouche (" + pValeur +  ") partagé non déjà existant");
			final IObjetSpatial nouveauIObjetSpatial = new ObjetSpacialPartage(pValeur);
			listObjSpa.put(pValeur, nouveauIObjetSpatial);

			return nouveauIObjetSpatial;
		}
	}


	public Map<String,IObjetSpatial> getListObjSpa() {
		return listObjSpa;
	}

}
