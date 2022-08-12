package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

@SuppressWarnings("serial")
public class Second extends JFrame {
	

	private ImageIcon image;
	private JLabel label;
	private JPanel panel;
	private JTextField player1;
	private JTextField player2;
	private JButton button;
	private JLabel player1Prompt;
	private JLabel player2Prompt;
	
	public Second() {
		
		
		image = new ImageIcon("second frame 2.jpg");
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setIcon(image);
		label.setPreferredSize(new Dimension(1000,this.getHeight()));
		
		player1Prompt = new JLabel();
		player1Prompt.setText("PLAYER ONE: ");
		player1Prompt.setFont(new Font("Marvel-Regular",Font.PLAIN,20));
		player1Prompt.setForeground(Color.white);
		player1Prompt.setBackground(new Color(0x040718));
		
		player2Prompt = new JLabel();
		player2Prompt.setText("PLAYER TWO: ");
		player2Prompt.setFont(new Font("Marvel-Regular",Font.PLAIN,20));
		player2Prompt.setForeground(Color.white);
		player2Prompt.setBackground(new Color(0x040718));
		
		
		player1 = new JTextField();
		player1.setPreferredSize(new Dimension(250,40));
		player1.setFont(new Font("Nanum Brush Script",Font.PLAIN,35));
		player1.setBackground(Color.white);
		player1.setForeground(new Color(0xBE3235));
		player1.setCaretColor(new Color(0xBE3235));
		
		
		player2 = new JTextField();
		player2.setPreferredSize(new Dimension(250,40));
		player2.setFont(new Font("Nanum Brush Script",Font.PLAIN,35));
		player2.setBackground(Color.white);
		player2.setForeground(new Color(0x063970));
		player2.setCaretColor(new Color(0x063970));
		
		button = new JButton();
		button.setFont(new Font("Marvel-Regular",Font.PLAIN,25));
		button.setText("SUBMIT");
		button.setBorderPainted(false);
		button.setOpaque(true);
		button.setForeground(Color.white);
		button.setBackground(new Color(0x040718));
		button.setFocusable(false);
	
		panel = new JPanel();
		panel.setBackground(new Color(0x040718));
		panel.add(player1Prompt);
		panel.add(player1);
		panel.add(player2Prompt);
		panel.add(player2);
		panel.add(button);
		panel.setPreferredSize(new Dimension(280,this.getHeight()));
		
		
		this.setSize(1280,800);
		this.setTitle("Marvel: Ultimate War");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1280,800);
		this.add(label, BorderLayout.CENTER);
		this.add(panel, BorderLayout.WEST);
		this.setVisible(true);
		this.validate();
		this.repaint();
		
	}

	public JTextField getPlayer2() {
		return player2;
	}

	public JTextField getPlayer1() {
		return player1;
	}

	public JButton getButton() {
		return button;
	}
}