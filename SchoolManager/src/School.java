
public class School {

	
	
	
	private static int monthlyBalance;
	
	public int getSchoolBalance() {
		return monthlyBalance;
	}
	
	public int paymentToSchoolBalance(int value) {
		monthlyBalance += value;
		return monthlyBalance;
	}
	
	public int paymentFromSchoolBalance(int value) {
		monthlyBalance -= value;
		return monthlyBalance;
	}
}
