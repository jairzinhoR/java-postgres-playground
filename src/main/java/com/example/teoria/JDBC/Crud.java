package com.example.teoria.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {

    public static void main(String[] args) throws SQLException {

        Connection conexao = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "gitpod", "");

        // Inserção do EstadoNovo
        PreparedStatement insertStatement = conexao.prepareStatement(
            "INSERT INTO estado (id, nome, uf, regiao_id, area_km2, populacao) VALUES (?, ?, ?, ?, ?, ?)");         
        insertStatement.setInt(1, 28);
        insertStatement.setString(2, "EstadoNovo");
        insertStatement.setString(3, "EN");
        insertStatement.setInt(4, 3);
        insertStatement.setInt(5, 100000);
        insertStatement.setInt(6, 3600000);
        int rowsAffected = insertStatement.executeUpdate();
        System.out.println(rowsAffected + " linha(s) inserida(s)");
        
        // Atualização do Estado Novo
        PreparedStatement updateStatement = conexao.prepareStatement("UPDATE estado SET nome = ?, populacao = ? WHERE id = ?");
        updateStatement.setString(1, "Estado Novíssimo");
        updateStatement.setInt(2, 330000);
        updateStatement.setInt(3, 28);
        int rowsAffected = updateStatement.executeUpdate();
        System.out.println(rowsAffected + " linha(s) ajustadas(s)");
        
        // Deletar o Estado Novíssimo
        PreparedStatement deleteStatement = conexao.prepareStatement("DELETE FROM estado WHERE nome = ?");
        deleteStatement.setString(1, "Estado Novíssimo");
        int rowsAffected = deleteStatement.executeUpdate();
        System.out.println(rowsAffected + " linha(s) deletada(s)");
     
        // Consulta
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