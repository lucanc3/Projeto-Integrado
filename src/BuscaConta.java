import java.util.ArrayList;


// este metodo 
public class BuscaConta {
	public static Conta achaConta(ArrayList<Conta> contas,Conta conta){
		Conta contaValidada=null;
		int userConta = Integer.parseInt(conta.getConta());
		int userAgencia = Integer.parseInt(conta.getAgencia());
		int userSenha = Integer.parseInt(conta.getAgencia());
		boolean respAgenciaConta=false, respSenha=false, respCodigo=false;

		for(int i =0; i<contas.size();i++){
			int puraConta = Integer.parseInt(contas.get(i).getConta());
			int	puraAgencia = Integer.parseInt(contas.get(i).getAgencia());
			int	puraSenha = Integer.parseInt(contas.get(i).getAgencia());

			if(userAgencia==puraAgencia){
				if(userConta==puraConta){
					respAgenciaConta=true;
					if(userSenha==puraSenha){
						if(conta.getCodigo().equals(null)){
							respCodigo=true;
							contaValidada=contas.get(i);
						}
						else {
							int userCod= Integer.parseInt(conta.getCodigo());
							int	puraCodigo = Integer.parseInt(contas.get(i).getAgencia());
							if(userCod==puraCodigo){
								contaValidada=contas.get(i);
							}
						}


					}
					else{
						respSenha=true;
					}
				}
			}
		}
		return contaValidada;

	}
}
