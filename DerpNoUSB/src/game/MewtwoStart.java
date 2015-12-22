package game;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MewtwoStart {

	private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;

	  
	   public void showAll(MewtwoStart u) {
		   u.prepareGUI();
		   u.showIt();
		   
	   }

	   private void prepareGUI(){
	      mainFrame = new JFrame("The Adventure");
	      mainFrame.setSize(480,290);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    

	      statusLabel.setSize(350,100);

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	    
	  

	   private void showIt(){

	      headerLabel.setText("A final challenger awaits!!"); 


	      JButton tButton = new JButton("Who could it be??");
	      tButton.setHorizontalTextPosition(SwingConstants.CENTER);   

	      tButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            //new screen
	        	 mainFrame.dispose();
	        	 FindMewtwo  y = new FindMewtwo();      
	             y.showAll(y);
	        	 
	         }          
	      });



	      controlPanel.add(tButton);       

	      mainFrame.setVisible(true);  
	   }
	   
	   
	   
	} 