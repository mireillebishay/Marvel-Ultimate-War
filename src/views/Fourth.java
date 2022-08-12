package views;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Fourth extends JFrame {
	
	private JPanel center,pq,map,controls,one, two,c1,c2;
	
	private ImageIcon captainAmericaImage, deadpoolImage, drStrangeImage, electroImage, ghostRiderImage, helaImage,
	hulkImage, icemanImage, ironmanImage, lokiImage, quicksilverImage, spidermanImage, thorImage,
	venomImage, yellowJacketImage;
	
	private GridBagConstraints gbc;
	
	private JLabel l1,l2,l3,l4,l5,l6,l7,n1,n2,pq1,pq2,pq3,pq4,pq5,pq6;
	
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12
	,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
	
	private JButton a, ca1,ca2,ca3,la,et;
	
	private JButton cha1, cha2, cha3, cha4, cha5, cha6, cha7;

	private JButton ae1, ae2, ae3, ae4, ae5, ae6, ae7;

	private JTextArea t1,t2,t3,t4,t5,t6,t7, abilitiesTxt, appliedEffectsTxt;

	private JFrame abilities, attack, appliedEffects, castAbilityDirectional;
	
	public JFrame getCastAbilityDirectional() {
		return castAbilityDirectional;
	}
	private JRadioButton u,d,r,l, u1, d1, r1, l11;
	
	private ButtonGroup g, g1;

	public Fourth() {
		
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,20,10,1);
		
		captainAmericaImage = new ImageIcon ("captain america 2.PNG");
		deadpoolImage = new ImageIcon ("deadpool 2.PNG");
		drStrangeImage = new ImageIcon ("dr strange 2.PNG");
		electroImage = new ImageIcon ("electro 2.PNG");
		ghostRiderImage = new ImageIcon ("ghost rider 2.PNG");
		helaImage = new ImageIcon ("hela 2.PNG");
		hulkImage = new ImageIcon ("hulk 2.PNG");
		icemanImage = new ImageIcon ("iceman 2.PNG");
		ironmanImage = new ImageIcon ("ironman 2.PNG");
		lokiImage = new ImageIcon ("loki 2.PNG");
		quicksilverImage = new ImageIcon ("quicksilver 2.PNG");
		spidermanImage = new ImageIcon ("spiderman 2.PNG");
		thorImage = new ImageIcon ("thor 2.PNG");
		venomImage = new ImageIcon ("venom 2.PNG");
		yellowJacketImage = new ImageIcon ("yellow jacket 2.PNG");
		
		captainAmericaImage.setDescription("Captain America");
		deadpoolImage.setDescription("Deadpool");
		drStrangeImage.setDescription("Dr Strange");
		electroImage.setDescription("Electro");
		ghostRiderImage.setDescription("Ghost Rider");
		helaImage.setDescription("Hela");
		hulkImage.setDescription("Hulk");
		icemanImage.setDescription("Iceman");
		ironmanImage.setDescription("Ironman");
		lokiImage.setDescription("Loki");
		quicksilverImage.setDescription("Quicksilver");
		spidermanImage.setDescription("Spiderman");
		thorImage.setDescription("Thor");
		venomImage.setDescription("Venom");
		yellowJacketImage.setDescription("Yellow Jacket");
		
		l1 = new JLabel();
		l1.setIcon(new ImageIcon("frame.PNG"));
		
		l2 = new JLabel();
		l2.setIcon(new ImageIcon("frame.PNG"));
		
		l3 = new JLabel();
		l3.setIcon(new ImageIcon("frame.PNG"));
		
		cha1 = new JButton("Abilities");
		cha1.setFocusable(false);
		cha1.setBounds(90, 198, 80, 30);
		cha1.setFont(new Font("Impact", Font.PLAIN,11));
		cha1.setForeground(new Color(0xBE3235));
		
		ae1 = new JButton ("A. Effects");
		ae1.setFocusable(false);
		ae1.setBounds(160, 198, 80, 30);
		ae1.setFont(new Font("Impact", Font.PLAIN,11));
		ae1.setForeground(new Color(0xBE3235));
		
		t1 = new JTextArea();
		t1.setFocusable(false);
		t1.setOpaque(false);
		t1.setFont(new Font("Impact", Font.PLAIN,11));
		t1.setForeground(new Color(0xf4f0e7));
		t1.setEditable(false);
		t1.setBounds(105, 30, 150, 200);
		l1.add(t1);
		l1.add(cha1);
		l1.add(ae1);
		
		cha2 = new JButton("Abilities");
		cha2.setFocusable(false);
		cha2.setBounds(90, 198, 80, 30);
		cha2.setFont(new Font("Impact", Font.PLAIN,11));
		cha2.setForeground(new Color(0xBE3235));
		
		ae2 = new JButton ("A. Effects");
		ae2.setFocusable(false);
		ae2.setBounds(160, 198, 80, 30);
		ae2.setFont(new Font("Impact", Font.PLAIN,11));
		ae2.setForeground(new Color(0xBE3235));
		
		
		t2 = new JTextArea();
		t2.setFocusable(false);
		t2.setOpaque(false);
		t2.setFont(new Font("Impact", Font.PLAIN,13));
		t2.setForeground(new Color(0xf4f0e7));
		t2.setEditable(false);
		t2.setBounds(105, 30, 150, 200);
		l2.add(t2);
		l2.add(cha2);
		l2.add(ae2);
		
		cha3 = new JButton("Abilities");
		cha3.setFocusable(false);
		cha3.setBounds(90, 198, 80, 30);
		cha3.setFont(new Font("Impact", Font.PLAIN,11));
		cha3.setForeground(new Color(0xBE3235));
		
		ae3 = new JButton ("A. Effects");
		ae3.setFocusable(false);
		ae3.setBounds(160, 198, 80, 30);
		ae3.setFont(new Font("Impact", Font.PLAIN,11));
		ae3.setForeground(new Color(0xBE3235));
		
		t3 = new JTextArea();
		t3.setFocusable(false);
		t3.setOpaque(false);
		t3.setFont(new Font("Impact", Font.PLAIN,13));
		t3.setForeground(new Color(0xf4f0e7));
		t3.setEditable(false);
		t3.setBounds(105, 30, 150, 200);
		l3.add(t3);
		l3.add(cha3);
		l3.add(ae3);
		
		l1.add(t1);
		l2.add(t2);
		l3.add(t3);
		
		n1 = new JLabel();
		n1.setFont(new Font("Impact", Font.PLAIN,13));
		n1.setForeground(new Color(0xf4f0e7));
		
		n2 = new JLabel();
		n2.setFont(new Font("Impact", Font.PLAIN,13));
		n2.setForeground(new Color(0xf4f0e7));
		
		one = new JPanel();
		one.setPreferredSize(new Dimension(200,this.getHeight()));
		one.setBackground(new Color(0xBE3235));
		one.add(n1);
		one.add(l1);
		one.add(l2);
		one.add(l3);
		
		l4 = new JLabel();
		l4.setIcon(new ImageIcon("frame.PNG"));
		
		l5 = new JLabel();
		l5.setIcon(new ImageIcon("frame.PNG"));
		
		l6 = new JLabel();
		l6.setIcon(new ImageIcon("frame.PNG"));
		
		cha4 = new JButton("Abilities");
		cha4.setFocusable(false);
		cha4.setBounds(90, 198, 80, 30);
		cha4.setFont(new Font("Impact", Font.PLAIN,11));
		cha4.setForeground(new Color(0x063970));
		
		ae4 = new JButton ("A. Effects");
		ae4.setFocusable(false);
		ae4.setBounds(160, 198, 80, 30);
		ae4.setFont(new Font("Impact", Font.PLAIN,11));
		ae4.setForeground(new Color(0x063970));
		
		t4 = new JTextArea();
		t4.setFocusable(false);
		t4.setOpaque(false);
		t4.setFont(new Font("Impact", Font.PLAIN,11));
		t4.setForeground(new Color(0xf4f0e7));
		t4.setEditable(false);
		t4.setBounds(105, 30, 150, 200);
		l4.add(t4);
		l4.add(cha4);
		l4.add(ae4);
		
		cha5 = new JButton("Abilities");
		cha5.setFocusable(false);
		cha5.setBounds(90, 198, 80, 30);
		cha5.setFont(new Font("Impact", Font.PLAIN,11));
		cha5.setForeground(new Color(0x063970));
		
		ae5 = new JButton ("A. Effects");
		ae5.setFocusable(false);
		ae5.setBounds(160, 198, 80, 30);
		ae5.setFont(new Font("Impact", Font.PLAIN,11));
		ae5.setForeground(new Color(0x063970));
		
		t5 = new JTextArea();
		t5.setFocusable(false);
		t5.setOpaque(false);
		t5.setFont(new Font("Impact", Font.PLAIN,13));
		t5.setForeground(new Color(0xf4f0e7));
		t5.setEditable(false);
		t5.setBounds(105, 30, 150, 200);
		l5.add(t5);
		l5.add(cha5);
		l5.add(ae5);
		
		cha6 = new JButton("Abilities");
		cha6.setFocusable(false);
		cha6.setBounds(90, 198, 80, 30);
		cha6.setFont(new Font("Impact", Font.PLAIN,11));
		cha6.setForeground(new Color(0x063970));
		
		ae6 = new JButton ("A. Effects");
		ae6.setFocusable(false);
		ae6.setBounds(160, 198, 80, 30);
		ae6.setFont(new Font("Impact", Font.PLAIN,11));
		ae6.setForeground(new Color(0x063970));
		
		t6 = new JTextArea();
		t6.setFocusable(false);
		t6.setOpaque(false);
		t6.setFont(new Font("Impact", Font.PLAIN,13));
		t6.setForeground(new Color(0xf4f0e7));
		t6.setEditable(false);
		t6.setBounds(105, 30, 150, 200);
		l6.add(t6);
		l6.add(cha6);
		l6.add(ae6);
		
		l4.add(t4);
		l5.add(t5);
		l6.add(t6);
		
		two = new JPanel();
		two.setPreferredSize(new Dimension(200,this.getHeight()));
		two.setBackground(new Color(0x063970));
		two.add(n2);
		two.add(l4);
		two.add(l5);
		two.add(l6);
		
		abilitiesTxt = new JTextArea();
		abilitiesTxt.setOpaque(false);
		abilitiesTxt.setFont(new Font("Impact", Font.PLAIN,13));
		abilitiesTxt.setForeground(Color.black);
		abilitiesTxt.setEditable(false);
		
		appliedEffectsTxt = new JTextArea();
		appliedEffectsTxt.setOpaque(false);
		appliedEffectsTxt.setFont(new Font("Impact", Font.PLAIN,13));
		appliedEffectsTxt.setForeground(Color.black);
		appliedEffectsTxt.setEditable(false);
		
		et = new JButton();
		et.setFocusable(false);
		et.setText("End Turn");
		et.setFont(new Font("Impact", Font.PLAIN,11));
		
		pq1 = new JLabel();
		pq2 = new JLabel();
		pq3 = new JLabel();
		pq4 = new JLabel();
		pq5 = new JLabel();
		pq6 = new JLabel();
		
		pq = new JPanel();
		pq.setOpaque(true);
		pq.setBackground(new Color(0xB2B2B2));
		pq.add(pq1);
		pq.add(pq2);
		pq.add(pq3);
		pq.add(pq4);
		pq.add(pq5);
		pq.add(pq6);
		
		map = new JPanel();
		map.setLayout(new GridLayout(5,5));
		map.setBackground(new Color(0xF8F0E3));
		
		b1 = new JButton();
		b1.setFocusable(false);
		b2 = new JButton();
		b2.setFocusable(false);
		b3 = new JButton();
		b3.setFocusable(false);
		b4 = new JButton();
		b4.setFocusable(false);
		b5 = new JButton();
		b5.setFocusable(false);
		b6 = new JButton();
		b6.setFocusable(false);
		b7 = new JButton();
		b7.setFocusable(false);
		b8 = new JButton();
		b8.setFocusable(false);
		b9 = new JButton();
		b9.setFocusable(false);
		b10 = new JButton();
		b10.setFocusable(false);
		b11 = new JButton();
		b11.setFocusable(false);
		b12 = new JButton();
		b12.setFocusable(false);
		b13 = new JButton();
		b13.setFocusable(false);
		b14 = new JButton();
		b14.setFocusable(false);
		b15 = new JButton();
		b15.setFocusable(false);
		b16 = new JButton();
		b16.setFocusable(false);
		b17 = new JButton();
		b17.setFocusable(false);
		b18 = new JButton();
		b18.setFocusable(false);
		b19 = new JButton();
		b19.setFocusable(false);
		b20 = new JButton();
		b20.setFocusable(false);
		b21 = new JButton();
		b21.setFocusable(false);
		b22 = new JButton();
		b22.setFocusable(false);
		b23 = new JButton();
		b23.setFocusable(false);
		b24 = new JButton();
		b24.setFocusable(false);
		b25 = new JButton();
		b25.setFocusable(false);
		
		map.add(b1);
		map.add(b2);
		map.add(b3);
		map.add(b4);
		map.add(b5);
		map.add(b6);
		map.add(b7);
		map.add(b8);
		map.add(b9);
		map.add(b10);
		map.add(b11);
		map.add(b12);
		map.add(b13);
		map.add(b14);
		map.add(b15);
		map.add(b16);
		map.add(b17);
		map.add(b18);
		map.add(b19);
		map.add(b20);
		map.add(b21);
		map.add(b22);
		map.add(b23);
		map.add(b24);
		map.add(b25);
		
		c1 = new JPanel();
		c1.setLayout(new GridBagLayout());
		
		a = new JButton("ATTACK");
		a.setFont(new Font("Impact", Font.PLAIN,11));
		a.setFocusable(false);
		gbc.gridx = 1;
		gbc.gridy = 0;
		c1.add(a, gbc);
		
		ca1 = new JButton();
		ca1.setFont(new Font("Impact", Font.PLAIN,11));
		ca1.setFocusable(false);
		gbc.gridx = 0;
		gbc.gridy = 1;
		c1.add(ca1, gbc);
		
		ca2 = new JButton();
		ca2.setFont(new Font("Impact", Font.PLAIN,11));
		ca2.setFocusable(false);
		gbc.gridx = 1;
		gbc.gridy = 2;
		c1.add(ca2, gbc);
		
		ca3 = new JButton();
		ca3.setFont(new Font("Impact", Font.PLAIN,11));
		ca3.setFocusable(false);
		gbc.gridx = 2;
		gbc.gridy = 1;
		c1.add(ca3, gbc);
		
		la = new JButton("LEADER ABILITY");
		la.setFont(new Font("Impact", Font.PLAIN,11));
		la.setFocusable(false);
		gbc.gridx = 3;
		gbc.gridy = 1;
		c1.add(la, gbc);
	
		l7 = new JLabel();
		l7.setIcon(new ImageIcon("frame.PNG"));
		
		cha7 = new JButton("Abilities");
		cha7.setFocusable(false);
		cha7.setBounds(90, 198, 80, 30);
		cha7.setFont(new Font("Impact", Font.PLAIN,11));
		
		ae7 = new JButton("A. Effects");
		ae7.setFocusable(false);
		ae7.setBounds(160, 198, 80, 30);
		ae7.setFont(new Font("Impact", Font.PLAIN,11));
		
		t7 = new JTextArea();
		t7.setFocusable(false);
		t7.setOpaque(false);
		t7.setFont(new Font("Impact", Font.PLAIN,11));
		t7.setForeground(new Color(0xf4f0e7));
		t7.setEditable(false);
		t7.setBounds(105, 30, 150, 179);
		
		l7.add(t7);
		l7.add(cha7);
		l7.add(ae7);
		
		c2 = new JPanel();
		c2.setPreferredSize(new Dimension(200,244));
		c2.setBackground(new Color(0xBE3235));
		c2.add(l7);
		
		controls = new JPanel();
		controls.setLayout(new BorderLayout());
		controls.add(c1, BorderLayout.CENTER);
		controls.add(c2, BorderLayout.EAST);
		
		center = new JPanel();
		center.setLayout(new BorderLayout());
		center.add(pq, BorderLayout.NORTH);
		center.add(map, BorderLayout.CENTER);
		center.add(controls, BorderLayout.SOUTH);
		
		this.setSize(1280,800);
		this.setFocusable(true);
		this.setTitle("Marvel: Ultimate War");
		this.add(one, BorderLayout.WEST);
		this.add(two, BorderLayout.EAST);
		this.add(center, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.validate();
		this.repaint();
	}
	
	public JFrame getAbilities(JTextArea abilitiesTxt) {
		abilities = new JFrame();
		abilities.setSize(400,555);
		abilities.setFocusable(false);
		abilities.setTitle("Abilities");
		abilities.add(abilitiesTxt, BorderLayout.CENTER);
		abilities.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		abilities.setLocationRelativeTo(null);
		abilities.setVisible(true);
		abilities.validate();
		abilities.repaint();
		return abilities;
	}
	
	public JFrame getAppliedEffects (JTextArea appliedEffectsTxt) {
		appliedEffects = new JFrame();
		appliedEffects.setSize(400,555);
		appliedEffects.setFocusable(false);
		appliedEffects.setTitle("Applied Effects");
		appliedEffects.add(appliedEffectsTxt, BorderLayout.CENTER);
		appliedEffects.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		appliedEffects.setLocationRelativeTo(null);
		appliedEffects.setVisible(true);
		appliedEffects.validate();
		appliedEffects.repaint();
		return appliedEffects;
	}
	
	public void attack() {
		attack =  new JFrame();
		attack.setLayout(new FlowLayout());
		attack.setFocusable(false);
		attack.setTitle("please select the direction");
		attack.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		attack.pack();
		attack.setLocationRelativeTo(null);
		
		u = new JRadioButton("up");
		d = new JRadioButton("down");
		r = new JRadioButton("right");
		l = new JRadioButton("left");
		
		g = new ButtonGroup();
		g.add(u);
		g.add(d);
		g.add(r);
		g.add(l);
		attack.add(u);
		attack.add(d);
		attack.add(r);
		attack.add(l);
		attack.pack();
		attack.setVisible(true);
		attack.validate();
		attack.repaint();
	}
	
	public void castAbilityDirectional() {
		castAbilityDirectional = new JFrame();
		castAbilityDirectional.setLayout(new FlowLayout());
		castAbilityDirectional.setFocusable(false);
		castAbilityDirectional.setTitle("please select the direction");
		castAbilityDirectional.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		castAbilityDirectional.pack();
		castAbilityDirectional.setLocationRelativeTo(null);
		
		
		u1 = new JRadioButton("up");
		d1 = new JRadioButton("down");
		r1 = new JRadioButton("right");
		l11 = new JRadioButton("left");
		
		g1 = new ButtonGroup();
		g1.add(u);
		g1.add(d);
		g1.add(r);
		g1.add(l);
		
		castAbilityDirectional.add(u1);
		castAbilityDirectional.add(d1);
		castAbilityDirectional.add(r1);
		castAbilityDirectional.add(l11);
		castAbilityDirectional.pack();
		castAbilityDirectional.setVisible(true);
		castAbilityDirectional.validate();
		castAbilityDirectional.repaint();
		
	}

	public JPanel getOne() {
		return one;
	}

	public JPanel getTwo() {
		return two;
	}

	public JLabel getL1() {
		return l1;
	}

	public JLabel getL2() {
		return l2;
	}

	public JLabel getL3() {
		return l3;
	}

	public JLabel getL4() {
		return l4;
	}

	public JLabel getL5() {
		return l5;
	}

	public JLabel getL6() {
		return l6;
	}

	public JFrame getAttack() {
		return attack;
	}

	public JRadioButton getU() {
		return u;
	}

	public JRadioButton getD() {
		return d;
	}

	public JRadioButton getR() {
		return r;
	}

	public JRadioButton getL() {
		return l;
	}

	public JTextArea getAbilitiesTxt() {
		return abilitiesTxt;
	}
	public JTextArea getAppliedEffectsTxt() {
		return appliedEffectsTxt;
	}

	public JButton getCha1() {
		return cha1;
	}

	public JButton getCha2() {
		return cha2;
	}

	public JButton getCha3() {
		return cha3;
	}

	public JButton getCha4() {
		return cha4;
	}

	public JButton getCha5() {
		return cha5;
	}

	public JButton getCha6() {
		return cha6;
	}
	
	public JButton getCha7() {
		return cha7;
	}

	public JTextArea getT7() {
		return t7;
	}

	public JPanel getC1() {
		return c1;
	}

	public JPanel getC2() {
		return c2;
	}

	public JPanel getControls() {
		return controls;
	}

	public JLabel getPq1() {
		return pq1;
	}

	public JLabel getPq2() {
		return pq2;
	}

	public JLabel getPq3() {
		return pq3;
	}

	public JLabel getPq4() {
		return pq4;
	}

	public JLabel getPq5() {
		return pq5;
	}

	public JLabel getPq6() {
		return pq6;
	}

	public JButton getA() {
		return a;
	}

	public JButton getCa1() {
		return ca1;
	}

	public JButton getCa2() {
		return ca2;
	}

	public JButton getCa3() {
		return ca3;
	}

	public JButton getLa() {
		return la;
	}

	public JButton getEt() {
		return et;
	}

	public JButton getB1() {
		return b1;
	}

	public JButton getB2() {
		return b2;
	}

	public JButton getB3() {
		return b3;
	}

	public JButton getB4() {
		return b4;
	}

	public JButton getB5() {
		return b5;
	}

	public JButton getB6() {
		return b6;
	}

	public JButton getB7() {
		return b7;
	}

	public JButton getB8() {
		return b8;
	}

	public JButton getB9() {
		return b9;
	}

	public JButton getB10() {
		return b10;
	}

	public JButton getB11() {
		return b11;
	}

	public JButton getB12() {
		return b12;
	}

	public JButton getB13() {
		return b13;
	}

	public JButton getB14() {
		return b14;
	}

	public JButton getB15() {
		return b15;
	}

	public JButton getB16() {
		return b16;
	}

	public JButton getB17() {
		return b17;
	}

	public JButton getB18() {
		return b18;
	}

	public JButton getB19() {
		return b19;
	}

	public JButton getB20() {
		return b20;
	}

	public JButton getB21() {
		return b21;
	}

	public JButton getB22() {
		return b22;
	}

	public JButton getB23() {
		return b23;
	}

	public JButton getB24() {
		return b24;
	}

	public JButton getB25() {
		return b25;
	}

	public JPanel getPq() {
		return pq;
	}

	public JPanel getMap() {
		return map;
	}

	public JLabel getN1() {
		return n1;
	}

	public JLabel getN2() {
		return n2;
	}

	public JTextArea getT1() {
		return t1;
	}

	public JTextArea getT2() {
		return t2;
	}

	public JTextArea getT3() {
		return t3;
	}

	public JTextArea getT4() {
		return t4;
	}

	public JTextArea getT5() {
		return t5;
	}

	public JTextArea getT6() {
		return t6;
	}
	
	public JPanel getCenter() {
		return center;
	}
	
	public JButton getAe1() {
		return ae1;
	}

	public JButton getAe2() {
		return ae2;
	}

	public JButton getAe3() {
		return ae3;
	}

	public JButton getAe4() {
		return ae4;
	}

	public JButton getAe5() {
		return ae5;
	}

	public JButton getAe6() {
		return ae6;
	}
	
	public JButton getAe7() {
		return ae7;
	}
	
	public JRadioButton getU1() {
		return u1;
	}

	public JRadioButton getD1() {
		return d1;
	}

	public JRadioButton getR1() {
		return r1;
	}

	public JRadioButton getL11() {
		return l11;
	}
}