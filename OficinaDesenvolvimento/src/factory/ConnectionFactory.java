package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //Configurando Usuário e senha do Banco de Dados
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "admin";
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection createConnectionToPostgreSQL() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = createConnectionToPostgreSQL();
        
        if(con != null){
            System.out.println("Conectado");
            con.close();
        }else{
            System.out.println("Falha na conexão com o banco");
        }
    }
    

}
