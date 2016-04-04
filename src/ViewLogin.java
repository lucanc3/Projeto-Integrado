import java.awt.*;
import java.util.ResourceBundle;
import javax.swing.*;
import java.awt.event.*;

public class ViewLogin extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal;
	private JLabel lblLogo,lblEntrar, lblTitulo, lblConta, lblAgencia, LblSenha;
	private JTextField txtConta, txtAgencia;
	private JPasswordField txtPSenha;
	private ImageIcon logo,entrar;
	protected ResourceBundle bn = null;

	public ViewLogin(ResourceBundle bnn){
		super("Login - NOPRANT");
		bn = bnn;
		setLayout( new GridLayout(1,1) );
		Container tela = getContentPane();

		
		entrar = new ImageIcon(Util.getBnu().getString("login.botao.entrar"));
		lblEntrar = new JLabel(entrar);

		logo = new ImageIcon(Util.getBnu().getString("login.botao.logo"));
		lblLogo = new JLabel(logo);

		lblTitulo= new JLabel(Util.getBnu().getString("login.label.titulo"));
		lblTitulo.setForeground( Color.WHITE );
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblConta= new JLabel(Util.getBnu().getString("login.label.conta"));
		lblConta.setForeground( Color.WHITE ); 
		lblConta.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblAgencia= new JLabel(Util.getBnu().getString("login.label.agencia"));
		lblAgencia.setForeground( Color.WHITE );
		lblAgencia.setFont(new Font("Dialog", Font.PLAIN, 17));
		LblSenha= new JLabel(Util.getBnu().getString("login.label.senha"));
		LblSenha.setForeground( Color.WHITE );
		LblSenha.setFont(new Font("Dialog", Font.PLAIN, 17));

		txtConta = new JTextField();
		txtConta.setFont(new Font("Dialog", Font.PLAIN, 30));
		txtAgencia = new JTextField();
		txtAgencia.setFont(new Font("Dialog", Font.PLAIN, 30));
		txtPSenha = new JPasswordField();
		txtPSenha.setFont(new Font("Dialog", Font.PLAIN, 30));


		painelGrid1 = new JPanel();
		painelGrid1.setLayout(new GridLayout(7,1));
		painelGrid1.add(lblTitulo);
		painelGrid1.add(lblAgencia);
		painelGrid1.add(txtAgencia);
		painelGrid1.add(lblConta);
		painelGrid1.add(txtConta);
		painelGrid1.add(LblSenha);
		painelGrid1.add(txtPSenha);

		painelGrid2 = new JPanel();
		painelGrid2.setLayout(new GridLayout(4,1));
		painelGrid2.add(lblLogo);
		painelGrid2.add(new JLabel(""));
		painelGrid2.add(new JLabel(""));
		painelGrid2.add(lblEntrar);

		painelGridPrincipal = new JPanel();
		painelGridPrincipal.setLayout(new GridLayout(1,2));
		painelGridPrincipal.add(painelGrid1);
		painelGridPrincipal.add(painelGrid2);


		tela.add(painelGridPrincipal); 

		painelGridPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE, 7)); 
		Color corFundo = new Color(45,95,143); 
		painelGrid1.setBackground(corFundo);  
		painelGrid2.setBackground(corFundo);  
		painelGridPrincipal.setBackground(corFundo);
		setSize(500, 460);
		setVisible(true);
	}
	
	public void setConta(String conta){
		lblConta.setText(String.valueOf(conta));
	}

	public void setAgencia(String agencia){
		lblAgencia.setText(String.valueOf(agencia));
	}

	public void setSenha(String senha){
		txtPSenha.setText(String.valueOf(senha));
	}
	
	public String getConta(){
		return txtConta.getText();
	}
	
	public String getAgencia(){
		return txtAgencia.getText();
	}
	
	public String getSenha(){
		return new String(txtPSenha.getPassword());
	}
	
	public void addEntrarListener(MouseListener a) { 

		lblEntrar.addMouseListener(a); 

	}


}
