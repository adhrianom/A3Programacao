package visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import dao.CategoriaDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;
import modelo.Tamanho;

public class FrmCadastroCategoria extends javax.swing.JFrame {
    
    public FrmCadastroCategoria() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.categoria = new Categoria();
        carregarCategorias();
    }

    Categoria categoria = new Categoria();
    CategoriaDAO dao = new CategoriaDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JTFEmbalagem = new javax.swing.JTextField();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTCategoria = new javax.swing.JTable();
        JCTamanho = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Categoria");

        JBFechar.setBackground(new java.awt.Color(204, 204, 204));
        JBFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBFechar.setForeground(new java.awt.Color(51, 51, 51));
        JBFechar.setText("Fechar");
        JBFechar.setToolTipText("");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText(" ");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tamanho:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Embalagem:");

        JTFNome.setBackground(new java.awt.Color(204, 204, 204));
        JTFNome.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        JTFNome.setForeground(new java.awt.Color(51, 51, 51));
        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        JTFEmbalagem.setBackground(new java.awt.Color(204, 204, 204));
        JTFEmbalagem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        JTFEmbalagem.setForeground(new java.awt.Color(51, 51, 51));
        JTFEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEmbalagemActionPerformed(evt);
            }
        });

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

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        JTCategoria.setAutoCreateRowSorter(true);
        JTCategoria.setBackground(new java.awt.Color(204, 204, 204));
        JTCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JTCategoria.setForeground(new java.awt.Color(51, 51, 51));
        JTCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tamanho", "Embalagem"
            }
        ));
        JTCategoria.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTCategoria.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(JTCategoria);

        JCTamanho.setBackground(new java.awt.Color(204, 204, 204));
        JCTamanho.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        JCTamanho.setForeground(new java.awt.Color(51, 51, 51));
        JCTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande" }));
        JCTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCTamanhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFEmbalagem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCTamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JBFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                            .addComponent(JBRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JCTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCTamanhoActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed

    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        try {
            String nome = "";
            String embalagem = "";
            Tamanho tamanho = null;

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("O nome da categoria deve conter mais de 2 caractéres.");
            } else {
                nome = JTFNome.getText();
            }
            if (this.JTFEmbalagem.getText().length() < 2) {
                throw new Mensagem("A embalagem deve conter mais de 2 caractéres.");
            } else {
                embalagem = JTFEmbalagem.getText();
            }

            Object selected = JCTamanho.getSelectedItem();
            if (selected == null) {
                throw new Mensagem("Selecione um tamanho.");
            } else {
                tamanho = Tamanho.valueOf(selected.toString());
            }

            categoria = new Categoria(nome, tamanho, embalagem);
            try {
                dao.inserir(categoria);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao adicionar categoria." + e.getMessage());
            }
            int id = categoria.getIdCategoria();

            // Adicionando as informações na table
            DefaultTableModel model = (DefaultTableModel) JTCategoria.getModel();
            model.addRow(new Object[]{id, nome, tamanho, embalagem});

            // Setando os valores iniciais.
            JTFNome.setText("");
            JTFEmbalagem.setText("");
            JCTamanho.setSelectedItem(0);

            JOptionPane.showMessageDialog(null, "Categoria adicionada!");

        } catch (Mensagem e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        // Selecionando as rows(linhas) da JTable;

        int selectedRow = JTCategoria.getSelectedRow();

        // Caso o usuário não escolha uma linha para deletar.
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um linha para apagar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) JTCategoria.getModel();
        int idCategoria = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

        dao.apagar(idCategoria);

        // Removendo a linha
        model.removeRow(selectedRow);

        JOptionPane.showMessageDialog(null, "Categoria apagada.");
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void JTFEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEmbalagemActionPerformed
        // TODO add your handling code here:
        
        JBAdicionar.doClick();
        
    }//GEN-LAST:event_JTFEmbalagemActionPerformed
    private void carregarCategorias() {
        try {
            DefaultTableModel model = (DefaultTableModel) JTCategoria.getModel();
            model.setRowCount(0); // Limpa a tabela antes de recarregar os dados

            for (Categoria cat : dao.listar()) {
                model.addRow(new Object[]{
                    cat.getIdCategoria(),
                    cat.getNome(),
                    cat.getTamanho(),
                    cat.getEmbalagem()
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
            java.util.logging.Logger.getLogger(FrmCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmCadastroCategoria().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrmCadastroCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JComboBox<String> JCTamanho;
    private javax.swing.JTable JTCategoria;
    private javax.swing.JTextField JTFEmbalagem;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
