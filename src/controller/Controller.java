package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import engine.*;
import model.abilities.*;
import model.world.*;
import views.*;
import exceptions.*;
import model.effects.*;

public class Controller implements ActionListener, KeyListener {
	
	private Game game;
	private Player one;
	private Player two;
	private First first; 
	private Second second;
	private Third third;
	private Fourth fourth;
	private Fifth fifth;
	private static String firstName;
	private static String secondName;
	private int count;
	private int c = 1;
	private int c1 = 0;
	private String infoToGet; 
	private boolean f0,f1,f2,f3,f4,f5 = false;
	
	public Controller() {
		count = 0;
		first = new First();
		first.getButton().addActionListener(this);
		
	}
	
	public void updateInfo(JButton champion, JTextArea championInfo) {
		String name = champion.getName();
		infoToGet = "";
		
		switch(name) {
		case "Captain America":
			infoToGet = "Captain America";
			break;
			
		case "Deadpool":
			infoToGet = "Deadpool";
			break;
			
		case "Dr Strange":
			infoToGet = "Dr Strange";
			break;
			
		case "Electro":
			infoToGet = "Electro";
			break;
			
		case "Ghost Rider":
			infoToGet = "Ghost Rider";
			break;
			
		case "Hela":
			infoToGet = "Hela";
			break;
			
		case "Hulk":
			infoToGet = "Hulk";
			break;
			
		case "Iceman":
			infoToGet = "Iceman";
			break;
			
		case "Ironman":
			infoToGet = "Ironman";
			break;
			
		case "Loki":
			infoToGet = "Loki";
			break;
			
		case "Quicksilver":
			infoToGet = "Quicksilver";
			break;
			
		case "Spiderman":
			infoToGet = "Spiderman";
			break;
			
		case "Thor":
			infoToGet = "Thor";
			break;
			
		case "Venom":
			infoToGet = "Venom";
			break;
			
		case "Yellow Jacket":
			infoToGet = "Yellow Jacket";
			break;
		}
		
		String info = "";
		
		for (Champion c: Game.getAvailableChampions()) {
			if (c.getName().equals(infoToGet)) {
				if(count == 0)
					info = " " + second.getPlayer1().getText() + ", please pick your leader..." + '\n';
				else if(count == 1)
		    		info = " " + second.getPlayer2().getText() + ", please pick your leader..." + '\n';
				else if(count>1 && count%2==0)
					info = " " + second.getPlayer1().getText() + ", please pick your champion..." + '\n';
				else if(count>1 && count%2 == 1)
					info = " " + second.getPlayer2().getText() + ", please pick your champion..." + '\n';
				info += " Name: " + c.getName() + '\n';
				info += " Maximum Health Points: " + c.getMaxHP() + '\n';
				info += " Mana: " + c.getMana() + '\n';
				info += " Speed: " + c.getSpeed() + '\n';
				info += " Maximum Action Points Per Turn: " + c.getMaxActionPointsPerTurn() + '\n';
				info += " Attack Damage: " + c.getAttackDamage()  + '\n';
				info += " Attack Range: " + c.getAttackRange() + '\n';
				if(c instanceof Hero)
					info += " Type: Hero"+ '\n';
				else if(c instanceof AntiHero)
					info += " Type: AntiHero"+ '\n';
				else if(c instanceof Villain)
					info += " Type: Villain"+ '\n';
				info += " Abilities: " + '\n';
				
				for (Ability a: c.getAbilities())
					info += "      " + a.getName() + '\n';
				break;
			}
		}
		championInfo.setText(info);
	}
	
	public void pickedChampionsInfo() {
		
		String s = "";
		int k = 1;
		for(Champion c : one.getTeam()) {
			s = " Name: " + c.getName() + '\n';
			s += " HP: " + c.getCurrentHP() + '\n';
			s += " Mana: " + c.getMana() + '\n';
			s += " Speed: " + c.getSpeed() + '\n';
			s += " Actions: " + c.getCurrentActionPoints() + '\n';
			s += " DMG: " + c.getAttackDamage() + '\n';
			s += " RNG: " + c.getAttackRange() + '\n';
			if(c instanceof Hero)
				s += " Type: Hero"+ '\n';
			else if(c instanceof AntiHero)
				s += " Type: AntiHero"+ '\n';
			else if(c instanceof Villain)
				s += " Type: Villain"+ '\n';
			if(c != one.getLeader())
				s += " Not Leader" + '\n';
			else {
				s += " Leader" + '\n';
				s += " Leader Ability Used: " + game.isFirstLeaderAbilityUsed();
			}
			switch(k) {
			case 1 :
				fourth.getT1().setText(s);
				break;
				
			case 2 :
				fourth.getT2().setText(s);
				break;
				
			case 3 :
				fourth.getT3().setText(s);
				break;
			}
			k++;
		}
		if(one.getTeam().size() == 0) {
			fourth.getL1().setVisible(false);
			fourth.getL2().setVisible(false);
			fourth.getL3().setVisible(false);
		}
		else if(one.getTeam().size() == 1) {
			fourth.getL2().setVisible(false);
			fourth.getL3().setVisible(false);
		}
		else if(one.getTeam().size() == 2)
			fourth.getL3().setVisible(false);
		
		
		s = "";
		k = 4;
		for(Champion c : two.getTeam()) {
			s = " Name: " + c.getName() + '\n';
			s += " HP: " + c.getCurrentHP() + '\n';
			s += " Mana: " + c.getMana() + '\n';
			s += " Speed: " + c.getSpeed() + '\n';
			s += " Actions: " + c.getCurrentActionPoints() + '\n';
			s += " DMG: " + c.getAttackDamage() + '\n';
			s += " RNG: " + c.getAttackRange() + '\n';
			if(c instanceof Hero)
				s += " Type: Hero"+ '\n';
			else if(c instanceof AntiHero)
				s += " Type: AntiHero"+ '\n';
			else if(c instanceof Villain)
				s += " Type: Villain"+ '\n';
			if(c != two.getLeader())
				s += " Not Leader" + '\n';
			else {
				s += " Leader" + '\n';
				s += " Leader Ability Used: " + game.isSecondLeaderAbilityUsed();
			}
			switch(k) {	
			case 4 : 
				fourth.getT4().setText(s);
				break;
				
			case 5 :
				fourth.getT5().setText(s);
				break;
				
			case 6 :
				fourth.getT6().setText(s);
				break;
			}
			k++;
		}
		if(two.getTeam().size() == 0) {
			fourth.getL4().setVisible(false);
			fourth.getL5().setVisible(false);
			fourth.getL6().setVisible(false);
		}
		else if(two.getTeam().size() == 1) {
			fourth.getL5().setVisible(false);
			fourth.getL6().setVisible(false);
		}
		else if(two.getTeam().size() == 2) 
			fourth.getL6().setVisible(false);
			
		
		
	}
	
