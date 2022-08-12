package views;

import java.awt.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Third extends JFrame {
	
	private JButton captainAmerica, deadpool, drStrange, electro, ghostRider, hela, hulk, iceman, ironman,
	loki, quicksilver, spiderman, thor, venom, yellowJacket;
	
	private ImageIcon captainAmericaIcon, deadpoolIcon, drStrangeIcon, electroIcon, ghostRiderIcon, helaIcon,
	hulkIcon, icemanIcon, ironmanIcon, lokiIcon, quicksilverIcon, spidermanIcon, thorIcon,
	venomIcon, yellowJacketIcon;
	
	private JPanel players, info, teams, team1, team2;
	
	private JButton pick, start;
	
	private JTextAreaPlus championsInfo;
	
	private JLabel oneOne, oneTwo, oneThree, twoOne, twoTwo, twoThree, declareOne, declareTwo;
	
	private ArrayList <ImageIcon> icons;
	
	private ArrayList <JButton> buttons;
	
	public Third() {
		
		captainAmerica = new JButton();
		deadpool = new JButton();
		drStrange = new JButton();
		electro = new JButton();
		ghostRider = new JButton();	
		hela = new JButton();
		hulk = new JButton();
		iceman = new JButton();
		ironman = new JButton();
		loki = new JButton();
		quicksilver = new JButton();
		spiderman = new JButton();
		thor = new JButton();
		venom = new JButton();		
		yellowJacket = new JButton();
		
		captainAmerica.setName("Captain America");
		deadpool.setName("Deadpool");
		drStrange.setName("Dr Strange");
		electro.setName("Electro");
		ghostRider.setName("Ghost Rider");
		hela.setName("Hela");
		hulk.setName("Hulk");
		iceman.setName("Iceman");
		ironman.setName("Ironman");
		loki.setName("Loki");
		quicksilver.setName("Quicksilver");
		spiderman.setName("Spiderman");
		thor.setName("Thor");
		venom.setName("Venom");
		yellowJacket.setName("Yellow Jacket");
		
		buttons = new ArrayList <JButton>();
		buttons.add(captainAmerica);
		buttons.add(deadpool);
		buttons.add(drStrange);
		buttons.add(electro);
		buttons.add(ghostRider);
		buttons.add(hela);
		buttons.add(hulk);
		buttons.add(iceman);
		buttons.add(ironman);
		buttons.add(loki);
		buttons.add(quicksilver);
		buttons.add(spiderman);
		buttons.add(thor);
		buttons.add(venom);
		buttons.add(yellowJacket);
		
		captainAmericaIcon = new ImageIcon ("captain america 1.PNG");
		deadpoolIcon = new ImageIcon ("deadpool 1.PNG");
		drStrangeIcon = new ImageIcon ("dr strange 1.PNG");
		electroIcon = new ImageIcon ("electro.PNG");
		ghostRiderIcon = new ImageIcon ("ghost rider 1.PNG");
		helaIcon = new ImageIcon ("hela 1.PNG");
		hulkIcon = new ImageIcon ("hulk 1.PNG");
		icemanIcon = new ImageIcon ("iceman 1.PNG");
		ironmanIcon = new ImageIcon ("ironman 1.PNG");
		lokiIcon = new ImageIcon ("loki 1.PNG");
		quicksilverIcon = new ImageIcon ("quicksilver 1.PNG");
		spidermanIcon = new ImageIcon ("spiderman 1.PNG");
		thorIcon = new ImageIcon ("thor 1.PNG");
		venomIcon = new ImageIcon ("venom 1.PNG");
		yellowJacketIcon = new ImageIcon ("yellow jacket 1.PNG");
		
		captainAmericaIcon.setDescription("Captain America");
		deadpoolIcon.setDescription("Deadpool");
		drStrangeIcon.setDescription("Dr Strange");
		electroIcon.setDescription("Electro");
		ghostRiderIcon.setDescription("Ghost Rider");
		helaIcon.setDescription("Hela");
		hulkIcon.setDescription("Hulk");
		icemanIcon.setDescription("Iceman");
		ironmanIcon.setDescription("Ironman");
		lokiIcon.setDescription("Loki");
		quicksilverIcon.setDescription("Quicksilver");
		spidermanIcon.setDescription("Spiderman");
		thorIcon.setDescription("Thor");
		venomIcon.setDescription("Venom");
		yellowJacketIcon.setDescription("Yellow Jacket");
		
		icons = new ArrayList <ImageIcon>();
		
		icons.add(captainAmericaIcon);
		icons.add(deadpoolIcon);
		icons.add(drStrangeIcon);
		icons.add(electroIcon);
		icons.add(ghostRiderIcon);
		icons.add(helaIcon);
		icons.add(hulkIcon);
		icons.add(icemanIcon);
		icons.add(ironmanIcon);
		icons.add(lokiIcon);
		icons.add(quicksilverIcon);
		icons.add(spidermanIcon);
		icons.add(thorIcon);
		icons.add(venomIcon);
		icons.add(yellowJacketIcon);
		
		
		captainAmerica.setIcon(captainAmericaIcon);
		deadpool.setIcon(deadpoolIcon);
		drStrange.setIcon(drStrangeIcon);
		electro.setIcon(electroIcon);
		ghostRider.setIcon(ghostRiderIcon);
		hela.setIcon(helaIcon);
		hulk.setIcon(hulkIcon);
		iceman.setIcon(icemanIcon);
		ironman.setIcon(ironmanIcon);
		loki.setIcon(lokiIcon);
		quicksilver.setIcon(quicksilverIcon);
		spiderman.setIcon(spidermanIcon);
		thor.setIcon(thorIcon);
		venom.setIcon(venomIcon);
		yellowJacket.setIcon(yellowJacketIcon);
		
		players = new JPanel();
		players.setLayout(new GridLayout(3,5));
		players.setBackground(new Color(0xF8F0E3));
		players.add(captainAmerica);
		players.add(deadpool);
		players.add(drStrange);
		players.add(electro);
		players.add(ghostRider);
		players.add(hela);
		players.add(hulk);
		players.add(iceman);
		players.add(ironman);
		players.add(loki);
		players.add(quicksilver);
		players.add(spiderman);
		players.add(thor);
		players.add(venom);
		players.add(yellowJacket);
		
		
		pick = new JButton();
		pick.setText("PICK");
		pick.setPreferredSize(new Dimension(330,40));
		pick.setFont(new Font("Marvel-Regular",Font.PLAIN,25));
		pick.setBackground(Color.white);
		pick.setForeground(new Color(0xBE3235));
		
		ImageIcon i = new ImageIcon("rn.JPG");
		
		championsInfo = new JTextAreaPlus();
		
		championsInfo.setEditable(false);
		championsInfo.setFont(new Font("FrostbiteBossFight",Font.PLAIN,22));
		championsInfo.setBackground(Color.white);
		championsInfo.setForeground(Color.black);
		championsInfo.setImage(i);
		
		
		oneOne = new JLabel();
		oneTwo = new JLabel();
		oneThree = new JLabel();
		twoOne = new JLabel();
		twoTwo = new JLabel();
		twoThree = new JLabel();
		declareOne = new JLabel();
		declareTwo = new JLabel();
		
		declareOne.setFont(new Font("Nanum Brush Script",Font.PLAIN,25));
		declareOne.setForeground(new Color(0xBE3235));
		declareTwo.setFont(new Font("Nanum Brush Script",Font.PLAIN,25));
		declareTwo.setForeground(new Color(0x063970));
		
		info = new JPanel();
		info.setLayout(new BorderLayout());
		info.setPreferredSize(new Dimension(330,this.getHeight()));
		info.add(championsInfo, BorderLayout.CENTER);
		info.add(pick, BorderLayout.SOUTH);
		
		team1 = new JPanel();
		team1.add(declareOne, BorderLayout.NORTH);
		team1.add(oneOne);
		team1.add(oneTwo);
		team1.add(oneThree);
		team1.setBackground(new Color(0xd47979));
		
		
		team2 = new JPanel();
		team2.add(declareTwo, BorderLayout.NORTH);
		team2.add(twoOne);
		team2.add(twoTwo);
		team2.add(twoThree);
		team2.setBackground(new Color(0x75b0fb));
		 
		teams = new JPanel();
		teams.setLayout(new BorderLayout());
		teams.setPreferredSize(new Dimension(this.getWidth(), 200));
		teams.add(team1, BorderLayout.WEST);
		teams.add(team2, BorderLayout.EAST);
		teams.setBackground(new Color(0xb2b2b2));
		
		start = new JButton();
		start.setText("START");
		start.setPreferredSize(new Dimension(330,40));
		start.setFont(new Font("Marvel-Regular",Font.PLAIN,25));
		start.setBackground(Color.white);
		start.setForeground(Color.black);
		
		
		this.setTitle("Marvel: Ultimate War");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1280,800);
		this.add(players, BorderLayout.CENTER);
		this.add(info, BorderLayout.EAST);
		this.add(teams, BorderLayout.SOUTH);
		this.setVisible(true);
		this.validate();
		this.repaint();
		
	}
	
	public JLabel getDeclareOne() {
		return declareOne;
	}

	public JLabel getDeclareTwo() {
		return declareTwo;
	}

	public JButton getStart() {
		return start;
	}

	public void transition() {
		pick.setVisible(false);
		start.setText("START");
		pick.setFont(new Font("Marvel-Regular",Font.PLAIN,25));
		pick.setBackground(Color.white);
		pick.setForeground(new Color(0x063970));
		start.setVisible(true);
		info.add(start, BorderLayout.SOUTH);
		
	}
	
	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	public ArrayList<ImageIcon> getIcons() {
		return icons;
	}

	public JLabel getOneOne() {
		return oneOne;
	}

	public JLabel getOneTwo() {
		return oneTwo;
	}

	public JLabel getOneThree() {
		return oneThree;
	}

	public JLabel getTwoOne() {
		return twoOne;
	}

	public JLabel getTwoTwo() {
		return twoTwo;
	}

	public JLabel getTwoThree() {
		return twoThree;
	}

	public JButton getPick() {
		return pick;
	}

	public JTextArea getChampionsInfo() {
		return championsInfo;
	}

	public JButton getCaptainAmerica() {
		return captainAmerica;
	}

	public JButton getDeadpool() {
		return deadpool;
	}

	public JButton getDrStrange() {
		return drStrange;
	}

	public JButton getElectro() {
		return electro;
	}

	public JButton getGhostRider() {
		return ghostRider;
	}

	public JButton getHela() {
		return hela;
	}

	public JButton getHulk() {
		return hulk;
	}

	public JButton getIceman() {
		return iceman;
	}

	public JButton getIronman() {
		return ironman;
	}

	public JButton getLoki() {
		return loki;
	}

	public JButton getQuicksilver() {
		return quicksilver;
	}

	public JButton getSpiderman() {
		return spiderman;
	}

	public JButton getThor() {
		return thor;
	}

	public JButton getVenom() {
		return venom;
	}

	public JButton getYellowJacket() {
		return yellowJacket;
	}

}