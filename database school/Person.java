
public class Person {

	
		

	
        private String name;
		private String surname;
		private int age;
		private String race;
		private String gender;
		
		public Person(String name) {
			this.name = name;
		}
		
		public void displayName() { 
			System.out.println("My name is "+name);
		
		}
		public String getName() {
			return this.name;
		}
		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getRace() {
			return race;
		}

		public void setRace(String race) {
			this.race = race;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public void setName(String name) {
			this.name = name;
			
	
}
}
