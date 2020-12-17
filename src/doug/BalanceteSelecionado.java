/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doug;

/**
 *
 * @author DouglasFerreirag
 */

import java.sql.*;




public class BalanceteSelecionado extends javax.swing.JFrame {

    /**
     * Creates new form registroGasto
     */
    
    private String[] args;
    
    private Double resultado = 0.0;
    
    private  javax.swing.table.DefaultTableModel dtm ;
    
    private String[] argumento;
 
   
    
    public BalanceteSelecionado() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        new Funcoes().executeTimer(jtxtDataHora, "dd/MM/yyyy hh:mm:ss");
        
    }
    
    private static void tabela(){ // Constrói a tabela usando os requisitos apresentados.
        
            if(new Funcoes().getTipoUsuario(jtxtUsuario.getText()).toString().compareTo("root") == 0) {
                
                    preencheT1("org.gjt.mm.mysql.Driver","jdbc:mysql://localhost/gastos", "root", "","Select * from gasto Order by codigo asc" ) ; // Preenche a tabela.
             
                    preencheT2("org.gjt.mm.mysql.Driver","jdbc:mysql://localhost/gastos", "root", "",
                        "select g.codigo, cat.codigo, cat.descricao"
                        + " from gasto as g, catalogo as cat, item as i"
                        + " where ( ( g.codigo = i.codigoGasto) and (i.codigoCatalogo = cat.codigo) )" ) ; // Preenche a tabela.
                    
            }        
            
            else
                
            {
            
                String[][] parametro = new String[1][2];
                
                parametro[0][0] = "String";
                
                parametro[0][1] = jtxtUsuario.getText();
                
                
                preencheT1("org.gjt.mm.mysql.Driver","jdbc:mysql://localhost/gastos", "root", "",
                        
                            "Select * from gasto where codigoPessoa = " + new Funcoes().retornar("SELECT codigoPessoa FROM login WHERE usuario = ?", "codigoPessoa", parametro) + 
                        
                                "Order by codigo asc" ) ; // Preenche a tabela.
                
                preencheT2("org.gjt.mm.mysql.Driver","jdbc:mysql://localhost/gastos", "root", "",
                        "select g.codigo, cat.codigo, cat.descricao"
                        + " from gasto as g, catalogo as cat, item as i"
                        + " where ( ( g.codigo = i.codigoGasto) and (i.codigoCatalogo = cat.codigo) and (g.codigoPessoa =  " 
                        +         new Funcoes().retornar("SELECT codigoPessoa FROM login WHERE usuario = ?", "codigoPessoa", parametro) 
                        +
                                " ))" ) ; // Preenche a tabela.
            
                
                
            }
            
            
        
    }
    
    
    
     private static void preencheT1 (String driver, String url, String user, String password, String query){
     // Preenche a tabela.
     
        
        Connection  conn = null;
    
        Statement st = null;
 
          
        jtGastos.setModel(new javax.swing.table.DefaultTableModel( //Aqui adiciona-se as colunas e seus respectivos nomes.
                         new Object [][] { }, new String [] {
        
                         "Selecione","Código do gasto","Código da pessoa", "Data", "Descrição",
                         "Desconto em reais", "Valor em reais"     
                         }
        ));
          
         
        try
               
        {
                
                Class.forName(driver);
                
                conn = DriverManager.getConnection(url, user, password);
       
                // Our SQL SELECT query. 
                
                // If you only need a few columns, specify them by name instead of using "*".
                                                                                                                                            
                // Create the java statement.
                
                st = conn.createStatement();
       
                // Execute the query, and get a java resultset.
               
                ResultSet rs = st.executeQuery(query);
                
                // Iterate through the java resultset.
                
                
                while (rs.next())
                   
                {     
                    
                   
                    javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jtGastos.getModel();

                    dtm.addRow(new Object[]{" ",rs.getDouble("codigo"),rs.getDouble("codigoPessoa"),Funcoes.convertData(rs.getDate("data"), "dd-MM-yyyy "), 
                                rs.getString("descricao"), rs.getDouble("desconto"), rs.getDouble("valor") });
                   
                     
                }
             
                st.close();
                
                conn.close();
                
            }
           
            catch (Exception e)
                
            {
                
                System.err.println("Got an exception! ");
                 
                System.err.println(e.getMessage());
                
                 
            }

                      
    }
     
     private static void preencheT2 (String driver, String url, String user, String password, String query){
     // Preenche a tabela.
     
        
        Connection  conn = null;
    
        Statement st = null;
 
          
        jtProdxGast.setModel(new javax.swing.table.DefaultTableModel( //Aqui adiciona-se as colunas e seus respectivos nomes.
                         new Object [][] { }, new String [] {
        
                         "Código do gasto","Código do registro catalogado", "Descrição do registro catalogado"
                         }
        ));
          
         
        try
               
        {
                
                Class.forName(driver);
                
                conn = DriverManager.getConnection(url, user, password);
       
                // Our SQL SELECT query. 
                
                // If you only need a few columns, specify them by name instead of using "*".
                                                                                                                                            
                // Create the java statement.
                
                st = conn.createStatement();
       
                // Execute the query, and get a java resultset.
               
                ResultSet rs = st.executeQuery(query);
                
                // Iterate through the java resultset.
                
                
                while (rs.next())
                   
                {     
                    
                   
                    javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jtProdxGast.getModel();

                     dtm.addRow(new Object[]{rs.getDouble("g.codigo"),rs.getDouble("cat.codigo"), 
                                rs.getString("cat.descricao") });
                   
                     
                }
             
                st.close();
                
                conn.close();
                
            }
           
            catch (Exception e)
                
            {
                
                System.err.println("Got an exception! ");
                 
                System.err.println(e.getMessage());
                
                 
            }

                      
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
        jpBse = new javax.swing.JPanel();
        jspSaidaGastos = new javax.swing.JScrollPane();
        jtGastos = new javax.swing.JTable();
        jtxtUsuario = new javax.swing.JTextField();
        jspCatxGastos = new javax.swing.JScrollPane();
        jtProdxGast = new javax.swing.JTable();
        jtxtResultado = new javax.swing.JTextField();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escolha quais gastos quer computar a soma.");
        setName("jfRegistroGasto"); // NOI18N

        jspFundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 5, true));

        jpBse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102), 5));

        jspSaidaGastos.setBackground(new java.awt.Color(51, 255, 153));
        jspSaidaGastos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 5, true));
        jspSaidaGastos.setForeground(new java.awt.Color(0, 153, 0));

        jtGastos.setBackground(new java.awt.Color(255, 51, 51));
        jtGastos.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtGastos.setForeground(new java.awt.Color(0, 51, 102));
        jtGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtGastos.setRowHeight(60);
        jtGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtGastosMousePressed(evt);
            }
        });
        jspSaidaGastos.setViewportView(jtGastos);

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setBackground(new java.awt.Color(204, 204, 0));
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(51, 153, 0));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 5, true), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 51))); // NOI18N

        jspCatxGastos.setBackground(new java.awt.Color(51, 255, 153));
        jspCatxGastos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 5, true));
        jspCatxGastos.setForeground(new java.awt.Color(0, 153, 0));

        jtProdxGast.setBackground(new java.awt.Color(255, 51, 51));
        jtProdxGast.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtProdxGast.setForeground(new java.awt.Color(0, 51, 102));
        jtProdxGast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdxGast.setRowHeight(60);
        jspCatxGastos.setViewportView(jtProdxGast);

        jtxtResultado.setEditable(false);
        jtxtResultado.setBackground(new java.awt.Color(255, 51, 51));
        jtxtResultado.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtResultado.setForeground(new java.awt.Color(0, 51, 102));
        jtxtResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 5, true), "Resultado do Somátorio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setBackground(new java.awt.Color(204, 204, 0));
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setForeground(new java.awt.Color(51, 153, 0));
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 5, true), "Data e Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(0, 51, 51))); // NOI18N

        javax.swing.GroupLayout jpBseLayout = new javax.swing.GroupLayout(jpBse);
        jpBse.setLayout(jpBseLayout);
        jpBseLayout.setHorizontalGroup(
            jpBseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspSaidaGastos, javax.swing.GroupLayout.DEFAULT_SIZE, 1752, Short.MAX_VALUE)
                    .addComponent(jspCatxGastos)
                    .addGroup(jpBseLayout.createSequentialGroup()
                        .addGroup(jpBseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 1740, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpBseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBseLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        jpBseLayout.setVerticalGroup(
            jpBseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBseLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jspSaidaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jspCatxGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBseLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(886, Short.MAX_VALUE)))
        );

        jspFundo.setViewportView(jpBse);

        jmbMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 10));
        jmbMenu.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N

        jmMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 5));
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

    private void jmMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMenuMouseClicked
        // Vai para o menu principal e fecha o frame atual.

        MenuPrincipal.main(args,jtxtUsuario.getText());

        BalanceteSelecionado.this.dispose();
        
    }//GEN-LAST:event_jmMenuMouseClicked

    private void jtGastosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGastosMousePressed
        // Faz o cálculo e apresenta.
        
        dtm = (javax.swing.table.DefaultTableModel)jtGastos.getModel();
        
        if( (jtGastos.getSelectedColumn() ==  0) &&  (dtm.getValueAt(jtGastos.getSelectedRow() ,jtGastos.getSelectedColumn()).toString().compareTo("Selecionado") != 0) ) {
            
            resultado+=  Double.parseDouble(dtm.getValueAt(jtGastos.getSelectedRow() ,6).toString());
            
            dtm.setValueAt("Selecionado", jtGastos.getSelectedRow(), 0);
            
        }
        
        else
            
        {
            
             if( (jtGastos.getSelectedColumn() ==  0) &&  (dtm.getValueAt(jtGastos.getSelectedRow() ,jtGastos.getSelectedColumn()).toString().compareTo("Selecionado") == 0) ) {
            
            
                dtm.setValueAt("", jtGastos.getSelectedRow(), 0);
                
                resultado-=  Double.parseDouble(dtm.getValueAt(jtGastos.getSelectedRow() ,6).toString());
            
            }     
                 
        }
        
        jtxtResultado.setText(Double.toString(resultado) );
        
        
    }//GEN-LAST:event_jtGastosMousePressed

    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
     */
    
    
    
    /**
     * @param args the command line arguments
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[],String user ) {
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
            java.util.logging.Logger.getLogger(BalanceteSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalanceteSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalanceteSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalanceteSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BalanceteSelecionado().setVisible(true);
                
               
                jtxtUsuario.setText(user);
                
                tabela();
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JMenu jmMenu;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JPanel jpBse;
    private javax.swing.JScrollPane jspCatxGastos;
    private javax.swing.JScrollPane jspFundo;
    private javax.swing.JScrollPane jspSaidaGastos;
    private static javax.swing.JTable jtGastos;
    private static javax.swing.JTable jtProdxGast;
    private static javax.swing.JTextField jtxtDataHora;
    private javax.swing.JTextField jtxtResultado;
    private static javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
