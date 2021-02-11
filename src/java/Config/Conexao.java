
package Config;

import java.sql.*;

public class Conexao {
    Connection con;
    public Conexao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","");
            
              
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error = " + e);
            System.out.println("Erro de conexao com Banco de Dados - verificar se está ativo - Mysql ! ");
        }
    }
    public Connection getConnection(){
        return con;
    }

}
