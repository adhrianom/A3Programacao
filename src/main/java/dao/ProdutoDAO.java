package dao;

import java.sql.*;
import modelo.Produto;
import modelo.Categoria;
import modelo.GerenciamentoEstoque;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection conexao;
    
    GerenciamentoEstoque se = new GerenciamentoEstoque();


    public ProdutoDAO() throws SQLException {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, "
                + "quantidadeMaxima, categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setInt(5, produto.getQuantidadeMinima());
            stmt.setInt(6, produto.getQuantidadeMaxima());
            stmt.setString(7, produto.getCategoria().getNome());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao inserir produto " + e.getMessage());
        }
    }

    public void alterar(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, precoUnitario = ?, unidade = ?, quantidadeEstoque = ?, quantidadeMinima = ?, "
                + "quantidadeMaxima = ? idProduto = ?, categoria = ? WHERE idProduto = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setInt(5, produto.getQuantidadeMinima());
            stmt.setInt(6, produto.getQuantidadeMaxima());
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
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produto p = new Produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setPrecoUnitario(rs.getDouble("precoUnitario"));
                p.setUnidade(rs.getString("unidade"));
                p.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                p.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                p.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                Categoria c = new Categoria();
                c.setNome(rs.getString("categoria"));
                p.setCategoria(c);
                lista.add(p);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar os Produtos: " + e.getMessage());
        }

        return lista;
    }
}
