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
public class CadastroEntradaCapital extends javax.swing.JFrame {

    /**
     * Creates new form salarioPorMes
     */
    
    private String[] argumento;
    
    private boolean trava = false;
    
    public CadastroEntradaCapital() {
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
        jtxtMes = new javax.swing.JTextField();
        jtxtAno = new javax.swing.JTextField();
        jtxtCodigoPessoa = new javax.swing.JTextField();
        jtxtValor = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmMenu = new javax.swing.JMenu();
        jmLimpar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de entrada de capital");
        setName("jfCadastroEntradaCapital"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 9));

        jtxtMes.setEditable(false);
        jtxtMes.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jtxtMes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true), "Mês", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(255, 51, 51))); // NOI18N
        jtxtMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMesMouseClicked(evt);
            }
        });

        jtxtAno.setEditable(false);
        jtxtAno.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jtxtAno.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true), "Ano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(255, 51, 51))); // NOI18N
        jtxtAno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtAnoMouseClicked(evt);
            }
        });

        jtxtCodigoPessoa.setEditable(false);
        jtxtCodigoPessoa.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jtxtCodigoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true), "Código da pessoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(255, 51, 51))); // NOI18N
        jtxtCodigoPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCodigoPessoaMouseClicked(evt);
            }
        });

        jtxtValor.setEditable(false);
        jtxtValor.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jtxtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true), "Valor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(255, 51, 51))); // NOI18N
        jtxtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtValorMouseClicked(evt);
            }
        });

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(255, 51, 51))); // NOI18N

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true), "Data e Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(255, 51, 51))); // NOI18N

        javax.swing.GroupLayout jpBaseLayout = new javax.swing.GroupLayout(jpBase);
        jpBase.setLayout(jpBaseLayout);
        jpBaseLayout.setHorizontalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31598, Short.MAX_VALUE))
        );
        jpBaseLayout.setVerticalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtxtCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jspFundo.setViewportView(jpBase);

        jmbMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 51), 10, true));

        jmCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 5, true));
        jmCadastro.setText("Cadastro");
        jmCadastro.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadastroMouseClicked(evt);
            }
        });
        jmbMenu.add(jmCadastro);

        jmMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 5, true));
        jmMenu.setText("Menu Principal");
        jmMenu.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMenuMouseClicked(evt);
            }
        });
        jmbMenu.add(jmMenu);

        jmLimpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 5, true));
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
            .addComponent(jspFundo, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmLimparMouseClicked
        // Limpa o formulário.
        
        jtxtMes.setText("");
        
        jtxtAno.setText("");
        
        jtxtCodigoPessoa.setText("");
        
        jtxtValor.setText("");
        
        trava = false;
        
        jmCadastro.setVisible(false);

        
    }//GEN-LAST:event_jmLimparMouseClicked

    private void jmMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMenuMouseClicked
        // Vai para o menu principal e fecha o frame atual.
        
        MenuPrincipal.main(argumento,jtxtUsuario.getText());
        
        CadastroEntradaCapital.this.dispose();
        
    }//GEN-LAST:event_jmMenuMouseClicked

    private void jmCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadastroMouseClicked
        // Trata do cadastro.
        
        jmCadastro.setVisible(false);
        
        String[][] parametro  = new String[4][2];
                
        parametro[0][0] = "Double";
                
        parametro[0][1] = jtxtCodigoPessoa.getText();
                
        parametro[1][0] = parametro[0][0];
                
        parametro[1][1] = jtxtAno.getText();
        
        parametro[2][0] = parametro[0][0];
                
        parametro[2][1] = jtxtMes.getText();
        
        parametro[3][0] = parametro[0][0];
        
        parametro[3][1] = jtxtValor.getText();
                
        new Funcoes().executa("INSERT INTO entradaCapital(codigoPessoa,ano,mes,valor) VALUES(?,?,?,?)", parametro, "Registro na tabela de entrada de capital realizado com sucesso. ");

      
    }//GEN-LAST:event_jmCadastroMouseClicked

    private void jtxtMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMesMouseClicked
        //Vai para a tela de calendário.
        
        if(jtxtMes.getText().isEmpty() == true)
            
            Data.main(argumento, jtxtMes, 1, "Selecione o mês em que caiu o capital na conta.", jtxtUsuario.getText());
        
    }//GEN-LAST:event_jtxtMesMouseClicked

    private void jtxtAnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtAnoMouseClicked
        // Vai para a tela de calendário.
        
        if(jtxtAno.getText().isEmpty() == true)
            
            Data.main(argumento, jtxtAno, 2, "Selecione o ano referente ao mês em que caiu o capital na conta.", jtxtUsuario.getText());
        
    }//GEN-LAST:event_jtxtAnoMouseClicked

    private void jtxtValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtValorMouseClicked
        // Vai para a tela de entrada numérica.
        
        if(jtxtValor.getText().isEmpty() == true)
            
            EntradaValores.main(argumento, jtxtValor, true, jtxtUsuario.getText(), "Insira o valor que caiu na conta.");
        
    }//GEN-LAST:event_jtxtValorMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Seto o código da pessoa caso for usuário.
        
        if (new Funcoes().getTipoUsuario(jtxtUsuario.getText()).toString().compareTo("usuario") == 0) { 
                
                    String[][] parametro = new String[1][2];
         
                    parametro[0][0] = "String";
        
                    parametro[0][1] = jtxtUsuario.getText();
        
                    jtxtCodigoPessoa.setText(new Funcoes().retornar("SELECT codigoPessoa FROM login WHERE usuario = ?", "codigoPessoa", parametro).toString());
        
                    
        }
        // Verifico se posso liberar o botão de cadastro.
        
        if((jtxtMes.getText().isEmpty() == false) && (jtxtAno.getText().isEmpty() == false)
            && (jtxtCodigoPessoa.getText().isEmpty() == false)  && (trava == false) )  {

                trava = true;

                jmCadastro.setVisible(true);

        }


    }//GEN-LAST:event_formWindowActivated

    private void jtxtCodigoPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCodigoPessoaMouseClicked
        // Se for admin ou root poderá escolher o código da pessoa na lista.
        
        if( (new Funcoes().getTipoUsuario(jtxtUsuario.getText()).toString().compareTo("administrador") == 0) ||
                 (new Funcoes().getTipoUsuario(jtxtUsuario.getText()).toString().compareTo("root") == 0) )  
                
                 ListagemPessoa.main(argumento, jtxtCodigoPessoa, null,"Retorno de código", false, jtxtUsuario.getText(), "Selecione o código da pessoa que terá seus gastos análisados.");
        
    }//GEN-LAST:event_jtxtCodigoPessoaMouseClicked

    
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
            java.util.logging.Logger.getLogger(CadastroEntradaCapital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEntradaCapital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEntradaCapital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEntradaCapital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastroEntradaCapital().setVisible(true);
                
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
    private javax.swing.JTextField jtxtAno;
    private javax.swing.JTextField jtxtCodigoPessoa;
    private static javax.swing.JTextField jtxtDataHora;
    private javax.swing.JTextField jtxtMes;
    private static javax.swing.JTextField jtxtUsuario;
    private javax.swing.JTextField jtxtValor;
    // End of variables declaration//GEN-END:variables
}
