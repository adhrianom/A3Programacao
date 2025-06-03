package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Categoria;
import modelo.Tamanho;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    public void inserir(Categoria categoria) {
        String sql = "INSERT INTO categoria(nome, tamanho, embalagem) VALUES (?, ?, ?)";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho().name());
            stmt.setString(3, categoria.getEmbalagem());
            stmt.executeUpdate();

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
        String sql = "UPDATE categoria SET nome = ?, tamanho = ?, embalagem = ? WHERE idCategoria = ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho().name());
            stmt.setString(3, categoria.getEmbalagem());
            stmt.setInt(4, categoria.getIdCategoria());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao alterar categoria " + e.getMessage());
        }
    }

    public void apagar(int idCategoria) {
        String sql = "DELETE FROM categoria WHERE idCategoria = ?";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, idCategoria);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao remover categoria " + e.getMessage());
        }
    }

    public List<Categoria> listar() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM categoria";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conexao = factory.getConnection();
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setNome(rs.getString("nome"));
                categoria.setTamanho(Tamanho.valueOf(rs.getString("tamanho")));
                categoria.setEmbalagem(rs.getString("embalagem"));
                lista.add(categoria);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar categorias: " + e.getMessage());
        }

        return lista;
    }
}
