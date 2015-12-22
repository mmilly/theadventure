package game;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
public class EliteIntro {
	   private JFrame mainFrame;
	   private JButton backButton;
	   private ImageIcon imageIcon;
	public void showAll(EliteIntro d, int i) {
		d.prepareGUI(i);
		
		d.showInfo(i);
		
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
	     
	    
	      
	      String name = "";
	      String im = "";
	      String statement = "";
		     if (k == 3) {
		    	 name = "Lost Pants";
		    	 im = "lostpantsactual.png";
		    	 statement = "Pokemon with pants are best pokemon!";
		     }
		     if (k == 1) {
		    	 name = "2 Dollar Bill";
		    	 im = "2dollarbillactual.jpg";
		    	 statement = "You will never defeat me and my unlucky and dark pokemon!";
		     }
		     if (k == 2) {
		    	 name = "Unsweet Tea";
		    	 im = "unsweetteaactual.jpg";
		    	 statement = "My disgusting pokemon are unstoppable!";
		     }
		     if (k == 4) {
		    	 name = "The Rock";
		    	 im = "rockactual2.png";
		    	 statement = "You've hit rock bottom! I'll destroy you in a landslide!";
		     }
	      imageIcon = new ImageIcon(im);
	     
	     Image img = imageIcon.getImage();
	     Image newimg = img.getScaledInstance(400, 150,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon newIcon = new ImageIcon(newimg);
	     
	     
	     
	     
	     JPanel titlePanel = new JPanel();
		  titlePanel.add(new JLabel(name,JLabel.CENTER));
	     
		  JPanel statementPanel = new JPanel();
		  statementPanel.add(new JLabel(statement,JLabel.CENTER));
	     
		  
		  
	      JLabel image = new JLabel(newIcon);
	      
	      JPanel picPanel = new JPanel();
		  picPanel.add(image);
	      
		  backButton = new JButton("Fight!");
		  
		  JPanel buttPanel = new JPanel();
		  buttPanel.add(backButton);
	      
		  GridBagConstraints gbc = new GridBagConstraints();
		    
		    gbc.gridx = 0;
			gbc.gridy = 0;
	 
			mainFrame.add(titlePanel, gbc);
		  
		  
		  
			gbc.gridx = 0;
			gbc.gridy = 1;
	 
			mainFrame.add(picPanel, gbc);
			

			
			gbc.gridx = 0;
			gbc.gridy = 3;
	 
			mainFrame.add(statementPanel, gbc);
	
			
	
			gbc.gridx = 0;
			gbc.gridy = 4;
	 
			mainFrame.add(buttPanel, gbc);
			
			
			
	    
	      mainFrame.setVisible(true);  
	   }
	

	
	
	
	  private void showInfo(int j){
		 
	     backButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //new screen
	        	 mainFrame.dispose();
	        	 //Battle  b = new Battle();      
	             //b.start(b, j);
	        	 PokemonChoice p = new PokemonChoice();
	        	 Battle b = new Battle();
	        	 Angie a = new Angie();
	        	 a.initialize();
	        	 p.showAll(b,p,j,1,a);
	        	 
	         }          
	      });
	      


	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
