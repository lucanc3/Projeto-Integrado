import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

public class ControleCadastrarCodigoAcesso extends ViewCadastrarCodigoAcesso{
	protected Conta conta;
	protected String codigoAcesso;
	public ControleCadastrarCodigoAcesso(ResourceBundle bnn, Conta conta)  { 
		super(bnn);
		this.conta=conta;
		addEncerrarListener(new EncerrarListener()); 
		addGerarListener(new GerarListener()); 


	}
	class EncerrarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			System.exit(1);

		}
	}
	class GerarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			codigoAcesso=""+(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10);
			LblResultado.setText(codigoAcesso);
			JOptionPane.showMessageDialog(null, "O código de acesso é: "+codigoAcesso);
			ManipulaArray controle = new ManipulaArray();
			conta.setCodigo(codigoAcesso);
			try {
				controle.salvaCodigoAcesso(conta);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			setVisible(false);
			ControleCodigoAcesso app=new ControleCodigoAcesso(bn,conta);
			app.setDefaultCloseOperation(EXIT_ON_CLOSE);


		}
	}

}
