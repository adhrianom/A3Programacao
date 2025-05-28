package dao;
import java.sql.*;
import modelo.Produto;
import modelo.Categoria;
import modelo.SistemaEstoque;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private Connection conexao;
    
    SistemaEstoque se = new SistemaEstoque();

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserir(Produto produto) { 
        String sql = "INSERT INTO produto (Nome, Preço Unitário, Unidade, Quantidade de Estoque, Quantidade Mínima, "
                + "Quantidade Máxima, Id, Categoria) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, se.getQuantidadeEstoque());
            stmt.setInt(5, se.getQuantidadeMinima());
            stmt.setInt(6, se.getQuantidadeMaxima());
            stmt.setString(7, produto.getCategoria().getNome());
            stmt.setString(8, produto.getCategoria().getTamanho());
            stmt.setString(9, produto.getCategoria().getEmbalagem());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao inserir produto " + e.getMessage());
        }
    }
    
    public void alterar(Produto produto) {
        String sql = "UPDATE produto SET Nome = ?, Preço Unitário = ?, Unidade = ?, Quantidade de Estoque = ?, Quantidade Mínima = ?, "
                + "Quantidade Máxima = ? Id = ?, Categoria = ? WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, se.getQuantidadeEstoque());
            stmt.setInt(5, se.getQuantidadeMinima());
            stmt.setInt(6, se.getQuantidadeMaxima());
            stmt.setString(7, produto.getCategoria().getNome());
            stmt.setString(8, produto.getCategoria().getTamanho());
            stmt.setString(9, produto.getCategoria().getEmbalagem());
            stmt.setInt(10, se.getId());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao alterar produto " + e.getMessage());
        }
    }
    
    public void apagar(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao remover produto " + e.getMessage());
        }
    }
}
