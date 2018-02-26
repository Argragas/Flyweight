package exemple;

public class ObjetSpatial implements IObjetSpatial{
   
   
   private String commentaire;
    private int numNorad;
    private String  nom;
    private String dateLancment;
    
    
    
    
    
    private ObjetSpatial() {
        // TODO Auto-generated constructor stub
    }
    
    
    public String getCommentaire() {
        return commentaire;
    }
    public int getNumNorad() {
        return numNorad;
    }
    public String getNom() {
        return nom;
    }
    public String getDateLancment() {
        return dateLancment;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    public void setNumNorad(int numNorad) {
        this.numNorad = numNorad;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDateLancment(String dateLancment) {
        this.dateLancment = dateLancment;
    }
}
