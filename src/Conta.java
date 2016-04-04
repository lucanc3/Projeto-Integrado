
public class Conta {
private String conta, agencia, senha, codigo, nome;
private double saldo;

	public Conta(){
		setConta(null);
		setAgencia(null);
		setSenha(null);
		setCodigo("00");
		setSaldo(0.0);
		setNome(null);
		
	}
	public Conta(String cAgencia, String cConta, String cSenha, String cCodigo){
		setAgencia(cAgencia);
		setConta(cConta);
		setSenha(cSenha);
		setCodigo(cCodigo);
	}
	
	public void setConta(String sConta){
		conta=sConta;
	}
	public void setNome(String sNome){
		nome=sNome;
	}
	
	public void setAgencia(String sAgencia){
		agencia=sAgencia;
	}
	
	public void setSenha(String sSenha){
		senha=sSenha;
	}
	
	public void setCodigo(String sCodigo){
		codigo=sCodigo;
	}
	public void setSaldo(double sSaldo){
		saldo=sSaldo;
	}
	
	public String getAgencia(){
		return agencia;
	}
	public String getConta(){
		return conta;
	}
	public String getSenha(){
		return senha;
	}
	public String getCodigo(){
		return codigo;
	}
	public double getSaldo(){
		return saldo;
	}
	public String getNome(){
		return nome;
	}
}
