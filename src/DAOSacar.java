import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;

public class DAOSacar {

	// atributos
	private Connection conn;
	private PreparedStatement st;
	private MysqlConnect local;
	private Conta conta;


	//construtor padrão
	public DAOSacar(Conta conta) {
		this.conta=conta;
		this.local = new MysqlConnect();
		this.conn = local.getConnection();

	}



	//consultar dados
	public String consultaPorCodigo()
	{
		ResultSet resultado;
		String retorno = "Usuário nâo Localizado";
		String conteudo = "";
		try {
			String sql = "SELECT * FROM tabContaSaldo WHERE conta = ?";
			st = conn.prepareStatement(sql);
			st.setInt(1,Integer.parseInt(conta.getConta()));
			resultado = st.executeQuery();

			if (resultado.next())
			{      	 
				conta.setNome(""+resultado.getString("nome"));
				conta.setSaldo(resultado.getDouble("saldo"));
				conteudo += "Conta: " + conta.getConta() + "\n";
				conteudo += "Agência: " + conta.getAgencia() + "\n";
				conteudo += "Nome: " + resultado.getString("nome") + "\n";
		
				retorno = conteudo;
			}
			st.close();
		}   
		catch(Exception e)
		{ 
			e.printStackTrace(); 
		}
		return retorno;
	}

	//update de saldo da conta apos o saque
	   public boolean sacar(double novoSaldo)
	   {
	      boolean sucesso = false;
	      try { 
	         String sql = "UPDATE tabContaSaldo SET saldo = ? WHERE agencia = ? and conta = ?";
	         st = conn.prepareStatement(sql);
	         st.setDouble(1,novoSaldo);
	         st.setInt(2,Integer.parseInt(conta.getAgencia()));
	         st.setInt(3,Integer.parseInt(conta.getConta()));
	         st.executeUpdate();
	         sucesso = true;
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	      local.closeConnection();
	      return sucesso;
	   
	   }
	


}
