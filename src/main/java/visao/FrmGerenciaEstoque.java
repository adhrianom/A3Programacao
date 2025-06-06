package visao;

import javax.swing.JOptionPane;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class FrmGerenciaEstoque extends javax.swing.JFrame {
    private ProdutoDAO dao;

    public FrmGerenciaEstoque() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        dao = new ProdutoDAO();
        carregarProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JCOperacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JBAlterarQuantidade = new javax.swing.JButton();
        JBAplicarAumento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTFAumentoPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFReducaoPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFPesquisar = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        JBAplicarReducao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Estoque");

        JBFechar.setBackground(new java.awt.Color(204, 204, 204));
        JBFechar.setForeground(new java.awt.Color(51, 51, 51));
        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JTEstoque.setBackground(new java.awt.Color(204, 204, 204));
        JTEstoque.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTEstoque.setForeground(new java.awt.Color(51, 51, 51));
        JTEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Medida", "Preço", "Categoria", "Qntd. Mínima", "Qntd. Máxima"
            }
        ));
        JTEstoque.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTEstoque.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(JTEstoque);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Quantidade: ");

        JTFQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        JTFQuantidade.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFQuantidade.setForeground(new java.awt.Color(51, 51, 51));
        JTFQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Operação:");

        JCOperacao.setBackground(new java.awt.Color(204, 204, 204));
        JCOperacao.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JCOperacao.setForeground(new java.awt.Color(51, 51, 51));
        JCOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída" }));
        JCOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCOperacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Aumento Percentual:");

        JBAlterarQuantidade.setBackground(new java.awt.Color(204, 204, 204));
        JBAlterarQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAlterarQuantidade.setForeground(new java.awt.Color(51, 51, 51));
        JBAlterarQuantidade.setText("Alterar Quantidade");
        JBAlterarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarQuantidadeActionPerformed(evt);
            }
        });

        JBAplicarAumento.setBackground(new java.awt.Color(204, 204, 204));
        JBAplicarAumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAplicarAumento.setForeground(new java.awt.Color(51, 51, 51));
        JBAplicarAumento.setText("Aplicar Aumento de Preço");
        JBAplicarAumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAplicarAumentoActionPerformed(evt);
            }
        });

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerência de Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        JTFAumentoPreco.setBackground(new java.awt.Color(204, 204, 204));
        JTFAumentoPreco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFAumentoPreco.setForeground(new java.awt.Color(51, 51, 51));
        JTFAumentoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAumentoPrecoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Redução Percentual:");

        JTFReducaoPreco.setBackground(new java.awt.Color(204, 204, 204));
        JTFReducaoPreco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFReducaoPreco.setForeground(new java.awt.Color(51, 51, 51));
        JTFReducaoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFReducaoPrecoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Encontrar Produto:");

        JTFPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        JTFPesquisar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTFPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        JTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPesquisarActionPerformed(evt);
            }
        });

        JBPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        JBPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JBAplicarReducao.setBackground(new java.awt.Color(204, 204, 204));
        JBAplicarReducao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAplicarReducao.setForeground(new java.awt.Color(51, 51, 51));
        JBAplicarReducao.setText("Aplicar Redução de Preço");
        JBAplicarReducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAplicarReducaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFQuantidade))
                            .addComponent(JBAlterarQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTFAumentoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBAplicarAumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(JTFReducaoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBAplicarReducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JCOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFReducaoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFAumentoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAlterarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAplicarReducao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAplicarAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(JBFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBAplicarAumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAplicarAumentoActionPerformed
        int selectedRow = JTEstoque.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto.");
            return;
        }

        try {
            int idProduto = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 0).toString());
            double percentual = Double.parseDouble(JTFAumentoPreco.getText()) / 100.0;

            ProdutoDAO dao = new ProdutoDAO();
            dao.aplicarDesconto(idProduto, -percentual);
            JOptionPane.showMessageDialog(this, "Preço aumentado com sucesso.");
            carregarProdutos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao aplicar aumento: " + e.getMessage());
        }
        
        // Setando valores iniciais
        
        JTFAumentoPreco.setText("");
    }//GEN-LAST:event_JBAplicarAumentoActionPerformed

    private void JTFQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeActionPerformed

    private void JCOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCOperacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCOperacaoActionPerformed

    private void JTFAumentoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAumentoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAumentoPrecoActionPerformed

    private void JTFReducaoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFReducaoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFReducaoPrecoActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        // TODO add your handling code here:
        String texto = JTFPesquisar.getText().trim();
        if (texto.matches("\\d+")) {
            buscarPorId(Integer.parseInt(texto));
        } else {
            buscarPorNome(texto);
        }
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JBAplicarReducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAplicarReducaoActionPerformed
        int selectedRow = JTEstoque.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto.");
            return;
        }

        try {
            int idProduto = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 0).toString());
            double percentual = Double.parseDouble(JTFReducaoPreco.getText()) / 100.0;

            ProdutoDAO dao = new ProdutoDAO();
            dao.aplicarDesconto(idProduto, percentual);
            JOptionPane.showMessageDialog(this, "Desconto aplicado com sucesso.");
            carregarProdutos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao aplicar desconto: " + e.getMessage());
        }
        
        // Setando os valores iniciais
        
        JTFReducaoPreco.setText("");
    }//GEN-LAST:event_JBAplicarReducaoActionPerformed

    private void JBAlterarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarQuantidadeActionPerformed
        int selectedRow = JTEstoque.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto na tabela.");
            return;
        }

        try {
            int idProduto = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 0).toString());
            int quantidadeAtual = Integer.parseInt(JTEstoque.getValueAt(selectedRow, 2).toString());
            int quantidade = Integer.parseInt(JTFQuantidade.getText());
            String operacao = JCOperacao.getSelectedItem().toString();

            ProdutoDAO dao = new ProdutoDAO();

            int novaQuantidade = operacao.equals("Entrada")
                    ? quantidadeAtual + quantidade
                    : quantidadeAtual - quantidade;

            if (novaQuantidade < 0) {
                JOptionPane.showMessageDialog(this, "A quantidade final não pode ser negativa.");
                return;
            }

            dao.atualizarEstoque(idProduto, novaQuantidade);
            JOptionPane.showMessageDialog(this, "Estoque atualizado.");
            carregarProdutos();
            
            Produto produto = dao.buscarPorId(idProduto);
            if (produto.getQuantidadeEstoque() < produto.getQuantidadeMinima()) {
                JOptionPane.showMessageDialog(null,
                        "Estoque abaixo da quantidade mínima! \nQuantidade em estoque: " + produto.getQuantidadeEstoque()+ 
                                ". \nQuantidade mínima: " +produto.getQuantidadeMinima()+".",
                        "ATENÇÃO:",
                        JOptionPane.WARNING_MESSAGE);
            }

            if (produto.getQuantidadeEstoque() > produto.getQuantidadeMaxima()) {
                JOptionPane.showMessageDialog(null,
                        "Estoque acima da quantidade máxima! \nQuantidade em estoque: " +produto.getQuantidadeEstoque()+
                                ". \nQuantidade máxima: " +produto.getQuantidadeMaxima()+".",
                        "ATENÇÃO:",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
        
        
        // Setando os valores iniciais
        
        JTFQuantidade.setText("");
    }//GEN-LAST:event_JBAlterarQuantidadeActionPerformed

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        // TODO add your handling code here:
        JBPesquisar.doClick();
    }//GEN-LAST:event_JTFPesquisarActionPerformed
    private void carregarProdutos() {
        try {
            DefaultTableModel model = (DefaultTableModel) JTEstoque.getModel();
            model.setRowCount(0);

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

    private void buscarPorId(int idProduto) {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            Produto produto = dao.buscarPorId(idProduto);

            DefaultTableModel model = (DefaultTableModel) JTEstoque.getModel();
            model.setRowCount(0);

            if (produto != null) {
                model.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getQuantidadeEstoque(),
                    produto.getUnidade(),
                    produto.getPrecoUnitario(),
                    produto.getCategoria().getNome(),
                    produto.getQuantidadeMinima(),
                    produto.getQuantidadeMaxima()
                });
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar produto: " + e.getMessage());
        }
    }

    private void buscarPorNome(String nome) {
        try {
            ProdutoDAO dao = new ProdutoDAO();
            List<Produto> lista = dao.buscarPorNome(nome);
            DefaultTableModel model = (DefaultTableModel) JTEstoque.getModel();
            model.setRowCount(0);

            for (Produto produto : lista) {
                model.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getQuantidadeEstoque(),
                    produto.getUnidade(),
                    produto.getPrecoUnitario(),
                    produto.getCategoria().getNome(),
                    produto.getQuantidadeMinima(),
                    produto.getQuantidadeMaxima()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar produtos: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(FrmGerenciaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmGerenciaEstoque().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao abrir Form" + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterarQuantidade;
    private javax.swing.JButton JBAplicarAumento;
    private javax.swing.JButton JBAplicarReducao;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JComboBox<String> JCOperacao;
    private javax.swing.JTable JTEstoque;
    private javax.swing.JTextField JTFAumentoPreco;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFReducaoPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
