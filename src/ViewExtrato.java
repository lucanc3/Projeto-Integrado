import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ResourceBundle;

public class ViewExtrato extends JFrame {
	private JPanel painelGrid1, painelGrid2, painelGridPrincipal, panelDataIni, panelDataFini;
	private JLabel lblTitulo, lblVoltar,lblDataInicial,lblDataFinal, lblLogo,  lblConsultar ;
	private ImageIcon consultar, voltar, logo;
	private final JTextField txtDataInicial, txtDataFinal;
	private JRadioButton dias7 , dias15 ; 
	private ButtonGroup radioGrupoDias; // buttongroup para armazenar botões de opção
	private JButton btnDataInicial, btnDataFinal;
	private DatePicker dataInicial, dataFinal;
	protected ResourceBundle bn = null;	

	public ViewExtrato(ResourceBundle bnn){
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		bn=bnn;
		setTitle(Util.getBnu().getString("extrato.label.tituloJanela"));

		lblTitulo= new JLabel(Util.getBnu().getString("extrato.label.titulo"));
		lblDataInicial= new JLabel(Util.getBnu().getString("extrato.label.dataInicial"));
		lblDataFinal= new JLabel(Util.getBnu().getString("extrato.label.dataFinal"));

		voltar = new ImageIcon(Util.getBnu().getString("extrato.botao.voltar"));
		lblVoltar = new JLabel(voltar);

		logo = new ImageIcon("Logo.png");
		lblLogo = new JLabel(logo);

		consultar = new ImageIcon(Util.getBnu().getString("extrato.botao.extrato"));
		lblConsultar = new JLabel(consultar);

		//Botão de Radio

		dias7 = new JRadioButton( "7 Dias", false ); 
		dias15 = new JRadioButton( "15 Dias", false );

		radioGrupoDias = new ButtonGroup(); // cria ButtonGroup 
		radioGrupoDias.add( dias7 ); // adiciona simples ao grupo 
		radioGrupoDias.add( dias15 ); // adiciona negrito ao grupo
		
		//Data Personalizada

		txtDataInicial = new JTextField(10);
		dataInicial= new DatePicker();
		ImageIcon iconeIni = dataInicial.getImage();
		btnDataInicial = new JButton(iconeIni);
		btnDataInicial.setPreferredSize(new Dimension(30, 24));
		btnDataInicial.setMargin(new Insets(0,0,0,0));
		btnDataInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataInicial.setDate(txtDataInicial.getText());
				dataInicial.popupShow(btnDataInicial);
			}

		});
		
		dataInicial.addPopupListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	txtDataInicial.setText(dataInicial.getFormattedDate());
            	dataInicial.popupHide();
            }
        });


		//Coloca em um JPanel Separado
		panelDataIni = new JPanel();
		panelDataIni.setLayout(new FlowLayout());
		panelDataIni.add(txtDataInicial);
		panelDataIni.add(btnDataInicial);



		txtDataFinal = new JTextField(10);
		dataFinal= new DatePicker();
		ImageIcon iconeFini = dataFinal.getImage();
		btnDataFinal = new JButton(iconeFini);
		btnDataFinal.setPreferredSize(new Dimension(30, 24));
		btnDataFinal.setMargin(new Insets(0,0,0,0));
		btnDataFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataFinal.setDate(txtDataFinal.getText());
				dataFinal.popupShow(btnDataFinal);
			}

		});
		
		dataFinal.addPopupListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	txtDataFinal.setText(dataFinal.getFormattedDate());
	                dataFinal.popupHide();
	            }
	        });

		panelDataFini = new JPanel();
		panelDataFini.setLayout(new FlowLayout());
		panelDataFini.add(txtDataFinal);
		panelDataFini.add(btnDataFinal);


		painelGrid1 = new JPanel();
		painelGrid1.setLayout(new GridLayout(8,1,0,0));
		painelGrid1.add(lblTitulo);
		painelGrid1.add(dias7);
		painelGrid1.add(dias15);
		painelGrid1.add(lblDataInicial);
		painelGrid1.add(panelDataIni);
		painelGrid1.add(lblDataFinal);
		painelGrid1.add(panelDataFini);
		painelGrid1.add(lblConsultar);


		painelGrid2 = new JPanel();
		painelGrid2.setLayout(new GridLayout(3,1,0,0));
		painelGrid2.add(lblLogo);
		painelGrid2.add(new Label(""));
		painelGrid2.add(lblVoltar);



		painelGridPrincipal = new JPanel();
		painelGridPrincipal.setLayout(new GridLayout(1,2,0,0));
		painelGridPrincipal.add(painelGrid1);
		painelGridPrincipal.add(painelGrid2);



		tela.add(lblTitulo, BorderLayout.NORTH); 
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
	
	public void addVoltarListener(MouseListener a) { 

		lblVoltar.addMouseListener(a); 

	} 
	
	public void addConsultarListener(MouseListener a) { 

		lblConsultar.addMouseListener(a); 

	} 
}