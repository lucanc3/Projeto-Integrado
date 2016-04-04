import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;

public class ControleSaldo extends ViewSaldo {
	Conta conta=new Conta();


	public ControleSaldo(ResourceBundle bnn, Conta conta)  { 
		 super(bnn);
		 this.conta=conta;
		 addVoltarListener(new VoltarListener()); 
		 addTransferirListener(new TransferirListener()); 
		 
		 
	}
	
	class VoltarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			dispose();
			ControleMenuCliente app=new ControleMenuCliente(bn, conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

	        

		}
		
	}
		
		
		class TransferirListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			
				DAOSaldo saldo = new DAOSaldo(conta);
				
				String resultado = saldo.Saldo();
				LblResultado.setText(String.valueOf(resultado));
				
				String dados = saldo.consultaPorCodigo();
				
				LblTitulo.setText(String.valueOf(dados));
				
				
				

		}

	}

}