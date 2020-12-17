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


public class CadastroItem extends javax.swing.JFrame {

    /**
     * Creates new form CadastroÍtemGasto
     */
    
    private String[] argumento;

    private boolean trava = false;
    
    public CadastroItem() {
        initComponents();
       
        this.setExtendedState(MAXIMIZED_BOTH);
        
        jmCadastro.setVisible(false);
        
        new Funcoes().executeTimer(jtxtDataHora, "dd/MM/yyyy hh:mm:ss");
        
        
    }

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
        jtxtCodigoGasto = new javax.swing.JTextField();
        jtxtCodigoCatalogo = new javax.swing.JTextField();
        jtxtQuantidade = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jtxtValorUnitario = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmTelaGasto = new javax.swing.JMenu();
        jmLimpar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Ítens de gasto");
        setName("jfCadastroItem"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 4, true));

        jtxtCodigoGasto.setEditable(false);
        jtxtCodigoGasto.setBackground(new java.awt.Color(0, 0, 204));
        jtxtCodigoGasto.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtCodigoGasto.setForeground(new java.awt.Color(51, 153, 0));
        jtxtCodigoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código do ítem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(204, 204, 0))); // NOI18N

        jtxtCodigoCatalogo.setEditable(false);
        jtxtCodigoCatalogo.setBackground(new java.awt.Color(0, 0, 204));
        jtxtCodigoCatalogo.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtCodigoCatalogo.setForeground(new java.awt.Color(51, 153, 0));
        jtxtCodigoCatalogo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código do produto/ serviço catalogado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(204, 204, 0))); // NOI18N
        jtxtCodigoCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCodigoCatalogoMouseClicked(evt);
            }
        });

        jtxtQuantidade.setEditable(false);
        jtxtQuantidade.setBackground(new java.awt.Color(0, 0, 204));
        jtxtQuantidade.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtQuantidade.setForeground(new java.awt.Color(51, 153, 0));
        jtxtQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(204, 204, 0))); // NOI18N
        jtxtQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtQuantidadeMouseClicked(evt);
            }
        });

        jtxtTotal.setEditable(false);
        jtxtTotal.setBackground(new java.awt.Color(0, 0, 204));
        jtxtTotal.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtTotal.setForeground(new java.awt.Color(51, 153, 0));
        jtxtTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(204, 204, 0))); // NOI18N

        jtxtValorUnitario.setEditable(false);
        jtxtValorUnitario.setBackground(new java.awt.Color(0, 0, 204));
        jtxtValorUnitario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtValorUnitario.setForeground(new java.awt.Color(51, 153, 0));
        jtxtValorUnitario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Unitário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(204, 204, 0))); // NOI18N

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setBackground(new java.awt.Color(0, 0, 204));
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(51, 153, 0));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(204, 204, 0))); // NOI18N

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setBackground(new java.awt.Color(0, 0, 204));
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setForeground(new java.awt.Color(51, 153, 0));
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data e Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(204, 204, 0))); // NOI18N

        javax.swing.GroupLayout jpBaseLayout = new javax.swing.GroupLayout(jpBase);
        jpBase.setLayout(jpBaseLayout);
        jpBaseLayout.setHorizontalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addComponent(jtxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addComponent(jtxtCodigoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtCodigoCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpBaseLayout.setVerticalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodigoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jtxtCodigoCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jspFundo.setViewportView(jpBase);

        jmbMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 10, true));

        jmCadastro.setBackground(new java.awt.Color(102, 102, 255));
        jmCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jmCadastro.setForeground(new java.awt.Color(0, 153, 0));
        jmCadastro.setText("Cadastro");
        jmCadastro.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadastroMouseClicked(evt);
            }
        });
        jmbMenu.add(jmCadastro);

        jmTelaGasto.setBackground(new java.awt.Color(102, 102, 255));
        jmTelaGasto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jmTelaGasto.setForeground(new java.awt.Color(0, 153, 0));
        jmTelaGasto.setText("Tela de Gastos");
        jmTelaGasto.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmTelaGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmTelaGastoMouseClicked(evt);
            }
        });
        jmbMenu.add(jmTelaGasto);

        jmLimpar.setBackground(new java.awt.Color(102, 102, 255));
        jmLimpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jmLimpar.setForeground(new java.awt.Color(0, 153, 0));
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

    private void jmLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmLimparMouseClicked
        // Limpa o formulário.

        jtxtCodigoCatalogo.setText("");
        
        jtxtQuantidade.setText("");
        
        jtxtTotal.setText("");
        
        jtxtValorUnitario.setText("");
        
        trava = false;
        
        jmCadastro.setVisible(false);


        
    }//GEN-LAST:event_jmLimparMouseClicked

    private void jmTelaGastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmTelaGastoMouseClicked
        // Vai para a tela de cadastro de gastos e fecha o frame atual.

        CadastroGasto.main(argumento, jtxtUsuario.getText());
 
        CadastroItem.this.dispose();
        
    }//GEN-LAST:event_jmTelaGastoMouseClicked

    private void jtxtQuantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtQuantidadeMouseClicked
        // Vai para a tela de entrada .
        
        if(jtxtQuantidade.getText().isEmpty() == true)
            
            EntradaValores.main(argumento, jtxtQuantidade, true, jtxtUsuario.getText(), "Insira a quantidade obtida do produto/serviço catalogado.");
        
    }//GEN-LAST:event_jtxtQuantidadeMouseClicked

    private void jtxtCodigoCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCodigoCatalogoMouseClicked
        //Vai para a tela de registro do catálogo.
        
        if(jtxtCodigoCatalogo.getText().isEmpty() == true)
            
            ListagemCatalogo.main(argumento, jtxtCodigoCatalogo, null, jtxtValorUnitario,"Cadastro de Ítem", false, jtxtUsuario.getText(), "Selecione o código do produto/serviço catalogado.");
        
    }//GEN-LAST:event_jtxtCodigoCatalogoMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Faz o cálculo valor unitário x quantidade e verifica se pode liberar o botão de cadastro.

        
        double total = 0;
        
        if( (jtxtValorUnitario.getText().isEmpty() == false) && (jtxtQuantidade.getText().isEmpty() == false))
            
        {
            
            total = new Funcoes().round((Double.parseDouble(jtxtValorUnitario.getText())) * (Double.parseDouble(jtxtQuantidade.getText())));
            
            jtxtTotal.setText(Double.toString(total));
            
        }
        
        if(
                
                (jtxtValorUnitario.getText().isEmpty() == false) && 
                
                (jtxtQuantidade.getText().isEmpty() == false) && (trava == false)
                
                
            )
            
        {
            
                jmCadastro.setVisible(true);
                
                trava = true;
            
        }
        
       
    }//GEN-LAST:event_formWindowActivated

    private void jmCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadastroMouseClicked
        //Trata do cadastro.
       
        
                jmCadastro.setVisible(false);
        
                String[][] parametro = new String[4][2];

                parametro[0][0] = "Double";
            
                parametro[0][1] = jtxtCodigoGasto.getText();
            
                parametro[1][0] = parametro[0][0];
            
                parametro[1][1] = jtxtCodigoCatalogo.getText();
            
                parametro[2][0] = parametro[0][0];
            
                parametro[2][1] = jtxtQuantidade.getText();
            
                parametro[3][0] = parametro[0][0];
            
                parametro[3][1] = jtxtTotal.getText();
            
                new Funcoes().executa("INSERT INTO item(codigoGasto,codigoCatalogo,quantidade,total) VALUES(?,?,?,?)", parametro, "Inserção na tabela de ítens realizada com sucesso.");

              
                
      
        
    }//GEN-LAST:event_jmCadastroMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CadastroItem().setVisible(true);
             
                 jtxtCodigoGasto.setText(CadastroGasto.jtxtCodigoGasto.getText());
                 
                 jtxtUsuario.setText(user);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmLimpar;
    private javax.swing.JMenu jmTelaGasto;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JPanel jpBase;
    private javax.swing.JScrollPane jspFundo;
    public static javax.swing.JTextField jtxtCodigoCatalogo;
    public static javax.swing.JTextField jtxtCodigoGasto;
    private static javax.swing.JTextField jtxtDataHora;
    public static javax.swing.JTextField jtxtQuantidade;
    public static javax.swing.JTextField jtxtTotal;
    private static javax.swing.JTextField jtxtUsuario;
    public static javax.swing.JTextField jtxtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
