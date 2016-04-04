import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.ResourceBundle;

public class ViewCodigoAcesso extends JFrame {
	private JPanel painelGrid1, painelGrid2, gridTop, gridCenter;
	private JLabel lblTitulo, lblLogo, lblEntrar, lblEncerrar, lbl0, lbl1,lbl2,lbl3,lbl4 ;
	private ImageIcon logo, entrar, encerrar;
	private JPasswordField codigo;
	private int v[]=new int[10];
	protected ResourceBundle bn = null;
	
	public ViewCodigoAcesso(ResourceBundle bnn){
		bn=bnn;
		setTitle(Util.getBnu().getString("codigoAcesso.label.tituloJanela"));
		setLayout( new BorderLayout () );
		Container tela = getContentPane();
		
		codigo = new JPasswordField ();
		codigo.setPreferredSize((new Dimension(230,30)));
		
		lblTitulo= new JLabel(Util.getBnu().getString("codigoAcesso.label.titulo"));

		logo = new ImageIcon("Logo.png");
		lblLogo = new JLabel(logo);
		
		
		entrar = new ImageIcon(Util.getBnu().getString("codigoAcesso.botao.entrar"));
		lblEntrar = new JLabel(entrar);
		
		encerrar = new ImageIcon(Util.getBnu().getString("codigoAcesso.botao.encerrar"));
		lblEncerrar = new JLabel(encerrar);
		
		 for(int i =0; i<v.length;i++){
	            v[i]=(int)(Math.random()*10);
	        
	               for(int k=i-1; k>=0; k--){
	                  if(v[k]==v[i]){			
	                     i--;
	                     break;
	                  }
	               }
	            
	         }
		
			lbl0=new JLabel(""+v[0]+" -  "+v[1],JLabel.CENTER);
			lbl0.setFont(new Font("Dialog", Font.PLAIN, 20));
			lbl0.setBackground(Color.WHITE);
			lbl0.setPreferredSize((new Dimension(60,60)));	
			lbl0.setOpaque(true);
			lbl0.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));  
			lbl1=new JLabel(""+v[2]+" -  "+v[3],JLabel.CENTER);
			lbl1.setFont(new Font("Dialog", Font.PLAIN, 20));
			lbl1.setBackground(Color.WHITE);
			lbl1.setOpaque(true);
			lbl1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
			lbl2=new JLabel(""+v[4]+" -  "+v[5],JLabel.CENTER);
			lbl2.setFont(new Font("Dialog", Font.PLAIN, 20));
			lbl2.setBackground(Color.WHITE);
			lbl2.setOpaque(true);
			lbl2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
			lbl3=new JLabel(""+v[6]+" -  "+v[7],JLabel.CENTER);
			lbl3.setFont(new Font("Dialog", Font.PLAIN, 20));
			lbl3.setBackground(Color.WHITE);
			lbl3.setOpaque(true);
			lbl3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
			lbl4=new JLabel(""+v[8]+" -  "+v[9],JLabel.CENTER);
			lbl4.setFont(new Font("Dialog", Font.PLAIN, 20));
			lbl4.setBackground(Color.WHITE);
			lbl4.setOpaque(true);
			lbl4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
		
		gridTop = new JPanel();
		gridTop.setLayout(new GridLayout(1,2,0,0));
		gridTop.add(lblTitulo);
		gridTop.add(lblLogo);
			
			
		painelGrid1 = new JPanel();
	    painelGrid1.setLayout(new GridLayout(1,2,0,0));
	    painelGrid1.add(lblEncerrar);
	    painelGrid1.add(lblEntrar);
	    
	    
	    painelGrid2 = new JPanel();
	    painelGrid2.setLayout(new GridLayout(1,5,0,0));
	    painelGrid2.add(lbl0);
	    painelGrid2.add(lbl1);
	    painelGrid2.add(lbl2);
	    painelGrid2.add(lbl3);
	    painelGrid2.add(lbl4);
	    
	    
		gridCenter = new JPanel();
		gridCenter.setLayout(new FlowLayout());
		gridCenter.add(codigo);
		gridCenter.add(painelGrid2);
		
	    tela.add(gridTop, BorderLayout.NORTH); 
	    tela.add(gridCenter, BorderLayout.CENTER); 
	    tela.add(painelGrid1, BorderLayout.SOUTH); 
	    
	    
	    Color corBorda = new Color(45,95,143); 
	    gridCenter.setBorder(BorderFactory.createLineBorder(corBorda, 7)); 
	    tela.setBackground(corBorda);
		Color corFundo = new Color(192,192,192);
		painelGrid1.setBackground(corFundo);  
		painelGrid2.setBackground(corFundo);  
		gridTop.setBackground(corFundo);
	    gridCenter.setBackground(corFundo);
		setSize(500, 460);
		setVisible(true);
	}
	
	public void setCodigo(int sCodigo){
		codigo.setText(String.valueOf(sCodigo));
	}
	
	public String getCodigo(){
		return String.valueOf(codigo.getText());
	}
	
	public void addEntrarListener(MouseListener a) { 

		lblEntrar.addMouseListener(a); 

	}
	
	public void addEncerrarListener(MouseListener a) { 

		lblEncerrar.addMouseListener(a); 

	}
	
}