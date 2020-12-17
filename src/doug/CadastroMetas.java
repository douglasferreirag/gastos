package doug;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Douglas
 */



public class CadastroMetas extends javax.swing.JFrame { 

    /**
     * Creates new form Cadastrolimite
     */
    
    private String[] argumento;
    
    private boolean trava = false ;
    
    
    public CadastroMetas() {
        initComponents();
        
        new Funcoes().setaCodigo(jtxtCodigoMeta,"SELECT Max(codigo) "
                          + "FROM meta ","Max(codigo)");
        
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
        jtxtCodigoMeta = new javax.swing.JTextField();
        jtxtCodigoPessoa = new javax.swing.JTextField();
        jtxtMes = new javax.swing.JTextField();
        jtxtAno = new javax.swing.JTextField();
        jtxtValor = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmMenu = new javax.swing.JMenu();
        jmLimpar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de metas");
        setName("jfCadastroMeta"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 204), 3, true));

        jtxtCodigoMeta.setEditable(false);
        jtxtCodigoMeta.setBackground(new java.awt.Color(255, 255, 102));
        jtxtCodigoMeta.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtCodigoMeta.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCodigoMeta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 5), "Código da meta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N

        jtxtCodigoPessoa.setEditable(false);
        jtxtCodigoPessoa.setBackground(new java.awt.Color(255, 255, 102));
        jtxtCodigoPessoa.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtCodigoPessoa.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCodigoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 5), "Código da Pessoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N
        jtxtCodigoPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCodigoPessoaMouseClicked(evt);
            }
        });

        jtxtMes.setEditable(false);
        jtxtMes.setBackground(new java.awt.Color(255, 255, 102));
        jtxtMes.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtMes.setForeground(new java.awt.Color(102, 0, 0));
        jtxtMes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 5), "Mês", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N
        jtxtMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMesMouseClicked(evt);
            }
        });

        jtxtAno.setEditable(false);
        jtxtAno.setBackground(new java.awt.Color(255, 255, 102));
        jtxtAno.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtAno.setForeground(new java.awt.Color(102, 0, 0));
        jtxtAno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 5), "Ano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N
        jtxtAno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtAnoMouseClicked(evt);
            }
        });

        jtxtValor.setEditable(false);
        jtxtValor.setBackground(new java.awt.Color(255, 255, 102));
        jtxtValor.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtValor.setForeground(new java.awt.Color(102, 0, 0));
        jtxtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 5), "Valor ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N
        jtxtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtValorMouseClicked(evt);
            }
        });

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setBackground(new java.awt.Color(255, 255, 102));
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(102, 0, 0));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 5), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 153, 153))); // NOI18N

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setBackground(new java.awt.Color(255, 255, 102));
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setForeground(new java.awt.Color(102, 0, 0));
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 5), "Data e Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 153, 153))); // NOI18N

        javax.swing.GroupLayout jpBaseLayout = new javax.swing.GroupLayout(jpBase);
        jpBase.setLayout(jpBaseLayout);
        jpBaseLayout.setHorizontalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtCodigoMeta)
                            .addComponent(jtxtCodigoPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(449, Short.MAX_VALUE))
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpBaseLayout.setVerticalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodigoMeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jspFundo.setViewportView(jpBase);

        jmbMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 10));

        jmCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 51), 5));
        jmCadastro.setText("Cadastro");
        jmCadastro.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadastroMouseClicked(evt);
            }
        });
        jmbMenu.add(jmCadastro);

        jmMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 51), 5));
        jmMenu.setText("Menu Principal");
        jmMenu.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMenuMouseClicked(evt);
            }
        });
        jmbMenu.add(jmMenu);

        jmLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 51), 5));
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
        //Vou para a tela de menu e fecha a tela atual.

        MenuPrincipal.main(argumento,jtxtUsuario.getText());

        CadastroMetas.this.dispose(); 
        
    }//GEN-LAST:event_jmMenuMouseClicked

    private void jmLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmLimparMouseClicked
        // Limpa o formulário.
        
        new Funcoes().setaCodigo(jtxtCodigoMeta,"SELECT Max(codigo) "
                          + "FROM meta ","Max(codigo)");
        
        trava = false;
        
        jtxtMes.setText("");
        
        jtxtAno.setText("");
        
        jtxtCodigoPessoa.setText("");
        
        jtxtValor.setText("");
        
        jmCadastro.setVisible(false);
        
        
    }//GEN-LAST:event_jmLimparMouseClicked

    private void jmCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadastroMouseClicked
        
        // Trata do cadastro da meta.
        
        
        
        String[][] parametro = new String[5][2];
                
        parametro[0][0] = "Double";
                
        parametro[0][1] = jtxtCodigoMeta.getText();
                
        parametro[1][0] = "Double";
                
        parametro[1][1] = jtxtMes.getText();
                      
        parametro[2][0] = "Double";
                
        parametro[2][1] = jtxtAno.getText();
                
        parametro[3][0] = "Double";
                
        parametro[3][1] = jtxtValor.getText();
                
        parametro[4][0] = "Double";
                
        parametro[4][1] = jtxtCodigoPessoa.getText();
                        
        new Funcoes().executa("INSERT INTO meta(codigo,mes,ano,valor, codigoPessoa) VALUES(?,?,?,?,?)", parametro," Cadastro na tabela de metas realizado com sucesso.");
        
        
        
                
    }//GEN-LAST:event_jmCadastroMouseClicked

    private void jtxtMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMesMouseClicked
        // Vai para a tela de calendário.
        
        if(jtxtMes.getText().isEmpty() == true)
            
            Data.main(argumento, jtxtMes, 1, "Insira o mês referente a meta que será cadastrada.", jtxtUsuario.getText());
        
    }//GEN-LAST:event_jtxtMesMouseClicked

    private void jtxtAnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtAnoMouseClicked
        // Vai para a tela de calendário.
        
         if(jtxtAno.getText().isEmpty() == true)
             
            Data.main(argumento, jtxtAno, 2, "Insira o ano referente ao mês da meta que será cadastrada.", jtxtUsuario.getText());
         
    }//GEN-LAST:event_jtxtAnoMouseClicked

    private void jtxtCodigoPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCodigoPessoaMouseClicked
        // Vai para a tela de registro de pessoa.
        
        if( (new Funcoes().getTipoUsuario(jtxtUsuario.getText()).toString().compareTo("administrador") == 0) ||
                 (new Funcoes().getTipoUsuario(jtxtUsuario.getText()).toString().compareTo("root") == 0) )  
                
            ListagemPessoa.main(argumento, jtxtCodigoPessoa, null,"Retorno de código", false, jtxtUsuario.getText(), "Selecione o código da pessoa que terá a meta associada.");
        
    }//GEN-LAST:event_jtxtCodigoPessoaMouseClicked

    private void jtxtValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtValorMouseClicked
        // Vai para a tela de entrada.
        
        if(jtxtValor.getText().isEmpty() == true)
            
            EntradaValores.main(argumento, jtxtValor, true, jtxtUsuario.getText(), "Insira o valor da meta.");
        
    }//GEN-LAST:event_jtxtValorMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Testa para ver se posso liberar o botão de cadastro.
        
        if((jtxtMes.getText().isEmpty() == false) && (jtxtAno.getText().isEmpty() == false) && 
                (jtxtValor.getText().isEmpty() == false) && (jtxtCodigoPessoa.getText().isEmpty() == false) && (trava == false)) {
            
            trava = true;
            
            jmCadastro.setVisible(true);
            
        }
        
        // Seto o código da pessoa caso for usuário.
        
        if (new Funcoes().getTipoUsuario(jtxtUsuario.getText()).toString().compareTo("usuario") == 0) { 
                
                    String[][] parametro = new String[1][2];
         
                    parametro[0][0] = "String";
        
                    parametro[0][1] = jtxtUsuario.getText();
        
                    jtxtCodigoPessoa.setText(new Funcoes().retornar("SELECT codigoPessoa FROM login WHERE usuario = ?", "codigoPessoa", parametro).toString());
        
                    
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
            java.util.logging.Logger.getLogger(CadastroMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastroMetas().setVisible(true);
                
                jtxtUsuario.setText(user);
                
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmLimpar;
    private javax.swing.JMenu jmMenu;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JPanel jpBase;
    private javax.swing.JScrollPane jspFundo;
    private static javax.swing.JTextField jtxtAno;
    private static javax.swing.JTextField jtxtCodigoMeta;
    private static javax.swing.JTextField jtxtCodigoPessoa;
    private static javax.swing.JTextField jtxtDataHora;
    private static javax.swing.JTextField jtxtMes;
    private static javax.swing.JTextField jtxtUsuario;
    private static javax.swing.JTextField jtxtValor;
    // End of variables declaration//GEN-END:variables
}
