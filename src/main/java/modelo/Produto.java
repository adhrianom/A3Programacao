package modelo;

public class Produto extends ItemEstoque {

    private String unidade; // Kg, Litros, etc...
    private int idProduto; // id para diferenciar produtos.
    private Categoria categoria; // Se referindo a classe Categoria.
    private int quantidadeEstoque; 
    private int quantidadeMinima;
    private int quantidadeMaxima;

    public Produto() {
        this("",0.0,"",new Categoria(),0,0,0);
    }

    // Construtor sem quantidadeEstoque, para ser iniciado com zero no estoque.
    public Produto(String unidade, Categoria categoria) {
        this.unidade = unidade;
        this.categoria = categoria;
    }

    public Produto(String nome, double precoUnitario, String unidade, Categoria categoria, int quantidadeEstoque,
             int quantidadeMinima, int quantidadeMaxima) {
        super(nome, precoUnitario);
        this.unidade = unidade;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
}
