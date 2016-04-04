import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ResourceBundle;

public class ViewMenuCliente extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal;
	private JLabel lblTitulo, lblTransferencia, lblExtrato, lblCadastrarDeb, lblConsultarSaldo, LblLogo, lblRealizarSaque, lblEncerrar;
	private ImageIcon transferencia, extrato, cadastrarDeb, cnsultarSaldo, logo, realizarSaque, encerrar;
	protected ResourceBundle bn = null;
	
	public ViewMenuCliente(ResourceBundle bnn){
		bn=bnn;
		setTitle(Util.getBnu().getString("menuCli.label.tituloJanela"));
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		
		lblTitulo= new JLabel(Util.getBnu().getString("menuCli.label.titulo"));
		
		transferencia = new ImageIcon(Util.getBnu().getString("menuCli.botao.tranferencia"));
		lblTransferencia = new JLabel(transferencia);
		
		extrato = new ImageIcon(Util.getBnu().getString("menuCli.botao.extrato"));
		lblExtrato = new JLabel(extrato);
		
		cadastrarDeb = new ImageIcon(Util.getBnu().getString("menuCli.botao.cadastrarDeb"));
		lblCadastrarDeb = new JLabel(cadastrarDeb);
		
		cnsultarSaldo = new ImageIcon(Util.getBnu().getString("menuCli.botao.consultarSaldo"));
		lblConsultarSaldo = new JLabel(cnsultarSaldo);
		
		logo = new ImageIcon("Logo.png");
		LblLogo = new JLabel(logo);
		
		realizarSaque = new ImageIcon(Util.getBnu().getString("menuCli.botao.realizarSaque"));
		lblRealizarSaque = new JLabel(realizarSaque);
		
		encerrar = new ImageIcon(Util.getBnu().getString("menuAdm.botao.encerrar"));
		lblEncerrar = new JLabel(encerrar);
		
		
		
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(4,1,0,0));
	    painelGrid1.add(lblTransferencia);
	    painelGrid1.add(lblExtrato);
	    painelGrid1.add(lblCadastrarDeb);
	    painelGrid1.add(lblConsultarSaldo);
	  
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(3,1,0,0));
	    painelGrid2.add(LblLogo);
	    painelGrid2.add(lblRealizarSaque);
	    painelGrid2.add(lblEncerrar);
	    
	    painelGridPrincipal = new JPanel();
	    painelGridPrincipal.setLayout(new GridLayout(1,2,0,0));
	    painelGridPrincipal.add(painelGrid1);
	    painelGridPrincipal.add(painelGrid2);
	    
	    
	   
	    tela.add(lblTitulo, BorderLayout.NORTH); 
	    tela.add(painelGridPrincipal, BorderLayout.CENTER); 
	    
	    
	    Color corBorda = new Color(45,95,143); 
		painelGridPrincipal.setBorder(BorderFactory.createLineBorder(corBorda, 7)); 
	    tela.setBackground(corBorda);
		Color corFundo = new Color(192,192,192);
		painelGrid1.setBackground(corFundo);  
		painelGrid2.setBackground(corFundo);  
		setSize(500, 460);
		setVisible(true);
	}
	
	public void addTransferenciaListener(MouseListener a) { 

		lblTransferencia.addMouseListener(a); 

	 }
	
	public void addExtratoListener(MouseListener a) { 

		lblExtrato.addMouseListener(a); 

	 }
	
	public void addCadastrarDebListener(MouseListener a) { 

		lblCadastrarDeb.addMouseListener(a); 

	 }
	
	public void addConsultarSaldoListener(MouseListener a) { 

		lblConsultarSaldo.addMouseListener(a); 

	 }
	public void addRealizarSaqueListener(MouseListener a) { 

		lblRealizarSaque.addMouseListener(a); 

	 }
	public void addEncerrarListener(MouseListener a) { 

		lblEncerrar.addMouseListener(a); 

	 }
}
