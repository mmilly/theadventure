package game;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
 
public class Start {
    
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Start(){
      prepareGUI();
   }

   public static void main(String[] args){
      Start  s = new Start();      
      s.showButtonDemo();
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
    
  

   private void showButtonDemo(){

      headerLabel.setText("Are you ready to begin your adventure??"); 

      File file = new File("/");
		File[] l = file.listFiles();
		String R = l[0].toString();
      JButton tButton = new JButton("Begin!");
		tButton.setHorizontalTextPosition(SwingConstants.CENTER);   

      tButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //new screen
        	 mainFrame.dispose();
        	 FindScreen  s = new FindScreen();      
             s.showAll(s, 1);
        	 
         }          
      });



      controlPanel.add(tButton);       

      mainFrame.setVisible(true);  
   }
   
   
   
} 
   
   
   
 
 


   
   
   
   
   
   
