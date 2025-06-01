package modelo;
import java.util.Date;

public class SistemaEstoque extends itemEstoque {
    private int idProduto;
    private String operacao; // Entrada ou saida
    private int quantidadeEstoque;
    private int quantidadeMinima;
    private int quantidadeMaxima;
    private Date data;
    

    public SistemaEstoque() {
    }

    public SistemaEstoque(int idProduto, String operacao, int quantidadeEstoque, int quantidadeMinima, int quantidadeMaxima, Date data) {
        this.idProduto = idProduto;
        this.operacao = operacao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.data = data;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setId(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    // Movimentação dos produtos
    
    public void entrada(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    
    public void saida(int quantidade){
        this.quantidadeEstoque -= quantidade;
    }
    
    
    // Verificação da quantidade de produtos
    
    public boolean abaixoDoMinima(){
        return quantidadeEstoque < quantidadeMinima;
    }
    
    public boolean acimaDoMaximo(){
        return quantidadeEstoque > quantidadeMaxima;
    }
    
    
    // Valor total do produto no Estoque
    
    public double valorTotalEmEstoque(){
        return super.getPrecoUnitario() * quantidadeEstoque;
    }

    
 
    
    
    
}
