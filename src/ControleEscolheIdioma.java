import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;
public class ControleEscolheIdioma extends ViewEscolheIdioma {
	private ResourceBundle bn = null;

	//	public ControleEscolheIdioma(Funcionario f)  { 
	public ControleEscolheIdioma()  { 
	    super(); 
		addIdiomaPTListener(new PTListener()); 
		addIdiomaENListener(new ENListener()); 


	}

	class PTListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			setVisible(false);
			bn = ResourceBundle.getBundle("NOPRANT", new Locale("pt", "BR"));
			ControleLogin app=new ControleLogin(bn);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
	class ENListener extends MouseAdapter  implements MouseListener { 

		public void  mouseClicked(MouseEvent e) { 
			setVisible(false);
			bn = ResourceBundle.getBundle("NOPRANT", Locale.US);
			Util.setBnu(bn);
			ControleLogin app=new ControleLogin(bn);
	        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}

	}

}
