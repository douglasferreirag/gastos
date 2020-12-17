/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doug;

/**
 *
 * @author Douglas
 */



public class RemoverLogin extends javax.swing.JFrame {

    /**
     * Creates new form DeletaLogin
     */
    public RemoverLogin() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        trava = false;
        
        jmRemover.setVisible(false);
        
        new Funcoes().executeTimer(jtxtDataHora, "dd/MM/yyyy hh:mm:ss");
        
    }
    
    private String[] argumento;
  
    private boolean trava;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspFundo = new javax.swing.JScrollPane();
        jpBase = new javax.swing.JPanel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmRemover = new javax.swing.JMenu();
        jmMenu = new javax.swing.JMenu();
        jmLimpar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remove Cadastro de Login");
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(0, 0, 255));
        setName("jfRemoveLogin"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 5));

        jtxtCodigo.setEditable(false);
        jtxtCodigo.setBackground(new java.awt.Color(255, 102, 102));
        jtxtCodigo.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(0, 153, 51));
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 5, true), "Código da pessoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N
        jtxtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCodigoMouseClicked(evt);
            }
        });

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setBackground(new java.awt.Color(255, 102, 102));
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(0, 153, 51));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 5, true), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setBackground(new java.awt.Color(255, 102, 102));
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setForeground(new java.awt.Color(0, 153, 51));
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 204), 5, true), "Data e Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N

        javax.swing.GroupLayout jpBaseLayout = new javax.swing.GroupLayout(jpBase);
        jpBase.setLayout(jpBaseLayout);
        jpBaseLayout.setHorizontalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jpBaseLayout.setVerticalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jspFundo.setViewportView(jpBase);

        jmbMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 10, true));

        jmRemover.setBackground(new java.awt.Color(255, 51, 51));
        jmRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        jmRemover.setForeground(new java.awt.Color(51, 0, 204));
        jmRemover.setText("Remover");
        jmRemover.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRemoverMouseClicked(evt);
            }
        });
        jmbMenu.add(jmRemover);

        jmMenu.setBackground(new java.awt.Color(255, 51, 51));
        jmMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        jmMenu.setForeground(new java.awt.Color(51, 0, 204));
        jmMenu.setText("Menu Principal");
        jmMenu.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMenuMouseClicked(evt);
            }
        });
        jmbMenu.add(jmMenu);

        jmLimpar.setBackground(new java.awt.Color(255, 51, 51));
        jmLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        jmLimpar.setForeground(new java.awt.Color(51, 0, 204));
        jmLimpar.setText("Limpar");
        jmLimpar.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmLimparMouseClicked(evt);
            }
        });
        jmbMenu.add(jmLimpar);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMenuMouseClicked
        // Vai para o menu principal e fecha o frame atual.

        MenuPrincipal.main(argumento, jtxtUsuario.getText());
        
        RemoverLogin.this.dispose();
        
    }//GEN-LAST:event_jmMenuMouseClicked

    private void jmLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmLimparMouseClicked
        // Limpa o formulário.

        jtxtCodigo.setText("");
        
        jmRemover.setVisible(false);
        
        trava = false;
   
    }//GEN-LAST:event_jmLimparMouseClicked

    private void jtxtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCodigoMouseClicked
        // Seleciona o código da pessoa.
        
        if(jtxtCodigo.getText().isEmpty() == true)
            
           ListagemLogin.main(argumento, jtxtCodigo, null,"Retorno de código", false, "Selecione o código da pessoa referente ao registro de login a ser removido.", jtxtUsuario.getText()); 
        
    }//GEN-LAST:event_jtxtCodigoMouseClicked

    private void jmRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRemoverMouseClicked
        // Trata da remoção.
        
      
                jmRemover.setVisible(false);
        
                String[][] parametro = new String[1][2];
        
                parametro[0][0] = "Double";
        
                parametro[0][1] = jtxtCodigo.getText();    

                new Funcoes().executa("delete from login where codigoPessoa = ?",
                        parametro, "Remoção na tabela de login realizada com sucesso.");
            
             
        
    }//GEN-LAST:event_jmRemoverMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Verifica se posso liberar o botão remover.
        
        if((jtxtCodigo.getText().isEmpty() == false) && (trava == false)) {
            
            jmRemover.setVisible(true);
            
            trava = true;
            
        }
        
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], String user) {
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
            java.util.logging.Logger.getLogger(RemoverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverLogin().setVisible(true);
                
                jtxtUsuario.setText(user);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmLimpar;
    private javax.swing.JMenu jmMenu;
    private javax.swing.JMenu jmRemover;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JPanel jpBase;
    private javax.swing.JScrollPane jspFundo;
    private javax.swing.JTextField jtxtCodigo;
    private static javax.swing.JTextField jtxtDataHora;
    private static javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
