package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Produto;
import modelo.Categoria;
import modelo.GerenciamentoEstoque;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    GerenciamentoEstoque se = new GerenciamentoEstoque();

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, "
                + "quantidadeMaxima, categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

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

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

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

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, idProduto);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao remover produto " + e.getMessage());
        }
    }

    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                produto.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                produto.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                Categoria categoria = new Categoria();
                categoria.setNome(rs.getString("categoria"));
                produto.setCategoria(categoria);
                lista.add(produto);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar os Produtos: " + e.getMessage());
        }

        return lista;
    }
    
    public List<Produto> listarPrecos() throws SQLException{
        List<Produto> listarPrecos = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Produto produto = new Produto();
             
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
                produto.setUnidade(rs.getString("unidade"));
                Categoria categoria = new Categoria();
                categoria.setNome(rs.getString("categoria"));
                produto.setCategoria(categoria);
                listarPrecos.add(produto);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar os preços: " + e.getMessage());
        }
        return listarPrecos;
    }   
 
    public List<Produto> listarBalanco() {
    List<Produto> listaBalanco = new ArrayList<>();
    String sql = "SELECT * FROM produto";

     ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Produto produto = new Produto();
            produto.setNome(rs.getString("nome"));
            produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
            produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
            listaBalanco.add(produto);
        }

    } catch (SQLException e) {
        System.err.println("Erro ao listar balanço dos produtos: " + e.getMessage());
    }

    return listaBalanco;
}

    public Produto buscarPorId(int idProduto) {
        String sql = "SELECT * FROM produto WHERE idProduto = ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, idProduto);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                produto.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                produto.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                Categoria categoria = new Categoria();
                categoria.setNome(rs.getString("categoria"));
                produto.setCategoria(categoria);
                return produto;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar produto por ID: " + e.getMessage());
        }
        return null;
    }

    public List<Produto> buscarPorNome(String nome) {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto WHERE nome LIKE ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                produto.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                produto.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                Categoria categoria = new Categoria();
                categoria.setNome(rs.getString("categoria"));
                produto.setCategoria(categoria);
                lista.add(produto);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar produtos por nome: " + e.getMessage());
        }

        return lista;
    }

    public void atualizarEstoque(int idProduto, int novaQuantidade) {
        String sql = "UPDATE produto SET quantidadeEstoque = ? WHERE idProduto = ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, novaQuantidade);
            stmt.setInt(2, idProduto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar estoque: " + e.getMessage());
        }
    }

    public void aplicarDesconto(int idProduto, double percentual) {
        String sql = "UPDATE produto SET precoUnitario = precoUnitario * ? WHERE idProduto = ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection(); PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setDouble(1, 1 - percentual);
            stmt.setInt(2, idProduto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao aplicar desconto: " + e.getMessage());
        }
    }
}
