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
	public class PokemonChoiceFinal {
		
		   private JFrame mainFrame;
		   private JButton backButton;
		   private JButton b1;
		   private JButton b2;
		   private JButton b3;
		   private JButton b4;
		   private JButton b5;
		   private JButton b6;
		   private ImageIcon imageIcon;
		public void showAll(FinalBattle b, PokemonChoiceFinal d) {
			d.prepareGUI();
			
			d.showInfo(b);
			
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
		      String p = "";
		      Opponent o = new Opponent();
			     
			    	 o.initialize(5);
			    	 name = "";
			    	 
			    	 
			    
			     
		    		 im = "front.png";
		    		 p = "";
		    	
		    	 
		    		
		      imageIcon = new ImageIcon(im);
		     
		     Image img = imageIcon.getImage();
		     Image newimg = img.getScaledInstance(400, 150,  java.awt.Image.SCALE_SMOOTH);
		     ImageIcon newIcon = new ImageIcon(newimg);
		     
		     
		     
		     
		     JPanel titlePanel = new JPanel();
			  titlePanel.add(new JLabel("You've chosen Michael!",JLabel.CENTER));
		     
			  JPanel statementPanel = new JPanel();
			  statementPanel.add(new JLabel("",JLabel.CENTER));
		     
			  
			  
		      JLabel image = new JLabel(newIcon);
		      
		      JPanel picPanel = new JPanel();
			  picPanel.add(image);
		      
			  backButton = new JButton("Fight!");
			  JPanel buttPanel = new JPanel();
			  buttPanel.add(backButton);
			  
			  /*
			  b1 = new JButton("Dragonite");
			  JPanel p1 = new JPanel();
			  p1.add(b1);
			  
			  b2 = new JButton("Vaporeon");
			  JPanel p2 = new JPanel();
			  p2.add(b2);
			  
			  b3 = new JButton("Talonflame");
			  JPanel p3 = new JPanel();
			  p3.add(b3);
			  
			  b4 = new JButton("Gogoat");
			  JPanel p4 = new JPanel();
			  p4.add(b4);
			  
			  b5 = new JButton("Bulbasaur");
			  JPanel p5 = new JPanel();
			  p5.add(b5);
			  
			  b6 = new JButton("Magikarp");
			  JPanel p6 = new JPanel();
			  p6.add(b6);
			  
			  if (a.pokemon1.health==0) {
				  p1.setVisible(false);
			  }
			  if (a.pokemon2.health==0) {
				  p2.setVisible(false);
			  }
			  if (a.pokemon3.health==0) {
				  p3.setVisible(false);
			  }
			  if (a.pokemon4.health==0) {
				  p4.setVisible(false);
			  }
			  if (a.pokemon5.health==0) {
				  p5.setVisible(false);
			  }
			  if (a.pokemon6.health==0) {
				  p6.setVisible(false);
			  }
			  
			  */
			  
			  
		      
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
				/*
				gbc.gridx = 0;
				gbc.gridy = 5;
		 
				mainFrame.add(p1, gbc);
				
				gbc.gridx = 1;
				gbc.gridy = 5;
		 
				mainFrame.add(p2, gbc);
				
				gbc.gridx = 2;
				gbc.gridy = 5;
		 
				mainFrame.add(p3, gbc);
				
				gbc.gridx = 0;
				gbc.gridy = 6;
		 
				mainFrame.add(p4, gbc);
				
				gbc.gridx = 1;
				gbc.gridy = 6;
		 
				mainFrame.add(p5, gbc);
				
				gbc.gridx = 2;
				gbc.gridy = 6;
		 
				mainFrame.add(p6, gbc);
				
		    */
		      mainFrame.setVisible(true);  
		   }
		

		
		
		
		  private void showInfo(FinalBattle b){
			 
		     backButton.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 
		        	 mainFrame.dispose();
		        	 b.start(b);
		            
		        	 
		         }          
		      });
		     /*
		     b1.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 mainFrame.dispose();
		        	 if (a.pokemon1.health==100 && a.pokemon2.health==100 && a.pokemon3.health==100 && a.pokemon4.health==100 && a.pokemon5.health==100 && a.pokemon6.health==100) {
			        	 
		        		 b.start(b,1,a);
			            }
			            else {
			             b.cont(b, 1,a);	
			            }
		        	 
		         }          
		      });
		     
		     b2.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 mainFrame.dispose();
		        	 if (a.pokemon1.health==100 && a.pokemon2.health==100 && a.pokemon3.health==100 && a.pokemon4.health==100 && a.pokemon5.health==100 && a.pokemon6.health==100) {
					        
		        		 b.start(b,2,a);
			            }
			            else {
			             b.cont(b, 2,a);	
			            }
		        	 
		         }          
		      });
		     
		     b3.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 mainFrame.dispose();
		        	 if (a.pokemon1.health==100 && a.pokemon2.health==100 && a.pokemon3.health==100 && a.pokemon4.health==100 && a.pokemon5.health==100 && a.pokemon6.health==100) {
					        
		        	 b.start(b,3,a);
		            }
		            else {
		             b.cont(b, 3,a);	
		            }
		        	 
		         }          
		      });
		     
		     b4.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 mainFrame.dispose();
		        	 if (a.pokemon1.health==100 && a.pokemon2.health==100 && a.pokemon3.health==100 && a.pokemon4.health==100 && a.pokemon5.health==100 && a.pokemon6.health==100) {
					        
		        	 b.start(b,4,a);
		            }
		            else {
		             b.cont(b, 4,a);	
		            }
		        	 
		         }          
		      });
		     
		     b5.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 mainFrame.dispose();
		        	 if (a.pokemon1.health==100 && a.pokemon2.health==100 && a.pokemon3.health==100 && a.pokemon4.health==100 && a.pokemon5.health==100 && a.pokemon6.health==100) {
					         
		        	 b.start(b,5,a);
		            }
		            else {
		             b.cont(b,5,a);	
		            }
		        	 
		         }          
		      });
		     
		     b6.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 mainFrame.dispose();
		        	 if (a.pokemon1.health==100 && a.pokemon2.health==100 && a.pokemon3.health==100 && a.pokemon4.health==100 && a.pokemon5.health==100 && a.pokemon6.health==100) {
					         
		        	 b.start(b,6,a);
		            }
		            else {
		             b.cont(b,6,a);	
		            }
		        	 
		         }          
		      });
		      
*/

		   //   controlPanel.add(tButton);       

		      mainFrame.setVisible(true);  
		   }
		
		
	}

	
	
	

