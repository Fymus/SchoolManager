import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentSearcher extends JDialog {
	private JTextField textStudentName;


	/**
	 * Create the dialog.
	 */
	public StudentSearcher() {
		setAlwaysOnTop(true);
		setBounds(100, 100, 932, 378);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel labelStudentSearch = new JLabel("Enter name of the student you wish to look up");
		labelStudentSearch.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelStudentSearch.setBounds(280, 40, 430, 52);
		getContentPane().add(labelStudentSearch);
		
		textStudentName = new JTextField();
		textStudentName.setText("Name here");
		textStudentName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textStudentName.setBounds(748, 52, 160, 29);
		getContentPane().add(textStudentName);
		textStudentName.setColumns(10);
		
		JTextArea textAreaSudentSearcher = new JTextArea();
		textAreaSudentSearcher.setBounds(25, 102, 883, 219);
		getContentPane().add(textAreaSudentSearcher);
		
		JButton buttonSearch = new JButton("Search For Student");
		buttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				Student student = new Student(textStudentName.getText());
				
				for (int i = 0; i < main.students.size(); i++) {
					System.out.println(main.students.get(i).getName());
					if ((main.students.get(i).getName()).equals(textStudentName.getText())) {
						textAreaSudentSearcher.append(main.students.get(i).getPerosonalInfo() + "\n");
						System.out.println(main.students.get(i).getPerosonalInfo());
						break;
					}
				}
				}
			
		});
		buttonSearch.setBackground(Color.BLUE);
		buttonSearch.setFont(new Font("Tahoma", Font.PLAIN, 19));
		buttonSearch.setBounds(25, 40, 195, 52);
		getContentPane().add(buttonSearch);
		setVisible(true);
	}
}
