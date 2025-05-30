package dao;

import java.sql.*;
import modelo.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Connection con;

    public CategoriaDAO() throws SQLException {
        this.con = new ConnectionFactory().getConnection();
    }

    public void inserir(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO categoria(nome,tamanho,embalagem) VALUES (?,?,?)";

        try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho());
            stmt.setString(3, categoria.getEmbalagem());
            stmt.executeUpdate();

            // Recuperar o ID gerado
            try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                int idGerado = rs.getInt(1);
                categoria.setIdCategoria(idGerado);
                System.out.println("ID gerado: " + idGerado);
            }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao inserir categoria " + e.getMessage());
        }
    }

    public void alterar(Categoria categoria) {
        String sql = "UPDATE categoria SET nome = ?, tamanho = ?, embalagem = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho());
            stmt.setString(3, categoria.getEmbalagem());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao alterar categoria " + e.getMessage());
        }
    }

    public void apagar(int id) {
        String sql = "DELETE FROM categoria WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao remover categoria " + e.getMessage());
        }
    }

}
