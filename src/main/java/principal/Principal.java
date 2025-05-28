package principal;
import modelo.Categoria;
import dao.ConnectionFactory;
import visao.FrmMenuPrincipal;
public class Principal {

    public static void main(String[] args) {
        
        try {
            ConnectionFactory a = new ConnectionFactory();
            a.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na conexão.");
        }
     // Instancia a interface gráfica;
    FrmMenuPrincipal objetotela = new FrmMenuPrincipal();
    // Torna a janela visível
    objetotela.setVisible(true);
    }
}
