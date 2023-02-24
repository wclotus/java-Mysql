import java.util.ArrayList;
import java.util.List;

public class Manager extends Employees {
	
	public Manager(int Salary) {
		super(Salary);
	
	}
	

	private List<Developer> subordinates = new ArrayList<Developer>();
	private int bonus;
	
	
	public List<Developer> getsubordinates(){
		return subordinates;
	
	}
	
	public void addsubordinates(Developer developer) {
		subordinates.add(developer);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return super.getSalary() + this.bonus;
	}
	
	public String toString() {
		String subordinatesList = "";
		if (subordinates != null) {
			for(Developer developer : subordinates) {
				subordinatesList += "Subordinate" + (developer).toString(); 
			}
		}
		return super.toString() + subordinatesList;
	}
	   
	

}
