import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;

public class DAOSaldo {

	// atributos
	private Connection conn;
	private PreparedStatement st;
	private MysqlConnect local;
	private Conta conta;


	//construtor padr�o
	public DAOSaldo(Conta conta) {
		this.conta=conta;
		this.local = new MysqlConnect();
		this.conn = local.getConnection();

	}



	//consultar dados
	public String consultaPorCodigo()
	{
		ResultSet resultado;
		String retorno = "Usu�rio n�o Localizado";
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
				conteudo += "Ag�ncia: " + conta.getAgencia() + "\n";
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

	//consultar Saldo por codigo
	public String Saldo()
	{
		ResultSet resultado;
		String retorno = "Usu�rio n�o Localizado";
		String conteudo = "";
		try {
			String sql = "SELECT * FROM tabContaSaldo WHERE agencia = ? AND conta = ? ";
			st = conn.prepareStatement(sql);
			st.setInt(1,Integer.parseInt(conta.getAgencia()));
			st.setInt(2,Integer.parseInt(conta.getConta()));
			resultado = st.executeQuery();

			if (resultado.next())
			{      	 

				conta.setSaldo(resultado.getDouble("saldo"));
				conteudo += "Saldo: " + resultado.getDouble("saldo");

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



}
