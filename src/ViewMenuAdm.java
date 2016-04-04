import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ResourceBundle;

public class ViewMenuAdm extends JFrame {
	private JPanel painelGrid1;
	private JLabel lblTitulo, lblGerarRelatorios, lblConsultarDispenser, lblEncerrar, lblLogo ;
	private ImageIcon relatorios, dispenser, encerrar, logo;
	protected ResourceBundle bn = null;
	
	public ViewMenuAdm(ResourceBundle bnn){
		bn=bnn;
		setTitle(Util.getBnu().getString("menuAdm.label.tituloJanela"));
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		
		lblTitulo= new JLabel(Util.getBnu().getString("menuAdm.label.titulo"));

		
		relatorios = new ImageIcon(Util.getBnu().getString("menuAdm.botao.gerarRelatorios"));
		lblGerarRelatorios = new JLabel(relatorios);
		
		dispenser = new ImageIcon(Util.getBnu().getString("menuAdm.botao.consultarDispenser"));
		lblConsultarDispenser = new JLabel(dispenser);
		
		encerrar = new ImageIcon(Util.getBnu().getString("menuAdm.botao.encerrar"));
		lblEncerrar = new JLabel(encerrar);
		
		logo = new ImageIcon("Logo.png");
		lblLogo = new JLabel(logo);
			
		
		
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(3,2,0,0));
	    painelGrid1.add(lblGerarRelatorios);
	    painelGrid1.add(lblLogo);
	    painelGrid1.add(lblEncerrar);
	    painelGrid1.add(lblConsultarDispenser);
	  
	   
	    tela.add(lblTitulo, BorderLayout.NORTH); 
	    tela.add(painelGrid1, BorderLayout.CENTER); 
	    
	    
	    Color corBorda = new Color(45,95,143); 
		painelGrid1.setBorder(BorderFactory.createLineBorder(corBorda, 7)); 
	    tela.setBackground(corBorda);
		Color corFundo = new Color(192,192,192);
		painelGrid1.setBackground(corFundo);  
		setSize(500, 460);
		setVisible(true);
	}
	
	public void addGerarRelatoriosListener(MouseListener a) { 

		lblGerarRelatorios.addMouseListener(a); 

	 }
	public void addConsultarDispenserListener(MouseListener a) { 

		lblConsultarDispenser.addMouseListener(a); 

	 }
	public void addEncerrarListener(MouseListener a) { 

		lblEncerrar.addMouseListener(a); 

	 }
}