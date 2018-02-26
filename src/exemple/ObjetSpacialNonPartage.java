package exemple;

/**
 * {@link ObjetSpatial} spécifique ne pouvant ètre partagé.
 * @author Argragas
 *
 */
public class ObjetSpacialNonPartage extends ObjetSpatial implements IObjetSpatial   {

	private String commentaire;

	
	public ObjetSpacialNonPartage() {
		super();
	}


	public ObjetSpacialNonPartage(String pays, String commentaire) {
		this.commentaire =  commentaire;
		this.setPays(pays);
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	
	
}
