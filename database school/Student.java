
public class Student extends Person {

	
	public Student(String name) {
		super(name);
	}
	private String extracurricularActivity;
	
	
	public String getExtracurricularActivity() {
		return extracurricularActivity;
	}
	public void setExtracurricularActivity(String extracurricularActivity) {
		this.extracurricularActivity = extracurricularActivity;
	}
	public void displayName() {
		super.displayName();
	}
}
