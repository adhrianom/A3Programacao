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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
