import javax.swing.JOptionPane;

public class WindowsCumonication {
	
	
	public void getShowDataMessage(Student student) {
		JOptionPane.showInternalMessageDialog(null, student.showData());
	}
	
	public void getShowDataMessage(Worker worker) {
		JOptionPane.showInternalMessageDialog(null, worker.showData());
	}
	
	public void getShowDataMessage(Teacher teacher) {
		JOptionPane.showInternalMessageDialog(null, teacher.showData());
	}
	
	public void getSchoolBalance() {
		JOptionPane.showInternalMessageDialog(null, new School().getSchoolBalance(), "School's Balance", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void showErrorWindow() {
		JOptionPane.showInternalMessageDialog(null, "Data that you have enterted is invalid");
	}
}
