import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;

public class ControleSacar extends ViewSacar {
	Conta conta = new Conta();

	public ControleSacar(ResourceBundle bnn, Conta conta) {
		super(bnn);
		this.conta = conta;
		addVoltarListener(new VoltarListener());
		addSacarListener(new TransferirListener());
		addNota10Listener(new Nota10Listener());
		addNota20Listener(new Nota20Listener());
		addNota50Listener(new Nota50Listener());
		addNota100Listener(new Nota100Listener());
		addNota200Listener(new Nota200Listener());
		addNota500Listener(new Nota500Listener());

		
		
	}

	class Nota10Listener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {

			setValor(10);

		}
	}

	class Nota20Listener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {

			setValor(20);

		}
	}

	class Nota50Listener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {

			setValor(50);

		}
	}

	class Nota100Listener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {

			setValor(100);

		}
	}

	class Nota200Listener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {

			setValor(200);

		}
	}
	
	class Nota500Listener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {

			setValor(500);

		}
	}

	class VoltarListener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			dispose();
			ControleMenuCliente app = new ControleMenuCliente(bn, conta);
			app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}

	}

	class TransferirListener extends MouseAdapter implements MouseListener {

		public void mouseClicked(MouseEvent e) {

			DAOSacar daoSacar = new DAOSacar(conta);
			
			String dados = daoSacar.consultaPorCodigo();
			LblTitulo.setText(String.valueOf(dados));
			

			if (getValor() < conta.getSaldo()) {

				double resultado = conta.getSaldo() - getValor();

				daoSacar.sacar(resultado);
				JOptionPane.showMessageDialog(null,
						bn.getString("sacar.mensagem.realizarSaque"));

			} else {
				JOptionPane.showMessageDialog(null,
						bn.getString("sacar.mensagem.saldoInsuficiente"));
			}

			// JOptionPane.showMessageDialog(null,bn.getString("sacar.mensagem.realizarSaque"));
			// //alterar

			// app.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}

	}

}
