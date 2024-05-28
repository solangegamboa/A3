/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Produtos;
import DAO.ProdutoDAO;
import View.Mensagens;
import javax.swing.JOptionPane;
import View.CadastroProduto;
import View.Home;
/**
 *
 * @author rafae
 */
public class CadastroProduto extends javax.swing.JFrame {

    private Produtos objProduto;
    public CadastroProduto() {
        initComponents();
        this.objProduto = new Produtos();
    }
    /*
    private Home objHome;
    public CadastroProduto() {
        initComponents();
        this.objProduto = new Produtos();
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        quantidade = new javax.swing.JTextField();
        bCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        imag = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setTitle("EditProduto");
        setFocusableWindowState(true);
        setResizable(false);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });

        nome.setBackground(new java.awt.Color(255, 255, 255));
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeFocusGained(evt);
            }
        });
        nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeMouseClicked(evt);
            }
        });
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        descricao.setBackground(new java.awt.Color(255, 255, 255));
        descricao.setForeground(new java.awt.Color(0, 0, 0));
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        quantidade.setBackground(new java.awt.Color(255, 255, 255));
        quantidade.setForeground(new java.awt.Color(0, 0, 0));
        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });

        bCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        bCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrar.setText("Cadastrar");
        bCadastrar.setToolTipText("");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descrição");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Quantidade");

        precos.setBackground(new java.awt.Color(255, 255, 255));
        precos.setForeground(new java.awt.Color(0, 0, 0));
        precos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precosActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Preço");

        imag.setBackground(new java.awt.Color(255, 255, 255));
        imag.setForeground(new java.awt.Color(0, 0, 0));
        imag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Imagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imag, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(precos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(imag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bCadastrar)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(294, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        // TODO add your handling code here:
         try {
            // recebendo e validando dados da interface gr�fica.
          String nome = "";
          String descrição = "";
            int quantidade = 0;
            double precos = 0;
            int peso = 0;
           String imagem = "";
           
                    if(this.nome.getText().length()<2){
                        throw new Mensagens("O campo deve conter pelo menos 2 caracteres");
                    } else{
                    nome = this.nome.getText();
                    this.objProduto.setProduto(nome);
                    
                   }if(this.descricao.getText().length()<=0){
                   throw new Mensagens("A descrição não pode estar vazia");
                   }else{
                   descrição = this.descricao.getText();
                   this.objProduto.setdescricao(descrição); 
                   }if(this.quantidade.getText().length()<=0){
                   throw new Mensagens("a quantidade deve ser maior que zero");
                   }else{ 
                   quantidade = Integer.parseInt(this.quantidade.getText());
                   this.objProduto.setquantidadeEstoque(quantidade); 
                   }
                   
                   if(this.precos.getText().length()<=0){
                   throw new Mensagens("O preço deve ser maior que zero");
                   }else{ 
                   precos = Double.parseDouble(this.precos.getText());
                   this.objProduto.setpreco(precos);

                   }if(this.imag.getText().length()<=0){
                   throw new Mensagens("Adicione uma imagem");
                   } else{
                   imagem = this.imag.getText();
                   this.objProduto.setImagem(nome);
                   }
                  if (ProdutoDAO.InsertProdutoBD(this.objProduto)){
                      JOptionPane.showMessageDialog(rootPane, "Produto Cadastrado com sucesso");
                    this.nome.setText("");
                    this.descricao.setText("");
                    this.quantidade.setText("");
                    this.precos.setText("");
                    this.imag.setText("");
                  } 
                    //System.out.println();
            }catch(Mensagens erro){
                        JOptionPane.showMessageDialog(null, erro.getMessage());
                   }   catch (NumberFormatException erro2){
                       JOptionPane.showMessageDialog(null, "esse campo só aceita números");
                   }
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeMouseClicked

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusGained

    }//GEN-LAST:event_nomeFocusGained

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorResized

    private void precosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precosActionPerformed

    private void imagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagActionPerformed

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField imag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField precos;
    private javax.swing.JTextField quantidade;
    // End of variables declaration//GEN-END:variables
}
