
	public abstract class Person {
		
		protected static int id = 0;
		protected int personID = 0;
		protected String name = "";
		public String personalInfo = "";
		
		public String showData() {
			return personalInfo;
		}
		protected void setID() {
			System.out.println(id);
			++id;
			this.personID = id;
			System.out.print("zosta³ nadany unikalny ID" + id);
		}
		
		protected void setName(String name) {
			int foo = 0;
			for (int i = 0; i < name.length(); i++) {
				if (Character.isDigit(name.charAt(i)) || Character.isWhitespace(name.charAt(i))) {
					++foo;
					System.out.println("Imiê ma w sobie liczbê albo pusty znak");
					System.out.println("Is a Digit: " + name.charAt(i) + Character.isDigit(name.charAt(i)));
					System.out.println("Is a White Space: " + name.charAt(i) + Character.isWhitespace(name.charAt(i)));
				}
				else if(!Character.isDigit(name.charAt(i)) && !Character.isLetter(name.charAt(i)) && !Character.isWhitespace(name.charAt(i))) {
					++foo;
					System.out.println("is Letter " + Character.isLetter(name.charAt(i)));
					System.out.println("is White Space " + Character.isWhitespace(name.charAt(i)));
					System.out.println("is Digit " + Character.isDigit(name.charAt(i)));
				}
			}
			
			System.out.println("Liczba goo wynosi: " +foo);
			
			if (foo > 0) {
				System.out.println("foo wynosi: " + foo);
				this.name = "";
			}
			else {
				this.name = name.toLowerCase();
				this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
			}
		}
		
		protected String getName() {
			return this.name;
		}
		
		protected int getID() {
			return this.personID;
		}
		
		protected void setPersonalInfo() {
			
		}
		
		protected String getPerosonalInfo() {
			return this.personalInfo;
		}
	}