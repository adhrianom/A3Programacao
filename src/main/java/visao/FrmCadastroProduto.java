package visao;

import java.sql.SQLException;
import modelo.Produto;
import javax.swing.table.DefaultTableModel;
import dao.ProdutoDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Tamanho;

public class FrmCadastroProduto extends javax.swing.JFrame {

    private Produto produto;
    private ProdutoDAO dao;
    private JComboBox<Categoria> JCCategoria;

    public FrmCadastroProduto() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.produto = new Produto();
        dao = new ProdutoDAO();
        carregarProdutos();
        JCCategoria = new JComboBox<>();
        JCCategoria.setBounds(600, 57, 150, 20); // ajuste as coordenadas
        JCCategoria.setBackground(new Color(209, 209, 209));      // fundo escuro
        JCCategoria.setForeground(Color.BLACK);   // texto claro
        JCCategoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12)); // mesma fonte usada no JCMedida
        getContentPane().add(JCCategoria);
        carregarCategoria();
        this.produto = new Produto();
        this.dao = new ProdutoDAO();
    }

    private void carregarCategoria() {
        try {
            // Conexão direta com o banco
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/controleestoquea3", "a3prog", "unisul@prog3"
            );

            String sql = "SELECT * FROM categoria";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setNome(rs.getString("nome"));
                cat.setTamanho(Tamanho.valueOf(rs.getString("tamanho")));
                cat.setEmbalagem(rs.getString("embalagem"));
                JCCategoria.addItem(cat);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar categorias: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JTFPreco = new javax.swing.JTextField();
        JTFQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTProduto = new javax.swing.JTable();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JTFQuantidadeMinima = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTFQuantidadeMaxima = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JCMedida = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");

        JBFechar.setBackground(new java.awt.Color(204, 204, 204));
        JBFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBFechar.setForeground(new java.awt.Color(51, 51, 51));
        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Quantidade:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Categoria:");

        JTFNome.setBackground(new java.awt.Color(204, 204, 204));
        JTFNome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFNome.setForeground(new java.awt.Color(0, 0, 0));
        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        JTFPreco.setBackground(new java.awt.Color(204, 204, 204));
        JTFPreco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFPreco.setForeground(new java.awt.Color(0, 0, 0));

        JTFQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidade.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        JTProduto.setBackground(new java.awt.Color(204, 204, 204));
        JTProduto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTProduto.setForeground(new java.awt.Color(51, 51, 51));
        JTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Medida", "Preço", "Categoria", "Qntd. Mínima", "Qntd. Máxima"
            }
        ));
        JTProduto.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTProduto.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(JTProduto);

        JBAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        JBAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAdicionar.setForeground(new java.awt.Color(51, 51, 51));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBRemover.setBackground(new java.awt.Color(204, 204, 204));
        JBRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBRemover.setForeground(new java.awt.Color(51, 51, 51));
        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Quantidade Minima:");

        JTFQuantidadeMinima.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidadeMinima.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeMinimaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Quantidade Máxima:");

        JTFQuantidadeMaxima.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidadeMaxima.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFQuantidadeMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeMaximaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Medida:");

        JCMedida.setBackground(new java.awt.Color(204, 204, 204));
        JCMedida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JCMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidade", "Kilogramas", "Gramas", "Litros", "Mililitros" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(JTFQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(JTFQuantidadeMaxima)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JTFQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(208, 208, 208)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(JTFQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JTFQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JCMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBFechar)
                    .addComponent(JBRemover)
                    .addComponent(JBAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        // TODO add your handling code here:
        int selectedRow = JTProduto.getSelectedRow();

        // Caso o usuário não escolha uma linha para deletar.
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um linha para apagar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) JTProduto.getModel();
        int idProduto = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

        dao.apagar(idProduto);

        // Removendo a linha
        model.removeRow(selectedRow);

        JOptionPane.showMessageDialog(null, "Produto apagado.");
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTFQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeMinimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeMinimaActionPerformed

    private void JTFQuantidadeMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeMaximaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeMaximaActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        // TODO add your handling code here:
        try {
            String nome = JTFNome.getText();
            String unidade = JCMedida.getSelectedItem().toString();
            Categoria categoria = (Categoria) JCCategoria.getSelectedItem();

            Produto produto = new Produto();
            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("O nome do produto deve conter no minimo 2 caractéres.");
            } else {
                produto.setNome(nome);
            }

            if (JTFQuantidade.getText().trim().isEmpty()) {
                throw new Mensagem("Deve conter no minimo 1 produto.");
            } else {
                int quantidadeEstoque = Integer.parseInt(JTFQuantidade.getText().trim());
                produto.setQuantidadeEstoque(quantidadeEstoque);
            }

            if (JTFQuantidadeMinima.getText().trim().isEmpty()) {
                throw new Mensagem("A quantidade minima deve ser acima de 0.");
            } else {
                int quantidadeMinima = Integer.parseInt(JTFQuantidadeMinima.getText().trim());
                produto.setQuantidadeMinima(quantidadeMinima);
            }
            if (JTFQuantidadeMaxima.getText().trim().isEmpty()) {
                throw new Mensagem("A quantidade máxima deve ser acima de 0.");
            } else {
                int quantidadeMaxima = Integer.parseInt(JTFQuantidadeMaxima.getText().trim());
                produto.setQuantidadeMaxima(quantidadeMaxima);
            }
            if (JTFPreco.getText().trim().isEmpty()) {
                throw new Mensagem("O preço deve ser acima de R$ 0.");
            } else {
                double preco = Double.parseDouble(JTFPreco.getText().trim());
                produto.setPrecoUnitario(preco);
            }

            produto.setUnidade(unidade);
            produto.setCategoria(categoria);

            dao.inserir(produto);
            carregarProdutos();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            JTFNome.setText("");
            JTFPreco.setText("");
            JTFQuantidade.setText("");
            JTFQuantidadeMinima.setText("");
            JTFQuantidadeMaxima.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() != null ? e.getMessage() : toString(), "Erro ao adicionar produto.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed
    private void carregarProdutos() {
        try {
            DefaultTableModel model = (DefaultTableModel) JTProduto.getModel();
            model.setRowCount(0); // Limpa a tabela antes de recarregar os dados

            for (Produto p : dao.listar()) {
                model.addRow(new Object[]{
                    p.getIdProduto(),
                    p.getNome(),
                    p.getQuantidadeEstoque(),
                    p.getUnidade(),
                    p.getPrecoUnitario(),
                    p.getCategoria(),
                    p.getQuantidadeMinima(),
                    p.getQuantidadeMaxima()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar categorias: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmCadastroProduto().setVisible(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao abrir Form" + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JComboBox<String> JCMedida;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFQuantidadeMaxima;
    private javax.swing.JTextField JTFQuantidadeMinima;
    private javax.swing.JTable JTProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
