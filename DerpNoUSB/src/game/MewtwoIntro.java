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
public class MewtwoIntro {
	   private JFrame mainFrame;
	   private JButton backButton;
	   private ImageIcon imageIcon;
	public void showAll(MewtwoIntro d) {
		d.prepareGUI();
		
		d.showInfo();
		
	}

	
	private void prepareGUI(){
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
		   
		    	 name = "Mewtwo";
		    	 im = "mewtwo.png";
		    	 statement = "*menacing look intensifies*";
		   
		    	
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
	

	
	
	
	  private void showInfo(){
		 
	     backButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //new screen
	        	 mainFrame.dispose();
	        	 //Battle  b = new Battle();      
	             //b.start(b, j);
	        	 PokemonChoiceMewtwo p = new PokemonChoiceMewtwo();
	        	 BattleMewtwo b = new BattleMewtwo();
	        	 Angie a = new Angie();
	        	 a.initialize();
	        	 p.showAll(b,p,a);
	        	 
	         }          
	      });
	      


	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
