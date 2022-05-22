import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WorkerAdder extends JDialog {
	private JTextField textWorkerName;
	private JTextField textWorkerJobTitle;
	private JButton buttonWorkerAdd;


	/**
	 * Create the dialog.
	 */
	public WorkerAdder() {
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 1208, 214);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel labelWorkerName = new JLabel("On the right enter Name of the Worker you wish to add");
		labelWorkerName.setBackground(Color.GREEN);
		labelWorkerName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelWorkerName.setBounds(256, 29, 571, 49);
		getContentPane().add(labelWorkerName);
		
		textWorkerName = new JTextField();
		textWorkerName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textWorkerName.setText("Here Enter Worker Name");
		textWorkerName.setBounds(801, 39, 350, 29);
		getContentPane().add(textWorkerName);
		textWorkerName.setColumns(10);
		
		JLabel labelWorkerJobTitle = new JLabel("On the right enter Job Title of the Worker you wish to add");
		labelWorkerJobTitle.setBackground(Color.GREEN);
		labelWorkerJobTitle.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelWorkerJobTitle.setBounds(256, 109, 511, 41);
		getContentPane().add(labelWorkerJobTitle);
		
		textWorkerJobTitle = new JTextField();
		textWorkerJobTitle.setText("janitor / librarian / secretary");
		textWorkerJobTitle.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textWorkerJobTitle.setColumns(10);
		textWorkerJobTitle.setBounds(801, 115, 350, 29);
		getContentPane().add(textWorkerJobTitle);
		
		buttonWorkerAdd = new JButton("Add Worker");
		buttonWorkerAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int foo = 0;
				Main main = new Main();
				Worker newWorker = new Worker();
				
				if (textWorkerName.getText().isEmpty() || textWorkerJobTitle.getText().isEmpty()) {
					++foo;
				}
				else {
					newWorker = new Worker(textWorkerName.getText(), textWorkerJobTitle.getText());
				}
				
				System.out.println(":iczba foo " + foo);
				if (foo == 0 && (!newWorker.getName().isEmpty() && newWorker.getSalary() > 0)) {
					System.out.println("Nowy Pracownik: " + newWorker.getPerosonalInfo());
					main.workers.add(newWorker);
					System.out.println("Nowy Pracownik: " + main.workers.getLast());
				}
				else {
					new WindowsCumonication().showErrorWindow();
				}
			}
		});
		buttonWorkerAdd.setFont(new Font("Tahoma", Font.PLAIN, 19));
		buttonWorkerAdd.setBounds(66, 71, 137, 49);
		getContentPane().add(buttonWorkerAdd);
		setVisible(true);
	}
}
