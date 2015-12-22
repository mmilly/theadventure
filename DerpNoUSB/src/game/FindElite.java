package game;
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
public class FindElite {

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
	public void showAll(FindElite s, int i) {
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
	     imageIcon = new ImageIcon("2dollarbillblack.jpg");
	     }
	     if (k == 2) {
		     imageIcon = new ImageIcon("unsweetteablack.jpg");
		     }
	     if (k == 3) {
		     imageIcon = new ImageIcon("lostpantsblack.png");
		     }
	     if (k == 4) {
		     imageIcon = new ImageIcon("rockblack2.png");
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
		  if (j == 1) {
			  numtext = "1st Enemy";
			  coords = "33d 38.196, 82d 22.314";
			  name = "2";
		  }
		  if (j == 2) {
			  numtext = "2nd Enemy";
			  coords = "33d 38.391, 82d 22.155";
			  name = "UNSWEETTEA";
		  }
		  if (j == 3) {
			  numtext = "3rd Enemy";
			  coords = "33d 38.529, 82d 22.445";
			  name = "LOSTPANTS";
		  }
		  if (j == 4) {
			  numtext = "4th Enemy";
			  coords = "33d 38.426, 82d 22.591";
			  name = "ROCK";
		  }
		  
		  pokemonNum.setText(numtext); 
		  coordsLabel.setText(coords);


	     // JButton nextButton = new JButton("Next");
	     // nextButton.setHorizontalTextPosition(SwingConstants.CENTER);   

	      nextButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //new screen
	        	 
	        	 mainFrame.dispose();
	        	 
	        	 EliteIntro  s = new EliteIntro();      
	             s.showAll(s, j);
	        	 
	        	 
	         }          
	      });
	      
	      displayButton.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            //new screen
		        	 mainFrame.dispose();
		        	 
		        	 DisplayScreenElite  d = new DisplayScreenElite();      
		             d.showAll(d, j);
		        	 
		        	 
		         }          
		      });



	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
