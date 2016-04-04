import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

public class ControleCodigoAcesso extends ViewCodigoAcesso {
	protected Conta conta;


	public ControleCodigoAcesso(ResourceBundle bnn, Conta conta)  { 
		super(bnn);
		this.conta=conta;
		addEntrarListener(new EntrarListener()); 
		addEncerrarListener(new EncerrarListener());
	


	}

	class EntrarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
	
			
			
			
				if(getCodigo().equals(conta.getCodigo())){

					// Para administrador agencia: 101  conta: 101 senha: 101
					if((conta.getAgencia().equals("101"))&&(conta.getConta().equals("101"))){
						setVisible(false);
						ControleMenuAdm app=new ControleMenuAdm(bn,conta);
						app.setDefaultCloseOperation(EXIT_ON_CLOSE);
					}
					else{
						setVisible(false);
						ControleMenuCliente appCli=new ControleMenuCliente(bn,conta);
						appCli.setDefaultCloseOperation(EXIT_ON_CLOSE);
					}
				}
				else{
				
		
					JOptionPane.showMessageDialog(null, "Código incorreto");
					
				}
			}
		

	}
	

	class EncerrarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			System.exit(ABORT);

		}
	}

}