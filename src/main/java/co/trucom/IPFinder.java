package co.trucom;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IPFinder extends Frame implements ActionListener {
	
	private JTextField textField;
	private JLabel label;
	private JButton button;
	
	public IPFinder() {
		textField = new JTextField();
		textField.setBounds(50, 50, 150, 20);
		
		label = new JLabel();
		label.setBounds(50, 100, 150, 20);
		
		button = new JButton("Find IP");
		button.setBounds(50, 150, 150, 20);
		
		button.addActionListener(this);
		
		add(textField);
		add(label);
		add(button);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			String host = textField.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			label.setText(ip);
		} catch(Exception ex) {
			throw new RuntimeException("Got error getting IP: " + ex);
		}
	}

}
