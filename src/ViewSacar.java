import java.awt.*;
import java.util.ResourceBundle;

import javax.swing.*;

import java.awt.event.*;

public class ViewSacar extends JFrame {
	private JPanel painelGrid1, painelGrid4, painelGrid2, painelGridPrincipal, painelGrid3;
	private JLabel lblNotas, lblDisponiveis, lblLogo,  lblSaqueRapido, lbl10, lbl20, lbl50,lbl100, lbl200, lbl500, lblDigite, lblSaque, lblVoltar;
	private ImageIcon saque, voltar, logo, nota10, nota20, nota50, nota100, nota200, nota500;
	public JLabel LblTitulo;
	private JTextField TxtValor;
	protected ResourceBundle bn = null;
   
	
	public ViewSacar(ResourceBundle bnn){
		bn = bnn;
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		setTitle(Util.getBnu().getString("sacar.label.tituloJanela"));
		
		LblTitulo= new JLabel();
		
		
		lblDisponiveis = new JLabel(Util.getBnu().getString("dispenser.label.notasDisponiveis"));
		lblNotas = new JLabel(Util.getBnu().getString("dispenser.label.notas")); //alterar
		
		lblSaqueRapido = new JLabel(Util.getBnu().getString("sacar.label.saqueRapido"));
		
		nota10 = new ImageIcon(Util.getBnu().getString("sacar.botao.nota10"));
		lbl10 = new JLabel(nota10);
		
		nota20 = new ImageIcon(Util.getBnu().getString("sacar.botao.nota20"));
		lbl20 = new JLabel(nota20);
		
		nota50 = new ImageIcon(Util.getBnu().getString("sacar.botao.nota50"));
		lbl50 = new JLabel(nota50);
		
		nota100 = new ImageIcon(Util.getBnu().getString("sacar.botao.nota100"));
		lbl100 = new JLabel(nota100);
		
		nota200 = new ImageIcon(Util.getBnu().getString("sacar.botao.nota200"));
		lbl200 = new JLabel(nota200);
		
		nota500 = new ImageIcon(Util.getBnu().getString("sacar.botao.nota500"));
		lbl500 = new JLabel(nota500);
		
		lblDigite = new JLabel(Util.getBnu().getString("sacar.label.digite"));
		TxtValor= new JTextField();
		
		saque = new ImageIcon(Util.getBnu().getString("sacar.botao.realizarSaque"));
		lblSaque = new JLabel(saque);
					
		voltar = new ImageIcon(Util.getBnu().getString("transferencia.botao.voltar"));
		lblVoltar = new JLabel(voltar);
		
		logo = new ImageIcon(Util.getBnu().getString("login.botao.logo"));
		lblLogo = new JLabel(logo);
      

		
		painelGrid3 = new JPanel();
		painelGrid3.setLayout(new GridLayout(1,3,0,0));
		
		painelGrid3.add(lbl10);
		painelGrid3.add(lbl20);
		painelGrid3.add(lbl50);
		
		painelGrid4 = new JPanel();
		painelGrid4.setLayout(new GridLayout(1,3,0,0));
	    painelGrid4.add(lbl100);
		painelGrid4.add(lbl200);
		painelGrid4.add(lbl500);
		
	
		
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(6,1,0,0));
	    painelGrid1.add(lblDisponiveis);
	    painelGrid1.add(lblNotas);
	    painelGrid1.add(lblSaqueRapido);
	    painelGrid1.add(painelGrid3);
	    painelGrid1.add(lblDigite);
	    painelGrid1.add(lblSaque);
	    
	    
	    
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(6,1,0,0));
	   
	   // painelGrid2.add(new JLabel(""));
	    painelGrid2.add(lblLogo);
	    painelGrid2.add(new JLabel(""));
	    painelGrid2.add(new JLabel(""));
	    painelGrid2.add(painelGrid4);
	    painelGrid2.add(TxtValor);
	    painelGrid2.add(lblVoltar);
		
	   
	    


	    
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
		setSize(800, 460);
		setVisible(true);
	}
	public void setValor(double transferencia){
		TxtValor.setText(String.valueOf(transferencia));
	}
	
	public Double getValor(){
		return Double.valueOf(TxtValor.getText());
	}
	
	public void addSacarListener(MouseListener a) { 

		lblSaque.addMouseListener(a); 

	} //pra cada botao
	
	public void addVoltarListener(MouseListener a) { 

		lblVoltar.addMouseListener(a); 

	} //pra cada botao
	
	public void addNota10Listener(MouseListener a){
		
		lbl10.addMouseListener(a);
	}
	
	public void addNota20Listener(MouseListener a){
		
		lbl20.addMouseListener(a);
	}
	
	public void addNota50Listener(MouseListener a){
		
		lbl50.addMouseListener(a);
	}
	
	public void addNota100Listener(MouseListener a){
		
		lbl100.addMouseListener(a);
	}
	
	public void addNota200Listener(MouseListener a){
		
		lbl200.addMouseListener(a);
	}
	
	public void addNota500Listener(MouseListener a){
		
		lbl500.addMouseListener(a);
	}
	
	
	
}
