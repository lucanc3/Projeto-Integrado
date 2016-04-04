import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ManipulaArray {
	private CryptoDummy cdummy; 
	public boolean respAgenciaConta, respSenha, respCodigo;

	public ManipulaArray(){
		cdummy = new CryptoDummy();
		respAgenciaConta=false; respSenha=false; respCodigo=false;
	}
	public Conta geraContaNova(){
		Conta novaConta= new Conta();
		String dado;

		dado=JOptionPane.showInputDialog(null, "Insira a agência");
		novaConta.setAgencia(dado);
		dado=JOptionPane.showInputDialog(null, "Insira a conta");
		novaConta.setConta(dado);
		dado=JOptionPane.showInputDialog(null, "Insira a senha");
		novaConta.setSenha(dado);

		return novaConta;
	}
	public ArrayList<Conta> CriptografaArray (ArrayList<Conta> contasLimpas) throws Exception{
		ArrayList<Conta> contasCrip = new ArrayList <Conta>();
		for (int i =0; i < contasLimpas.size();i++){
			contasCrip.add(criptografaConta(contasLimpas.get(i)));
		}
		return contasCrip;

	}

	public Conta criptografaConta(Conta contaNovaLimpa) throws Exception{
		byte[] bDadoClaro=null;
		byte[] bDadoCifrado =null;
		String sDadoCifrado=null;
		Conta contaCriptografada= new Conta();

		//Cifra a agencia e coloca no array list
		String dado=contaNovaLimpa.getAgencia();
		bDadoClaro = dado.getBytes("ISO-8859-1"); 
		cdummy.geraCifra(bDadoClaro, new File ("chave.dummy")); 
		bDadoCifrado = cdummy.getTextoCifrado(); 
		sDadoCifrado = (new String (bDadoCifrado, "ISO-8859-1")); 
		System.out.println(sDadoCifrado);
		contaCriptografada.setAgencia(sDadoCifrado);

		bDadoClaro = contaNovaLimpa.getConta().getBytes("ISO-8859-1"); 
		cdummy.geraCifra(bDadoClaro, new File ("chave.dummy")); 
		bDadoCifrado = cdummy.getTextoCifrado(); 
		sDadoCifrado = (new String (bDadoCifrado, "ISO-8859-1")); 
		System.out.println(sDadoCifrado);
		contaCriptografada.setConta(sDadoCifrado);

		bDadoClaro = contaNovaLimpa.getSenha().getBytes("ISO-8859-1"); 
		cdummy.geraCifra(bDadoClaro, new File ("chave.dummy")); 
		bDadoCifrado = cdummy.getTextoCifrado(); 
		sDadoCifrado = (new String (bDadoCifrado, "ISO-8859-1")); 
		System.out.println(sDadoCifrado);
		contaCriptografada.setSenha(sDadoCifrado);
		
	
		bDadoClaro = contaNovaLimpa.getCodigo().getBytes("ISO-8859-1"); 
		cdummy.geraCifra(bDadoClaro, new File ("chave.dummy")); 
		bDadoCifrado = cdummy.getTextoCifrado(); 
		sDadoCifrado = (new String (bDadoCifrado, "ISO-8859-1")); 
		System.out.println(sDadoCifrado);
		contaCriptografada.setCodigo(sDadoCifrado);
		
		
		return contaCriptografada;

	}

	public void gravaConta(Conta conta) throws Exception { 
		// object to be written to file 
		File file = new File("contas.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		PrintWriter writer = new PrintWriter(fileWriter);
		String dados=conta.getAgencia() + " " + conta.getConta()+" "+ conta.getSenha()+" "+conta.getCodigo()+"\n";
		writer.print(dados);
		writer.flush();
		writer.close();

	} 

	public ArrayList<Conta> acrecentaConta(ArrayList<Conta> contas) throws Exception{
		ArrayList<Conta> adicionaConta =leArquivoCriptografado();
		Conta novaConta = geraContaNova();
		int nAgencia = Integer.parseInt(novaConta.getAgencia());
		int nConta = Integer.parseInt(novaConta.getConta());
		boolean add = false;
		if (adicionaConta.isEmpty()){
			adicionaConta.add(novaConta);
		}

		for(int i =0; i < adicionaConta.size() && add==false;i++){

			int agencia = Integer.parseInt(adicionaConta.get(i).getAgencia());
			int conta = Integer.parseInt(adicionaConta.get(i).getConta());

			if(nAgencia<agencia){
				adicionaConta.add(i,novaConta);
				add=true;

			}
			if(nAgencia==agencia){
				if(nConta<conta){
					adicionaConta.add(i,novaConta);
					add=true;
				}

			}
		}
		return adicionaConta;
	}

	public void gravaConta(ArrayList<Conta> contas) throws Exception {

		// object to be written to file 
		Formatter output = new Formatter( "contas.txt" ); // object used to output text to file
		String dados="";
		for(int i=0;i<contas.size();i++){
			dados+=contas.get(i).getAgencia() + " " + contas.get(i).getConta()+" "+ contas.get(i).getSenha()+" "+contas.get(i).getCodigo()+"\n";
		}
		output.format( dados);
		output.close();
	}


	public void limpaArquivo() throws Exception{
		File file = new File("contas.txt");
		PrintWriter writer = new PrintWriter(file);
		writer.print("");
		writer.close();

	}

	public ArrayList<Conta> leArquivoCriptografado() throws Exception{ 
		Scanner input = new Scanner( new File( "contas.txt" ) );
		System.out.println("Metodo le arquivo");
		ArrayList<Conta> arrayDeContaDoArquivo = new ArrayList <Conta>();
		while ( input.hasNext() ){
			String dadoDescriptografado="";
			Conta conta = new Conta();

			dadoDescriptografado=decifra(input.next());
			System.out.println(dadoDescriptografado);
			conta.setAgencia(dadoDescriptografado);

			dadoDescriptografado=decifra(input.next());
			System.out.println(dadoDescriptografado);
			conta.setConta(dadoDescriptografado);

			dadoDescriptografado=decifra(input.next());
			System.out.println(dadoDescriptografado);
			conta.setSenha(dadoDescriptografado);

			dadoDescriptografado=decifra(input.next());
			System.out.println(dadoDescriptografado);
			conta.setCodigo(dadoDescriptografado);

			arrayDeContaDoArquivo.add(conta);
		} // end while
		input.close();
		return arrayDeContaDoArquivo;
	}

	public String decifra(String dadoCriptogradafo) throws Exception{
		byte[] bMsgCifrada=null;
		byte[] bMsgDecifrada=null;
		String sMsgDecifrada="";
		System.out.println("Meotodo decifra/vai decifrar"); 

		bMsgCifrada = dadoCriptogradafo.getBytes("ISO-8859-1"); 
		// Gera a decifra Dummy da mensagem dada, segundo a chave Dummy simetrica gerada 
		cdummy.geraDecifra(bMsgCifrada, new File ("chave.dummy")); 

		// recebe o texto decifrado 
		bMsgDecifrada = cdummy.getTextoDecifrado(); 

		// Converte o texto byte[] no equivalente String 
		sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1")); 

		// Imprime cabecalho da mensagem 
		System.out.println("Mensagem Decifrada (String):"); 

		// Imprime o texto decifrado em String 
		System.out.println(sMsgDecifrada); 
		System.out.println("");

		return sMsgDecifrada;
	}

	public Conta achaConta(Conta conta) throws Exception{
		ArrayList<Conta> contas = leArquivoCriptografado();
		Conta contaValidada=null;
		int userConta = Integer.parseInt(conta.getConta());
		int userAgencia = Integer.parseInt(conta.getAgencia());
		int userSenha = Integer.parseInt(conta.getSenha());

		for(int i =0; i<contas.size();i++){
			int puraConta = Integer.parseInt(contas.get(i).getConta());
			int	puraAgencia = Integer.parseInt(contas.get(i).getAgencia());
			int	puraSenha = Integer.parseInt(contas.get(i).getSenha());

			if(userAgencia==puraAgencia){
				if(userConta==puraConta){
					respAgenciaConta=true;
					if(userSenha==puraSenha){
						respSenha=true;
						contaValidada=contas.get(i);
						if(contas.get(i).getCodigo().equals("00")){
							respCodigo=true;

						}

					}


				}

			}
		}
		return contaValidada;
	}

	public void salvaCodigoAcesso(Conta conta) throws Exception{
		ArrayList<Conta> contas = leArquivoCriptografado();
		int userConta = Integer.parseInt(conta.getConta());
		int userAgencia = Integer.parseInt(conta.getAgencia());
		int userSenha = Integer.parseInt(conta.getSenha());

		for(int i =0; i<contas.size();i++){
			int puraConta = Integer.parseInt(contas.get(i).getConta());
			int	puraAgencia = Integer.parseInt(contas.get(i).getAgencia());
			int	puraSenha = Integer.parseInt(contas.get(i).getSenha());

			if(userAgencia==puraAgencia){
				if(userConta==puraConta){
					if(userSenha==puraSenha){
						contas.get(i).setCodigo(conta.getCodigo());
						gravaConta(CriptografaArray(contas));
						}


				}

			}
		}
		
		
	}
	public void insereConta() throws Exception{
		gravaConta(CriptografaArray(acrecentaConta(leArquivoCriptografado())));

	}


	public static void main(String[] args) throws Exception { 
		ManipulaArray teste = new ManipulaArray();
		//teste.insereConta();
		teste.leArquivoCriptografado();


	}

}
