
public class Employees {

	public static void main(String[] args) {


	}
	private String name;
	private String surname;
	private String country;
	private String city;
	private String street;
	private String streetNumber;
	private int Salary;
	
	public Employees(int Salary) {
		this.Salary = Salary; 
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public String toString() {
    	String basicInfo="";
    	basicInfo="Employees [name=" + name + ", surname=" + surname + ", country=" + country + ", city=" + city
				+ ", street=" + street + ", streetNumber=" + streetNumber + "]";
		return(basicInfo) ;
    }
	
}



