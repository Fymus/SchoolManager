
public class Worker extends Person {
	
	//Variables that enable worker to have both salary and a job title
	protected int salary = 0;
	protected String jobTitle = "";
	
	
	
	public Worker() {
		
	}
	
	public Worker(String name, String jobTitle) {
		
		setID();
		setName(name);
		setJobTitle(jobTitle);
		setSalary();
		setPersonalInfo();
		
	}

	//method setting workers salary
	protected void setSalary() {
		System.out.println(this.jobTitle);
		
		if (this.jobTitle.toLowerCase().equals("janitor")) {
			this.salary = 1800;
		}
		else if (this.jobTitle.toLowerCase().equals("librarian")) {
			this.salary = 2000;
		}
		else if (this.jobTitle.toLowerCase().equals("secretary")) {
			this.salary = 2000;
		}
		else {
			System.out.println("Setter Pensji siê rozhuœta³");
		}
		
	}
	
	//method that is returning workers salary
	public int getSalary() {
		return this.salary;
	}
	
	//method that is setting workers job title
	protected void setJobTitle(String jobTitle) {
		if (jobTitle.toLowerCase().equals("janitor")) {
			this.jobTitle = "janitor";
		}
		else if (jobTitle.toLowerCase().equals("librarian")) {
			this.jobTitle = "librarian";
		}
		else if (jobTitle.toLowerCase().equals("secretary")) {
			this.jobTitle = "secretary";
		}
		else {
			System.out.println("Setter Zawodu w Wokrer siê rozhuœta³");
		}
	}
	
	//method that is returning job title of the worker
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	
	
	//Method for setting personal info of worker
	protected void setPersonalInfo() {
		this.personalInfo = "Worker's name: \\" + this.name + "\\ Worker's ID: \\" + this.getID() + "\\ Worker salary is equiavilent to: \\" + Integer.toString(this.getSalary()) + "\\ Worker's job title: \\" + this.getJobTitle();
	}

}