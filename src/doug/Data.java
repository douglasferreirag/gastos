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

import java.sql.Date;

import java.util.Calendar;

import java.util.GregorianCalendar;

import javax.swing.JTextField;

import javax.swing.JOptionPane;

public class Data extends javax.swing.JFrame {

    
    /**
     * Creates new form Montagemdata
     */
    public Data() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        this.setTitle(titulo);
        
        new Funcoes().executeTimer(jtxtDataHora, "dd/MM/yyyy hh:mm:ss");
        
    }

    
    private static javax.swing.table.DefaultTableModel dtm ;
    
    private static JTextField txtRetorno;
    
    private int i = 1;
    
    private int j = 1;
    
    private static Calendar c;
    
    private static int temp;
    
    private static String titulo;
    
    
   
    
    public static int getultimodiadomes(java.sql.Date d){ // Pega o último dia do mês. 
        
        Calendar cal = GregorianCalendar.getInstance();
        
        cal.setTime( d );
         
        return cal.getActualMaximum( Calendar.DAY_OF_MONTH );
        

        
    }
    
    public static int getmes(java.sql.Date d){ // Pega o mês atual.
        
        c = GregorianCalendar.getInstance();
        
        c.setTime( d );
         
        return (c.get(Calendar.MONDAY)+1);
        

        
    }
    
    public static int getano(java.sql.Date d){ // Pega o ano atual.
        
        Calendar cal = GregorianCalendar.getInstance();
        
        cal.setTime( d );
         
        return cal.get(Calendar.YEAR);
        

        
    }
    
    public static int getdia(java.sql.Date d){ // Pega o dia atual.
        
        Calendar cal = GregorianCalendar.getInstance();
        
        cal.setTime( d );
         
        return cal.get( Calendar.DAY_OF_MONTH );
        
    }
  
    
    private static int getdiasemana(int j , int m, int a){ // Verifica se um dado dia caí segunda,terça, quarta,quinta, sexta , sábado ou domingo.
        
               
                   Calendar data = Calendar.getInstance();
          
                   data.set(a, m - 1, j);
                   
              
                   if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                   
                            return 1;
                   
                   if (data.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)
                   
                            return 2;
                   
                   if (data.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY)
                   
                            return 3;
                   
                   if (data.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY)
                   
                            return 4;
                   
                   if (data.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY)
                   
                            return 5;
                   
                    if (data.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
              
                            return 6;
                    
                     if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                         
                            return 7;
                     
                    data.clear();
              
                    return -1;
        
    }
     
  
    private static void preenche (Date d){
        
        // Preenche a tabela.
        
        dtm =  (javax.swing.table.DefaultTableModel)jtSemanas.getModel();
        
       
        jtxtMes.setText(Integer.toString(getmes(d)));
           
        jtxtAno.setText(Integer.toString(getano(d)));
        
        
        int b = 0;
        
          
        for(int k = 1;  k <= getultimodiadomes(d); k++   )
          
        {
            
            int diasemana = getdiasemana(k,getmes(d), getano(d)) - 1;
            
            
            dtm.setValueAt((Object) k, b, diasemana);
            
          
            if(diasemana == 6) {
                
                dtm.setValueAt((Object) k, b, diasemana);
                
                b += 1;
                
            }
                
                         
               
        } 
          
        
    }
    
    private static void limpar(){ // Limpa a tabela.
        
        dtm =  (javax.swing.table.DefaultTableModel)jtSemanas.getModel();
         
        for(int i = 0; i < dtm.getRowCount(); i++){
             
                for(int j = 0; j< dtm.getColumnCount(); j++)
                   
                    dtm.setValueAt("", i, j);
             
        }
         
         
        
    }
    
    private static java.sql.Date convertFromJAVADateToSQLDate( // Converter de java.util.Date para java.sql.Date.
            java.util.Date javaDate) {
        
        java.sql.Date sqlDate = null;
        
        if (javaDate != null) {
         
            sqlDate = new Date(javaDate.getTime());
        
        }
        
        return sqlDate;
    
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
        jspResultado = new javax.swing.JScrollPane();
        jtSemanas = new javax.swing.JTable();
        jtxtMes = new javax.swing.JTextField();
        jtxtAno = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmMenuAnterior = new javax.swing.JMenu();
        jmMenuPosterior = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmMontaData"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 9, true));

        jspResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 9, true));

        jtSemanas.setBackground(new java.awt.Color(255, 0, 51));
        jtSemanas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jtSemanas.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtSemanas.setForeground(new java.awt.Color(204, 255, 0));
        jtSemanas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
            }
        ));
        jtSemanas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtSemanas.setColumnSelectionAllowed(true);
        jtSemanas.setName(""); // NOI18N
        jtSemanas.setRowHeight(60);
        jtSemanas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtSemanasMousePressed(evt);
            }
        });
        jspResultado.setViewportView(jtSemanas);
        jtSemanas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jtxtMes.setEditable(false);
        jtxtMes.setBackground(new java.awt.Color(255, 0, 51));
        jtxtMes.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtMes.setForeground(new java.awt.Color(204, 255, 0));
        jtxtMes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 5), "Mês", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(102, 102, 0))); // NOI18N
        jtxtMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMesMouseClicked(evt);
            }
        });

        jtxtAno.setEditable(false);
        jtxtAno.setBackground(new java.awt.Color(255, 0, 51));
        jtxtAno.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtAno.setForeground(new java.awt.Color(204, 255, 0));
        jtxtAno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 5), "Ano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48), new java.awt.Color(102, 102, 0))); // NOI18N
        jtxtAno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtAnoMouseClicked(evt);
            }
        });

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 10), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 36))); // NOI18N

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 10), "Data e Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 36))); // NOI18N

        javax.swing.GroupLayout jpBaseLayout = new javax.swing.GroupLayout(jpBase);
        jpBase.setLayout(jpBaseLayout);
        jpBaseLayout.setHorizontalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jspResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jpBaseLayout.setVerticalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jspFundo.setViewportView(jpBase);

        jmbMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        jmbMenu.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N

        jmMenuAnterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jmMenuAnterior.setText("Mês Anterior");
        jmMenuAnterior.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmMenuAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMenuAnteriorMouseClicked(evt);
            }
        });
        jmbMenu.add(jmMenuAnterior);

        jmMenuPosterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jmMenuPosterior.setText("Mês Seguinte");
        jmMenuPosterior.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmMenuPosterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMenuPosteriorMouseClicked(evt);
            }
        });
        jmbMenu.add(jmMenuPosterior);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmMenuAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMenuAnteriorMouseClicked
        // Abre calendário com mês anterior.

      
        limpar();
       
        c = Calendar.getInstance();
		
        c.setTime(Funcoes.getDataAtual());
                
	c.add(Calendar.MONTH,-i);
        
        java.util.Date dataUtil = new java.util.Date();
        
        dataUtil = c.getTime();
        
        java.sql.Date dataSql = convertFromJAVADateToSQLDate(dataUtil);
        
        jtxtMes.setText(Integer.toString(getmes(dataSql)));

        jtxtAno.setText(Integer.toString((getmes(dataSql))));
        
        preenche(dataSql);
        
        i++;

    }//GEN-LAST:event_jmMenuAnteriorMouseClicked

    private void jmMenuPosteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMenuPosteriorMouseClicked
        //Abre calendário com mês posterior.

        limpar();
       
        c = Calendar.getInstance();
		
        c.setTime(Funcoes.getDataAtual());
                
	c.add(Calendar.MONTH,j);
        
        java.util.Date dataUtil = new java.util.Date();
        
        dataUtil = c.getTime();
        
        java.sql.Date dataSql = convertFromJAVADateToSQLDate(dataUtil);
        
        jtxtMes.setText(Integer.toString(getmes(dataSql)));
        
        jtxtAno.setText(Integer.toString(getmes(dataSql)));
        
        preenche(dataSql);
        
        j++;
        
    }//GEN-LAST:event_jmMenuPosteriorMouseClicked

    private void jtxtMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMesMouseClicked
        //Retorna o mês quando clicada e possivelmente a última data do mês.
        
        if(temp == 1) 
            
            txtRetorno.setText(jtxtMes.getText());
       
       
            
        dispose();
        
    }//GEN-LAST:event_jtxtMesMouseClicked

    private void jtxtAnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtAnoMouseClicked
        //Retorna o ano quando clicada.
        
        if(temp == 2)
            
            txtRetorno.setText(jtxtAno.getText());
      
        dispose();
        
    }//GEN-LAST:event_jtxtAnoMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Troca o título do frame
        
        this.setTitle(titulo);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jtSemanasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSemanasMousePressed
         if(temp > 2) {
            
        
            dtm =  (javax.swing.table.DefaultTableModel)jtSemanas.getModel();

            String dia = dtm.getValueAt(jtSemanas.getSelectedRow(),jtSemanas.getSelectedColumn()).toString();

            String data = dia + "-" + jtxtMes.getText() + "-" + jtxtAno.getText();
    
            txtRetorno.setText(data);
 
            dispose();
            
        }
         
    }//GEN-LAST:event_jtSemanasMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], javax.swing.JTextField txtReturn, int temporario, String caption, String user) {
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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Data().setVisible(true);
                
                JOptionPane.showMessageDialog(null,"Observação. Para captura de data clique na tabela e para capturar o dia ou o mês só clicar nas caixas de texto correspondentes.", "System Message", JOptionPane.INFORMATION_MESSAGE); 
                
                preenche(Funcoes.getDataAtual()); 
                
                txtRetorno = txtReturn;
                
                temp = temporario;
                
                jtxtUsuario.setText(user);
                
                titulo = caption;
                
                
               
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmMenuAnterior;
    private javax.swing.JMenu jmMenuPosterior;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JPanel jpBase;
    private javax.swing.JScrollPane jspFundo;
    private javax.swing.JScrollPane jspResultado;
    private static javax.swing.JTable jtSemanas;
    private static javax.swing.JTextField jtxtAno;
    private static javax.swing.JTextField jtxtDataHora;
    private static javax.swing.JTextField jtxtMes;
    private static javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
