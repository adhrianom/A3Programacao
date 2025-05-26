package modelo;
import modelo.Categoria;
import modelo.itemEstoque;
public class Produto extends itemEstoque{
    private String unidade; // Kg, Litros, etc.
    private int idProduto; // id para diferenciar produtos.
    private Categoria categoria; // Se referindo a classe Categoria.

    public Produto() {
    }

    // Construtor sem quantidadeEstoque, para ser iniciado com zero no estoque.

    public Produto(String unidade, Categoria categoria) {
        this.unidade = unidade;
        this.categoria = categoria;
    }

    public Produto(String unidade, int idProduto, Categoria categoria, String nome, double precoUnitario) {
        super(nome, precoUnitario);
        this.unidade = unidade;
        this.idProduto = idProduto;
        this.categoria = categoria;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    

    

     
}
