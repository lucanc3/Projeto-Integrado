import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.*;

public class ControleTransferencia extends ViewTransferencia {
	protected Conta conta;

	public ControleTransferencia(ResourceBundle bnn,Conta conta)  { 
		 super(bnn);
		 this.conta=conta;
		 addVoltarListener(new VoltarListener()); 
		 addTransferirListener(new TransferirListener()); 
		 
		 
	}
	
	class VoltarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			//setVisible(false);
			dispose();
			ControleMenuCliente app=new ControleMenuCliente(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

	        

		}
		
	}
		
		
		class TransferirListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
		
				JOptionPane.showMessageDialog(null,bn.getString("transferenciaControle.message.transferido"));
			
	     //   app.setDefaultCloseOperation(EXIT_ON_CLOSE);

	        

		}

	}

}