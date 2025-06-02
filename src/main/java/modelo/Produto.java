package modelo;

import modelo.Categoria;
import modelo.itemEstoque;

public class Produto extends itemEstoque {

    private String unidade; // Kg, Litros, etc.
    private int idProduto; // id para diferenciar produtos.
    private Categoria categoria; // Se referindo a classe Categoria.
    private int quantidadeEstoque;
    private int quantidadeMinima;
    private int quantidadeMaxima;

    public Produto() {
    }

    // Construtor sem quantidadeEstoque, para ser iniciado com zero no estoque.
    public Produto(String unidade, Categoria categoria) {
        this.unidade = unidade;
        this.categoria = categoria;
    }

    public Produto(String unidade, Categoria categoria, String nome, double precoUnitario) {
        super(nome, precoUnitario);
        this.unidade = unidade;
        this.categoria = categoria;
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
