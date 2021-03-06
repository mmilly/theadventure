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

public class BattleMewtwo {

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

	   
	public void start(BattleMewtwo b,int apokemon, Angie a) {
		nextFlag = false;
		move1Flag = true;
		move2Flag = true;
		text1text = "";
		text2text = "";
		tChart = new TypeChart();
		t = new Opponent();
		e = new Pokemon();
		ang = a;
		aPok = new Pokemon();
		t.initialize(5);
		
		
			e = t.pokemon1;
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
		b.showInfo(b);
	} 
	
	public void cont(BattleMewtwo b, int apokemon, Angie a) {
		nextFlag = false;
		move1Flag = true;
		move2Flag = true;
		
		
		e = t.pokemon1;
		
		
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
		b.showInfo(b);
	} 
	
	
	
	
	private void prepareGUI(BattleMewtwo b){
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
	     if (e.health == 95) {
		     enemyHealth = new ImageIcon("healthbar95.png");
	     }
	     if (e.health == 90) {
		     enemyHealth = new ImageIcon("healthbar90.png");
		     }
	     if (e.health == 85) {
		     enemyHealth = new ImageIcon("healthbar85.png");
		     }
	     if (e.health == 80) {
		     enemyHealth = new ImageIcon("healthbar80.png");
		     }
	     if (e.health == 75) {
		     enemyHealth = new ImageIcon("healthbar75.png");
		     }
	     if (e.health == 70) {
		     enemyHealth = new ImageIcon("healthbar70.png");
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
	

	
	public void angAttack(BattleMewtwo b, int move) {
		
			text2text = "It's not very effective...";
			e.reduceHealth(5);
		
		
		nextFlag = true;
		move1Flag = false;
		move2Flag = false;
		mainFrame.dispose();
		b.prepareGUI(b);
		b.showInfo(b);
		
		
	}
	
	public void enemyAttack(BattleMewtwo b) {
		
			text1text = "Mewtwo used Obliterate!";
		
			text2text = "It's super effective!";
			aPok.reduceHealth(100);
		
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
		b.showInfo(b);
		
	}
	
	  private void showInfo(BattleMewtwo b){
		 
	     move1button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent g) {
	            text1text = aPok.name + " used " + aPok.move1;
	            b.angAttack(b, 1);
	        	 
	         }          
	      });
	     move2button.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent g) {
	            text1text = aPok.name + " used " + aPok.move2;
	            b.angAttack(b, 2);
	        	 
	         }          
	      });

	     nextbutton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent g) {
	        	 mainFrame.dispose();
	            text1text = "";
	            text2text = "";
	            nextFlag = false;
	            
	            if (ang.pokemon1.health==0 && ang.pokemon2.health==0 && ang.pokemon3.health==0 && ang.pokemon4.health==0 && ang.pokemon5.health==0 && ang.pokemon6.health==0) {
	            	MewtwoDefeat f = new MewtwoDefeat();
	            	f.showAll(f);
	            	
	            }
	            else if (aPok.health <= 0) {
	            	PokemonChoiceMewtwo pc = new PokemonChoiceMewtwo();
	            	pc.showAll(b,pc, ang);
	            }
	            else {
	            	enemyAttack(b);
	            }
	            
	            
	            
	        	 
	         }          
	      });
	     
      

	      mainFrame.setVisible(true);  
	   }
	
	
	
	
	
	
}
