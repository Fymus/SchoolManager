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

public class WorkerSearcher extends JDialog {
	private JTextField textFieldWorkerSearcher;


	/**
	 * Create the dialog.
	 */
	public WorkerSearcher() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1086, 507);
		getContentPane().setLayout(null);
		
		JLabel labelWorkerSearcher = new JLabel("On The right Enter Name of the Worker you wish to loop up");
		labelWorkerSearcher.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelWorkerSearcher.setBounds(261, 22, 516, 52);
		getContentPane().add(labelWorkerSearcher);
		
		textFieldWorkerSearcher = new JTextField();
		textFieldWorkerSearcher.setBounds(787, 36, 275, 32);
		getContentPane().add(textFieldWorkerSearcher);
		textFieldWorkerSearcher.setColumns(10);
		
		JTextArea textAreaWorkerSearcher = new JTextArea();
		textAreaWorkerSearcher.setBounds(10, 85, 1052, 375);
		getContentPane().add(textAreaWorkerSearcher);
		
		JButton buttonWorker = new JButton("Click To Search");
		buttonWorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				Worker worker = new Worker();
				
				for (int i = 0; i < main.workers.size(); i++) {
					if(main.workers.get(i).getName().equals(textFieldWorkerSearcher.getText())) {
						textAreaWorkerSearcher.append(main.workers.get(i).getPerosonalInfo() + "\n");
						break;
					}
				}
			}
		});
		buttonWorker.setBackground(Color.BLUE);
		buttonWorker.setFont(new Font("Tahoma", Font.PLAIN, 19));
		buttonWorker.setBounds(10, 22, 156, 42);
		getContentPane().add(buttonWorker);
		setVisible(true);
	}
}
