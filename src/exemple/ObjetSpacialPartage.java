package exemple;

/**
 * {@link ObjetSpatial} pouvant ètre partagé.
 * @author Argragas
 *
 */
public class ObjetSpacialPartage extends ObjetSpatial implements IObjetSpatial {




	public ObjetSpacialPartage(String pValeur) {
		super();
		this.setPays(pValeur);

	}


	@Override
	public String getInfos() {
		return this.toString();
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ObjetSpacialPartage [getNumNorad()=");
		builder.append(getNumNorad());
		builder.append(", getDateLancment()=");
		builder.append(getDateLancment());
		builder.append(", getPays()=");
		builder.append(getPays());
		builder.append("]");
		return builder.toString();
	}


}
