package exemple;


/**
 * Classe représentant un objet spatial.
 * Implémente l'interface {@link IObjetSpatial}.
 * @author Argragas
 *
 */
public class ObjetSpatial implements IObjetSpatial{
	private String  paysOrganisation;
	private String commentaire;
	private String dateLancment;
	private String numNorad;
	
	public ObjetSpatial() {
		
	}
	public ObjetSpatial(String paysOrganisation) {
		this.setPaysOrganisation(paysOrganisation);
	}
	
	@Override
	public boolean isDebris() {
		return false;
	}

	@Override
	public void formatDonnee(String numNorad, String dateLancement, String commentaire) {
		this.commentaire = commentaire;
		this.dateLancment = dateLancement;
		this.numNorad = numNorad;		
	}
	
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getDateLancment() {
		return dateLancment;
	}
	public void setDateLancment(String dateLancment) {
		this.dateLancment = dateLancment;
	}
	public String getNumNorad() {
		return numNorad;
	}
	public void setNumNorad(String numNorad) {
		this.numNorad = numNorad;
	}
	public String getPaysOrganisation() {
		return paysOrganisation;
	}
	public void setPaysOrganisation(String paysOrganisation) {
		this.paysOrganisation = paysOrganisation;
	}
}
