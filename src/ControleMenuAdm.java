import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ControleMenuAdm extends ViewMenuAdm {
	protected Conta conta;

	public ControleMenuAdm(ResourceBundle bnn,Conta conta)  { 
		 super(bnn);
		 this.conta=conta;
		 addGerarRelatoriosListener(new GerarRelatoriosListener()); 
		 addConsultarDispenserListener(new ConsultarDispenserListener());
		 addEncerrarListener(new EncerrarListener());
		 
		 
	}
	
	class GerarRelatoriosListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) {
			setVisible(false);
			ControleGerarRelatorio app=new ControleGerarRelatorio(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	
	class ConsultarDispenserListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			setVisible(false);
			ControleConsultarDispenser app=new ControleConsultarDispenser(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	
	class EncerrarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			System.exit(ABORT);

		}
	}

}
