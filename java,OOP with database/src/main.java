
public class main {

	

	public static void main(String[] args) {
		Developer developer1=new Developer(1);
		developer1.setName("desi");
		developer1.setSurname("Banks");
		developer1.setCountry("America");
		developer1.setCity("New York");
		developer1.setStreet("5th street");
		developer1.setStreetNumber("123");
		developer1.setSalary(15000);

		
		Developer developer2=new Developer(2);
		developer2.setName("jonah");
		developer2.setSurname("jones");
		developer2.setCountry("America");
		developer2.setCity("atlanta");
		developer2.setStreet("MLK street");
		developer2.setStreetNumber("23");
		developer2.setSalary(15000);
		
		
		Manager manager1=new Manager(1);
		manager1.setName("george");
		manager1.setSurname("ramos");
		manager1.setCountry("jamaica");
		manager1.setCity("harlem");
		manager1.setStreet("halulu");
		manager1.setStreetNumber("13");
		manager1.setSalary(15000);
		manager1.setBonus(4000);
		manager1.getSalary();
		
		((Manager) manager1).addsubordinates((Developer) developer1);
		((Manager) manager1).addsubordinates((Developer) developer2);
		
		System.out.println("developer:" + developer1.toString() + "Salary=" +developer1.getSalary());
		System.out.println("developer:" + developer2.toString()+ "Salary=" +developer2.getSalary());
		System.out.println("Manager:" + manager1.toString()+ "Salary=" + manager1.getSalary());
		

	}

}
