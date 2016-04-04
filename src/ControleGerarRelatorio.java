import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ControleGerarRelatorio extends ViewGerarRelatorio {
	protected Conta conta;

	public ControleGerarRelatorio(ResourceBundle bnn, Conta conta)  { 
		 super(bnn);
		 addVoltarListener(new VoltarListener()); 
		 
		 
	}
	
	class VoltarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			dispose();		
			ControleMenuAdm appCli=new ControleMenuAdm(bn,conta);
			appCli.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
	        

		}
	}

}


