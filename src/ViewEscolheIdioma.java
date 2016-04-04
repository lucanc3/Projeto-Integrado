import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ViewEscolheIdioma extends JFrame {
	private JLabel lblPT, lblEN, lblLogo;
	private ImageIcon PT, EN, logo;
	private JPanel painelGrid;
	
	public ViewEscolheIdioma(){
		super("Acesso - NOPRANT");
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		
		logo = new ImageIcon("logo.png");
		lblLogo = new JLabel(logo);
		
		PT = new ImageIcon("BotaoPortugues.png");
		lblPT = new JLabel(PT);
		
		EN = new ImageIcon("BotaoEnglish.png");
		lblEN = new JLabel(EN);
		
		
		painelGrid = new JPanel();
	    painelGrid.setLayout(new GridLayout(3,1,0,0));
	    painelGrid.add(lblLogo);
	    painelGrid.add(lblPT);
	    painelGrid.add(lblEN);
		
	    painelGrid.setBorder(BorderFactory.createLineBorder(Color.WHITE, 7)); 
		Color corFundo = new Color(45,95,143); 
	    tela.setBackground(corFundo);
	    
	    painelGrid.setBackground(corFundo);
		
		tela.add(painelGrid,  BorderLayout.CENTER);
		setSize(500, 460);
		setVisible(true);

	}
	
	public void addIdiomaPTListener(MouseListener a) { 

		lblPT.addMouseListener(a); 

	 }
	
	public void addIdiomaENListener(MouseListener a) { 

		lblEN.addMouseListener(a);  

	 }

	public static void main(String args[]){
		ViewEscolheIdioma app = new ViewEscolheIdioma();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


