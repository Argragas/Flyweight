
import java.util.Hashtable;
/**
* Fabrique de PoidsMouche
*/
public class PoidsMoucheFabrique {
 // Tableau des "PoidsMouche" partagés
 private Hashtable<String, ConcretePoidsMouche> poidsMouchesPartages =
 new Hashtable<String, ConcretePoidsMouche>();

 PoidsMoucheFabrique() {
 poidsMouchesPartages.put("Bonjour", new ConcretePoidsMouche("Bonjour"));
 poidsMouchesPartages.put("le", new ConcretePoidsMouche("le"));
 poidsMouchesPartages.put("monde", new ConcretePoidsMouche("monde"));
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
 public PoidsMouche getPoidsMouche(String pValeur) {
 if(poidsMouchesPartages.containsKey(pValeur)) {
 System.out.println("--> Retourne un PoidsMouche (" + pValeur +
 ") partagé déjà existant");
 return poidsMouchesPartages.get(pValeur);
 }
 else {
 System.out.println("--> Retourne un PoidsMouche (" + pValeur +
 ") partagé non déjà existant");
 final ConcretePoidsMouche lNouveauPoidsMouche = new ConcretePoidsMouche(pValeur);
 poidsMouchesPartages.put(pValeur, lNouveauPoidsMouche);
 return lNouveauPoidsMouche;
 }
 }

 /**
* Retourne un "PoidsMouche" non partagé.
* @param pValeur1
* @param pValeur2
* @return un "PoidsMouche"
*/
 public PoidsMouche getPoidsMouche(String pValeur1, String pValeur2) {
 System.out.println("--> Retourne un PoidsMouche (" + pValeur1 + ", " +
 pValeur2 + ") non partagé");
 return new ConcretePoidsMoucheNonPartage(pValeur1, pValeur2);
 }
}
