package assignment_3;

public class KarnatakaState extends India {
	 private int mass;
     private int districts;
	public KarnatakaState(int landmass, int population, int totalcountries, int totalmass, int mass, int districts) {
		super(landmass, population, totalcountries, totalmass);
		this.mass = mass;
		this.districts = districts;
	}
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public int getDistricts() {
		return districts;
	}
	public void setDistricts(int districts) {
		this.districts = districts;
	}
	@Override
	public String toString() {
		return "KarnatakaState [mass=" + mass + ", districts=" + districts + ", getTotalmass()=" + getTotalmass()
				+ ", getStates()=" + getStates() + ", toString()=" + super.toString() + ", getLandmass()="
				+ getLandmass() + ", getPopulation()=" + getPopulation() + ", getTotalcountries()="
				+ getTotalcountries() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
     
     

}
