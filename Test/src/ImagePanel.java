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
		
	//"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/","V","&","_","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","W","V","/","V","H","H","H","H","H","H","_","_","_","V","_","_","_","_","_","H","H","H","V","/","V","_","_","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","P","V","/","V","_","W","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","V","/","V","_","_","_","_","_","_","_","_","_","B","_","_","_","_","_","_","_","_","V","/","V","_","B","_","_","_","_","H","H","H","B","H","H","H","_","_","_","H","H","V","/","V","_","V","_","_","_","_","_","_","_","_","_","_","_","_","_","_","_","P","V","/","V","_","V","_","_","_","_","_","B","H","H","H","H","H","H","H","H","H","H","V","/","V","_","B","_","_","_","_","_","_","_","_","_","_","_","_","_","_","_","W","V","/","V","_","P","_","V","_","_","_","_","_","_","H","H","H","_","_","_","_","_","V","/","V","_","_","_","_","_","_","_","V","W","_","_","E","V","_","_","_","_","_","V","/","B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B"

	String[] pics = new String[] {
			
			
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
			"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",
	
			
            };
	
	


	
	
	
	
	  public ImagePanel(fenetre f_jeu) {
	   // this(new ImageIcon(img).getImage());
		  this.f = f_jeu;
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
				

				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  this.setBackground(Color.BLACK);
	  }
	  
	  

	public void paint(Graphics g) {
		super.paint(g);
		time = new Timer();
		for(String test : pics){
		
			switch(test){
			case "H" : 	
					g.drawImage(horizontal_bone, x, y, f);
					x+=32;
					// chaque image = 32 pixel donc cote  à cote x+32
					
					break;
					
				case "/" : // Bordure de map
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
				
					break;
					
				case "P" : 
					g.drawImage(purse, x, y, f);
				
				case "V":
					g.drawImage(vertical_bone, x, y, f); 
					x+=32;
						break;
						
				case "&" : 
				g.drawImage(lorann_1, x, y, f);
				
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
	

