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
public class EliteDefeat {
	   private JFrame mainFrame;
	   private JButton backButton;
	   private ImageIcon imageIcon;
	public void showAll(EliteDefeat d, int i) {
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
	      String statement1 = "";
	      String statement2 = "";
		     if (k == 3) {
		    	 name = "Lost Pants";
		    	 im = "lostpantsactual.png";
		    	 statement1 = "Incredible. You win. Maybe it's because";
		    	 statement2 = "...you'll never be lost or alone again";
		     }
		     if (k == 1) {
		    	 name = "2 Dollar Bill";
		    	 im = "2dollarbillactual.jpg";
		    	 statement1 = "No! I am defeated! You must have someone";
		    	 statement2 = "with you who is the luckiest person alive...";
		     }
		     if (k == 2) {
		    	 name = "Unsweet Tea";
		    	 im = "unsweetteaactual.jpg";
		    	 statement1 = "Impossible! Unless...you must be ";
		    	 statement2 = "the sweetest person in the world!";
		     }
		     if (k == 4) {
		    	 name = "The Rock at Yellowstone";
		    	 im = "rockactual2.png";
		    	 statement1 = "Inconceivable! It's because you have someone who thinks";
		         statement2 = "you really rock...who will never take you for granite...";
		     }
	      imageIcon = new ImageIcon(im);
	     
	     Image img = imageIcon.getImage();
	     Image newimg = img.getScaledInstance(300, 100,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon newIcon = new ImageIcon(newimg);
	     
	     
	     
	     
	     JPanel titlePanel = new JPanel();
		  titlePanel.add(new JLabel(name,JLabel.CENTER));
	     
		  JPanel statement1Panel = new JPanel();
		  statement1Panel.add(new JLabel(statement1,JLabel.CENTER));
	     
		  JPanel statement2Panel = new JPanel();
		  statement2Panel.add(new JLabel(statement2,JLabel.CENTER));
	     
		  
		  
	      JLabel image = new JLabel(newIcon);
	      
	      JPanel picPanel = new JPanel();
		  picPanel.add(image);
	      
		  backButton = new JButton("Find the next one!");
		  
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
	 
			mainFrame.add(statement1Panel, gbc);
	
			gbc.gridx = 0;
			gbc.gridy = 4;
	 
			mainFrame.add(statement2Panel, gbc);
	
			
	
			gbc.gridx = 0;
			gbc.gridy = 5;
	 
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
	        	 if (j <4) {
	        	 FindElite fe = new FindElite();
	        	 fe.showAll(fe, j + 1);
	        	 }
	        	 else {
	        		 MewtwoStart m = new MewtwoStart();
	        		 m.showAll(m);
	        	 }
	        	 
	        	 
	         }          
	      });
	      


	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
