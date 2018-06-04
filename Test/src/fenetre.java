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
		f.setSize(660,430);
		f.setResizable(false);
	    f.setLocationRelativeTo(null);	
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 // Ajout de l'image
	    f.getContentPane().add(jeu);
	    f.setVisible(true);
	   
	}

	
		
	
	}
