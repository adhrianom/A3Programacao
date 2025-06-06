package modelo;

public abstract class ItemEstoque {
    
    // Classe superior, contendo somente preço e nome.
    
    private String nome; // Nome do produto
    private double precoUnitario;

    public ItemEstoque() {
        this("",0.0);
    }

    public ItemEstoque(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}