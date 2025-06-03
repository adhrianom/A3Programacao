package modelo;

public class Categoria {

    private String nome; // Nome da categoria.
    private Tamanho tamanho; // Pequeno, Medio e Grande;
    private String embalagem; // Lata, Vidro e Plastico;
    private int idCategoria; // ID da categoria

    public Categoria() {
        this("",Tamanho.Pequeno,"",0);
    }

    public Categoria(String nome, Tamanho tamanho, String embalagem, int idCategoria) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
        this.idCategoria = idCategoria;
    }

    public Categoria(String nome, Tamanho tamanho, String embalagem) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
