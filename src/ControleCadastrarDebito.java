import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ControleCadastrarDebito extends ViewCadastrarDebito {
	protected Conta conta;

	public ControleCadastrarDebito(ResourceBundle bnn, Conta conta)  { 
		 super(bnn);
		 this.conta=conta;
		 addVoltarListener(new VoltarListener()); 
		 addCadastrarListener(new CadastrarListener());
		 
		 
	}
	
	class VoltarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) {
			dispose();
			ControleMenuCliente app=new ControleMenuCliente(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	class CadastrarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) {
			setVisible(false);
			ControleTransferencia app=new ControleTransferencia(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	
}