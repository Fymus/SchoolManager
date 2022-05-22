import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentAdder extends JDialog {
	private JTextField textStudentName;
	private JTextField textFirstSubject;
	private JTextField textSecondSubject;
	private JTextField textThirdSubject;


	/**
	 * Create the dialog.
	 */
	public StudentAdder() {
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 1224, 373);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel labelStudentName = new JLabel("You may enter name of the student you wish to add");
		labelStudentName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelStudentName.setBounds(247, 28, 513, 40);
		getContentPane().add(labelStudentName);
		
		JLabel lblYouMayEnter = new JLabel("You may enter first subject of the student you wish to add");
		lblYouMayEnter.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblYouMayEnter.setBounds(247, 113, 513, 40);
		getContentPane().add(lblYouMayEnter);
		
		JLabel lblYouMayEnter_2 = new JLabel("You may enter second (optional) subject of the student you wish to add");
		lblYouMayEnter_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblYouMayEnter_2.setBounds(247, 180, 621, 40);
		getContentPane().add(lblYouMayEnter_2);
		
		JLabel lblYouMayEnter_2_1 = new JLabel("You may enter third (optional) subject of the student you wish to add");
		lblYouMayEnter_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblYouMayEnter_2_1.setBounds(247, 256, 621, 40);
		getContentPane().add(lblYouMayEnter_2_1);
		
		textStudentName = new JTextField();
		textStudentName.setText("Enter Name");
		textStudentName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textStudentName.setBounds(930, 28, 251, 34);
		getContentPane().add(textStudentName);
		textStudentName.setColumns(10);
		
		textFirstSubject = new JTextField();
		textFirstSubject.setText("english / french / math / geography / chemistry / pe / physics");
		textFirstSubject.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textFirstSubject.setColumns(10);
		textFirstSubject.setBounds(930, 119, 251, 34);
		getContentPane().add(textFirstSubject);
		
		textSecondSubject = new JTextField();
		textSecondSubject.setText("english / french / math / geography / chemistry / pe / physics");
		textSecondSubject.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textSecondSubject.setColumns(10);
		textSecondSubject.setBounds(930, 194, 251, 34);
		getContentPane().add(textSecondSubject);
		
		textThirdSubject = new JTextField();
		textThirdSubject.setText("english / french / math / geography / chemistry / pe / physics");
		textThirdSubject.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textThirdSubject.setColumns(10);
		textThirdSubject.setBounds(930, 270, 251, 34);
		getContentPane().add(textThirdSubject);
		
		JButton buttonStudentAdder = new JButton("Add Student");
		buttonStudentAdder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int foo = 0;
				Main main = new Main();
				Student newStudent = new Student();
				if (textFirstSubject.getText().isEmpty() || textStudentName.getText().isEmpty()) {
					++foo;
				}
				else if (!textFirstSubject.getText().isEmpty() && textSecondSubject.getText().isEmpty()) {
					newStudent = new Student(textStudentName.getText(), textFirstSubject.getText());
					System.out.println("Jeden Przedmiot" + newStudent.getStudentsFee());
					System.out.println(newStudent.firstSubject);
					System.out.println(newStudent.secondSubject);
					System.out.println(newStudent.thirdSubject);
				}
				else if (!textFirstSubject.getText().isEmpty() && !textSecondSubject.getText().isEmpty() && textThirdSubject.getText().isEmpty()) {
					newStudent = new Student(textStudentName.getText(), textFirstSubject.getText(), textSecondSubject.getText());
					System.out.println("Dwa Przedmioty" + newStudent.getName());
					System.out.println(newStudent.firstSubject);
					System.out.println(newStudent.secondSubject);
					System.out.println(newStudent.thirdSubject);
				}
				else if (!textFirstSubject.getText().isEmpty() && !textSecondSubject.getText().isEmpty() && !textThirdSubject.getText().isEmpty()) {
					newStudent = new Student(textStudentName.getText(), textFirstSubject.getText(), textSecondSubject.getText(), textThirdSubject.getText());
					System.out.println("Trzy Przedmioty" + newStudent.getName());
					System.out.println(newStudent.firstSubject);
					System.out.println(newStudent.secondSubject);
					System.out.println(newStudent.thirdSubject);
				}
				
				
				if (foo == 0) {
					
					System.out.println(newStudent.getName());
					System.out.println(textStudentName.getText());
					if (!newStudent.getName().isEmpty() && newStudent.getStudentsFee() > 0) {
						System.out.println("allal" + newStudent);
						main.students.add(newStudent);
						System.out.println(newStudent + newStudent.getPerosonalInfo());
						
					}
					else {
						new WindowsCumonication().showErrorWindow();
					}
				}
			}
		});
		buttonStudentAdder.setFont(new Font("Tahoma", Font.PLAIN, 19));
		buttonStudentAdder.setBounds(33, 126, 173, 65);
		getContentPane().add(buttonStudentAdder);
		setVisible(true);

	}
}
