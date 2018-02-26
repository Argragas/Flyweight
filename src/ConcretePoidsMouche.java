

/**
 * Classe dont on souhaite limiter le nombre d'instance en mémoire.
 */
public class ConcretePoidsMouche implements PoidsMouche {
    private String valeur;

    public ConcretePoidsMouche(String pValeur) {
        valeur = pValeur;
    }

    public void afficher(String pContexte) {
        System.out.println("PoidsMouche  avec la valeur : " + valeur + " et contexte : " + pContexte);
    }
}
