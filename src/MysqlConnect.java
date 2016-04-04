import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class MysqlConnect {
   // atributo
   public Connection conn;
   // construtor
   public MysqlConnect() {
   //root@localhost:3306 - jdbc:mysql://localhost:3306/?user=root
        conn            = null;
	     String url      = "jdbc:mysql://localhost:3306/"; // localizacao do servidor
	    // root@localhost:3306 Mysql@localhost:3306
        String dbName   = "dbnoprant_Projeto";                    // nome do banco de dados
        String driver   = "com.mysql.jdbc.Driver";   // nome do driver de conexao
        String userName = "root";                    // nome do usuario do banco
        String password = "root";                    // respectiva senha
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, userName, password);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Banco de Dados!"+e);
            e.printStackTrace();
        }
    }
    // fornece a conexao com o banco de dados Mysql
    public Connection getConnection() {
      return conn;
    }
    //Fecha a conexao com bco de dados
    public void closeConnection() {
        try                { conn.close(); }
        catch(Exception e) { e.printStackTrace(); }
    }
}