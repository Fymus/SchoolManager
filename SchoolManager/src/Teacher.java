
public class Teacher extends Worker {
	
	protected Subject subjectOfWorker = new Subject();
	
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, String subject) {
		
		setName(name);
		setSubjectForWorker(subject);
		setSalary();
		setJobTitle();
		setID();
		setPersonalInfo();
	}

	
	//Method that sets subject which teacher is teaching
	protected void setSubjectForWorker(String subject) {
		this.subjectOfWorker = subjectOfWorker.setSubject(subject);
	}
	
	//Method that sets subject which teacher is teaching
	public Subject getSubjectForWorker() {
		return this.subjectOfWorker;
	}
	
	protected void setSalary() {
		this.salary = subjectOfWorker.getSubjectSalary();
	}
	
	//Method that returns Teacher Info
	protected void setPersonalInfo() {
		this.personalInfo = "Teacher's name: \\" + this.name + "\\ Teacher's ID: \\" + this.getID() + "\\ Teacher salary is equiavilent to: \\" + Integer.toString(this.getSalary()) + "\\ Worker's job title: \\" + this.getJobTitle();
	}
	
	protected void setJobTitle() {
		this.jobTitle = "Teacher of " + subjectOfWorker.getSubjectName(); 
	}

	
}