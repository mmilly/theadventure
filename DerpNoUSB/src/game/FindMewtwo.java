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
public class FindMewtwo {

	   private JFrame mainFrame;
	   private JLabel pokemonNum;
	   private JLabel coordsLabel;
	//   private JPanel controlPanel;
	   private JButton nextButton;
	   private String coords;
	   private String numtext;
	   private ImageIcon imageIcon;
	public void showAll(FindMewtwo s) {
		s.prepareGUI();
		
		s.showInfo();
		
	}

	
	private void prepareGUI(){
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
	      //coordsLabel.setSize(350,100);

	    //  controlPanel = new JPanel();
	    //  controlPanel.setLayout(new FlowLayout());

	     
	     imageIcon = new ImageIcon("questionmark.png");
	     
	     
		     
	     
	     
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
	      
	      mainFrame.add(new JLabel(""));
	      mainFrame.add(new JLabel(""));
	      mainFrame.add(nextButton);
	      
	      mainFrame.setVisible(true);  
	   }
	

	
	
	
	  private void showInfo(){
		numtext = "The Final Opponent";
		coords = "???";
		  
		  
		  pokemonNum.setText(numtext); 
		  coordsLabel.setText(coords);


	     // JButton nextButton = new JButton("Next");
	     // nextButton.setHorizontalTextPosition(SwingConstants.CENTER);   

	      nextButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //new screen
	        	  mainFrame.dispose();
	        	 
	        	 MewtwoIntro  s = new MewtwoIntro();      
	             s.showAll(s);
	        	 
	        	 
	        	 
	        	 
	         }          
	      });
	      
	      



	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
