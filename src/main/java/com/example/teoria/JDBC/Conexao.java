package com.example.teoria.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    public static void main(String[] args) throws SQLException {

        Connection conexao = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "gitpod", "");
            ResultSet rsEstado = conexao.createStatement().executeQuery("SELECT * FROM estado");
            System.out.println("ESTADO | UF | POPULAÇÃO");
            while (rsEstado.next()) {
                System.out.println(rsEstado.getString("nome") + " | " + rsEstado.getString("uf") + " | " + rsEstado.getInt("populacao"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do Banco de Dados não localizado");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados" + e.getMessage());
        }
        finally {
            if (conexao != null) {
                conexao.close();
            }
        }
    }
}