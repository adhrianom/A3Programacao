package dao;
import java.sql.*;
import modelo.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private Connection conexao;

    public CategoriaDAO(Connection conexao) {
        this.conexao = conexao;
    }
//seguindo o categoria.java por enquanto
    public void inserir(Categoria categoria) { 
        String sql = "INSERT INTO produtos (nome,tamanho,embalagem) VALUES (?,?,?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho());
            stmt.setString(3, categoria.getEmbalagem());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao inserir categoria " + e.getMessage());
        }
    }
    
    public void alterar(Categoria categoria) {
        String sql = "UPDATE produtos SET nome = ?, tamanho = ?, embalagem = ? WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho());
            stmt.setString(3, categoria.getEmbalagem());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao alterar categoria " + e.getMessage());
        }
    }
    
    public void apagar(int id) {
        String sql = "DELETE FROM produtos WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao remover categoria " + e.getMessage());
        }
    }
}

