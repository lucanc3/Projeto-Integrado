import java.awt.event.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

public class ControleLogin extends ViewLogin {


	public ControleLogin(ResourceBundle bnn)  { 
		super(bnn);
		addEntrarListener(new EntrarListener()); 


	}

	class EntrarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			ManipulaArray controle = new ManipulaArray();
			Conta conta = new Conta();
			conta.setAgencia(getAgencia());
			conta.setConta(getConta());
			conta.setSenha(getSenha());
			Conta contaValidada = null;
			try {
				contaValidada=controle.achaConta(conta);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			if(controle.respAgenciaConta==true){
				if(controle.respSenha==true){
					if(controle.respCodigo==true){
						setVisible(false);
						ControleCadastrarCodigoAcesso app=new ControleCadastrarCodigoAcesso(bn,contaValidada);
						app.setDefaultCloseOperation(EXIT_ON_CLOSE);
					}

					if(controle.respCodigo==false){
						setVisible(false);
						ControleCodigoAcesso app=new ControleCodigoAcesso(bn,contaValidada);
						app.setDefaultCloseOperation(EXIT_ON_CLOSE);
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Senha Incorreta");
				}
			}
			else{
				JOptionPane.showMessageDialog(null,"Agencia ou Conta Incorreta");

			}

		}

	}
}