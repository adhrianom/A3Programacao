package dao;
import java.sql.*;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/controleestoquea3";
    private static final String USUARIO = "root";
    private static final String SENHA = "unisul@prog3";
    //Depois tem que substituir quando criado

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC não encontrado.", e);
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
