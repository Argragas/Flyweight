package exemple;

/**
 * {@link IObjetSpatial} caractèrisant un débris.
 * @author Argragas
 *
 */
public class ObjetSpacialDebris implements IObjetSpatial {


	private String  paysOrganisation;
	private String commentaire;
	private String dateLancment;
	private String numNorad;

	

	public ObjetSpacialDebris(String pValeur) {
		super();
		this.setPaysOrganisation(pValeur);

	}



	public String getPaysOrganisation() {
		return paysOrganisation;
	}



	public void setPaysOrganisation(String paysOrganisation) {
		this.paysOrganisation = paysOrganisation;
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



	@Override
	public boolean isDebris() {
		return true;
	}



	@Override
	public void formatDonnee(String numNorad, String dateLancement, String commentaire) {
		this.commentaire = commentaire;
		this.dateLancment = dateLancement;
		this.numNorad = numNorad;	
	}





}
