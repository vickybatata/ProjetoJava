package Contas;

import Contas.Contas;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class FormContas extends javax.swing.JFrame {

        ContasControle cctrl = new ContasControle();

    public FormContas() {
        initComponents();
        lbCod.setEnabled(false);
        jTextFCod.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbDescricao = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        lbDataVenc = new javax.swing.JLabel();
        lbDataPag = new javax.swing.JLabel();
        lbFornecedor = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbStatusPag = new javax.swing.JLabel();
        lbMetodoPag = new javax.swing.JLabel();
        lbObservacoes = new javax.swing.JLabel();
        jTextFDescricao = new javax.swing.JTextField();
        jTextFValor = new javax.swing.JTextField();
        jTextFDataVenc = new javax.swing.JTextField();
        jTextFDataPag = new javax.swing.JTextField();
        jTextFFornecedor = new javax.swing.JTextField();
        jTextFCategoria = new javax.swing.JTextField();
        jTextFStatusPag = new javax.swing.JTextField();
        jTextFMetodoPag = new javax.swing.JTextField();
        jTextFObservacoes = new javax.swing.JTextField();
        jButtonMostrar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        lbCod = new javax.swing.JLabel();
        jTextFCod = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiDados = new javax.swing.JMenu();
        jMenuDados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDescricao.setText("Descrição da conta:");

        lbValor.setText("Valor:");

        lbDataVenc.setText("Data de Vencimento:");

        lbDataPag.setText("Data de Pagamento:");

        lbFornecedor.setText("Fornecedor:");

        lbCategoria.setText("Categoria:");

        lbStatusPag.setText("Status de Pagamento (Pago/Pendente) :");

        lbMetodoPag.setText("Método de Pagamento:");

        lbObservacoes.setText("Observações:");

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        lbCod.setText("Codigo:");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButtonMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGravar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbObservacoes)
                            .addComponent(lbMetodoPag)
                            .addComponent(lbStatusPag)
                            .addComponent(lbCategoria)
                            .addComponent(lbFornecedor)
                            .addComponent(lbDataPag)
                            .addComponent(lbDataVenc)
                            .addComponent(lbValor)
                            .addComponent(lbDescricao)
                            .addComponent(lbCod))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jTextFValor)
                            .addComponent(jTextFDataVenc)
                            .addComponent(jTextFDataPag)
                            .addComponent(jTextFFornecedor)
                            .addComponent(jTextFCategoria)
                            .addComponent(jTextFStatusPag)
                            .addComponent(jTextFMetodoPag)
                            .addComponent(jTextFObservacoes)
                            .addComponent(jTextFCod))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonFechar)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCod)
                    .addComponent(jTextFCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(jTextFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(jTextFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataVenc)
                    .addComponent(jTextFDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataPag)
                    .addComponent(jTextFDataPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFornecedor)
                    .addComponent(jTextFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(jTextFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusPag)
                    .addComponent(jTextFStatusPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMetodoPag)
                    .addComponent(jTextFMetodoPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbObservacoes)
                    .addComponent(jTextFObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonFechar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addGap(37, 37, 37))
        );

        jmiDados.setText("File");

        jMenuDados.setText("Dados");
        jMenuDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDadosActionPerformed(evt);
            }
        });
        jmiDados.add(jMenuDados);

        jMenuBar1.add(jmiDados);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        Contas c = this.MontarConta();
        JOptionPane.showMessageDialog(null, c.getDescricao()+"\n "+c.getValor()+"\n "+
                c.getDtVenc()+"\n "+c.getDtPag()+"\n "+c.getFornecedor()+"\n "+
                c.getCategoria()+"\n "+c.getStatusPag()+"\n "+c.getMetPag()+"\n "+
                c.getObservacoes());
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Contas c = this.MontarConta();
        if (c != null && !jTextFCod.getText().trim().isEmpty()) {
            c.setCod(Integer.parseInt(jTextFCod.getText()));
            ContasControle ccntl = new ContasControle();
            ccntl.update(c);
        }else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos +"
                    + "corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
      
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Contas c = this.MontarConta();
        if (c != null) {
         cctrl.insert(c);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos +"
                    + " corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void jMenuDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDadosActionPerformed
        ContasControle cc = new ContasControle();
        cc.selectALL();
    }//GEN-LAST:event_jMenuDadosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(!jTextFCod.getText().trim().isEmpty()){
         int cod = Integer.parseInt(jTextFCod.getText());
         ContasControle ccntl = new ContasControle();
        
        }else{
            JOptionPane.showMessageDialog(null,"Informe novamente...");
         } 
                                 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormContas().setVisible(true);
            }
        });
    }

    public Contas MontarConta(){
        Contas c = new Contas();
        c.setDescricao(jTextFDescricao.getText());
        c.setValor(jTextFValor.getText());
        c.setDtVenc(jTextFDataVenc.getText());
        c.setDtPag(jTextFDataPag.getText());
        c.setFornecedor(jTextFFornecedor.getText());
        c.setCategoria(jTextFCategoria.getText());
        c.setStatusPag(jTextFStatusPag.getText());
        c.setMetPag(jTextFMetodoPag.getText());
        c.setObservacoes(jTextFObservacoes.getText());
        return c;
    }
    
    public void Limpar(){
        jTextFCod.setText("");
        jTextFDescricao.setText("");
        jTextFValor.setText("");
        jTextFDataVenc.setText("");
        jTextFDataPag.setText("");
        jTextFFornecedor.setText("");
        jTextFCategoria.setText("");
        jTextFStatusPag.setText("");
        jTextFMetodoPag.setText("");
        jTextFObservacoes.setText("");
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFCategoria;
    private javax.swing.JTextField jTextFCod;
    private javax.swing.JTextField jTextFDataPag;
    private javax.swing.JTextField jTextFDataVenc;
    private javax.swing.JTextField jTextFDescricao;
    private javax.swing.JTextField jTextFFornecedor;
    private javax.swing.JTextField jTextFMetodoPag;
    private javax.swing.JTextField jTextFObservacoes;
    private javax.swing.JTextField jTextFStatusPag;
    private javax.swing.JTextField jTextFValor;
    private javax.swing.JMenu jmiDados;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbDataPag;
    private javax.swing.JLabel lbDataVenc;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbMetodoPag;
    private javax.swing.JLabel lbObservacoes;
    private javax.swing.JLabel lbStatusPag;
    private javax.swing.JLabel lbValor;
    // End of variables declaration//GEN-END:variables
}
