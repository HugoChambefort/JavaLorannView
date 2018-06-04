import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.*;


public class ImagePanel extends JPanel implements KeyListener{
	
	JPanel j = new JPanel();
	fenetre f;
	private Image img;
	int x = 0;
	int y = 0;

	Timer time;
	Image bone;
	Image horizontal_bone;
	Image vertical_bone;
	Image lorann_1;
	Image lorann_2;
	Image lorann_3;
	Image lorann_4;
	Image lorann_5;
	Image lorann_6;
	Image lorann_7;
	Image lorann_8;
	Image path;
	Image enemy;
	Image purse;
	Image crystal;
	Image door;

	String[] map = new String[] {
			
			//Map 1 : 
			/*
			"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
			"V","_","_","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","V","/",
			"V","H","H","H","H","H","H","_","_","_","V","_","_","_","_","_","H","H","H","V","/",
			"V","_","W","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","_","V","/",
			"V","_","_","_","_","_","_","_","_","_","B","_","_","_","_","_","_","_","_","V","/",
			"V","_","B","_","_","_","_","H","H","H","B","H","H","H","_","_","_","H","H","V","/",
			"V","_","V","_","_","_","P","_","_","_","_","_","W","_","_","_","_","_","_","_","V","/",
			"V","_","V","_","_","_","_","_","B","H","H","H","H","H","H","H","H","H","H","V","/",
			"V","_","B","_","&","_","_","_","_","_","_","_","_","_","_","_","_","_","W","_","V","/",
			"V","_","P","_","V","_","_","_","_","_","_","H","H","H","_","_","_","_","_","V","/",
			"V","_","_","_","_","_","_","_","V","W","_","_","E","V","_","_","_","_","_","_","_","V","/",
			"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",*/
			
			//Map 2 : 
			"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
	        "V","&","_","_","_","_","_","_","_","_","_","_","_","_","_","V","B","B","B","B","/",
	        "V","H","H","H","B","_","H","H","H","H","H","H","H","_","W","B","H","H","H","B","/",
	        "V","P","E","P","H","_","_","_","_","_","_","_","_","_","_","_","V","P","_","V","/",
	        "V","_","_","_","V","_","_","_","_","_","_","_","H","H","H","B","_","_","_","V","/",
	        "V","_","_","_","V","_","_","_","_","_","_","_","_","W","_","_","_","_","_","V","/",
	        "V","_","_","_","V","_","_","_","_","_","_","_","_","_","_","_","_","_","_","V","/",
	        "V","_","W","_","B","B","_","_","_","_","H","H","H","H","H","H","H","V","W","V","/",
	        "V","_","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","P","V","/",
	        "B","H","H","H","B","_","_","_","_","V","_","_","_","_","H","H","H","H","H","V","/",
	        "B","B","B","B","V","_","_","_","_","V","_","_","_","W","_","_","_","_","|","V","/",
	        "B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/"
			
	        //Map 3 : 
			/*"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
			"V","&","_","_","_","_","_","_","_","_","V","_","_","_","_","_","_","E","H","V","/",
			"V","B","H","_","_","_","_","_","_","_","_","_","_","W","_","_","_","H","B","V","/",
			"V","_","B","H","_","_","_","_","_","_","V","_","_","_","_","_","P","H","B","_","V","/",
			"V","_","_","_","B","V","_","_","_","H","H","H","_","_","V","B","_","_","_","V","/",
			"V","_","_","_","B","V","_","H","H","H","H","H","H","_","V","B","_","_","_","V","/",
			"V","_","_","_","B","V","_","_","_","H","H","H","_","_","V","B","_","_","_","V","/",
			"V","_","_","_","B","V","_","_","_","_","V","_","_","_","V","B","_","_","_","V","/",
			"V","_","B","H","_","_","_","W","_","_","_","_","_","_","_","_","H","B","_","V","/",
			"V","B","H","P","_","_","_","_","_","_","_","H","H","H","_","_","_","_","H","B","V","/",
			"V","H","P","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","|","V","/",
			"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
			*/
		
			
			//Map 4 : 
			/*"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
			"B","&","_","_","_","_","_","_","_","B","V","H","H","H","V","B","W","B","V","B","/",
			"V","B","_","_","_","_","_","_","_","_","_","_","_","_","_","_","_","_","B","V","/",
			"V","H","B","_","_","_","B","H","H","H","_","_","H","H","H","B","_","_","H","V","/",
			"V","_","V","_","_","_","V","B","_","_","_","_","_","_","P","V","_","_","V","V","/",
			"V","_","V","_","_","_","V","_","_","_","_","_","B","_","_","V","_","_","V","V","/",
			"V","_","V","_","_","_","V","_","_","_","_","W","_","_","_","V","_","_","V","V","/",
			"V","_","V","_","_","_","V","E","_","B","_","_","_","_","B","V","_","_","V","V","/",
			"V","H","B","_","_","_","B","H","H","H","_","_","H","H","H","B","_","_","H","B","/",
			"V","H","H","B","_","_","_","_","_","_","_","_","_","_","_","_","_","H","V","B","/",
			"B","B","B","B","V","_","_","_","_","_","_","_","W","_","_","_","_","|","V","B","/",
			"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
			*/
	    	
			//Map 5 :
			/*"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
			"B","&","_","_","_","_","_","_","_","_","_","P","B","H","H","H","H","H","H","V","/",
			"V","H","H","H","H","H","H","H","H","_","_","_","V","|","_","_","_","_","_","V","/",
			"V","_","_","W","_","_","_","E","V","_","W","_","V","H","H","H","H","_","_","V","/",
			"V","_","_","_","H","H","H","H","V","_","_","_","V","_","_","_","_","_","_","V","/",
			"V","_","_","_","V","P","_","_","_","_","H","V","_","_","_","_","_","_","_","V","/",
			"V","_","_","_","V","H","H","_","_","_","V","H","H","H","H","H","H","_","_","V","/",
			"V","_","_","_","_","P","V","_","_","_","V","_","_","_","_","_","_","W","_","V","/",
			"V","_","_","H","H","H","H","_","_","_","V","_","_","_","H","H","H","H","H","V","/",
			"V","B","_","_","_","_","_","_","H","H","V","_","_","_","_","_","_","B","B","V","/",
			"V","B","B","B","_","_","_","_","_","W","_","_","_","_","_","B","B","B","B","V","/",
			"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
			*/
            };
	
	


	
	
	
	
