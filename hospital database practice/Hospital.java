package problem2;

public class Hospital {

	public static void main(String[] args) {
	
			 Doctor doctor = new Doctor();
			 Nurse nurse = new Nurse();
			 Administrator administrator = new Administrator();
			 Receptionist receptionist = new Receptionist();
			 Janitor janitor = new Janitor();
			 
			 doctor.diagnose();
			 nurse.care();
			 administrator.budget();
			 receptionist.appointment();
			 janitor.clean();

	}

}
