import java.awt.Color;

import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.layout.Pane;


public class fenetre  extends JFrame{
	
	

	ImagePanel jeu = new ImagePanel(this);
	public fenetre() {
		
		

		//Création de la fenêtre
		JFrame f = new JFrame();
		f.setTitle("Lorann Game");
		f.setSize(700,700);
		f.setResizable(false);
	    f.setLocationRelativeTo(null);	
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 // Ajout de l'image
	    f.getContentPane().add(jeu);
	    f.setVisible(true);
	  
	    
		
	   
	}

	
		
	
	}



/*import java.awt.Panel;

import javax.swing.JFrame;

public class fenetre extends JFrame{
    
    static Panel panel = new Panel();
    static int x;
    
    public fenetre(String nom) {
        JFrame frame = new JFrame();
        frame.setName(nom);
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.add(panel);
        Trame();

    }
    public static void Trame() {
        while(true){
        try { Thread.sleep(10);}
        catch(InterruptedException e){System.out.println("Erreur marche Po");}
        x++;
        if (x == 350) {
            x = 0;}
        panel.repaint();
        }
    }
}*/