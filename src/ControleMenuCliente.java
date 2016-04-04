import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ControleMenuCliente extends ViewMenuCliente {
	protected Conta conta;

	public ControleMenuCliente(ResourceBundle bnn, Conta conta)  { 
		 super(bnn);
		 this.conta=conta;
		 addTransferenciaListener(new TransferenciaListener()); 
		 addExtratoListener(new ExtratoListener());
		 addCadastrarDebListener(new CadastrarDebListener());
		 addConsultarSaldoListener(new ConsultarSaldoListener()); 
		 addRealizarSaqueListener(new RealizarSaqueListener());
		 addEncerrarListener(new EncerrarListener());
		 
		 
	}
	
	class TransferenciaListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) {
			setVisible(false);
			ControleTransferencia app=new ControleTransferencia(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	
	class ExtratoListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			setVisible(false);
			ControleExtrato app=new ControleExtrato(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	
	class CadastrarDebListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			setVisible(false);
			ControleCadastrarDebito app=new ControleCadastrarDebito(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	class ConsultarSaldoListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			setVisible(false);
			ControleSaldo app=new ControleSaldo(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	
	class RealizarSaqueListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			setVisible(false);
			ControleSacar app=new ControleSacar(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	
	class EncerrarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			System.exit(0);

		}
	}

}