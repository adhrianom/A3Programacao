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

    public ProdutoDAO() throws SQLException {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (Nome, PrecoUnitario, Unidade, QuantidadeEstoque, QuantidadeMinima, "
                + "QuantidadeMaxima, Categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, se.getQuantidadeEstoque());
            stmt.setInt(5, se.getQuantidadeMinima());
            stmt.setInt(6, se.getQuantidadeMaxima());
            stmt.setString(7, produto.getCategoria().getNome());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao inserir produto " + e.getMessage());
        }
    }

    public void alterar(Produto produto) {
        String sql = "UPDATE produto SET Nome = ?, Preço Unitário = ?, Unidade = ?, Quantidade de Estoque = ?, Quantidade Mínima = ?, "
                + "Quantidade Máxima = ? IdProduto = ?, Categoria = ? WHERE idProduto = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, se.getQuantidadeEstoque());
            stmt.setInt(5, se.getQuantidadeMinima());
            stmt.setInt(6, se.getQuantidadeMaxima());
            stmt.setString(7, produto.getCategoria().getNome());
            stmt.setString(8, produto.getCategoria().getTamanho().name());
            stmt.setString(9, produto.getCategoria().getEmbalagem());
            stmt.setInt(10, se.getIdProduto());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao alterar produto " + e.getMessage());
        }
    }

    public void apagar(int idProduto) {
        String sql = "DELETE FROM produto WHERE idProduto = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, idProduto);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao remover produto " + e.getMessage());
        }
    }
}
