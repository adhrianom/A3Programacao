package dao;

import java.sql.*;
import modelo.Categoria;
import modelo.Tamanho;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Connection con;

    public CategoriaDAO() throws SQLException {
        this.con = ConnectionFactory.getConnection();
    }

    public void inserir(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO categoria(nome, tamanho, embalagem) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho().name());
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
            System.err.println("Erro ao inserir categoria: " + e.getMessage());
        }
    }

    public void alterar(Categoria categoria) {
        String sql = "UPDATE categoria SET nome = ?, tamanho = ?, embalagem = ? WHERE idCategoria = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getTamanho().name());
            stmt.setString(3, categoria.getEmbalagem());
            stmt.setInt(4, categoria.getIdCategoria());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao alterar categoria: " + e.getMessage());
        }
    }

    public void apagar(int idCategoria) {
        String sql = "DELETE FROM categoria WHERE idCategoria = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, idCategoria);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao remover categoria: " + e.getMessage());
        }
    }
    public List<Categoria> listar() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM categoria";
        
        try (PreparedStatement stmt = con.prepareStatement(sql);
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
