package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Fifth extends JFrame {
	private JLabel label;
	private ImageIcon image;
	private JTextArea winnerTop, winnerBottom, winnerJoke;
	
	
	public Fifth() {
		
		image = new ImageIcon("fifth frame copy.JPEG");
		
		winnerTop = new JTextArea("Congratulations, ");
		winnerTop.setFocusable(false);
		winnerTop.setEditable(false);
		winnerTop.setOpaque(false);
		winnerTop.setFont(new Font("Impact", Font.PLAIN,50));
		winnerTop.setForeground(Color.white);
		winnerTop.setBounds(480, 60, 700, 179);
		
		winnerBottom = new JTextArea("YOU WON!");
		winnerBottom.setFocusable(false);
		winnerBottom.setEditable(false);
		winnerBottom.setOpaque(false);
		winnerBottom.setFont(new Font("Marvel-Regular", Font.PLAIN,100));
		winnerBottom.setForeground(Color.white);
		winnerBottom.setBounds(480, 600, 700, 179);
		
		winnerJoke = new JTextArea("wallah w 3amalouha el regala");
		winnerJoke.setFocusable(false);
		winnerJoke.setEditable(false);
		winnerJoke.setOpaque(false);
		winnerJoke.setFont(new Font("Helvetica Neue", Font.PLAIN,15));
		winnerJoke.setForeground(Color.white);
		winnerJoke.setBounds(550, 750, 700, 179);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setIcon(image);
		
		this.setSize(1280,800);
		this.setTitle("Marvel: Ultimate War");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(winnerTop);
		this.add(winnerBottom);
		this.add(winnerJoke);
		this.add(label, BorderLayout.CENTER);
		this.setVisible(true);
		this.validate();
		this.repaint();
		
		
	}
	
	public JTextArea getWinnerTop() {
		return winnerTop;
	}
}
