
package clientecomthread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {
    public static Socket conexaoSocket;
    public static ObjectOutputStream Saida;
    public static ObjectInputStream Entrada;
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBPessoas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBProduto = new javax.swing.JButton();
        jBProdutor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBEdiProdutores = new javax.swing.JButton();
        jBEdiProdutos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBPessoas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBPessoas.setText("Cadastro Administradores");
        jBPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPessoasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Deseja:");

        jBProduto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBProduto.setText("Cadastro Produto");
        jBProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProdutoActionPerformed(evt);
            }
        });

        jBProdutor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBProdutor.setText("Cadastro Produtor");
        jBProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProdutorActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Editar Administradores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBEdiProdutores.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBEdiProdutores.setText("Editar Produtores");
        jBEdiProdutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEdiProdutoresActionPerformed(evt);
            }
        });

        jBEdiProdutos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBEdiProdutos.setText("Editar Produtos");
        jBEdiProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEdiProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEdiProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEdiProdutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBProdutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jBPessoas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEdiProdutores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEdiProdutos)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPessoasActionPerformed
        Cad_Administradores a = new Cad_Administradores();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBPessoasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            this.conexaoSocket = new Socket("127.0.0.1",12345);
            this.Saida = new ObjectOutputStream(conexaoSocket.getOutputStream());
            this.Entrada = new ObjectInputStream(conexaoSocket.getInputStream());
        } catch (IOException ex) {
        System.out.println( "Deu erro na conexao ao servidor."+ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jBProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProdutoActionPerformed
        // TODO add your handling code here:
        Cad_Produtos p = new Cad_Produtos();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBProdutoActionPerformed

    private void jBProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProdutorActionPerformed
        // TODO add your handling code here:
        Cad_Produtores pr = new Cad_Produtores ();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBProdutorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Edi_Administradores adm = new Edi_Administradores();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBEdiProdutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEdiProdutoresActionPerformed
        Edi_Produtores pro = new Edi_Produtores();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBEdiProdutoresActionPerformed

    private void jBEdiProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEdiProdutosActionPerformed
        Edi_Produtos prod = new Edi_Produtos();
        prod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBEdiProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEdiProdutores;
    private javax.swing.JButton jBEdiProdutos;
    private javax.swing.JButton jBPessoas;
    private javax.swing.JButton jBProduto;
    private javax.swing.JButton jBProdutor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}