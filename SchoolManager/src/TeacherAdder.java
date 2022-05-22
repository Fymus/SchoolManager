import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeacherAdder extends JDialog {
	private JTextField textTeacherName;
	private JTextField textSubject;


	/**
	 * Create the dialog.
	 */
	public TeacherAdder() {
		setResizable(false);
		setBounds(100, 100, 1190, 205);
		getContentPane().setLayout(null);
		setVisible(true);
		
		JLabel labelName = new JLabel("On the right enter name of the teacher you wish to add");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelName.setBounds(236, 33, 514, 41);
		getContentPane().add(labelName);
		
		JLabel labelFirstSubject = new JLabel("On the right enter  subject of the teacher you wish to add");
		labelFirstSubject.setHorizontalAlignment(SwingConstants.CENTER);
		labelFirstSubject.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelFirstSubject.setBounds(216, 92, 604, 46);
		getContentPane().add(labelFirstSubject);
		
		JButton buttonAddTeacher = new JButton("Add Teacher");
		buttonAddTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int foo = 0;
				Main main = new Main();
				Teacher newTeacher = new Teacher();
				
				if (textSubject.getText().isEmpty() || textTeacherName.getText().isEmpty()) {
					++foo;
				}
				else {
					newTeacher = new Teacher(textTeacherName.getText(), textSubject.getText());
				}
				
				
				System.out.println("foo wynosi: " + foo);
				System.out.println("Imie nauczyciela to: " + newTeacher.getName());
				if (foo == 0 && (!newTeacher.getName().isEmpty() && newTeacher.getSalary() > 0)) {
					System.out.println("essa");
					System.out.println("Pensja " + newTeacher.getSalary());
					System.out.println("Imiê Nauczyciela: " + newTeacher.getName());
					System.out.println("Nauczyciel Uczy: " + newTeacher.getSubjectForWorker());
					System.out.println("Nauczyciel Uczy: " + newTeacher.personalInfo);
					
					System.out.println("Pan Nauczyciel zosta³ dodany a jego dane to: " + newTeacher.getPerosonalInfo());
					main.workers.add(newTeacher);
					main.teachers.add(newTeacher);
					System.out.println(main.workers.getLast());
					System.out.println(main.teachers.getLast());
					
				}
				else {
					new WindowsCumonication().showErrorWindow();
				}
			}
		});
		buttonAddTeacher.setFont(new Font("Tahoma", Font.PLAIN, 19));
		buttonAddTeacher.setBounds(33, 50, 157, 66);
		getContentPane().add(buttonAddTeacher);
		
		textTeacherName = new JTextField();
		textTeacherName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textTeacherName.setText("Name");
		textTeacherName.setBounds(942, 36, 192, 35);
		getContentPane().add(textTeacherName);
		textTeacherName.setColumns(10);
		
		textSubject = new JTextField();
		textSubject.setText("english / french / math / geography / chemistry / pe / physics");
		textSubject.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textSubject.setColumns(10);
		textSubject.setBounds(942, 98, 192, 35);
		getContentPane().add(textSubject);

	}

}