	public void disabler(ArrayList <JButton> buttons, String info) {
		for (JButton button: buttons) 
			if (button.getName().equals(info))
				button.setEnabled(false);
	}
	
	public void pickHelper() {
		for(Champion c : Game.getAvailableChampions()) {
			if(c.getName().equals(infoToGet)) {
				for(ImageIcon i : third.getIcons()) 
					if(i.getDescription().equals(infoToGet)) {
						switch(count) {
						
						case 0 :
							third.getOneOne().setIcon(i);
							one.setLeader(c);
							one.getTeam().add(c);
							third.getPick().setForeground(new Color(0x063970));
							count++;
							break;
							
						case 1 : 
							third.getTwoOne().setIcon(i);
							two.setLeader(c);
							two.getTeam().add(c);
							
							third.getPick().setForeground(new Color(0xBE3235));
							count++;
							break;
						
						case 2 :
							third.getOneTwo().setIcon(i);
							one.getTeam().add(c);
							third.getPick().setForeground(new Color(0x063970));
							count++;
							break;
							
						case 3 : 
							third.getTwoTwo().setIcon(i);
							two.getTeam().add(c);
							third.getPick().setForeground(new Color(0xBE3235));
							count++;
							break;
							
						case 4 :
							third.getOneThree().setIcon(i);
							one.getTeam().add(c);
							third.getPick().setForeground(new Color(0x063970));
							count++;
							break;
							
						case 5 :
							third.getTwoThree().setIcon(i);
							two.getTeam().add(c);
							third.getPick().setForeground(new Color(0xBE3235));
							count++;
							break;	
						}
						
					}
				
				Game.getAvailableChampions().remove(c);
				disabler(third.getButtons(), infoToGet);
				break;
			}
		}
		
		if (count == 6) {
			third.getPick().setEnabled(false);
		}
	}
	
	public void picker() {
		switch(count) {
		
		case 0 : 
			pickHelper();break;
		
		case 1 : 
			pickHelper();break;
			
		case 2 :
			pickHelper();break;
			
		case 3 : 
			pickHelper();break;
			
		case 4 :
			pickHelper();break;
			
		case 5 :
			pickHelper();break;
			
		}
	}
	
	public void updateLabel (JButton pick) {
		pick = third.getPick();
	}
	
	public ImageIcon placeIcon(Champion c) {
		ImageIcon champion = null;
		String name = c.getName();
		switch(name) {
		case "Captain America":
			champion = new ImageIcon("captain america 2.PNG");
			break;
		case "Deadpool":
			champion = new ImageIcon("deadpool 2.PNG");
			break;
		case "Dr Strange":
			champion = new ImageIcon("dr strange 2.PNG");
			break;
		case "Electro":
			champion = new ImageIcon("electro 2.PNG");
			break;
		case "Ghost Rider":
			champion = new ImageIcon("ghost rider 2.PNG");
			break;
		case "Hela":
			champion = new ImageIcon("hela 2.PNG");
			break;
		case "Hulk":
			champion = new ImageIcon("hulk 2.PNG");
			break;
		case "Iceman":
			champion = new ImageIcon("iceman 2.PNG");
			break;
		case "Ironman":
			champion = new ImageIcon("ironman 2.PNG");
			break;
		case "Loki":
			champion = new ImageIcon("loki 2.PNG");
			break;
		case "Quicksilver":
			champion = new ImageIcon("quicksilver 2.PNG");
			break;
		case "Spiderman":
			champion = new ImageIcon("spiderman 2.PNG");
			break;
		case "Thor":
			champion = new ImageIcon("thor 2.PNG");
			break;
		case "Venom":
			champion = new ImageIcon("venom 2.PNG");
			break;
		case "Yellow Jacket":
			champion = new ImageIcon("yellow jacket 2.PNG");
			break;
		}
		return champion;
	}
	
	public JButton returnButton() {
		
		JButton f = new JButton();
		
		switch(c) {
		
		case 1 :
			f = fourth.getB1();break;
			
		case 2 :
			f = fourth.getB2();break;
			
		case 3 :
			f = fourth.getB3();break;
			
		case 4 :
			f = fourth.getB4();break;
			
		case 5 :
			f = fourth.getB5();break;
			
		case 6 :
			f = fourth.getB6();break;
			
		case 7 :
			f = fourth.getB7();break;
			
		case 8 :
			f = fourth.getB8();break;
			
		case 9 :
			f = fourth.getB9();break;
			
		case 10 :
			f = fourth.getB10();break;
			
		case 11:
			f = fourth.getB11();break;
			
		case 12 :
			f = fourth.getB12();break;
			
		case 13 :
			f = fourth.getB13();break;
			
		case 14 :
			f = fourth.getB14();break;
			
		case 15 :
			f = fourth.getB15();break;
			
		case 16 :
			f = fourth.getB16();break;
			
		case 17 :
			f = fourth.getB17();break;
			
		case 18 :
			f = fourth.getB18();break;
			
		case 19 :
			f = fourth.getB19();break;
			
		case 20 :
			f = fourth.getB20();break;
			
		case 21 :
			f = fourth.getB21();break;
			
		case 22 :
			f = fourth.getB22();break;
			
		case 23:
			f = fourth.getB23();break;
			
		case 24 :
			f = fourth.getB24();break;	
			
		case 25 :
			f = fourth.getB25();break;	
		}
		return f;
		
	}
	
