package assignment_3;

public class India extends AsiaContinent {
	private int totalmass;
	private int states;
	
	public India(int landmass, int population, int totalcountries, int totalmass) {
		super(landmass, population, totalcountries);
		this.totalmass = totalmass;
	}

	public int getTotalmass() {
		return totalmass;
	}

	public void setTotalmass(int totalmass) {
		this.totalmass = totalmass;
	}

	public int getStates() {
		return states;
	}

	public void setStates(int states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "India [totalmass=" + totalmass + ", states=" + states + ", getLandmass()=" + getLandmass()
				+ ", getPopulation()=" + getPopulation() + ", getTotalcountries()=" + getTotalcountries()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
