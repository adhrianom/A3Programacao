package modelo;

public class Categoria {
    private String nome; // Nome da categoria.
    private String tamanho; // Pequeno, Medio e Grande;
    private String embalagem; // Lata, Vidro e Plastico;
    private int idCategoria;

    public Categoria() {
    }

    public Categoria(String nome, String tamanho, String embalagem, int idCategoria) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
        this.idCategoria = idCategoria;
    }

    public Categoria(String nome, String tamanho, String embalagem) {
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
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
    public String toString(){
     return nome;
    }

    

   
    
    
    
            
    
}
