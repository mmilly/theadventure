package game;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Battle {

	public Opponent t;
	public Pokemon e;
	public Angie ang;
	public Pokemon aPok;
	private JFrame mainFrame;
    public JButton move1button;
    public JButton move2button;
    public JButton nextbutton;
    public JPanel text1;
    public JPanel text2;
	private ImageIcon enemyImageIcon;
	private ImageIcon myImageIcon;
	private ImageIcon enemyHealth;
	private ImageIcon myHealth;
	public TypeChart tChart;
	public GridBagConstraints gbc;
	public String text1text;
	public String text2text;
	public boolean nextFlag;
	public boolean move1Flag;
	public boolean move2Flag;

	   
	public void start(Battle b, int opponent, int pokemon, int apokemon, Angie a) {
		nextFlag = false;
		move1Flag = true;
		move2Flag = true;
		text1text = "";
		text2text = "";
		tChart = new TypeChart();
		t = new Opponent();
		e = new Pokemon();
		if (opponent == 1) {
			t.initialize(1);
		}
		if (opponent == 2) {
			t.initialize(2);
		}
		if (opponent == 3) {
			t.initialize(3);
		}
		if (opponent == 4) {
			t.initialize(4);
		}
		if (pokemon == 1) {
			e = t.pokemon1;
		}
		if (pokemon == 2) {
			e = t.pokemon2;
		}
		if (pokemon == 3) {
			e = t.pokemon3;
		}
		if (pokemon == 4) {
			e = t.pokemon4;
		}
		ang = a;
		aPok = new Pokemon();
		if (apokemon == 1) {
			aPok = ang.pokemon1;
		}
		if (apokemon == 2) {
			aPok = ang.pokemon2;
		}
		if (apokemon == 3) {
			aPok = ang.pokemon3;
		}
		if (apokemon == 4) {
			aPok = ang.pokemon4;
		}
		if (apokemon == 5) {
			aPok = ang.pokemon5;
		}
		if (apokemon == 6) {
			aPok = ang.pokemon6;
		}
		
		b.prepareGUI(b);
		b.showInfo(b,opponent,pokemon);
	} 
	
	public void cont(Battle b, int oppo, int pokemon, int apokemon, Angie a) {
		nextFlag = false;
		move1Flag = true;
		move2Flag = true;
		
		if (pokemon == 1) {
			e = t.pokemon1;
		}
		if (pokemon == 2) {
			e = t.pokemon2;
		}
		if (pokemon == 3) {
			e = t.pokemon3;
		}
		if (pokemon == 4) {
			e = t.pokemon4;
		}
		
		if (apokemon == 1) {
			aPok = ang.pokemon1;
		}
		if (apokemon == 2) {
			aPok = ang.pokemon2;
		}
		if (apokemon == 3) {
			aPok = ang.pokemon3;
		}
		if (apokemon == 4) {
			aPok = ang.pokemon4;
		}
		if (apokemon == 5) {
			aPok = ang.pokemon5;
		}
		if (apokemon == 6) {
			aPok = ang.pokemon6;
		}
		mainFrame.dispose();
		b.prepareGUI(b);
		b.showInfo(b, oppo, pokemon);
	} 
	
	
	
	
	private void prepareGUI(Battle b){
	      mainFrame = new JFrame("The Adventure");
	      mainFrame.setSize(480,290);
	      
	      
	      mainFrame.setLayout(new GridBagLayout());
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	     
	    
	      
		     
		     
	      enemyImageIcon = new ImageIcon(e.pic);
	     Image img = enemyImageIcon.getImage();
	     Image newimg = img.getScaledInstance(80, 50,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon enemyIcon = new ImageIcon(newimg);
	     
	     myImageIcon = new ImageIcon(aPok.pic);
	     Image i = myImageIcon.getImage();
	     Image n = i.getScaledInstance(80, 50,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon myIcon = new ImageIcon(n);
	     
	     if (e.health == 100) {
	     enemyHealth = new ImageIcon("healthbar100.png");
	     }
	     if (e.health == 75) {
		     enemyHealth = new ImageIcon("healthbar75.png");
	     }
	     if (e.health == 50) {
		     enemyHealth = new ImageIcon("healthbar50.png");
		     }
	     if (e.health == 25) {
		     enemyHealth = new ImageIcon("healthbar25.png");
		     }
	     if (e.health <= 0) {
		     enemyHealth = new ImageIcon("healthbar0.png");
		     }
	     
	     Image ie = enemyHealth.getImage();
	     Image ne = ie.getScaledInstance(150, 25,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon eHealth = new ImageIcon(ne);
	     
	     
	     
	     if (aPok.health == 100) {
		     myHealth = new ImageIcon("healthbar100.png");
		     }
	     if (aPok.health == 75) {
		     myHealth = new ImageIcon("healthbar75.png");
	     }
		 if (aPok.health == 50) {
		     myHealth = new ImageIcon("healthbar50.png");
		     }
		 if (aPok.health == 25) {
		     myHealth = new ImageIcon("healthbar25.png");
		     }
		 if (aPok.health <= 0) {
		     myHealth = new ImageIcon("healthbar0.png");
		     }
	     Image im = myHealth.getImage();
	     Image nm = im.getScaledInstance(150, 25,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon mHealth = new ImageIcon(nm);
	     
	     
	     
	     JPanel enemyName = new JPanel();
		  enemyName.add(new JLabel(e.name,JLabel.CENTER));
	     
		  JPanel myPokemonName = new JPanel();
		  myPokemonName.add(new JLabel(aPok.name,JLabel.CENTER));
	     
		  
		  
	      JLabel enemyPokemonImage = new JLabel(enemyIcon);
	      JPanel enemyPicPanel = new JPanel();
		  enemyPicPanel.add(enemyPokemonImage);
		  
		  JLabel myPokemonImage = new JLabel(myIcon);
	      JPanel myPicPanel = new JPanel();
		  myPicPanel.add(myPokemonImage);
		  
		  JLabel enemyHealthImage = new JLabel(eHealth);
	      JPanel enemyHealthPanel = new JPanel();
		  enemyHealthPanel.add(enemyHealthImage);
		  
		  JLabel myHealthImage = new JLabel(mHealth);
	      JPanel myHealthPanel = new JPanel();
		  myHealthPanel.add(myHealthImage);
		  
	      
		  move1button = new JButton(aPok.move1);
		  move2button = new JButton(aPok.move2);
		  nextbutton = new JButton("Next");
		  
		  JPanel move1Panel = new JPanel();
		  move1Panel.add(move1button);
	      
		  JPanel move2Panel = new JPanel();
		  move2Panel.add(move2button);
		  
		  
		  JPanel nextPanel = new JPanel();
		  nextPanel.add(nextbutton);
		  
		  nextPanel.setVisible(nextFlag);
		  move1Panel.setVisible(move1Flag);
		  move2Panel.setVisible(move2Flag);
		  
		  text1 = new JPanel();
		  text1.add(new JLabel(text1text,JLabel.CENTER));
		  
		  text2 = new JPanel();
		  text2.add(new JLabel(text2text,JLabel.CENTER));
		  
		  
		  gbc = new GridBagConstraints();
		    
		  //  gbc.gridx = 0;
		//	gbc.gridy = 0;
	 
			//mainFrame.add(enemyName, gbc);
		  
			gbc.gridx = 2;
			gbc.gridy = 0;
	 
			mainFrame.add(enemyPicPanel, gbc);
		  
			gbc.gridx = 1;
			gbc.gridy = 0;
	 
			mainFrame.add(enemyHealthPanel, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 2;
	 
			mainFrame.add(myPicPanel, gbc);
	

			
			gbc.gridx = 1;
			gbc.gridy = 2;
	 
			mainFrame.add(myHealthPanel, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 3;
	 
			mainFrame.add(move1Panel, gbc);
	
			gbc.gridx = 1;
			gbc.gridy = 3;
	 
			mainFrame.add(move2Panel, gbc);
	
	
			gbc.gridx = 0;
			gbc.gridy = 4;
	 
			mainFrame.add(text1, gbc);
			gbc.gridx = 0;
			gbc.gridy = 5;
	 
			mainFrame.add(text2, gbc);
	
			gbc.gridx = 2;
			gbc.gridy = 4;
	 
			mainFrame.add(nextPanel, gbc);
			
	    
	      mainFrame.setVisible(true);  
	   }
	

	
	public void angAttack(Battle b, int move, int opp, int poke) {
		String typ;
		if (move == 1) {
			typ = aPok.move1type;
		}
		else {
			typ = aPok.move2type;
		}
		ArrayList<String> str = tChart.getStrongAgainst(typ);
		ArrayList<String> weak = tChart.getWeakAgainst(typ);
		
		if (aPok.name.equals("Magikarp")) {
			if (move == 1) {
				text2text = "...why";
				e.reduceHealth(0);
			}
			else {
				text2text = "...angie, no";
				e.reduceHealth(0);
			}
		}
		
		else if (str.contains(e.type1) || str.contains(e.type2)) {
			text2text = "It's super effective!";
			e.reduceHealth(100);
		}
		else if (weak.contains(e.type1) || weak.contains(e.type2)) {
			text2text = "It's not very effective...";
			e.reduceHealth(25);
		}
		else {
			text2text = "";
			e.reduceHealth(50);
		}
		nextFlag = true;
		move1Flag = false;
		move2Flag = false;
		mainFrame.dispose();
		b.prepareGUI(b);
		b.showInfo(b, opp, poke);
		
		
	}
	
	public void enemyAttack(Battle b, int opp, int poke) {
		Random rand = new Random();
		int a = rand.nextInt(2);
		String ty = "";
		if (a == 0) {
			ty = e.move1type;
			text1text = e.name + " used " + e.move1;	
		}
		if (a == 1) {
			ty = e.move2type;
			text1text = e.name + " used " + e.move2;
		}
		ArrayList<String> str = tChart.getStrongAgainst(ty);
		ArrayList<String> weak = tChart.getWeakAgainst(ty);
		
		if (str.contains(aPok.type1) || str.contains(aPok.type2)) {
			text2text = "It's super effective!";
			aPok.reduceHealth(100);
		}
		else if (weak.contains(aPok.type1) || weak.contains(aPok.type2)) {
			text2text = "It's not very effective...";
			aPok.reduceHealth(25);
		}
		else {
			text2text = "";
			aPok.reduceHealth(50);
		}
		nextFlag = false;
		move1Flag = true;
		move2Flag = true;
		if (aPok.health <= 0) {
			nextFlag = true;
			move1Flag = false;
			move2Flag = false;
		}
		mainFrame.dispose();
		b.prepareGUI(b);
		b.showInfo(b, opp, poke);
		
	}
	
	  private void showInfo(Battle b, int opp, int poke){
		 
	     move1button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent g) {
	            text1text = aPok.name + " used " + aPok.move1;
	            b.angAttack(b, 1, opp, poke);
	        	 
	         }          
	      });
	     move2button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent g) {
	            text1text = aPok.name + " used " + aPok.move2;
	            b.angAttack(b, 2, opp, poke);
	        	 
	         }          
	      });

	     nextbutton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent g) {
	        	 mainFrame.dispose();
	            text1text = "";
	            text2text = "";
	            nextFlag = false;
	            if (aPok.health <= 0) {
	            	PokemonChoice pc = new PokemonChoice();
	            	pc.showAll(b,pc,opp,poke, ang);
	            }
	            else if (e.health > 0) {
	            	enemyAttack(b, opp, poke);
	            }
	            
	            else if (poke < 4) {
	            	PokemonChoice pc = new PokemonChoice();
	            	pc.showAll(b,pc,opp,poke+1, ang);
	            }
	            else {
	            	EliteDefeat f = new EliteDefeat();
	            	f.showAll(f, opp);
	            	
	            }
	        	 
	         }          
	      });
	     
      

	      mainFrame.setVisible(true);  
	   }
	
	
	
	
	
	
}
