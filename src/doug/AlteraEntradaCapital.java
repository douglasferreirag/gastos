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
public class AlteraEntradaCapital extends javax.swing.JFrame {

    /**
     * Creates new form modificaEntradaCapital
     */

    private String alterado = "";
    
    private boolean trava;
    
    public AlteraEntradaCapital() {
        initComponents();
     
        this.setExtendedState(MAXIMIZED_BOTH);
        
        jmAlterar.setVisible(false);
        
        new Funcoes().executeTimer(jtxtDataHora, "dd/MM/yyyy hh:mm:ss");
        
    }
    
    private String[] argumento;

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
        jtxtDesc = new javax.swing.JTextField();
        jtxtConteudo = new javax.swing.JTextField();
        jtxtNovoConteudo = new javax.swing.JTextField();
        jtxtCodPess = new javax.swing.JTextField();
        jtxtMes = new javax.swing.JTextField();
        jtxtAno = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmAlterar = new javax.swing.JMenu();
        jmLimpar = new javax.swing.JMenu();
        jmMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificação de dados de entada de capital");
        setName("jfAlteraEntradaCapital"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 5, true));

        jtxtDesc.setEditable(false);
        jtxtDesc.setBackground(new java.awt.Color(51, 51, 255));
        jtxtDesc.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDesc.setForeground(new java.awt.Color(102, 102, 102));
        jtxtDesc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N
        jtxtDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtDescMouseClicked(evt);
            }
        });

        jtxtConteudo.setEditable(false);
        jtxtConteudo.setBackground(new java.awt.Color(51, 51, 255));
        jtxtConteudo.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtConteudo.setForeground(new java.awt.Color(102, 102, 102));
        jtxtConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Conteúdo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N

        jtxtNovoConteudo.setEditable(false);
        jtxtNovoConteudo.setBackground(new java.awt.Color(51, 51, 255));
        jtxtNovoConteudo.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtNovoConteudo.setForeground(new java.awt.Color(102, 102, 102));
        jtxtNovoConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Novo conteúdo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N
        jtxtNovoConteudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtNovoConteudoMouseClicked(evt);
            }
        });

        jtxtCodPess.setEditable(false);
        jtxtCodPess.setBackground(new java.awt.Color(51, 51, 255));
        jtxtCodPess.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtCodPess.setForeground(new java.awt.Color(102, 102, 102));
        jtxtCodPess.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Código da pessoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N

        jtxtMes.setEditable(false);
        jtxtMes.setBackground(new java.awt.Color(51, 51, 255));
        jtxtMes.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtMes.setForeground(new java.awt.Color(102, 102, 102));
        jtxtMes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Mês", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N

        jtxtAno.setEditable(false);
        jtxtAno.setBackground(new java.awt.Color(51, 51, 255));
        jtxtAno.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtAno.setForeground(new java.awt.Color(102, 102, 102));
        jtxtAno.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Ano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setBackground(new java.awt.Color(51, 51, 255));
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setBackground(new java.awt.Color(51, 51, 255));
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setForeground(new java.awt.Color(102, 102, 102));
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Data e Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 102))); // NOI18N

        javax.swing.GroupLayout jpBaseLayout = new javax.swing.GroupLayout(jpBase);
        jpBase.setLayout(jpBaseLayout);
        jpBaseLayout.setHorizontalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addComponent(jtxtUsuario)
                        .addContainerGap())
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBaseLayout.createSequentialGroup()
                                .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpBaseLayout.createSequentialGroup()
                                .addComponent(jtxtNovoConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jtxtCodPess, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)))
                        .addGap(326, 326, 326))
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBaseLayout.createSequentialGroup()
                                .addComponent(jtxtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jtxtConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpBaseLayout.setVerticalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNovoConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCodPess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jspFundo.setViewportView(jpBase);

        jmbMenu.setBackground(new java.awt.Color(255, 0, 0));
        jmbMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 10, true));
        jmbMenu.setForeground(new java.awt.Color(204, 102, 0));
        jmbMenu.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N

        jmAlterar.setBackground(new java.awt.Color(102, 0, 255));
        jmAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 5, true));
        jmAlterar.setForeground(new java.awt.Color(255, 0, 102));
        jmAlterar.setText("Alterar");
        jmAlterar.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAlterarMouseClicked(evt);
            }
        });
        jmbMenu.add(jmAlterar);

        jmLimpar.setBackground(new java.awt.Color(102, 0, 255));
        jmLimpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 5, true));
        jmLimpar.setForeground(new java.awt.Color(255, 0, 102));
        jmLimpar.setText("Limpar");
        jmLimpar.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmLimparMouseClicked(evt);
            }
        });
        jmbMenu.add(jmLimpar);

        jmMenu.setBackground(new java.awt.Color(102, 0, 255));
        jmMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 5, true));
        jmMenu.setForeground(new java.awt.Color(255, 0, 102));
        jmMenu.setText("Menu Principal");
        jmMenu.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMenuMouseClicked(evt);
            }
        });
        jmbMenu.add(jmMenu);

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
        // Limpar o formulário.

        jtxtDesc.setText("");

        jtxtConteudo.setText("");

        jtxtNovoConteudo.setText("");

        jtxtAno.setText("");
        
        jtxtMes.setText("");
        
        jtxtCodPess.setText("");
        
        alterado = "";
        
        trava = false;
        
        jmAlterar.setVisible(false);

    }//GEN-LAST:event_jmLimparMouseClicked

    private void jmMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMenuMouseClicked
        // Vai para o menu Principal e fecha o frame atual.

        MenuPrincipal.main(argumento,jtxtUsuario.getText());

        AlteraEntradaCapital.this.dispose();

    }//GEN-LAST:event_jmMenuMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Pega o valor do dado alterado.
        
       if(jtxtDesc.getText().compareTo("Mês") == 0) 
                
                alterado = "mes";
                
            
        
        if(jtxtDesc.getText().compareTo("Ano") == 0) 
                
                alterado = "ano";
        
        
        if(jtxtDesc.getText().compareTo("Valor adquirido em reais") == 0) 
                
                alterado = "valor";
        
        // Vai decidir se pode ou não liberar o botão de alterar.
        
        if (
            
                
                
                        (jtxtDesc.getText().isEmpty() == false) &&
                
                        (jtxtConteudo.getText().isEmpty() == false) &&
                
                        (jtxtNovoConteudo.getText().isEmpty() == false) && (trava == false)
                
              
                
                
            ) {
            
                trava = true;
                
                jmAlterar.setVisible(true);
                
            
            }
        
           
            
      
    }//GEN-LAST:event_formWindowActivated

    private void jtxtDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtDescMouseClicked
        //Seleciona o dado a ser alterado.
        
        if(jtxtDesc.getText().isEmpty() == true)
            
            ListagemEntradaCapital.main(argumento, jtxtConteudo, jtxtDesc, jtxtAno,jtxtCodPess, jtxtMes, "Alteração de dados", false, jtxtUsuario.getText(), "Selecione o registro a ser alterado.");

        
    }//GEN-LAST:event_jtxtDescMouseClicked

    private void jmAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAlterarMouseClicked
        // Trata da alteração.
        
        jmAlterar.setVisible(false);
        
        String d[][] = new String[4][2];

        d[0][0] = "Double";

        d[0][1] = jtxtNovoConteudo.getText();
        
        d[1][0] = d[0][0];
        
        d[1][1] =jtxtAno.getText(); 
        
        d[2][0] = d[0][0];
        
        d[2][1] = jtxtCodPess.getText();
        
        d[3][0] = d[0][0];
        
        d[3][1] =jtxtMes.getText(); 
      
        new Funcoes().executa("update entradaCapital set " + alterado + " = ? where ano =  ? and codigoPessoa = ? and mes = ? " , d, "Alteração na tabela de metas realizada com sucesso.");

            
        
        
    }//GEN-LAST:event_jmAlterarMouseClicked

    private void jtxtNovoConteudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtNovoConteudoMouseClicked
        // Escolhe um dado caminho dependendo do valor em alterado.
        
        if(alterado == "mes")
            
            Data.main(argumento, jtxtNovoConteudo,1, "Insira o mês que obteve o capital.", jtxtUsuario.getText());
        
        if (alterado.compareTo("ano") == 0)
            
            Data.main(argumento, jtxtNovoConteudo,2, "Insira o ano correspondente ao mês que obteve o capital.", jtxtUsuario.getText() + ".");
        
        if(alterado == "valor")
            
             EntradaValores.main(argumento, jtxtNovoConteudo, true, jtxtUsuario.getText(), "Insira o " + jtxtDesc.getText() + ".");
        
    }//GEN-LAST:event_jtxtNovoConteudoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], String user) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteraEntradaCapital().setVisible(true);
                
                jtxtUsuario.setText(user);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmAlterar;
    private javax.swing.JMenu jmLimpar;
    private javax.swing.JMenu jmMenu;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JPanel jpBase;
    private javax.swing.JScrollPane jspFundo;
    private javax.swing.JTextField jtxtAno;
    private javax.swing.JTextField jtxtCodPess;
    private javax.swing.JTextField jtxtConteudo;
    private javax.swing.JTextField jtxtDataHora;
    private javax.swing.JTextField jtxtDesc;
    private javax.swing.JTextField jtxtMes;
    private javax.swing.JTextField jtxtNovoConteudo;
    private static javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
