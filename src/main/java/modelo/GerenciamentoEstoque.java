package modelo;

public class GerenciamentoEstoque extends ItemEstoque {
    private int idProduto; // ID do produto
    private String operacao; // Entrada ou saida
    
// Mudança conforme solicitado
    public GerenciamentoEstoque() {
        this(0,"");
    }

    public GerenciamentoEstoque(int idProduto, String operacao) {
        this.idProduto = idProduto;
        this.operacao = operacao;
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
}
