package game;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class FindScreen {

	   private JFrame mainFrame;
	   private JLabel pokemonNum;
	   private JLabel coordsLabel;
	//   private JPanel controlPanel;
	   private JButton nextButton;
	   private String coords;
	   private String numtext;
	   private JButton displayButton;
	   private ImageIcon imageIcon;
	   private String name;
	public void showAll(FindScreen s, int i) {
		s.prepareGUI(i);
		
		s.showInfo(i);
		
	}

	
	private void prepareGUI(int k){
	      mainFrame = new JFrame("The Adventure");
	      mainFrame.setSize(480,290);
	      mainFrame.setLayout(new GridLayout(4,3));
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      pokemonNum = new JLabel("",JLabel.CENTER);        
	      coordsLabel = new JLabel("");    
	      nextButton = new JButton("Next");
	      displayButton = new JButton("Display");
	      //coordsLabel.setSize(350,100);

	    //  controlPanel = new JPanel();
	    //  controlPanel.setLayout(new FlowLayout());

	     if (k == 1) {
	     imageIcon = new ImageIcon("dragoniteblack.gif");
	     
	     }
	     if (k == 2) {
		     imageIcon = new ImageIcon("vaporeonblack.gif");
		     }
	     if (k == 3) {
		     imageIcon = new ImageIcon("talonflameblack.gif");
		     }
	     if (k == 4) {
		     imageIcon = new ImageIcon("gogoatblack.gif");
		     }
	     if (k == 5) {
		     imageIcon = new ImageIcon("bulbasaurblack.gif");
		     }
	     if (k == 6) {
		     imageIcon = new ImageIcon("magikarpblack.gif");
		     }
	     
	     
	     Image img = imageIcon.getImage();
	     Image newimg = img.getScaledInstance(120, 60,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon newIcon = new ImageIcon(newimg);
	     
	     
	     
	     JLabel image = new JLabel(newIcon);
	      
	     
	      
	      
	      
	      mainFrame.add(new JLabel(""));
	      mainFrame.add(pokemonNum);
	      mainFrame.add(new JLabel(""));
	      
	      mainFrame.add(new JLabel(""));
	      mainFrame.add(image);
	      mainFrame.add(new JLabel(""));
	      
	      mainFrame.add(new JLabel("Coordinates:",JLabel.CENTER));
	      mainFrame.add(coordsLabel);
	      mainFrame.add(new JLabel(""));
	      
	      mainFrame.add(displayButton);
	      mainFrame.add(new JLabel(""));
	      mainFrame.add(nextButton);
	      
	      mainFrame.setVisible(true);  
	   }
	

	
	
	
	  private void showInfo(int j){
		  name = "";
		  if (j == 1) {
			  
			  numtext = "1st Pokemon";
			  coords = "33d 38.466,82d 23.039";
			  name = "DRAGONITE";
		  }
		  if (j == 2) {
			  numtext = "2nd Pokemon";
			  coords = "33d 38.329, 82d 22.839";
			  name = "VAPOREON";
		  }
		  if (j == 3) {
			  numtext = "3rd Pokemon";
			  coords = "33d 38.171, 82d 22.743";
			  name = "TALONFLAME";
		  }
		  if (j == 4) {
			  numtext = "4th Pokemon";
			  coords = "33d 38.163, 82d 22.560";
			  name = "GOGOAT";
		  }
		  if (j == 5) {
			  numtext = "5th Pokemon";
			  coords = "33d 38.224, 82d 22.467";
			  name = "BULBASAUR";
		  }
		  if (j == 6) {
			  numtext = "6th Pokemon";
			  coords = "33d 38.083, 82d 22.290";
			  name = "MAGIKARP";
		  }
		  pokemonNum.setText(numtext); 
		  coordsLabel.setText(coords);


	     // JButton nextButton = new JButton("Next");
	     // nextButton.setHorizontalTextPosition(SwingConstants.CENTER);   

	      nextButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //new screen
	        	 	 
	        	 
	        	 mainFrame.dispose();
	        	 
	        	 //FindScreen  s = new FindScreen();      
	             //s.showAll(s, j+1);
	        	 PokemonDescription pd = new PokemonDescription();
	        	 pd.showAll(pd, j);
	        	 
	        	 
	         }          
	      });
	      
	      displayButton.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            //new screen
		        	 mainFrame.dispose();
		        	 
		        	 DisplayScreen  d = new DisplayScreen();      
		             d.showAll(d, j);
		        	 
		        	 
		         }          
		      });



	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
