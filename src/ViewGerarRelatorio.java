import java.awt.*;
import java.util.ResourceBundle;
import javax.swing.*;

import java.awt.event.*;


public class ViewGerarRelatorio extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal;
	private JLabel lblTitulo, lblVoltar, lblLogo, lblTotal, lblMostraTotal, lblPercentual, lblMostraPercentual;
	private ImageIcon voltar, logo;
	private JRadioButton transf , extrato, debAuto, consSaldo, saque ; 
	private ButtonGroup radioGrupoRelatorio; // buttongroup para armazenar botões de opção
	protected ResourceBundle bn = null;
   
	
	public ViewGerarRelatorio(ResourceBundle bnn){
		bn = bnn;
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		setTitle(Util.getBnu().getString("gerarRelatorio.label.tituloJanela"));
		
		lblTitulo= new JLabel(Util.getBnu().getString("gerarRelatorio.label.titulo"));
		
		voltar = new ImageIcon(Util.getBnu().getString("transferencia.botao.voltar"));
		lblVoltar = new JLabel(voltar);
		
		logo = new ImageIcon(Util.getBnu().getString("login.botao.logo"));
		lblLogo = new JLabel(logo);
      
		lblTotal = new JLabel (Util.getBnu().getString("gerarRelatorio.label.total"));
		lblMostraTotal = new JLabel("9999");
		lblPercentual = new JLabel (Util.getBnu().getString("gerarRelatorio.label.percentual"));
		lblMostraPercentual = new JLabel("9999%");
		

		transf = new JRadioButton(    (Util.getBnu().getString("gerarRelatorio.radioB.transf")), false ); 
		extrato = new JRadioButton(   (Util.getBnu().getString("gerarRelatorio.radioB.extrato")), false );
		debAuto = new JRadioButton(   (Util.getBnu().getString("gerarRelatorio.radioB.debAuto")), false ); 
		consSaldo = new JRadioButton( (Util.getBnu().getString("gerarRelatorio.radioB.consSaldo")), false );
		saque = new JRadioButton(     (Util.getBnu().getString("gerarRelatorio.radioB.saque")), false ); 

		radioGrupoRelatorio = new ButtonGroup(); // cria ButtonGroup 
		radioGrupoRelatorio.add( transf );  
		radioGrupoRelatorio.add( extrato );
		radioGrupoRelatorio.add( debAuto );  
		radioGrupoRelatorio.add( consSaldo ); 
		radioGrupoRelatorio.add( saque );  
		
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(2,3,0,0));
	    painelGrid2.add(lblTotal);
	    painelGrid2.add(lblMostraTotal);
	    painelGrid2.add(lblPercentual);
	    painelGrid2.add(lblMostraPercentual);
	    
	    
	    painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(7,1,0,0));
	    painelGrid1.add(lblTitulo);
	    painelGrid1.add(transf);
	    painelGrid1.add(extrato);
	    painelGrid1.add(debAuto);
	    painelGrid1.add(consSaldo);
	    painelGrid1.add(saque);
	    painelGrid1.add(painelGrid2);

	    
	   
	    painelGridPrincipal = new JPanel();
	    painelGridPrincipal.setLayout(new GridLayout(3,1,0,0));
	    painelGridPrincipal.add(lblLogo);
	    painelGridPrincipal.add(new JLabel(""));
	    painelGridPrincipal.add(lblVoltar);
	
	   
	   
	    //tela.add(painelGrid1, BorderLayout.WEST); 
	    tela.add(painelGrid1, BorderLayout.CENTER);
	    //tela.add(painelGrid2, BorderLayout.SOUTH);
	    tela.add(painelGridPrincipal, BorderLayout.EAST);
	    
	    
	    
	    Color corBorda = new Color(45,95,143); 
	    tela.setBackground(corBorda);
		Color corFundo = new Color(192,192,192);
		painelGrid1.setBackground(corFundo);  
		painelGrid2.setBackground(corFundo);  
	    painelGridPrincipal.setBackground(corFundo);
	    transf.setBackground(corFundo);
	    extrato.setBackground(corFundo);
	    debAuto.setBackground(corFundo);
	    consSaldo.setBackground(corFundo);
	    saque.setBackground(corFundo);
		setSize(500, 460);
		setVisible(true);
	}
	

	
		public void addVoltarListener(MouseListener a) { 

		lblVoltar.addMouseListener(a); 

	} //FALTA AÇÃO DOS RADIOS
	

}
