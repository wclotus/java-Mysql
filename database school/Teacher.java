
public class Teacher extends Person {
	
	
	public Teacher(String name) {
		super(name);
	}
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void displayNmae() {
		System.out.println("my name is"+ getName()+"."+"i am a" + title);
	}

}
