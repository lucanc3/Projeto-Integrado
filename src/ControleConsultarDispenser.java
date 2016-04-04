import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.*;

public class ControleConsultarDispenser extends ViewConsultarDispenser {
	protected Conta conta;

	public ControleConsultarDispenser(ResourceBundle bnn, Conta conta)  { 
		 super(bnn);
		 this.conta=conta;
		 addVoltarListener(new VoltarListener()); 
	
		 
		 
	}
	
	class VoltarListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			dispose();
			ControleMenuAdm app=new ControleMenuAdm(bn,conta);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

	        

		}
		
	}
		
		


}