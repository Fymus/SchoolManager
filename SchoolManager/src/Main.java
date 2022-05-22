import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	public static LinkedList<Student> students = new LinkedList<Student>();
	public static LinkedList<Worker> workers = new LinkedList<Worker>();
	public static LinkedList<Teacher> teachers = new LinkedList<Teacher>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 308);
		getContentPane().setLayout(null);
		
		JPanel panelStudent = new JPanel();
		panelStudent.setBounds(0, 0, 1000, 41);
		getContentPane().add(panelStudent);
		
		JButton buttonSearchStudent = new JButton("Search For Student");
		buttonSearchStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentSearcher();
			}
		});
		panelStudent.add(buttonSearchStudent);
		
		JLabel labelSeartchStudent = new JLabel("Click Button on the left if you wish to search for student");
		panelStudent.add(labelSeartchStudent);
		
		JList list = new JList();
		panelStudent.add(list);
		
		JPanel panelWorker = new JPanel();
		panelWorker.setBounds(0, 52, 1000, 41);
		getContentPane().add(panelWorker);
		
		JButton buttonWorkerSearch = new JButton("Search For the Worker");
		buttonWorkerSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WorkerSearcher();
			}
		});
		panelWorker.add(buttonWorkerSearch);
		
		JLabel labelWorkerSearch = new JLabel("Enter on the rigth data of Worker you wish to look for and then press button on the right");
		panelWorker.add(labelWorkerSearch);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 148, 1000, 33);
		getContentPane().add(panel);
		
		JButton buttonAddTeacher = new JButton("Add new Teacher");
		buttonAddTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeacherAdder();
			}
		});
		panel.add(buttonAddTeacher);
		
		JLabel labelAddTeacher = new JLabel("Click Button on the left if you wish to add new teacher");
		panel.add(labelAddTeacher);
		
		JPanel panelSchool = new JPanel();
		panelSchool.setBounds(0, 104, 1000, 33);
		getContentPane().add(panelSchool);
		
		JButton buttonSchoolBalance = new JButton("School Balance");
		buttonSchoolBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WindowsCumonication().getSchoolBalance();
			}
		});
		panelSchool.add(buttonSchoolBalance);
		
		JLabel labelSchool = new JLabel("Button on the left highlights school's balance");
		panelSchool.add(labelSchool);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 192, 1000, 33);
		getContentPane().add(panel_1);
		
		JButton buttonAddWorker = new JButton("Add new Worker");
		buttonAddWorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WorkerAdder();
			}
		});
		panel_1.add(buttonAddWorker);
		
		JLabel lblClickButtonOn = new JLabel("Click Button on the left if you wish to add new Worker to the system");
		panel_1.add(lblClickButtonOn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 236, 1000, 33);
		getContentPane().add(panel_2);
		
		JButton btnAddNewStudent = new JButton("Add new Student");
		btnAddNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentAdder();
			}
		});
		panel_2.add(btnAddNewStudent);
		
		JLabel lblClickButtonOn_1 = new JLabel("Click button on the left if you wish to add new Student to the system");
		panel_2.add(lblClickButtonOn_1);
	}
}
