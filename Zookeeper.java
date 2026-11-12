package javazoo;

public class Zookeeper {
	
	//Attributes
	private String name;
	private String title;
	private double payRate;
	private boolean degree;
	
	//Constructor
	public Zookeeper(String name) {
		this.name = name;
		
	}
	
	//Accessory and Mutators
	public void setName(String name) {
		this.name = name;
		
	}	
		
		public String getName() {
			return name;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public boolean isDegree() {
		return degree;
	}

	public void setDegree(boolean degree) {
		this.degree = degree;
	
	}

}