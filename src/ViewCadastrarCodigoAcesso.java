import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ResourceBundle;

public class ViewCadastrarCodigoAcesso extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal, painelGrid3;
	protected JLabel LblTitulo, LblOperadora, LblLogo,  LblGerar, LblEncerrar, LblResultado;
	private ImageIcon gerar, voltar, logo, encerrar;
	protected ResourceBundle bn = null;
   
	
	public ViewCadastrarCodigoAcesso(ResourceBundle bnn){
		bn = bnn;
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		setTitle(Util.getBnu().getString("gerarCodigoAcesso.label.tituloJanela"));
		
		LblTitulo= new JLabel(Util.getBnu().getString("gerarCodigoAcesso.label.titulo"));
		
	
		LblOperadora = new JLabel(Util.getBnu().getString("gerarCodigoAcesso.label.cadastrar"));
	
		
		LblResultado = new JLabel(Util.getBnu().getString("gerarCodigoAcesso.label.codigo"));
		

			
		logo = new ImageIcon(Util.getBnu().getString("login.botao.logo"));
		LblLogo = new JLabel(logo);
      
		gerar = new ImageIcon(Util.getBnu().getString("gerarCodigoAcesso.botao.gerar"));
		LblGerar = new JLabel(gerar);
		
		encerrar = new ImageIcon(Util.getBnu().getString("gerarCodigoAcesso.botao.encerrar"));
		LblEncerrar = new JLabel(encerrar);
		
		
		painelGrid3 = new JPanel();
		painelGrid3.setLayout(new GridLayout(1,2,0,0));
		painelGrid3.add(LblGerar);
		painelGrid3.add(LblEncerrar);
		
		
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(3,1,0,0));
	    painelGrid1.add(LblOperadora);
	    painelGrid1.add(LblResultado);
	    painelGrid1.add(painelGrid3);
	  
	  
	    
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(1,1,0,0));
	    painelGrid2.add(LblLogo);
  	   
	    //painelGrid2.add(LblVoltar);


	    
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
		painelGrid3.setBackground(corFundo);
	    //painelGridPrincipal.setBackground(corFundo);
		setSize(500, 460);
		setVisible(true);
	}
	
	
	public void setResultado(int resultado){
		LblResultado.setText(String.valueOf(resultado));
	}
	
	public int getResultado(){
		return Integer.valueOf(LblResultado.getText());
	}
	
	public void addEncerrarListener(MouseListener a) { 

		LblEncerrar.addMouseListener(a); 

	} //pra cada botao
	
		public void addGerarListener(MouseListener a) { 

		LblGerar.addMouseListener(a); 

	} //pra cada botao
	


	
}