	  public ImagePanel(fenetre f_jeu) {
		  this.f = f_jeu;
		  // load all pictures
		  try {
				this.bone = ImageIO.read(this.getClass().getResourceAsStream("bone.png"));
				this.vertical_bone = ImageIO.read(this.getClass().getResourceAsStream("vertical_bone.png"));
				this.horizontal_bone = ImageIO.read(this.getClass().getResourceAsStream("horizontal_bone.png"));
				this.lorann_1 = ImageIO.read(this.getClass().getResourceAsStream("lorann_1.png"));
				this.lorann_2 = ImageIO.read(this.getClass().getResourceAsStream("lorann_2.png"));
				this.lorann_3 = ImageIO.read(this.getClass().getResourceAsStream("lorann_3.png"));
				this.lorann_4 = ImageIO.read(this.getClass().getResourceAsStream("lorann_4.png"));
				this.lorann_5 = ImageIO.read(this.getClass().getResourceAsStream("lorann_5.png"));
				this.lorann_6 = ImageIO.read(this.getClass().getResourceAsStream("lorann_6.png"));
				this.lorann_7 = ImageIO.read(this.getClass().getResourceAsStream("lorann_7.png"));
				this.lorann_8 = ImageIO.read(this.getClass().getResourceAsStream("lorann_8.png"));
				this.path =ImageIO.read(this.getClass().getResourceAsStream("Black.png"));
				this.enemy =ImageIO.read(this.getClass().getResourceAsStream("monster_2.png"));
				this.purse =ImageIO.read(this.getClass().getResourceAsStream("purse.png"));
				this.crystal =ImageIO.read(this.getClass().getResourceAsStream("crystal_ball.png"));
				this.door = ImageIO.read(this.getClass().getResourceAsStream("gate_closed.png"));


				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  // put black background
		  this.setBackground(Color.BLACK);
	  }
	  
	  

	public void paint(Graphics g) {
		super.paint(g);
		
		for(String test : map){
		
			switch(test){
			case "H" : 	
					g.drawImage(horizontal_bone, x, y, f);
					x+=32;
					// each pictures have to separate with 32 pixels
					
					break;
					
				case "/" : // end of the map 
					x=0; 
					y+=32;
					break;
					
				case "B" : 
					g.drawImage(bone, x, y, f);	
					x+=32;
				break;
				
				case "_": 
					g.drawImage(path, x, y, f);
					
					x+=32;
					break;
					
				case "W": 
					g.drawImage(enemy, x, y, f);
					x+=32;
					break;
					
				case "P" : 
					g.drawImage(purse, x, y, f);
					x+=32;
					break;
				
				case "V":
					g.drawImage(vertical_bone, x, y, f); 
					x+=32;
						break;
						
				case "&" : 
				g.drawImage(lorann_1, x, y, f);
				
					x+=32;
					break;
				case "|" : 
				g.drawImage(door, x, y, f);
				x+=32;
					break;
				case "E" : 
					g.drawImage(crystal, x, y, f);
					x+=32;
						break;

				}
		
			
		}
		}
		
	
	private static Move Movement(final int pressed) {
        Move userOrder;
        switch (pressed) {
            case KeyEvent.VK_RIGHT:
                userOrder = Move.RIGHT;
                break;
            case KeyEvent.VK_LEFT:
                userOrder = Move.LEFT;
                break;
            case KeyEvent.VK_UP:
                userOrder = Move.UP;
                break;
            case KeyEvent.VK_DOWN:
                userOrder = Move.DOWN;
                break;
            case KeyEvent.VK_F:
                userOrder = Move.FIRE;
                break;
            default:
                userOrder = Move.INOP;
                break;
        }
        return userOrder;
    }
  
	 
	@Override
    public final void keyPressed(final KeyEvent keyEvent) {
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	  
	  
	  

}
	

