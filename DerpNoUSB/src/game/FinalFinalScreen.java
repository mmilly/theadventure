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
public class FinalFinalScreen {
	   private JFrame mainFrame;
	   private JButton backButton;
	   private ImageIcon imageIcon;
	public void showAll(FinalFinalScreen d) {
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
	     
	      
	     imageIcon = new ImageIcon("master.jpg");
	     
	     
	     Image img = imageIcon.getImage();
	     Image newimg = img.getScaledInstance(400, 220,  java.awt.Image.SCALE_SMOOTH);
	     ImageIcon newIcon = new ImageIcon(newimg);
	     
	    
	     
	      JLabel image = new JLabel(newIcon);
	      
	      JPanel picPanel = new JPanel();
		  picPanel.add(image);
	      
		  //backButton = new JButton("Continue the Adventure?");
		  
	//	  JPanel buttPanel = new JPanel();
	//	  buttPanel.add(backButton);
	      
		  GridBagConstraints gbc = new GridBagConstraints();
		  
			gbc.gridx = 0;
			gbc.gridy = 0;
	 
			mainFrame.add(picPanel, gbc);
	
		
			
			
	      
	      /*
	      image.setSize(470, 250);
	     
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());
	      
	      backButton = new JButton("Back");
	      //backButton.setSize(100, 30);
	      
	      backButton.setHorizontalTextPosition(SwingConstants.CENTER);
	      
	      mainFrame.add(image);
	      mainFrame.add(controlPanel);
	      
	      controlPanel.add(backButton);
	      */
	      mainFrame.setVisible(true);  
	   }
	

	
	
	
	  private void showInfo(){
		 
	    


	   //   controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	
	
}
