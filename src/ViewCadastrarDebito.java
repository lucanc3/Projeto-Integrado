import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ResourceBundle;

public class ViewCadastrarDebito extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal;
	private JLabel LblTitulo, LblOperadora, LblVoltar, LblLogo,  LblCadastrar;
	private ImageIcon cadastrar, voltar, logo;
	private JTextField TxtOperadora;
	protected ResourceBundle bn = null;	
	
	public ViewCadastrarDebito(ResourceBundle bnn){
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		bn=bnn;
		setTitle(Util.getBnu().getString("cadastrarDeb.label.tituloJanela"));
		
		LblTitulo= new JLabel(Util.getBnu().getString("cadastrarDeb.label.titulo"));
		
	
		LblOperadora = new JLabel(Util.getBnu().getString("cadastrarDeb.label.operadora"));
		TxtOperadora= new JTextField();
		

		voltar = new ImageIcon(Util.getBnu().getString("cadastrarDeb.botao.voltar"));
		LblVoltar = new JLabel(voltar);
		
		logo = new ImageIcon("Logo.png");
		LblLogo = new JLabel(logo);
      
		cadastrar = new ImageIcon(Util.getBnu().getString("cadastrarDeb.botao.cadastrar"));
		LblCadastrar = new JLabel(cadastrar);
		
		
		
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(3,1,0,0));
	    painelGrid1.add(LblOperadora);
	    painelGrid1.add(TxtOperadora);
	    painelGrid1.add(LblCadastrar);
	    
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(3,1,0,0));
	    painelGrid2.add(LblLogo);
	    painelGrid2.add(new Label(""));
	    painelGrid2.add(LblVoltar);


	    
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
	public void setOperadora(int notas){
		TxtOperadora.setText(String.valueOf(notas));
	}

	public int getOperadora(){
		return Integer.valueOf(TxtOperadora.getText());
	}
	
	public void addVoltarListener(MouseListener a) { 

		LblVoltar.addMouseListener(a); 

	} 
	
	public void addCadastrarListener(MouseListener a) { 

		LblCadastrar.addMouseListener(a); 

	} 
	

}
