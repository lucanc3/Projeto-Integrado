import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;
public class ControleExtrato extends ViewExtrato {
protected Conta conta;


	public ControleExtrato(ResourceBundle bnn, Conta conta)  { 
	    super(bnn); 
	    this.conta=conta;
	    addVoltarListener(new VoltarListener()); 
	    addConsultarListener(new ConsultarListener()); 


	}

	class VoltarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			//setVisible(false);
			dispose();
			ControleMenuCliente app=new ControleMenuCliente(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

	        

		}
		
	}
	class ConsultarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			

		}

	}

}