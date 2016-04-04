import java.awt.*;
import java.util.ResourceBundle;
import javax.swing.*;
import java.awt.event.*;


public class ViewTransferencia extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal;
	private JLabel LblTitulo, LblAgencia, LblVoltar, LblLogo, LblConta, LblTransferir, LblValorTransferencia;
	private ImageIcon transferir, voltar, logo;
	private JTextField TxtAgencia, TxtConta, TxtValorTransferencia;
	protected ResourceBundle bn = null;
	
	
	
   
	
	public ViewTransferencia(ResourceBundle bnn){		
		bn = bnn;
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		setTitle(Util.getBnu().getString("transferencia.label.tituloJanela"));
		
		LblTitulo= new JLabel(Util.getBnu().getString("transferencia.label.titulo"));
		
	
		LblAgencia = new JLabel(Util.getBnu().getString("transferencia.label.agencia"));
		TxtAgencia = new JTextField();
		
		
		LblConta = new JLabel(Util.getBnu().getString("transferencia.label.conta"));
		TxtConta = new JTextField();
		
		LblValorTransferencia = new JLabel(Util.getBnu().getString("transferencia.label.valorTransferencia"));
		TxtValorTransferencia = new JTextField();
		
		voltar = new ImageIcon(Util.getBnu().getString("transferencia.botao.voltar"));
		LblVoltar = new JLabel(voltar);
		
		logo = new ImageIcon(Util.getBnu().getString("login.botao.logo"));
		LblLogo = new JLabel(logo);
      
		transferir = new ImageIcon(Util.getBnu().getString("transferencia.botao.transferir"));
		LblTransferir = new JLabel(transferir);
		
		
		
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(6,1,0,0));
	    painelGrid1.add(LblAgencia);
	    painelGrid1.add(TxtAgencia);
	    painelGrid1.add(LblConta);
	    painelGrid1.add(TxtConta);
	    painelGrid1.add(LblValorTransferencia);
	    painelGrid1.add(TxtValorTransferencia);
	    
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(3,1,0,0));
	    painelGrid2.add(LblLogo);
	    painelGrid2.add(LblVoltar);
	    painelGrid2.add(LblTransferir);

	    
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
	
	// para cada textfield
	public void setConta(int conta){
		TxtConta.setText(String.valueOf(conta));
	}

	public void setAgencia(int agencia){
		TxtAgencia.setText(String.valueOf(agencia));
	}

	public void setValorTransferencia(int transferencia){
		TxtValorTransferencia.setText(String.valueOf(transferencia));
	}
	
	public int getConta(){
		return Integer.valueOf(TxtConta.getText());
	}
	
	public int getAgencia(){
		return Integer.valueOf(TxtAgencia.getText());
	}
	
	public int getValorTransferencia(){
		return Integer.valueOf(TxtValorTransferencia.getText());
	}
	

	public void addVoltarListener(MouseListener a) { 

		LblVoltar.addMouseListener(a); 

	} //pra cada botao
	
		public void addTransferirListener(MouseListener a) { 

		LblTransferir.addMouseListener(a); 

	} //pra cada botao
}
