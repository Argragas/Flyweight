

public class FlyweightPatternMain {
    
 public static void main(String[] args) {
 // Instancie la fabrique
 PoidsMoucheFabrique lFlyweightFactory = new PoidsMoucheFabrique();
 // Demande des "PoidsMouche" qui sont partagés
 PoidsMouche lFlyweight1 = lFlyweightFactory.getPoidsMouche("Bonjour");
 PoidsMouche lFlyweight1Bis = lFlyweightFactory.getPoidsMouche("Bonjour");
 // Affiche ces deux "PoidsMouche"
 lFlyweight1.afficher("Contexte1");
 lFlyweight1Bis.afficher("Contexte1Bis");
 // Affiche si les références pointent sur la même instance
 // Cela est logique puisque c'est le principe de l'instance partagée.
 System.out.print("lFlyweight1 == lFlyweight1Bis : ");
 System.out.println(lFlyweight1 == lFlyweight1Bis);
 // Demande un "PoidsMouche" qui ne fait pas partie des existants
 PoidsMouche lFlyweight2 = lFlyweightFactory.getPoidsMouche("BonjouR");
 PoidsMouche lFlyweight2Bis = lFlyweightFactory.getPoidsMouche("BonjouR");
 // Affiche ces deux "PoidsMouche"
 lFlyweight2.afficher("Contexte2");
 lFlyweight2Bis.afficher("Contexte2Bis");

 // Demande et affiche un "PoidsMouche" non partagé
 PoidsMouche lFlyweight3 = lFlyweightFactory.getPoidsMouche("Valeur1", "Valeur2");
 lFlyweight3.afficher(null);

 }
}