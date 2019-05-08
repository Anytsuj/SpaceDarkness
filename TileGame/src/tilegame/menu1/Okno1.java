package tilegame.menu1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import tilegame.Launcher;

public class Okno1 extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextPane tekst;
	JPanel panel2;
	JPanel panel5;
	JButton nowa_gra;
	JButton wczytaj;
	JButton dzwiek;
	JButton jezyk;
	JButton wyjdz;
	JButton lenguage;
	public Okno1 (){
		//wczytuje obrazki 
		ImageIcon nowaGra = new ImageIcon("res\\textures\\przycisknowagra.png");
		ImageIcon wczyt = new ImageIcon("res\\textures\\przyciskwczyt.png");
		ImageIcon dzwie = new ImageIcon("res\\\\textures\\\\przyciskdzwie.png");
		ImageIcon jezykk = new ImageIcon("res\\\\textures\\\\przyciskjezyk.png");
		ImageIcon wyjscie = new ImageIcon("res\\\\textures\\\\przyciskwyjdz.png");
		ImageIcon name = new ImageIcon("res\\\\textures\\\\spacedarkness.png");
		ImageIcon newGame = new ImageIcon("res\\\\textures\\\\przycisknewgame.png");
		ImageIcon load = new ImageIcon("res\\\\textures\\\\przyciskload.png");
		ImageIcon sound = new ImageIcon("res\\\\textures\\\\przycisksound.png");
		ImageIcon language = new ImageIcon("res\\\\textures\\\\przycisklanguage.png");
		ImageIcon exit = new ImageIcon("res\\\\textures\\\\przyciskwyjdzang.png");
		
	    this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Tworzenie paneli i ustawianie ich 
		JPanel panel1 = new JPanel(new FlowLayout());
		add(BorderLayout.NORTH, panel1);
		panel2 = new JPanel(new GridLayout(5,1));
		add(BorderLayout.CENTER, panel2);
		panel2.setSize(1345, 350);
		JPanel panel3 = new JPanel();
		add(BorderLayout.WEST, panel3);
		JPanel panel4 = new JPanel();
		add(BorderLayout.EAST,panel4);
		
		//Tworzenie przycisków
		JLabel nazwa = new JLabel (name);
		nowa_gra = new JButton (nowaGra);
		wczytaj = new JButton (wczyt);
		dzwiek = new JButton (dzwie);
		jezyk = new JButton (jezykk);
		wyjdz = new JButton (wyjscie);
		
		nazwa.setSize(638, 147);
		nowa_gra.setSize(269, 70);
		wczytaj.setSize(269, 70);
		dzwiek.setSize(269, 70);
		jezyk.setSize(269, 70);
		wyjdz.setSize(269, 70);
		
		//nie potrzebne na razie
	//	nowa_gra.setActionCommand("Nowa Gra");
	//	wczytaj.setActionCommand("Wczytaj");
	//	dzwiek.setActionCommand("Dzwiek");
	//	jezyk.setActionCommand("Jezyk");
	//	wyjdz.setActionCommand("Wyjdz");
		
		//kolor t³a paneli
		panel1.setBackground(Color.BLACK);
		panel2.setBackground(Color.BLACK);
		panel3.setBackground(Color.BLACK);
		panel4.setBackground(Color.BLACK);
		
		//kolor t³a przycisków
		nowa_gra.setBackground(Color.BLACK);
		nowa_gra.setOpaque(true);
		nowa_gra.setBorderPainted(false);
		
		wczytaj.setBackground(Color.BLACK);
		wczytaj.setOpaque(true);
		wczytaj.setBorderPainted(false);
		
		dzwiek.setBackground(Color.BLACK);
		dzwiek.setOpaque(true);
		dzwiek.setBorderPainted(false);
		
		jezyk.setBackground(Color.BLACK);
		jezyk.setOpaque(true);
		jezyk.setBorderPainted(false);
		
		wyjdz.setBackground(Color.BLACK);
		wyjdz.setOpaque(true);
		wyjdz.setBorderPainted(false);
		
		nazwa.setBackground(Color.BLACK);
		nazwa.setOpaque(true);
		
		panel1.add(nazwa);
		panel2.add(nowa_gra);
		panel2.add(wczytaj);
		panel2.add(dzwiek); 
		panel2.add(jezyk);
		panel2.add(wyjdz);
		
		wyjdz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wyjdz();
				
			}
			
		});
		
		wczytaj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				wczytaj();
				
			}
		});
		nowa_gra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nowa_gra();
				
			}
			
		});
		jezyk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//if()) {
				nowa_gra.setIcon(newGame);
				wczytaj.setIcon(load);
				dzwiek.setIcon(sound);
				jezyk.setIcon(language);
				wyjdz.setIcon(exit);
				//}
			}
			
		});
		
	}
	
public void nowa_gra() {
	Launcher launch = new Launcher();
	launch.start();
}

public void wczytaj() {
	FileReader fr = null;
	String s ="";

	// OTWIERANIE PLIKU:
	try {
		fr = new FileReader("plik.txt");
		BufferedReader bfr = new BufferedReader(fr);
		//Scanner in = new Scanner(fr);
	//	String zadanie = in.nextLine();
	//	System.out.println(zadanie);

		// ODCZYT KOLEJNYCH LINII Z PLIKU:
		while ((s = bfr.readLine()) != null) {
			System.out.println(s);
			
			tekst.setText(tekst.getText()+"\n"+s);
		}
		
		

		// ZAMYKANIE PLIKU
		fr.close();
	} catch (Exception e) {
		System.out.println("BLAD IO!");
		System.exit(1);
	}
	
}

public void wyjdz() {
	System.exit(0);
}

	public static void main(String[] args) {
		Okno1 ok1 = new Okno1();
		ok1.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}