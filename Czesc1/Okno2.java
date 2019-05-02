package Czesc1;

import java.awt.BorderLayout;
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

public class Okno2 extends JFrame implements ActionListener{
	
	static JTextPane tekst;
	
	 Okno2(){
		    ImageIcon Zapisz = new ImageIcon("IkonaZapis.png");
			ImageIcon Wycisz = new ImageIcon("IkonaDzwiek.png");
			ImageIcon Zapauzuj = new ImageIcon("pauza.png");
			ImageIcon WyjsciezGry = new ImageIcon("IkonaWyjscie.png");
			ImageIcon Bron1 = new ImageIcon("Gun1.png");
			ImageIcon Bron2 = new ImageIcon("Gun1.png");
			ImageIcon Bron3 = new ImageIcon("Gun1.png");
			ImageIcon LicznikHPiEnergii = new ImageIcon("HP2.png");	
			ImageIcon WyborNogi = new ImageIcon("Nogi.png");
			ImageIcon WyborBrzuch = new ImageIcon("Brzuch.png");
			ImageIcon WyborGlowa = new ImageIcon("Glowa.png");
		    ImageIcon Plansza = new ImageIcon("Plansza2.png");
			
		    //JFrame Ramka2 = new JFrame();
	    	this.setSize(1600,900);
	    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	
	    	JPanel panel1 = new JPanel(new GridLayout(4,1));
	    	add(BorderLayout.WEST, panel1);
	    	JPanel panel2 = new JPanel(new GridLayout(1,7));
	    	add(BorderLayout.SOUTH, panel2);
	    	JPanel panel3 = new JPanel();
	    	add(panel3);
	    	
	    	panel1.setBackground(Color.BLACK);
			panel2.setBackground(Color.BLACK);
			panel3.setBackground(Color.BLACK);
	    	
	    	JButton Zapis = new JButton(Zapisz);
	    	JButton Dzwiek = new JButton(Wycisz);
	    	JButton Pauza = new JButton(Zapauzuj);
	    	JButton Wyjscie = new JButton(WyjsciezGry);
	    	JButton BronPierwsza = new JButton(Bron1);
	    	JButton BronDruga= new JButton(Bron2);
	    	JButton BronTrzecia = new JButton(Bron3);
	    	JLabel HP = new JLabel(LicznikHPiEnergii);
	    	JButton CelNogi = new JButton (WyborNogi);
	    	JButton CelBrzuch = new JButton (WyborBrzuch);
	    	JButton CelGlowa = new JButton (WyborGlowa);
	    	JLabel Plansza1 = new JLabel (Plansza);
	    	
	    	CelNogi.setPreferredSize(new Dimension(123,108));
	    	CelBrzuch.setPreferredSize(new Dimension(123,108));
	    	CelGlowa.setPreferredSize(new Dimension(123,108));
	    	BronPierwsza.setPreferredSize(new Dimension(87,11));
	    	BronDruga.setPreferredSize(new Dimension(87,11));
	    	BronTrzecia.setPreferredSize(new Dimension(87,11));
	    	
	    	Zapis.setBackground(Color.BLACK);
			Zapis.setOpaque(true);
			Zapis.setBorderPainted(false);
			
			Dzwiek.setBackground(Color.BLACK);
			Dzwiek.setOpaque(true);
			Dzwiek.setBorderPainted(false);
	    	
			Pauza.setBackground(Color.BLACK);
			Pauza.setOpaque(true);
			Pauza.setBorderPainted(false);
			
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
	    	panel1.add(Pauza);
	    	panel1.add(Wyjscie);
	    	panel2.add(HP);
	    	panel2.add(CelNogi);
	    	panel2.add(CelBrzuch);
	    	panel2.add(CelGlowa);
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
