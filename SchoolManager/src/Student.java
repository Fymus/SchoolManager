
public class Student extends Person {
	
	protected int fee = 0;
	public Subject firstSubject = new Subject();
	public Subject secondSubject = new Subject();
	public Subject thirdSubject = new Subject();
	
	
	public Student(String name, String firstSubject, String secondSubject, String thirdSubject) {
		setID();
		setName(name);
		setStudensSubjects(firstSubject, secondSubject, thirdSubject);
		setAllStudentsFee();
		setPersonalInfo();
		
	}
	
	public Student(String name, String firstSubject, String secondSubject) {
		setID();
		setName(name);
		setStudensSubjects(firstSubject, secondSubject);
		setAllStudentsFee();
		setPersonalInfo();
		
	}
	
	public Student(String name, String firstSubject) {
		setID();
		setName(name);
		setStudensSubjects(firstSubject);
		setAllStudentsFee();
		setPersonalInfo();
		
	}
	
	public Student(String name) {
		setName(name);
	}
	
	public Student() {
		
	}
	
	//Method which sets Students all fees
	protected void setAllStudentsFee() {
		if (this.firstSubject.getSubjectFee() == 0) {
			this.fee = 0;
		}
		else if (this.secondSubject.getSubjectFee() == 0) {
			this.fee = this.firstSubject.getSubjectFee();
		}
		else if (this.thirdSubject.getSubjectFee() == 0) {
			this.fee = this.firstSubject.getSubjectFee() + this.secondSubject.getSubjectFee();
		}
		else if (this.thirdSubject.getSubjectFee() != 0) {
			this.fee = this.firstSubject.getSubjectFee() + this.secondSubject.getSubjectFee() + this.thirdSubject.getSubjectFee();
		}
		else {
				System.out.println("Podczas ustawiania czesnych dla studenta coœ posz³o nie tak");
			}
		
	}
	
	//Method which returns Students overall fee
	public int getStudentsFee() {
		return this.fee;
	}
	
	//Method That is setting Students subject of lesson that he is attending and sets Students all fees
	protected void setStudensSubjects(String first, String second, String third) {
		this.firstSubject = firstSubject.setSubject(first);
		this.secondSubject = secondSubject.setSubject(second);
		this.thirdSubject = thirdSubject.setSubject(third);
	}
	
	protected void setStudensSubjects(String first, String second) {
		this.firstSubject = this.firstSubject.setSubject(first);
		this.secondSubject = this.secondSubject.setSubject(second);
	}
	
	protected void setStudensSubjects(String first) {
		this.firstSubject = this.firstSubject.setSubject(first);
	}
	
	protected void setPersonalInfo() {
		this.personalInfo = "Student's name is: \\" + this.name + "\\ Student's ID: \\" + this.getID() + "\\ Student's total fee is equiavilent to: \\" + Integer.toString(this.getStudentsFee());
	}
	
	public String toString() {
		return this.personalInfo;
		
	}
	
	
}