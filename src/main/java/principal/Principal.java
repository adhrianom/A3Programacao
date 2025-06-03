package principal;

import dao.ConnectionFactory;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import visao.FrmMenuPrincipal;

public class Principal {

    public static void main(String[] args) {

        try {
            ConnectionFactory a = new ConnectionFactory();
            a.getConnection();
            System.out.println("Conectado com sucesso!");
            // Instancia a interface gráfica.
            FrmMenuPrincipal objetotela = new FrmMenuPrincipal();
            // Torna a janela visível.
            objetotela.setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conexão.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}