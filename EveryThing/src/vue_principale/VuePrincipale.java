package vue_principale;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VuePrincipale extends JFrame {
	
	private Dimension screenSize;
	private BorderLayout gestAlignement_JFrame;
	private Container cont_JFrame;
	private PanelHaut panneauHaut;
	private JPanel panneauBas;
	
	public VuePrincipale() throws IOException{
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width/2,screenSize.height/2);
		setResizable(true);
		setLocationRelativeTo(null);
		this.setTitle("EveryThing in your Hands");
		
		cont_JFrame = this.getContentPane();
		gestAlignement_JFrame = new BorderLayout();
		cont_JFrame.setLayout(gestAlignement_JFrame);
		
		System.out.println(System.getProperty("user.dir"));
		panneauHaut = new PanelHaut(ImageIO.read(new File(System.getProperty("user.dir")+"\\images\\logo.png")));
		panneauHaut.setLayout(new BorderLayout());
		//panneauHaut.add(image_bandeau, BorderLayout.CENTER);
		cont_JFrame.add(panneauHaut);
		
		panneauBas = new JPanel();
		cont_JFrame.add(panneauBas);
		
		//pack();
		setVisible(true);
	}
	

}