	public void placeGraphically() {
		c = 1;
		for(int i = 4;i>-1;i--) {
			for(int j = 0; j<5;j++) {
				if(game.getBoard()[i][j] !=null) {
					if(game.getBoard()[i][j] instanceof Champion) {
						ImageIcon image = placeIcon((Champion) game.getBoard()[i][j]);
						returnButton().setIcon(image);
					}
					if(game.getBoard()[i][j] instanceof Cover) {	
						ImageIcon image = new ImageIcon("cover.PNG");
						returnButton().setIcon(image);
						Cover cover  = (Cover) game.getBoard()[i][j];
						returnButton().setToolTipText("HP: " + cover.getCurrentHP());
						UIManager.put("ToolTip.background", new Color(0xB2B2B2));
						UIManager.put("ToolTip.foreground", Color.black);
						UIManager.put("ToolTip.font", new Font("Impact", Font.PLAIN, 12));
					}
					
					
				}
				else {
					returnButton().setIcon(null);
				}
					
				c++;
			}
		}
	}
	
	public JLabel returnLabel() {
		JLabel label = new JLabel();
		switch(c1) {
		case 1 :
			label = fourth.getPq1();break;
			
		case 2 :
			label = fourth.getPq2();break;
			
		case 3 :
			label = fourth.getPq3();break;
			
		case 4 :
			label = fourth.getPq4();break;
			
		case 5 :
			label = fourth.getPq5();break;
			
		case 6 :
			label = fourth.getPq6();break;
		}
		return label;
	}
	
	public void pq() {
		if(c1 == 0) {
			for (Champion c : one.getTeam())
				game.getTurnOrder().insert(c);
			for (Champion c : two.getTeam())
				game.getTurnOrder().insert(c);
			c1++;
			return;
		}
		
		fourth.getPq().remove(fourth.getPq1());
		fourth.getPq().remove(fourth.getPq2());
		fourth.getPq().remove(fourth.getPq3());
		fourth.getPq().remove(fourth.getPq4());
		fourth.getPq().remove(fourth.getPq5());
		fourth.getPq().remove(fourth.getPq6());
		
		
		PriorityQueue tmp = new PriorityQueue(6);
		while(!game.getTurnOrder().isEmpty()) {
			Champion c = (Champion) game.getTurnOrder().peekMin();
			ImageIcon image = placeIcon(c);
			returnLabel().setIcon(image);
			fourth.getPq().add(returnLabel());
			tmp.insert(c);
			game.getTurnOrder().remove();
			c1++;
			
		}
		while(!tmp.isEmpty()) {
			game.getTurnOrder().insert(tmp.peekMin());
			tmp.remove();
		}
		c1 = 1;
		fourth.getPq().add(fourth.getEt());
		
	}
	
	public void placeAbilities() {
		int k = 0;
		Champion c = (Champion) game.getTurnOrder().peekMin();
		for(Ability a : c.getAbilities()) {
			if(k == 0)
				fourth.getCa1().setText(a.getName());
			else if(k==1)
				fourth.getCa2().setText(a.getName());
			else if(k==2)
				fourth.getCa3().setText(a.getName());
			k++;
		}
	}
	
	
	public void placeChampionsInfoOnControl() {
		fourth.getT7().setFont(new Font("Impact", Font.PLAIN,13));
		Champion c = (Champion) game.getTurnOrder().peekMin();
		String  s = "";
		s = " Name: " + c.getName() + '\n';
		s += " HP: " + c.getCurrentHP() + '\n';
		s += " Mana: " + c.getMana() + '\n';
		s += " Speed: " + c.getSpeed() + '\n';
		s += " Actions: " + c.getCurrentActionPoints() + '\n';
		s += " DMG: " + c.getAttackDamage() + '\n';
		s += " RNG: " + c.getAttackRange() + '\n';		
		if(c instanceof Hero)
			s += " Type: Hero"+ '\n';
		else if(c instanceof AntiHero)
			s += " Type: AntiHero"+ '\n';
		else if(c instanceof Villain)
			s += " Type: Villain"+ '\n';
		if(c != two.getLeader() && c!= one.getLeader())
			s += " Not Leader" + '\n';
		else {
			s += " Leader" + '\n';
			fourth.getT7().setFont(new Font("Impact", Font.PLAIN,11));
			if (c == two.getLeader())
				s += " Leader Ability Used: " + game.isSecondLeaderAbilityUsed();
			else if (c == one.getLeader())
				s += " Leader Ability Used: " + game.isFirstLeaderAbilityUsed();
		}
		fourth.getT7().setText(s);
	}
	
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
		
