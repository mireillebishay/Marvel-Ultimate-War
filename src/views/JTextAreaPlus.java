package views;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JTextAreaPlus extends JTextArea{

	
	Image image;
	
	public JTextAreaPlus() {
		super();
	}
	
	public JTextAreaPlus(String text) {
		super(text);
	}
	
	public void setImage(ImageIcon icon) {
		this.image = icon.getImage();
		setOpaque(false);
		repaint();
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, null);
		super.paint(g);
	}
}
