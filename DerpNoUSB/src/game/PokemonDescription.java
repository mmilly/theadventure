package game;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PokemonDescription {

	   private JFrame mainFrame;
	   private JLabel pokemonNum;
	   private JLabel coordsLabel;
	//   private JPanel controlPanel;
	   private JButton nextbutton;
	   private String coords;
	   private String numtext;
	   private String text;
	   private ImageIcon imageIcon;
	   private String type;
	   private String mt1;
	   private String mt2;
	public void showAll(PokemonDescription s, int i) {
		s.prepareGUI(i);
		
		s.showInfo(i);
		
	}

	
	private void prepareGUI(int k){
	      mainFrame = new JFrame("The Adventure");
	      mainFrame.setSize(480,290);
	      mainFrame.setLayout(new GridBagLayout());
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      pokemonNum = new JLabel("",JLabel.CENTER);        
	      coordsLabel = new JLabel("");    
	      nextbutton = new JButton("Next");
	      text = "";
	      mt1 = "";
	      mt2 = "";
	      type = "";
	      //coordsLabel.setSize(350,100);

	    //  controlPanel = new JPanel();
	    //  controlPanel.setLayout(new FlowLayout());

	     if (k == 1) {
	     imageIcon = new ImageIcon("dragonite.jpg");
	     text = "You found Dragonite!";
	     mt1 = "Move 1: Dragon Breath, Type: Dragon";
	     mt2 = "Move 2: Hurricane, Type: Flying";
	     type = "Type: Dragon and Flying";
	     }
	     if (k == 2) {
		     imageIcon = new ImageIcon("vaporeon.jpg");
		     text = "You found Vaporeon!";
		     mt1 = "Move 1: Hydro Pump, Type: Water";
		     mt2 = "Move 2: Aurora Beam, Type: Ice";
		     type = "Type: Water";
		     }
	     if (k == 3) {
		     imageIcon = new ImageIcon("talonflame.jpg");
		     text = "You found Talonflame!";
		     mt1 = "Move 1: Flare Blitz, Type: Fire";
		     mt2 = "Move 2: Brave Bird, Type: Flying";
		     type = "Type: Fire and Flying";
		     }
	     if (k == 4) {
		     imageIcon = new ImageIcon("gogoat.jpg");
		     text = "You found Gogoat!";
		     mt1 = "Move 1: Leaf Blade, Type: Grass";
		     mt2 = "Move 2: Earthquake, Type: Ground";
		     type = "Type: Grass";
		     }
	     if (k == 5) {
		     imageIcon = new ImageIcon("bulbasaur.jpg");
		     text = "You found Bulbasaur!";
		     mt1 = "Move 1: Vine Whipe, Type: Grass";
		     mt2 = "Move 2: Sludge, Type: Poison";
		     type = "Type: Grass and Poison";
		     }
	     if (k == 6) {
		     imageIcon = new ImageIcon("magikarp.png");
		     text = "You found Magikarp!";
		     type = "Why did you choose this Pokemon?";
		     mt1 = "Move 1: Splash, Type: Pointless";
		     mt2 = "Move 2: Splash Harder, Type: Seriously, it does nothing";
		     }
	     
	     
	     Image img = imageIcon.getImage();
	     Image newimg = img.getScaledInstance(250, 100,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon newIcon = new ImageIcon(newimg);
	     JLabel image = new JLabel(newIcon);
	     JPanel im = new JPanel();
	     im.add(image);
	     
	      JPanel name = new JPanel();
		  name.add(new JLabel(text,JLabel.CENTER));
		  
		  JPanel movesandtypes1 = new JPanel();
		  movesandtypes1.add(new JLabel(mt1,JLabel.CENTER));
		  
		  JPanel movesandtypes2 = new JPanel();
		  movesandtypes2.add(new JLabel(mt2,JLabel.CENTER));
		  
		  JPanel typePanel = new JPanel();
		  typePanel.add(new JLabel(type,JLabel.CENTER));
	      
		  JPanel nextPanel = new JPanel();
		  nextPanel.add(nextbutton);
		  
	      GridBagConstraints gbc = new GridBagConstraints();
	      
	      gbc.gridx = 0;
		  gbc.gridy = 0;
		  mainFrame.add(name, gbc);
	      
		  gbc.gridx = 0;
		  gbc.gridy = 1;
		  mainFrame.add(im, gbc);
		  
		  gbc.gridx = 0;
		  gbc.gridy = 2;
		  mainFrame.add(typePanel, gbc);
		  
		  gbc.gridx = 0;
		  gbc.gridy = 3;
		  mainFrame.add(movesandtypes1, gbc);
	      
		  gbc.gridx = 0;
		  gbc.gridy = 4;
		  mainFrame.add(movesandtypes2, gbc);
		  
		  gbc.gridx = 0;
		  gbc.gridy = 5;
		  mainFrame.add(nextPanel, gbc);
	      
	      mainFrame.setVisible(true);  
	   }
	

	
	
	
	  private void showInfo(int j){
		  


	     // JButton nextButton = new JButton("Next");
	     // nextButton.setHorizontalTextPosition(SwingConstants.CENTER);   

	      nextbutton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //new screen
	        	 mainFrame.dispose();
	        	 if (j < 6) {
	        	 FindScreen s = new FindScreen();
	        	 s.showAll(s, j + 1);
	        	 }
	        	 else {
	        		 EliteFourStart four = new EliteFourStart();
	        		 four.showAll(four);
	        	 }
	        	 
	         }          
	      });
	      
	      


	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
