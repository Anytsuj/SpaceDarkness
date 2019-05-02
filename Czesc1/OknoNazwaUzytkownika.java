package Czesc1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class OknoNazwaUzytkownika extends JFrame {
	
	static JTextPane tekst;
	
	public OknoNazwaUzytkownika () {
		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panelUzytkownika = new JPanel(new GridLayout(2,1));
		add(panelUzytkownika);
		
		JLabel Uzytkownik = new JLabel("Uzytkownik");
		tekst = new JTextPane();
		
		panelUzytkownika.add(Uzytkownik);
		panelUzytkownika.add(tekst);
		
		//panelUzytkownika.setBackground(Color.BLACK);
		//panelNapisu.setBackground(Color.BLACK);
		
		//Uzytkownik.setBackground(Color.BLACK);
	//	Uzytkownik.setOpaque(true);
		//Uzytkownik.setBorder(false);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OknoNazwaUzytkownika OkNazwa = new OknoNazwaUzytkownika();
		OkNazwa.setVisible(true);

	}

}
