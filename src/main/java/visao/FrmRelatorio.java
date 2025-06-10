package visao;

import dao.ProdutoDAO;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class FrmRelatorio extends javax.swing.JFrame {
    
    public FrmRelatorio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBFechar = new javax.swing.JButton();
        JBLista = new javax.swing.JButton();
        JBFalta = new javax.swing.JButton();
        JBBalanco = new javax.swing.JButton();
        JBExcesso = new javax.swing.JButton();
        JBCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTRelatorio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório");

        JBFechar.setBackground(new java.awt.Color(204, 204, 204));
        JBFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBFechar.setForeground(new java.awt.Color(51, 51, 51));
        JBFechar.setText("Fechar");
        JBFechar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JBLista.setBackground(new java.awt.Color(204, 204, 204));
        JBLista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBLista.setForeground(new java.awt.Color(51, 51, 51));
        JBLista.setText("Lista de preços");
        JBLista.setToolTipText("");
        JBLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListaActionPerformed(evt);
            }
        });

        JBFalta.setBackground(new java.awt.Color(204, 204, 204));
        JBFalta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBFalta.setForeground(new java.awt.Color(51, 51, 51));
        JBFalta.setText("Falta de produtos");
        JBFalta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFaltaActionPerformed(evt);
            }
        });

        JBBalanco.setBackground(new java.awt.Color(204, 204, 204));
        JBBalanco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBBalanco.setForeground(new java.awt.Color(51, 51, 51));
        JBBalanco.setText("Balanço físico");
        JBBalanco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBBalanco.setMaximumSize(new java.awt.Dimension(97, 24));
        JBBalanco.setMinimumSize(new java.awt.Dimension(97, 24));
        JBBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBalancoActionPerformed(evt);
            }
        });

        JBExcesso.setBackground(new java.awt.Color(204, 204, 204));
        JBExcesso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBExcesso.setForeground(new java.awt.Color(51, 51, 51));
        JBExcesso.setText("Excesso de produtos");
        JBExcesso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBExcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcessoActionPerformed(evt);
            }
        });

        JBCategoria.setBackground(new java.awt.Color(204, 204, 204));
        JBCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBCategoria.setForeground(new java.awt.Color(51, 51, 51));
        JBCategoria.setText("Produtos por categoria");
        JBCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCategoriaActionPerformed(evt);
            }
        });

        JTRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        JTRelatorio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTRelatorio.setForeground(new java.awt.Color(51, 51, 51));
        JTRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTRelatorio.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTRelatorio.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(JTRelatorio);

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatórios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JBFalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBExcesso, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(JBBalanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBLista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(JBBalanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(JBFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(JBExcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListaActionPerformed
        gerarListaPrecos();
    }//GEN-LAST:event_JBListaActionPerformed

    private void JBBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBalancoActionPerformed
        gerarBalanco();
    }//GEN-LAST:event_JBBalancoActionPerformed

    private void JBExcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcessoActionPerformed
        gerarExcessoProdutos();
    }//GEN-LAST:event_JBExcessoActionPerformed

    private void JBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCategoriaActionPerformed
        gerarPorCategoria();
    }//GEN-LAST:event_JBCategoriaActionPerformed

    private void JBFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFaltaActionPerformed
        gerarFaltaProdutos();
    }//GEN-LAST:event_JBFaltaActionPerformed
    private void gerarListaPrecos() {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            List<Produto> lista = dao.listarPrecos();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Preço Unitário", "Unidade", "Categoria"}, 0
            );

            for (Produto produto : lista) {
                model.addRow(new Object[]{
                    produto.getNome(),
                    produto.getPrecoUnitario(),
                    produto.getUnidade(),
                    produto.getCategoria().getNome()
                });
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }

    private void gerarBalanco() {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            List<Produto> listaBalanco = dao.listarBalanco();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Preço Unitário", "Quantidade", "Total"}, 0
            );

            double totalGeral = 0;

            for (Produto produto : listaBalanco) {
                double total = produto.getPrecoUnitario() * produto.getQuantidadeEstoque();
                totalGeral += total;

                model.addRow(new Object[]{
                    produto.getNome(),
                    produto.getPrecoUnitario(),
                    produto.getQuantidadeEstoque(),
                    String.format(Locale.US,"%.2f", total)
                });
            }

            JTRelatorio.setModel(model);
            JOptionPane.showMessageDialog(this, "Total em estoque: R$ " + String.format(Locale.US,"%.2f", totalGeral));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar o relatório: " + e.getMessage());
        }
    }

    private void gerarFaltaProdutos() {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            List<Produto> listaFalta = dao.listarFaltaProduto();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Quantidade Mínima", "Quantidade no Estoque"}, 0
            );

            for (Produto produto : listaFalta) {
                model.addRow(new Object[]{
                    produto.getNome(),
                    produto.getQuantidadeMinima(),
                    produto.getQuantidadeEstoque()
                });
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar o relatório: " + e.getMessage());
        }
    }

    private void gerarExcessoProdutos() {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            List<Produto> listaExcesso = dao.listarExcessoProdutos();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Quantidade Máxima", "Quantidade no Estoque"}, 0
            );

            for (Produto produto : listaExcesso) {
                model.addRow(new Object[]{
                    produto.getNome(),
                    produto.getQuantidadeMaxima(),
                    produto.getQuantidadeEstoque()
                });
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar o relatório: " + e.getMessage());
        }
    }

    private void gerarPorCategoria() {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            List<String[]> listaCategoria = dao.listarPorCategoria();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Categoria", "Total de Produtos"}, 0
            );

            for (String[] linha : listaCategoria) {
                model.addRow(linha);
            }

            JTRelatorio.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar o relatório: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBalanco;
    private javax.swing.JButton JBCategoria;
    private javax.swing.JButton JBExcesso;
    private javax.swing.JButton JBFalta;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBLista;
    private javax.swing.JTable JTRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
