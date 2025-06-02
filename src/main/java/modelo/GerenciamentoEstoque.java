package modelo;
import java.util.Date;

public class GerenciamentoEstoque extends itemEstoque {
    private int idProduto;
    private String operacao; // Entrada ou saida
    private Date data;
    
// Mudança conforme solicitado
    public GerenciamentoEstoque() {
    }

    public GerenciamentoEstoque(int idProduto, String operacao, Date data) {
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
