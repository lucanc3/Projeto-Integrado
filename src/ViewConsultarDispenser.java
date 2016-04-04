import java.awt.*;
import java.util.ResourceBundle;
import javax.swing.*;
import java.awt.event.*;

public class ViewConsultarDispenser extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal;
	private JLabel LblNotasDisponiveis, LblVoltar, LblLogo, LblNotas, LblQuantidadesDisponiveis, LblQuantidade;
	private ImageIcon imprimir, voltar, logo;
	protected ResourceBundle bn = null;	


	public ViewConsultarDispenser(ResourceBundle bnn){
		bn = bnn;
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		setTitle(Util.getBnu().getString("dispenser.label.tituloJanela"));




		LblNotasDisponiveis = new JLabel(Util.getBnu().getString("dispenser.label.notasDisponiveis"));
		LblNotas = new JLabel(Util.getBnu().getString("dispenser.label.notas")); //alterar


		LblQuantidadesDisponiveis = new JLabel(Util.getBnu().getString("dispenser.label.quantidadesDisponiveis"));
		LblQuantidade = new JLabel(Util.getBnu().getString("dispenser.label.quantidades")); //alterar

		voltar = new ImageIcon(Util.getBnu().getString("transferencia.botao.voltar"));
		LblVoltar = new JLabel(voltar);

		logo = new ImageIcon(Util.getBnu().getString("login.botao.logo"));
		LblLogo = new JLabel(logo);


		painelGrid1 = new JPanel();
		painelGrid1.setLayout(new GridLayout(4,1,0,0));
		painelGrid1.add(LblNotasDisponiveis);
		painelGrid1.add(LblNotas);
		painelGrid1.add(LblQuantidadesDisponiveis);
		painelGrid1.add(LblQuantidade);


		painelGrid2 = new JPanel();
		painelGrid2.setLayout(new GridLayout(2,1,0,0));
		painelGrid2.add(LblLogo);
		painelGrid2.add(LblVoltar);


		painelGridPrincipal = new JPanel();
		painelGridPrincipal.setLayout(new GridLayout(1,2,0,0));
		painelGridPrincipal.add(painelGrid1);
		painelGridPrincipal.add(painelGrid2);


		tela.add(painelGridPrincipal, BorderLayout.CENTER); 


		Color corBorda = new Color(45,95,143); 
		painelGridPrincipal.setBorder(BorderFactory.createLineBorder(corBorda, 7)); 
		tela.setBackground(corBorda);
		Color corFundo = new Color(192,192,192);
		painelGrid1.setBackground(corFundo);  
		painelGrid2.setBackground(corFundo);  
		//painelGridPrincipal.setBackground(corFundo);
		setSize(500, 460);
		setVisible(true);
	}
	public void setNotas(int notas){
		LblNotas.setText(String.valueOf(notas));
	}

	public int getNotas(){
		return Integer.valueOf(LblNotas.getText());
	}
	
	public void setQuantidades(int quantidades){
		LblQuantidade.setText(String.valueOf(quantidades));
	}

	public int getQuantidades(){
		return Integer.valueOf(LblQuantidade.getText());
	}
	
	public void addVoltarListener(MouseListener a) { 

		LblVoltar.addMouseListener(a); 

	} //pra cada botao

}

