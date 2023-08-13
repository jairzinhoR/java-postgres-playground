package com.example.Backup.AulaJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AppBd {

    
    public static void main(String[] args) {
        try {
           Class.forName("org.postgresql.Driver");
           Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
           System.out.println("Conexão realizada com sucesso");
           
           var statement = conn.createStatement();
           var result = statement.executeQuery("select * from estado");
           while(result.next()){
            System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf") );
           }
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca/classe para acesso ao BD" + e.getMessage());   
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados" + e.getMessage());
        }

    }
    
}
