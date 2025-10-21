package day12;

public class account {
	private int accouno;
	private String name;
	private double amount;
	 //we can genarate getters and setters automaic, 
	
	public int getAccouno() {
		return accouno;
	}
	public void setAccouno(int accouno) {
		this.accouno = accouno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
    // the porpuse of use get set , is to make varaibles as private 
	//this is manualy
	
	/*void setaccount(int ac)
	{ 
		accouno=ac;
	}
	
	int getaccount()
	{ 
		return accouno;
	}*/
	
	
}
