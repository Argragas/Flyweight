

/**
* Sous-classe de Poids-Mouche dont on ne partage pas les instances.
*/
public class ConcretePoidsMoucheNonPartage implements PoidsMouche {
 private String valeur1;
 private String valeur2;

 public ConcretePoidsMoucheNonPartage(String pValeur1, String pValeur2) {
 valeur1 = pValeur1;
 valeur2 = pValeur2;
 }

 public void afficher(String pContexte) {
 System.out.println("PoidsMouche avec la valeur1 : " + valeur1 +
 " avec la valeur2 : " + valeur2);
 }
}
