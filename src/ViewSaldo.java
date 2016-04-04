import java.awt.*;
import java.util.ResourceBundle;

import javax.swing.*;

import java.awt.event.*;


public class ViewSaldo extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal;
	private JLabel LblImprimir, LblVoltar, LblLogo, LblRealizarSaque, LblSaldo; 
	protected JLabel LblResultado, LblTitulo;
	private ImageIcon imprimir, voltar, logo;
	protected ResourceBundle bn = null;
    //Saldo sal = new Saldo();
	//private String resultado;
	
	public ViewSaldo(ResourceBundle bnn){
		bn = bnn;
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		setTitle(Util.getBnu().getString("saldo.label.tituloJanela"));
		
		LblTitulo= new JLabel();
		
		imprimir = new ImageIcon(Util.getBnu().getString("saldo.botao.imprimir"));
		LblImprimir = new JLabel(imprimir);
		
		voltar = new ImageIcon(Util.getBnu().getString("transferencia.botao.voltar"));
		LblVoltar = new JLabel(voltar);
		
		logo = new ImageIcon(Util.getBnu().getString("login.botao.logo"));
		LblLogo = new JLabel(logo);
      

		LblSaldo = new JLabel(Util.getBnu().getString("saldo.label.saldo"));
		
		
		LblResultado = new JLabel ();
		
		
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(2,1,0,0));
	    painelGrid1.add(LblSaldo);
	    painelGrid1.add(LblResultado);
	    
	    
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(3,1,0,0));
	    painelGrid2.add(LblLogo);
	    painelGrid2.add(LblVoltar);
	    painelGrid2.add(LblImprimir);
	    
	    painelGridPrincipal = new JPanel();
	    painelGridPrincipal.setLayout(new GridLayout(1,2,0,0));
	    painelGridPrincipal.add(painelGrid1);
	    painelGridPrincipal.add(painelGrid2);
	    
	    
	   
	    tela.add(LblTitulo, BorderLayout.NORTH); 
	    tela.add(painelGridPrincipal, BorderLayout.CENTER); 
	    
	    
	    Color corBorda = new Color(45,95,143); 
		painelGridPrincipal.setBorder(BorderFactory.createLineBorder(corBorda, 7)); 
	    tela.setBackground(corBorda);
		Color corFundo = new Color(192,192,192);
		painelGrid1.setBackground(corFundo);  
		painelGrid2.setBackground(corFundo);  
	    //painelGridPrincipal.setBackground(corFundo);
		setSize(500, 460);
		setVisible(true);
	}
	

	
		public void addVoltarListener(MouseListener a) { 

		LblVoltar.addMouseListener(a); 

	} //pra cada botao
	
		public void addTransferirListener(MouseListener a) { 

		LblImprimir.addMouseListener(a); 

	} 
		
	

}
