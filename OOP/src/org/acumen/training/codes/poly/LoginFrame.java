package org.acumen.training.codes.poly;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.TemporalField;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static JTextField tField;
	private static JButton button;
	
	public static void main(String[] args) {

		LoginFrame loginFrame = new LoginFrame();

		tField = new JTextField(100);
		tField.setEditable(true);
		button = new JButton("Submit");

		JPanel panel = new JPanel();

		button.addActionListener(new LoginFrame());
		panel.add(tField);
		panel.add(button);
		loginFrame.add(panel);
		loginFrame.setSize(200, 200);
		loginFrame.setVisible(true);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == "submit") {
		tField.setText("");
	}
		
	}
}
