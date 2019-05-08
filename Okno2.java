package Czesc1;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

//import tilegame.Game;

public class Okno2 extends JFrame implements ActionListener{

	static JTextPane tekst;
	private Canvas canvas;
	
	 Okno2(){
		    ImageIcon Zapisz = new ImageIcon("IkonaZapis.png");
			ImageIcon Wycisz = new ImageIcon("IkonaDzwiek.png");
			ImageIcon PominTure = new ImageIcon("pauza.png");
			ImageIcon WyjsciezGry = new ImageIcon("IkonaWyjscie.png");
			ImageIcon Bron1 = new ImageIcon("Gun1.png");
			ImageIcon Bron2 = new ImageIcon("Gun1.png");
			ImageIcon Bron3 = new ImageIcon("Gun1.png");
			ImageIcon LicznikHPiEnergii = new ImageIcon("HP2.png");	
			ImageIcon WyborNogi = new ImageIcon("Nogi.png");
			ImageIcon WyborBrzuch = new ImageIcon("Brzuch.png");
			ImageIcon WyborGlowa = new ImageIcon("Glowa.png");
		    ImageIcon Plansza = new ImageIcon("Plansza.png");
			
	    	this.setSize(1600,900);
	    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	this.setResizable(true);
	    	
	    	JPanel panel1 = new JPanel(new GridLayout(3,1));
	    	add(BorderLayout.WEST, panel1);
	    	JPanel panel2 = new JPanel(new GridLayout(1,8));
	    	add(BorderLayout.SOUTH, panel2);
	    	JPanel panel3 = new JPanel();
	    	add(BorderLayout.CENTER,panel3);
	    	
	    	panel1.setBackground(Color.BLACK);
			panel2.setBackground(Color.BLACK);
			panel3.setBackground(Color.BLACK);
	    	
	    	JButton Zapis = new JButton(Zapisz);
	    	JButton Dzwiek = new JButton(Wycisz);
	    	JButton Pomin = new JButton(PominTure);
	    	JButton Wyjscie = new JButton(WyjsciezGry);
	    	JButton BronPierwsza = new JButton(Bron1);
	    	JButton BronDruga= new JButton(Bron2);
	    	JButton BronTrzecia = new JButton(Bron3);
	    	JLabel HP = new JLabel(LicznikHPiEnergii);
	    	JButton CelNogi = new JButton (WyborNogi);
	    	JButton CelBrzuch = new JButton (WyborBrzuch);
	    	JButton CelGlowa = new JButton (WyborGlowa);
	    	JLabel Plansza1 = new JLabel (Plansza);
	    //	Game game = new Game("Tile Game!", 1512, 756);
		 //  game.start();
	    	
	    	CelNogi.setPreferredSize(new Dimension(123,108));
	    	CelBrzuch.setPreferredSize(new Dimension(123,108));
	    	CelGlowa.setPreferredSize(new Dimension(123,108));
	    	BronPierwsza.setPreferredSize(new Dimension(87,11));
	    	BronDruga.setPreferredSize(new Dimension(87,11));
	    	BronTrzecia.setPreferredSize(new Dimension(87,11));
	    	
	    	Zapis.setSize(73, 83);
	    	Dzwiek.setSize(73, 83);
	    	Pomin.setSize(73,83);
	    	Wyjscie.setSize(73,83);
	    	HP.setSize(377,108);
	    	//Plansza1.setSize(1512,672);
	    	
	    	/*canvas = new Canvas();
			canvas.setPreferredSize(new Dimension(1512,672));
			canvas.setMaximumSize(new Dimension(1512,672));
			canvas.setMinimumSize(new Dimension(1512,672));*/
	    	
	    	Zapis.setBackground(Color.BLACK);
			Zapis.setOpaque(true);
			Zapis.setBorderPainted(false);
			
			Dzwiek.setBackground(Color.BLACK);
			Dzwiek.setOpaque(true);
			Dzwiek.setBorderPainted(false);
	    	
			Pomin.setBackground(Color.BLACK);
			Pomin.setOpaque(true);
			Pomin.setBorderPainted(false);
			
			Wyjscie.setBackground(Color.BLACK);
			Wyjscie.setOpaque(true);
			Wyjscie.setBorderPainted(false);
			
			BronPierwsza.setBackground(Color.BLACK);
			BronPierwsza.setOpaque(true);
			BronPierwsza.setBorderPainted(false);
			
			BronDruga.setBackground(Color.BLACK);
			BronDruga.setOpaque(true);
			BronDruga.setBorderPainted(false);
			
			BronTrzecia.setBackground(Color.BLACK);
			BronTrzecia.setOpaque(true);
			BronTrzecia.setBorderPainted(false);
			
	    	CelNogi.setBackground(Color.BLACK);
			CelNogi.setOpaque(true);
			CelNogi.setBorderPainted(false);
			
			CelBrzuch.setBackground(Color.BLACK);
			CelBrzuch.setOpaque(true);
			CelBrzuch.setBorderPainted(false);
			
			CelGlowa.setBackground(Color.BLACK);
			CelGlowa.setOpaque(true);
			CelGlowa.setBorderPainted(false);
			
			HP.setBackground(Color.BLACK);
			HP.setOpaque(true);

			Plansza1.setBackground(Color.BLACK);
			Plansza1.setOpaque(true);
			
	    	panel1.add(Zapis);
	    	panel1.add(Dzwiek);
	    	panel1.add(Wyjscie);
	    	panel2.add(HP);
	    	panel2.add(CelNogi);
	    	panel2.add(CelBrzuch);
	    	panel2.add(CelGlowa);
	    	panel2.add(Pomin);
	    	panel2.add(BronPierwsza);
	    	panel2.add(BronDruga);
	    	panel2.add(BronTrzecia);
	    	panel3.add(Plansza1);
	    	
	    	Wyjscie.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Wyjscie();
					}
				
			});
	    	
	    	Zapis.addActionListener(new ActionListener() {
	    		
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    			Zapis();
	    		}
	    	});
	    }
	   public static void Wyjscie() {
		   System.exit(0);
	   }
	   public static void Zapis() {
			
			String s = tekst.getText();

			FileWriter fw = null;

			try {
				fw = new FileWriter("plik.txt");
				BufferedWriter bw = new BufferedWriter(fw);

			
					bw.write(s);

				bw.close();
				//fw.close(); - wystarczy zamknąć zewnętrzny
			} catch (IOException e) {
				e.printStackTrace();
			
		}
		}
		public static void main(String[] args) {
			Okno2 ok2 = new Okno2();
			ok2.setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
