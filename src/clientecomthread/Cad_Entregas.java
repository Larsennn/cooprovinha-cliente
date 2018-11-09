/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientecomthread;

import Pacotao.Entregas;
import Pacotao.Produto;
import Pacotao.Programa;
import static clientecomthread.Principal.Entrada;
import static clientecomthread.Principal.Saida;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Cad_Entregas extends javax.swing.JFrame {

    /**
     * Creates new form Cad_Entrega2
     */
    public Cad_Entregas() {
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFEntregas_Total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFEntregas_Local = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEntregas_Produtos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEntregas_Programas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTFEntregas_Programas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFEntregas_Produto = new javax.swing.JTextField();
        jTFEntregas_ValorProduto = new javax.swing.JTextField();
        jBEntregas_Salvar = new javax.swing.JButton();
        jTFEntregas_QtProduto = new javax.swing.JTextField();
        jBEntregas_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Produtos:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Local de entrega:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Programas");

        jTableEntregas_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome:", "Tipo:", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEntregas_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEntregas_ProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEntregas_Produtos);

        jTableEntregas_Programas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome:", "Sigla:", "Orgão:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEntregas_Programas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEntregas_ProgramasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEntregas_Programas);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Programa:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ENTREGAS");

        jBVoltar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Produto:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Valor do Produto:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade de Produto:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Valor total:");

        jBEntregas_Salvar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jBEntregas_Salvar.setText("Salvar");
        jBEntregas_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntregas_SalvarActionPerformed(evt);
            }
        });

        jBEntregas_Cancelar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jBEntregas_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVoltar)
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(410, 410, 410)
                .addComponent(jLabel9)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEntregas_Salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEntregas_Cancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFEntregas_Produto)
                                .addComponent(jTFEntregas_ValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(73, 73, 73)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(76, 76, 76)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFEntregas_QtProduto)
                                .addComponent(jTFEntregas_Total)
                                .addComponent(jTFEntregas_Local)
                                .addComponent(jTFEntregas_Programas, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFEntregas_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFEntregas_ValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFEntregas_QtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTFEntregas_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFEntregas_Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFEntregas_Programas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEntregas_Salvar)
                    .addComponent(jBEntregas_Cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEntregas_ProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEntregas_ProdutosMouseClicked
        int p = jTableEntregas_Produtos.getSelectedRow(); // pegar a linha selecionada
        jTFEntregas_Produto.setText((String.valueOf(jTableEntregas_Produtos.getValueAt(p, 0))));// colocar no campor nome o que a pessoa esta selecionando
        jTFEntregas_ValorProduto.setText((String.valueOf(jTableEntregas_Produtos.getValueAt(p, 3))));

    }//GEN-LAST:event_jTableEntregas_ProdutosMouseClicked

    private void jTableEntregas_ProgramasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEntregas_ProgramasMouseClicked
        int p = jTableEntregas_Programas.getSelectedRow(); // pegar a linha selecionada
         // colocar no campor nome o que a pessoa esta selecionando
        jTFEntregas_Programas.setText((String.valueOf(jTableEntregas_Programas.getValueAt(p, 0))));
    }//GEN-LAST:event_jTableEntregas_ProgramasMouseClicked

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBEntregas_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntregas_SalvarActionPerformed
        int produto = Integer.parseInt(jTFEntregas_Produto.getText());
        float valorProduto = Float.parseFloat(jTFEntregas_ValorProduto.getText());
        int qtProduto = Integer.parseInt(jTFEntregas_QtProduto.getText());
        float valorTotal = Float.parseFloat(jTFEntregas_Total.getText());
        String localEntrega = jTFEntregas_Local.getText();
        int programa = Integer.parseInt(jTFEntregas_Programas.getText());
        Entregas minhaEntrega = new Entregas(produto, valorProduto, qtProduto, valorTotal, localEntrega, programa);

        try {
            Principal.Saida.writeObject(22);
            Principal.Saida.writeObject(minhaEntrega);

        } catch (IOException ex) {
            Logger.getLogger(Cad_Entregas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBEntregas_SalvarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Saida.writeObject(23);//avisa que quer a lista
            LinkedList<Produto> ListaProdutos = new LinkedList();
            ListaProdutos = (LinkedList<Produto>) Entrada.readObject();
            DefaultTableModel table = (DefaultTableModel) jTableEntregas_Produtos.getModel();
            table.setNumRows(0);

            for (int x = 0; x < ListaProdutos.size(); x++) {

                table.addRow(new Object[]{ListaProdutos.get(x).getId(),ListaProdutos.get(x).getNome(), ListaProdutos.get(x).getTipo(), ListaProdutos.get(x).getPreco()});

            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Erro " + ex);
        }
        try {
            Saida.writeObject(24);//avisa que quer a lista
            LinkedList<Programa> ListaPrograma = new LinkedList();
            ListaPrograma = (LinkedList<Programa>) Entrada.readObject();
            DefaultTableModel table = (DefaultTableModel) jTableEntregas_Programas.getModel();
            table.setNumRows(0);

            for (int x = 0; x < ListaPrograma.size(); x++) {

                table.addRow(new Object[]{ListaPrograma.get(x).getId(),ListaPrograma.get(x).getNome(), ListaPrograma.get(x).getSigla(), ListaPrograma.get(x).getOrgao()});

            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Erro " + ex);
        }
        

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Cad_Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Entregas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntregas_Cancelar;
    private javax.swing.JButton jBEntregas_Salvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFEntregas_Local;
    private javax.swing.JTextField jTFEntregas_Produto;
    private javax.swing.JTextField jTFEntregas_Programas;
    private javax.swing.JTextField jTFEntregas_QtProduto;
    private javax.swing.JTextField jTFEntregas_Total;
    private javax.swing.JTextField jTFEntregas_ValorProduto;
    private javax.swing.JTable jTableEntregas_Produtos;
    private javax.swing.JTable jTableEntregas_Programas;
    // End of variables declaration//GEN-END:variables
}