		case 'a' :
			try {
				game.move(Direction.LEFT);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
			
		case 'w' :
			try {
				game.move(Direction.UP);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {

				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
			
		case 'd' :
			try {
				game.move(Direction.RIGHT);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
			
		case 's' :
			
			try {
				game.move(Direction.DOWN);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
		}
		
	}

	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		
		case 37 :
			try {
				game.move(Direction.LEFT);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
			
		case 38 :
			try {
				game.move(Direction.UP);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
			
		case 39 :
			try {
				game.move(Direction.RIGHT);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
			
		case 40 :
			try {
				game.move(Direction.DOWN);
				pickedChampionsInfo();
				placeChampionsInfoOnControl();
				placeGraphically();
			} catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, "You need at least one action point to move" , "ERROR",JOptionPane.ERROR_MESSAGE);
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, "target cell is not empty" , "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
		}
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
	public Color controlBackground() {
		Champion c = (Champion) game.getTurnOrder().peekMin();
		if(one.getTeam().contains(c)) {
			Color red = new Color(0xBE3235);
			fourth.getC1().setBackground(red);
			fourth.getC2().setBackground(red);
			fourth.getCa1().setForeground(red);
			fourth.getCa2().setForeground(red);
			fourth.getCa3().setForeground(red);
			fourth.getA().setForeground(red);
			fourth.getEt().setForeground(red);
			fourth.getLa().setForeground(red);
			return red;
		}
		else {
			Color blue = new Color(0x063970);
			fourth.getC1().setBackground(blue);
			fourth.getC2().setBackground(blue);
			fourth.getCa1().setForeground(blue);
			fourth.getCa2().setForeground(blue);
			fourth.getCa3().setForeground(blue);
			fourth.getA().setForeground(blue);
			fourth.getEt().setForeground(blue);
			fourth.getLa().setForeground(blue);
			return blue;
		}
	}
	
	public String abilitiesDisplay(Champion c) {
		String s = "";
		for (Ability a: c.getAbilities()) {
			s += " Name: " + a.getName() + '\n';
			s += " Area of Effect: " + a.getCastArea() + '\n';
			s += " Cast Range: " + a.getCastRange() + '\n';
			s += " Mana Cost: " + a.getManaCost() + '\n';
			s += " Action Cost: " + a.getRequiredActionPoints() + '\n';
			s += " Current Cooldown: " + a.getCurrentCooldown() + '\n';
			s += " Base Cooldown: " + a.getBaseCooldown() + '\n';
			
			if (a instanceof DamagingAbility) {
				DamagingAbility d = (DamagingAbility) a;
				s += " Type: Damaging Ability" + '\n';
				s += " Damage Amount: " + d.getDamageAmount() + '\n';
			}
			
			if (a instanceof HealingAbility) {
				HealingAbility h = (HealingAbility) a;
				s += " Type: Healing Ability" + '\n';
				s += " Heal Amount: " + h.getHealAmount() + '\n';
			}
			
			if (a instanceof CrowdControlAbility) {
				CrowdControlAbility cca = (CrowdControlAbility) a;
				s += " Type: Crowd Control Ability" + '\n';
				s += " Effect Name: " + cca.getEffect().getName() + '\n';
				s += " Effect Duration: " + cca.getEffect().getDuration() + '\n';
			}
			s += '\n';
		}
		return s;
	}
	
	public String appliedEffectsDisplay(Champion c) {
		String s = "";
		for (Effect e: c.getAppliedEffects()) {
			s += "Name: " + e.getName() + '\n';
			s += "Duration: " + e.getDuration() + '\n';
			s += '\n';
		}
		return s;
	}
	
	public int getx (JButton b) { 
		int x = 0;
		if(b.equals(fourth.getB1()) || b.equals(fourth.getB2()) || b.equals(fourth.getB3()) ||
				b.equals(fourth.getB4()) || b.equals(fourth.getB5()))
			x = 4;
		
		else if(b.equals(fourth.getB6()) || b.equals(fourth.getB7()) || b.equals(fourth.getB8()) ||
				b.equals(fourth.getB9()) || b.equals(fourth.getB10()))
			x = 3;
		
		else if(b.equals(fourth.getB11()) || b.equals(fourth.getB12()) || b.equals(fourth.getB13()) ||
				b.equals(fourth.getB14()) || b.equals(fourth.getB15()))
			x = 2;
		
		else if(b.equals(fourth.getB16()) || b.equals(fourth.getB17()) || b.equals(fourth.getB18()) ||
				b.equals(fourth.getB19()) || b.equals(fourth.getB20()))
			x = 1;
		
		else if(b.equals(fourth.getB21()) || b.equals(fourth.getB22()) || b.equals(fourth.getB23()) ||
				b.equals(fourth.getB24()) || b.equals(fourth.getB25()))
			x = 0;
		return x;
	}
	
	public int gety (JButton b) { 
		int y = 0;
		if(b.equals(fourth.getB1()) || b.equals(fourth.getB6()) || b.equals(fourth.getB11()) ||
				b.equals(fourth.getB16()) || b.equals(fourth.getB21()))
			y = 0;
		
		else if(b.equals(fourth.getB2()) || b.equals(fourth.getB7()) || b.equals(fourth.getB12()) ||
				b.equals(fourth.getB17()) || b.equals(fourth.getB22()))
			y = 1;
		
		else if(b.equals(fourth.getB3()) || b.equals(fourth.getB8()) || b.equals(fourth.getB13()) ||
				b.equals(fourth.getB18()) || b.equals(fourth.getB23()))
			y = 2;
		
		else if(b.equals(fourth.getB4()) || b.equals(fourth.getB9()) || b.equals(fourth.getB14()) ||
				b.equals(fourth.getB19()) || b.equals(fourth.getB24()))
			y = 3;
		
		else if(b.equals(fourth.getB5()) || b.equals(fourth.getB10()) || b.equals(fourth.getB15()) ||
				b.equals(fourth.getB20()) || b.equals(fourth.getB25()))
			y = 4;
		return y;
	}
	
	public void applySingleTarget(JButton b) {
		Ability a = game.getCurrentChampion().getAbilities().get(0);
		if(f3) 
			f3 = false;
		else if(f4) {
			a  = game.getCurrentChampion().getAbilities().get(1);
			f4 = false;
		}
		
		else if(f5) {
			a  = game.getCurrentChampion().getAbilities().get(2);
			f5 = false;
		}
		try {
			game.castAbility(a, getx(b), gety(b));
			pickedChampionsInfo();
			placeChampionsInfoOnControl();
			placeGraphically();
			pq();
		} catch (NotEnoughResourcesException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage() , "ERROR",JOptionPane.ERROR_MESSAGE);
		} catch (AbilityUseException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage() , "ERROR",JOptionPane.ERROR_MESSAGE);
		} catch (InvalidTargetException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage() , "ERROR",JOptionPane.ERROR_MESSAGE);
		} catch (CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
	}
	
	public void winner() {
		String winnerName = game.checkGameOver().getName();
		String s = "";
		s = fifth.getWinnerTop().getText() + '\n';
		s += winnerName + "!";
		fifth.getWinnerTop().setText(s);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == first.getButton()) {
			first.getButton().setEnabled(false);
			first.dispose();
			second  = new Second();
			second.getButton().addActionListener(this);
		}
	
		if(e.getSource() == second.getButton()) {
			if(!second.getPlayer1().getText().equals("") && !second.getPlayer2().getText().equals("")) {
				one = new Player(second.getPlayer1().getText());
				two = new Player(second.getPlayer2().getText());
				game = new Game(one,two);
				try {
					Game.loadAbilities("Abilities.csv");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					Game.loadChampions("Champions.csv");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				second.getButton().setEnabled(false);
				second.dispose();
				third = new Third();
				third.getDeclareOne().setText(second.getPlayer1().getText() + "'s team");
				third.getDeclareTwo().setText(second.getPlayer2().getText() + "'s team");
				third.getCaptainAmerica().addActionListener(this);
				third.getDeadpool().addActionListener(this);
				third.getDrStrange().addActionListener(this);
				third.getElectro().addActionListener(this);
				third.getGhostRider().addActionListener(this);
				third.getHela().addActionListener(this);
				third.getHulk().addActionListener(this);
				third.getIceman().addActionListener(this);
				third.getIronman().addActionListener(this);
				third.getLoki().addActionListener(this);
				third.getQuicksilver().addActionListener(this);
				third.getSpiderman().addActionListener(this);
				third.getThor().addActionListener(this);
				third.getVenom().addActionListener(this);
				third.getYellowJacket().addActionListener(this);
				third.getPick().addActionListener(this);
				third.getStart().addActionListener(this);
			}
		}
		
		if (third!=null) {
			if (e.getSource() == third.getCaptainAmerica())
				updateInfo(third.getCaptainAmerica(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getDeadpool())
				updateInfo(third.getDeadpool(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getDrStrange())
				updateInfo(third.getDrStrange(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getElectro())
				updateInfo(third.getElectro(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getGhostRider())
				updateInfo(third.getGhostRider(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getHela())
				updateInfo(third.getHela(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getHulk())
				updateInfo(third.getHulk(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getIceman())
				updateInfo(third.getIceman(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getIronman())
				updateInfo(third.getIronman(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getLoki())
				updateInfo(third.getLoki(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getQuicksilver())
				updateInfo(third.getQuicksilver(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getSpiderman())
				updateInfo(third.getSpiderman(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getThor())
				updateInfo(third.getThor(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getVenom())
				updateInfo(third.getVenom(),third.getChampionsInfo());
			
			else if (e.getSource() == third.getYellowJacket())
				updateInfo(third.getYellowJacket(),third.getChampionsInfo());
			
			if (e.getSource() == third.getPick()) { 
				picker();
				if(count == 6) {
					third.transition();
				}	
			}
				
			if(e.getSource() == third.getStart()) {
				third.dispose();
				fourth = new Fourth();
				fourth.addKeyListener(this);
				fourth.getN1().setText(second.getPlayer1().getText() + "'s team"); 
				fourth.getN2().setText(second.getPlayer2().getText() + "'s team");
				pickedChampionsInfo();
				game.placeChampions();
				placeGraphically();
				pq();
				fourth.getB1().addActionListener(this);
				fourth.getB2().addActionListener(this);
				fourth.getB3().addActionListener(this);
				fourth.getB4().addActionListener(this);
				fourth.getB5().addActionListener(this);
				fourth.getB6().addActionListener(this);
				fourth.getB7().addActionListener(this);
				fourth.getB8().addActionListener(this);
				fourth.getB9().addActionListener(this);
				fourth.getB10().addActionListener(this);
				fourth.getB11().addActionListener(this);
				fourth.getB12().addActionListener(this);
				fourth.getB13().addActionListener(this);
				fourth.getB14().addActionListener(this);
				fourth.getB15().addActionListener(this);
				fourth.getB16().addActionListener(this);
				fourth.getB17().addActionListener(this);
				fourth.getB18().addActionListener(this);
				fourth.getB19().addActionListener(this);
				fourth.getB20().addActionListener(this);
				fourth.getB21().addActionListener(this);
				fourth.getB22().addActionListener(this);
				fourth.getB23().addActionListener(this);
				fourth.getB24().addActionListener(this);
				fourth.getB25().addActionListener(this);
				
				fourth.getCa1().addActionListener(this);
				fourth.getCa2().addActionListener(this);
				fourth.getCa3().addActionListener(this);
				fourth.getEt().addActionListener(this);
				fourth.getCha1().addActionListener(this);
				fourth.getCha2().addActionListener(this);
				fourth.getCha3().addActionListener(this);
				fourth.getCha4().addActionListener(this);
				fourth.getCha5().addActionListener(this);
				fourth.getCha6().addActionListener(this);
				fourth.getCha7().addActionListener(this);
				fourth.getA().addActionListener(this);
				fourth.getAe1().addActionListener(this);
				fourth.getAe2().addActionListener(this);
				fourth.getAe3().addActionListener(this);
				fourth.getAe4().addActionListener(this);
				fourth.getAe5().addActionListener(this);
				fourth.getAe6().addActionListener(this);
				fourth.getAe7().addActionListener(this);
				
				fourth.getLa().addActionListener(this);
			}
			
			if(fourth != null) {
				controlBackground();
				placeAbilities();
				placeChampionsInfoOnControl();
				pq();
				if(one.getTeam().contains((Champion)game.getTurnOrder().peekMin())) {
					fourth.getAe7().setForeground(new Color(0xBE3235));
					fourth.getCha7().setForeground(new Color(0xBE3235));
				}
				else {
					fourth.getAe7().setForeground(new Color(0x063970));
					fourth.getCha7().setForeground(new Color(0x063970));
				}
				if(e.getSource() == fourth.getEt()) {
					game.endTurn();
					placeAbilities();
					pq();
					controlBackground();
					placeChampionsInfoOnControl();
					if(one.getTeam().contains((Champion)game.getTurnOrder().peekMin())) {
						fourth.getAe7().setForeground(new Color(0xBE3235));
						fourth.getCha7().setForeground(new Color(0xBE3235));
					}
					else {
						fourth.getAe7().setForeground(new Color(0x063970));
						fourth.getCha7().setForeground(new Color(0x063970));
					}
					game.checkGameOver();
					if (game.checkGameOver() != null) {
						fourth.dispose();
						fifth = new Fifth();
						winner();
					}
				}
				
				if (e.getSource() == fourth.getCha1()) {
					Champion c = one.getTeam().get(0);
					String text = abilitiesDisplay(c);
					fourth.getAbilitiesTxt().setText(text);
					fourth.getAbilitiesTxt().setForeground(new Color(0xBE3235));
					fourth.getAbilities(fourth.getAbilitiesTxt());
				}
				
				if (e.getSource() == fourth.getCha2()) {
					Champion c = one.getTeam().get(1);
					String text = abilitiesDisplay(c);
					fourth.getAbilitiesTxt().setText(text);
					fourth.getAbilitiesTxt().setForeground(new Color(0xBE3235));
					fourth.getAbilities(fourth.getAbilitiesTxt());
				}
				
				if (e.getSource() == fourth.getCha3()) {
					Champion c = one.getTeam().get(2);
					String text = abilitiesDisplay(c);
					fourth.getAbilitiesTxt().setText(text);
					fourth.getAbilitiesTxt().setForeground(new Color(0xBE3235));
					fourth.getAbilities(fourth.getAbilitiesTxt());
				}
				
				if (e.getSource() == fourth.getCha4()) {
					Champion c = two.getTeam().get(0);
					String text = abilitiesDisplay(c);
					fourth.getAbilitiesTxt().setText(text);
					fourth.getAbilitiesTxt().setForeground(new Color(0x063970));
					fourth.getAbilities(fourth.getAbilitiesTxt());
				}
				
				if (e.getSource() == fourth.getCha5()) {
					Champion c = two.getTeam().get(1);
					String text = abilitiesDisplay(c);
					fourth.getAbilitiesTxt().setText(text);
					fourth.getAbilitiesTxt().setForeground(new Color(0x063970));
					fourth.getAbilities(fourth.getAbilitiesTxt());
				}
				
				if (e.getSource() == fourth.getCha6()) {
					Champion c = two.getTeam().get(2);
					String text = abilitiesDisplay(c);
					fourth.getAbilitiesTxt().setText(text);
					fourth.getAbilitiesTxt().setForeground(new Color(0x063970));
					fourth.getAbilities(fourth.getAbilitiesTxt());
				}
				
				if (e.getSource() ==  fourth.getCha7()) {
					Champion c = (Champion) game.getTurnOrder().peekMin();
					String text = abilitiesDisplay(c);
					fourth.getAbilitiesTxt().setText(text);
					if(one.getTeam().contains((Champion)game.getTurnOrder().peekMin()))
						fourth.getAbilitiesTxt().setForeground(new Color(0xBE3235));
					else
						fourth.getAbilitiesTxt().setForeground(new Color(0x063970));
					fourth.getAbilities(fourth.getAbilitiesTxt());
				}
				
				if (e.getSource() == fourth.getAe1()) {
					Champion c = one.getTeam().get(0);
					String text = appliedEffectsDisplay(c);
					fourth.getAppliedEffectsTxt().setText(text);
					fourth.getAppliedEffectsTxt().setForeground(new Color(0xBE3235));
					fourth.getAppliedEffects(fourth.getAppliedEffectsTxt());
				}
				
				if (e.getSource() == fourth.getAe2()) {
					Champion c = one.getTeam().get(1);
					String text = appliedEffectsDisplay(c);
					fourth.getAppliedEffectsTxt().setText(text);
					fourth.getAppliedEffectsTxt().setForeground(new Color(0xBE3235));
					fourth.getAppliedEffects(fourth.getAppliedEffectsTxt());
				}
				
				if (e.getSource() == fourth.getAe3()) {
					Champion c = one.getTeam().get(2);
					String text = appliedEffectsDisplay(c);
					fourth.getAppliedEffectsTxt().setText(text);
					fourth.getAppliedEffectsTxt().setForeground(new Color(0xBE3235));
					fourth.getAppliedEffects(fourth.getAppliedEffectsTxt());
				}
				
				if (e.getSource() == fourth.getAe4()) {
					Champion c = two.getTeam().get(0);
					String text = appliedEffectsDisplay(c);
					fourth.getAppliedEffectsTxt().setText(text);
					fourth.getAppliedEffectsTxt().setForeground(new Color(0x063970));
					fourth.getAppliedEffects(fourth.getAppliedEffectsTxt());
				}
				
				if (e.getSource() == fourth.getAe5()) {
					Champion c = two.getTeam().get(1);
					String text = appliedEffectsDisplay(c);
					fourth.getAppliedEffectsTxt().setText(text);
					fourth.getAppliedEffectsTxt().setForeground(new Color(0x063970));
					fourth.getAppliedEffects(fourth.getAppliedEffectsTxt());
				}
				
				if (e.getSource() == fourth.getAe6()) {
					Champion c = two.getTeam().get(2);
					String text = appliedEffectsDisplay(c);
					fourth.getAppliedEffectsTxt().setText(text);
					fourth.getAppliedEffectsTxt().setForeground(new Color(0x063970));
					fourth.getAppliedEffects(fourth.getAppliedEffectsTxt());
				}
				
				if (e.getSource() == fourth.getAe7()) {
					Champion c = (Champion) game.getTurnOrder().peekMin();
					String text = appliedEffectsDisplay(c);
					fourth.getAppliedEffectsTxt().setText(text);
					if(one.getTeam().contains((Champion)game.getTurnOrder().peekMin()))
						fourth.getAppliedEffectsTxt().setForeground(new Color(0xBE3235));
					else
						fourth.getAppliedEffectsTxt().setForeground(new Color(0x063970));
					fourth.getAppliedEffects(fourth.getAppliedEffectsTxt());
				}
				
				if(e.getSource() == fourth.getA()) {
					fourth.attack();
					fourth.getU().addActionListener(this);
					fourth.getD().addActionListener(this);
					fourth.getL().addActionListener(this);
					fourth.getR().addActionListener(this);
				}
				if(fourth.getU()!=null && e.getSource() == fourth.getU()) {
					try {
						fourth.getAttack().dispose();
						game.attack(Direction.UP);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (ChampionDisarmedException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (InvalidTargetException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
				if(fourth.getD()!=null && e.getSource() == fourth.getD()) {
					try {
						fourth.getAttack().dispose();
						game.attack(Direction.DOWN);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (ChampionDisarmedException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (InvalidTargetException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
				
				if(fourth.getL()!=null && e.getSource() == fourth.getL()) {
					try {
						fourth.getAttack().dispose();
						game.attack(Direction.LEFT);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (ChampionDisarmedException e1) {
						JOptionPane.showMessageDialog(null,e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (InvalidTargetException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
				
				if(fourth.getR() != null && e.getSource() == fourth.getR()) {
					try {
						fourth.getAttack().dispose();
						game.attack(Direction.RIGHT);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (ChampionDisarmedException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (InvalidTargetException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
				
				if(e.getSource() == fourth.getCa1()) {
					if(game.getCurrentChampion().getAbilities().get(0).getCastArea().equals(AreaOfEffect.DIRECTIONAL)) {
						f0 = true;
						fourth.castAbilityDirectional();
						fourth.getU1().addActionListener(this);
						fourth.getD1().addActionListener(this);
						fourth.getL11().addActionListener(this);
						fourth.getR1().addActionListener(this);
					}
					else if(game.getCurrentChampion().getAbilities().get(0).getCastArea().equals(AreaOfEffect.SELFTARGET) || 
							game.getCurrentChampion().getAbilities().get(0).getCastArea().equals(AreaOfEffect.TEAMTARGET) ||
							game.getCurrentChampion().getAbilities().get(0).getCastArea().equals(AreaOfEffect.SURROUND)) {
						
						try {
							game.castAbility(game.getCurrentChampion().getAbilities().get(0));
							pickedChampionsInfo();
							placeChampionsInfoOnControl();
							placeGraphically();
							pq();
						} catch (NotEnoughResourcesException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						} catch (AbilityUseException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						} catch (CloneNotSupportedException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						}
						
					}
					
					else if(game.getCurrentChampion().getAbilities().get(0).getCastArea().equals(AreaOfEffect.SINGLETARGET)) 
						f3 = true;
				}
				
				if(e.getSource() == fourth.getCa2()) {
					if(game.getCurrentChampion().getAbilities().get(1).getCastArea().equals(AreaOfEffect.DIRECTIONAL)) {
						f1 = true;
						fourth.castAbilityDirectional();
						fourth.getU1().addActionListener(this);
						fourth.getD1().addActionListener(this);
						fourth.getL11().addActionListener(this);
						fourth.getR1().addActionListener(this);
					}
					
					else if(game.getCurrentChampion().getAbilities().get(1).getCastArea().equals(AreaOfEffect.SELFTARGET) || 
							game.getCurrentChampion().getAbilities().get(1).getCastArea().equals(AreaOfEffect.TEAMTARGET) ||
							game.getCurrentChampion().getAbilities().get(1).getCastArea().equals(AreaOfEffect.SURROUND)) {
						
						try {
							game.castAbility(game.getCurrentChampion().getAbilities().get(1));
							pickedChampionsInfo();
							placeChampionsInfoOnControl();
							placeGraphically();
							pq();
						} catch (NotEnoughResourcesException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						} catch (AbilityUseException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						} catch (CloneNotSupportedException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						}
						
					}
					
					else if(game.getCurrentChampion().getAbilities().get(1).getCastArea().equals(AreaOfEffect.SINGLETARGET)) 
						f4 = true;
					
				}
				
				if(e.getSource() == fourth.getCa3()) {
					if(game.getCurrentChampion().getAbilities().get(2).getCastArea().equals(AreaOfEffect.DIRECTIONAL)) {
						f2 = true;
						fourth.castAbilityDirectional();
						fourth.getU1().addActionListener(this);
						fourth.getD1().addActionListener(this);
						fourth.getL11().addActionListener(this);
						fourth.getR1().addActionListener(this);
					}
					
					else if(game.getCurrentChampion().getAbilities().get(2).getCastArea().equals(AreaOfEffect.SELFTARGET) || 
							game.getCurrentChampion().getAbilities().get(2).getCastArea().equals(AreaOfEffect.TEAMTARGET) ||
							game.getCurrentChampion().getAbilities().get(2).getCastArea().equals(AreaOfEffect.SURROUND)) {
						
						try {
							game.castAbility(game.getCurrentChampion().getAbilities().get(2));
							pickedChampionsInfo();
							placeChampionsInfoOnControl();
							placeGraphically();
							pq();
						} catch (NotEnoughResourcesException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						} catch (AbilityUseException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						} catch (CloneNotSupportedException e1) {
							JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
						}
						
					}
					
					else if(game.getCurrentChampion().getAbilities().get(2).getCastArea().equals(AreaOfEffect.SINGLETARGET)) 
						f5 = true;
					
				}
				if(fourth.getU1() != null && e.getSource() == fourth.getU1()) {
					Ability a = game.getCurrentChampion().getAbilities().get(0);
					if(f0) 
						f0 = false;
					else if(f1) {
						a  = game.getCurrentChampion().getAbilities().get(1);
						f1 = false;
					}
					
					else if(f2) {
						a  = game.getCurrentChampion().getAbilities().get(2);
						f2 = false;
					}
					
					try {
						fourth.getCastAbilityDirectional().dispose();
						game.castAbility(a, Direction.UP);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (AbilityUseException e1) {
						JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (CloneNotSupportedException e1) {
						e1.printStackTrace();
					}
				}
				
				if(fourth.getD1() != null && e.getSource() == fourth.getD1()) {
					Ability a = game.getCurrentChampion().getAbilities().get(0);
					if(f0) 
						f0 = false;
					else if(f1) {
						a  = game.getCurrentChampion().getAbilities().get(1);
						f1 = false;
					}
					
					else if(f2) {
						a  = game.getCurrentChampion().getAbilities().get(2);
						f2 = false;
					}
					try {
						fourth.getCastAbilityDirectional().dispose();
						game.castAbility(a, Direction.DOWN);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (AbilityUseException e1) {
						JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (CloneNotSupportedException e1) {
						e1.printStackTrace();
					}
				}
				
				if(fourth.getR1() != null && e.getSource() == fourth.getR1()) {
					Ability a = game.getCurrentChampion().getAbilities().get(0);
					if(f0) 
						f0 = false;
					else if(f1) {
						a  = game.getCurrentChampion().getAbilities().get(1);
						f1 = false;
					}
					
					else if(f2) {
						a  = game.getCurrentChampion().getAbilities().get(2);
						f2 = false;
					}
					try {
						fourth.getCastAbilityDirectional().dispose();
						game.castAbility(a, Direction.RIGHT);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null,  e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (AbilityUseException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (CloneNotSupportedException e1) {
						e1.printStackTrace();
					}
				}
				
				if(fourth.getL11() != null && e.getSource() == fourth.getL11()) {
					Ability a = game.getCurrentChampion().getAbilities().get(0);
					if(f0) 
						f0 = false;
					else if(f1) {
						a  = game.getCurrentChampion().getAbilities().get(1);
						f1 = false;
					}
					
					else if(f2) {
						a  = game.getCurrentChampion().getAbilities().get(2);
						f2 = false;
					}
					try {
						fourth.getCastAbilityDirectional().dispose();
						game.castAbility(a, Direction.LEFT);
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (NotEnoughResourcesException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage() , "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (AbilityUseException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (CloneNotSupportedException e1) {
						e1.printStackTrace();
					}
				}
				
				if(e.getSource() == fourth.getB1()) 
					applySingleTarget(fourth.getB1());
				
				else if(e.getSource() == fourth.getB2()) 
					applySingleTarget(fourth.getB2());
				
				else if(e.getSource() == fourth.getB3()) 
					applySingleTarget(fourth.getB3());
				
				else if(e.getSource() == fourth.getB4())
					applySingleTarget(fourth.getB4());
				
				else if(e.getSource() == fourth.getB5())
					applySingleTarget(fourth.getB5());
				
				else if(e.getSource() == fourth.getB6())
					applySingleTarget(fourth.getB6());
				
				else if(e.getSource() == fourth.getB7())
					applySingleTarget(fourth.getB7());
				
				else if(e.getSource() == fourth.getB8())
					applySingleTarget(fourth.getB8());
				
				else if(e.getSource() == fourth.getB9())
					applySingleTarget(fourth.getB9());
				
				else if(e.getSource() == fourth.getB10())
					applySingleTarget(fourth.getB10());
				
				else if(e.getSource() == fourth.getB11())
					applySingleTarget(fourth.getB11());
				
				else if(e.getSource() == fourth.getB12())
					applySingleTarget(fourth.getB12());
				
				else if(e.getSource() == fourth.getB13())
					applySingleTarget(fourth.getB13());
				
				else if(e.getSource() == fourth.getB14())
					applySingleTarget(fourth.getB14());
				
				else if(e.getSource() == fourth.getB15())
					applySingleTarget(fourth.getB15());
				
				else if(e.getSource() == fourth.getB16())
					applySingleTarget(fourth.getB16());
				
				else if(e.getSource() == fourth.getB17())
					applySingleTarget(fourth.getB17());
				
				else if(e.getSource() == fourth.getB18())
					applySingleTarget(fourth.getB18());
				
				else if(e.getSource() == fourth.getB19())
					applySingleTarget(fourth.getB19());
				
				else if(e.getSource() == fourth.getB20())
					applySingleTarget(fourth.getB20());
				
				else if(e.getSource() == fourth.getB21())
					applySingleTarget(fourth.getB21());
				
				else if(e.getSource() == fourth.getB22())
					applySingleTarget(fourth.getB22());
				
				else if(e.getSource() == fourth.getB23())
					applySingleTarget(fourth.getB23());
				
				else if(e.getSource() == fourth.getB24())
					applySingleTarget(fourth.getB24());
				
				else if(e.getSource() == fourth.getB25())
					applySingleTarget(fourth.getB25());
				
				if(e.getSource() == fourth.getLa()) {
					try {
						game.useLeaderAbility();
						pickedChampionsInfo();
						placeChampionsInfoOnControl();
						placeGraphically();
						pq();
					} catch (LeaderNotCurrentException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage() , "ERROR",JOptionPane.ERROR_MESSAGE);
					} catch (LeaderAbilityAlreadyUsedException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage() , "ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
	}
	
	public static String getFirstName() {
		return firstName;
	}

	public static String getSecondName() {
		return secondName;
	}

	
	public static void main(String[] args) {
		new Controller();
	}

}