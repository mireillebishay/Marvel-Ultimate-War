package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

@SuppressWarnings("serial")
public class First extends JFrame {
	
	private JLabel label;
	private ImageIcon image;
	private JButton button;
	
	
	public First() {
		
		image = new ImageIcon("marvel-intro.gif");
		
		button = new JButton();
		button.setFont(new Font("Marvel-Regular",Font.PLAIN,25));
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setText("PLAY!");
		button.setForeground(new Color(0xba0801));
		button.setFocusable(false);
		button.setBounds(600, 660, 110, 40);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setIcon(image);
		
		this.setSize(1280,800);
		this.setTitle("Marvel: Ultimate War");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button);
		this.add(label, BorderLayout.CENTER);
		this.setVisible(true);
		this.validate();
		this.repaint();
		
		
	}
	
	public JButton getButton() {
		return button;
	}
}