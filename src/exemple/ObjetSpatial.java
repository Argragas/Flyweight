package exemple;


/**
 * Classe représentant un objet spatial.
 * Implémente l'interface {@link IObjetSpatial}.
 * @author Argragas
 *
 */
public class ObjetSpatial implements IObjetSpatial{

	private int numNorad;
	private String  pays;
	private String dateLancment;





	public ObjetSpatial() {
	}




	public ObjetSpatial(String commentaire, int numNorad, String pays, String dateLancment) {

		this.numNorad = numNorad;
		this.pays = pays;
		this.dateLancment = dateLancment;
	}



	public int getNumNorad() {
		return numNorad;
	}

	public String getDateLancment() {
		return dateLancment;
	}

	public void setNumNorad(int numNorad) {
		this.numNorad = numNorad;
	}

	public void setDateLancment(String dateLancment) {
		this.dateLancment = dateLancment;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}




	@Override
	public String getInfos() {
		
		return this.toString();
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ObjetSpatial [numNorad=");
		builder.append(numNorad);
		builder.append(", pays=");
		builder.append(pays);
		builder.append(", dateLancment=");
		builder.append(dateLancment);
		builder.append("]");
		return builder.toString();
	}
	


}
