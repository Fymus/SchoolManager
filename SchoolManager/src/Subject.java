
public class Subject {
	
	private String nameOfSubject;
	private int fee;
	private int salary;
	
	
	
	
	private Subject(String nameOfSubject, int fee, int salary) {
		
		// variables that are inside of class Subject, fee and name of the subject
		this.nameOfSubject = nameOfSubject;
		this.fee = fee;
		this.salary = salary;
		
	}
	
	// Subjects
	private static Subject english = new Subject("ENGLISH", 200, 2000);
	private static Subject french = new Subject("FRENCH", 200, 2000);
	private static Subject math = new Subject("MATH", 300, 2200);
	private static Subject geography = new Subject("GEOGRAPHY", 100, 2000);
	private static Subject chemistry = new Subject("CHEMISTRY", 300, 2200);
	private static Subject pe = new Subject("PHYSICAL EDUCATION", 100, 1900);
	private static Subject physics = new Subject("PHYSICS", 300, 2300);
	private static Subject error = new Subject("", 0, 0);
	
	
	public Subject() {
		
	}
	
	
	// Method sets object of class Subject
	public Subject setSubject(String name) {
		if (name.toLowerCase().equals("english")) {
			return english;
		}
		else if (name.toLowerCase().equals("french")) {
			return french;
		}
		else if (name.toLowerCase().equals("math")) {
			return math;
		}
		else if (name.toLowerCase().equals("geography")) {
			return geography;
		}
		else if (name.toLowerCase().equals("chemistry")) {
			return chemistry;
		}
		else if (name.toLowerCase().equals("pe")) {
			return pe;
		}
		else if (name.toLowerCase().equals("physics")) {
			return physics;
		}
		else {
			System.out.println("Nast¹pi³ b³¹d przy pobieraniu przedmiotu");
			return error ;
		}
	}
	
	// Method that returns object of Subject
	public Subject getSubject() {
		return this;
	}
	
	// Method that sets fee related to the Subject
	public int setSubjectsFee(String name) {
		if (name.toLowerCase().equals("english")) {
			return english.fee;
		}
		else if (name.toLowerCase().equals("french")) {
			return french.fee;
		}
		else if (name.toLowerCase().equals("math")) {
			return math.fee;
		}
		else if (name.toLowerCase().equals("geography")) {
			return geography.fee;
		}
		else if (name.toLowerCase().equals("chemistry")) {
			return chemistry.fee;
		}
		else if (name.toLowerCase().equals("pe")) {
			return pe.fee;
		}
		else if (name.toLowerCase().equals("physics")) {
			return physics.fee;
		}
		else {
			System.out.println("Nast¹pi³ b³¹d przy pobieraniu przedmiotu");
			return 0;
		}
	}
	
	//Method that returns fee related to the subject
	public int getSubjectFee() {
		return this.fee;
	}
	
	//Method that returns name of the Subject
	public String setSubjectsName(String name) {
		if (name.toLowerCase().equals("english")) {
			return english.nameOfSubject;
		}
		else if (name.toLowerCase().equals("french")) {
			return french.nameOfSubject;
		}
		else if (name.toLowerCase().equals("math")) {
			return math.nameOfSubject;
		}
		else if (name.toLowerCase().equals("geography")) {
			return geography.nameOfSubject;
		}
		else if (name.toLowerCase().equals("chemistry")) {
			return chemistry.nameOfSubject;
		}
		else if (name.toLowerCase().equals("pe")) {
			return pe.nameOfSubject;
		}
		else if (name.toLowerCase().equals("physics")) {
			return physics.nameOfSubject;
		}
		else {
			System.out.println("Nast¹pi³ b³¹d przy pobieraniu przedmiotu");
			return error.nameOfSubject;
		}
	}
	
	public String getSubjectName() {
		return this.nameOfSubject;
	}
	
	//Method that sets salary for person teaching related subject
	public int setSubjectsSalary(String name) {
		if (name.toLowerCase().equals("english")) {
			return english.salary;
		}
		else if (name.toLowerCase().equals("french")) {
			return french.salary;
		}
		else if (name.toLowerCase().equals("math")) {
			return math.salary;
		}
		else if (name.toLowerCase().equals("geography")) {
			return geography.salary;
		}
		else if (name.toLowerCase().equals("chemistry")) {
			return chemistry.salary;
		}
		else if (name.toLowerCase().equals("pe")) {
			return pe.salary;
		}
		else if (name.toLowerCase().equals("physics")) {
			return physics.salary;
		}
		else {
			System.out.println("Nast¹pi³ b³¹d przy pobieraniu przedmiotu");
			return 0;
		}
	}
	
	//Method that returns salary related to the subject
	public int getSubjectSalary() {
		return this.salary;
	}
	
	public String toString() {
		return nameOfSubject;
		
	}

}
