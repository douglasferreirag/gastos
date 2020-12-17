/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doug;


import java.sql.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author DOUGLASFERREIRAG
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Aprresentacao
     */
    
    private ArrayList<String> tablesName = new ArrayList<String>();
     
    private static Funcoes func = new Funcoes() ;
    
    private String[] args;
   
    
    private void listTables(){ //Lista tabelas se existirem.
        
        Connection con = null;
       
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/gastos","root",""); 
            
            DatabaseMetaData dbmd = con.getMetaData();
            
            String[] types = {"TABLE"};
            
            ResultSet rs = dbmd.getTables(null, null, "%", types);
            
            while (rs.next()) {
              
                tablesName.add(rs.getString("TABLE_NAME"));
                 
                 
            }
            
            con.close();
             
        } 
        
            catch (SQLException e) {
                
            e.printStackTrace();
            
        }
 
        
    } 
    
    private boolean testeConexao(){ //Testa conexão do banco.
        
        Connection con = null;
       
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/gastos","root",""); 
            
            con.close();
            
            return true;
             
        } 
        
            catch (SQLException e) {
                
            e.printStackTrace();
           
            
        }
        
        return false;
 
        
    } 
    
    private boolean eIgual(String str, ArrayList nomes){ // Aqui vou ver se o nome da tabela/database está na lista de nomes.
         
       
        for(int i = 0; i < nomes.size(); i++){
            
            
            if (str.compareToIgnoreCase(nomes.get(i).toString()) == 0)
                
                return true;
            
        }
            
         
         
        return false;
         
    }
 
   private void tratarTabelas(){ // Trata da verificação de existência de tabelas.
       
          
            listTables();
            
            if(tablesName.size() == 0)
                
                JOptionPane.showMessageDialog(null, " Banco de dados gastos não possui nenhuma tabela. Criando as tabelas, aguarde ....", "System Message", JOptionPane.INFORMATION_MESSAGE); 
            

            if(eIgual("catalogo",tablesName) == false) 
              
                func.cria(  "create table catalogo " +
                                    "(codigo double not null auto_increment, " +       
                                    "descricao varchar(255) not null, " + 
                                    " valorUnitario double not null, " + 
                                    " codigoFornecedor double not null references fornecedor(codigo),"+
                                    " data date not null ,"+
                                    " primary key ( codigo ))"
                ,"jdbc:mysql://localhost/gastos", "Tabela catalogo criada com sucesso.");
          
            if (eIgual("pessoa",tablesName) == false) 
              
                func.cria(  "create table pessoa " +
                                    "(codigo double not null auto_increment  , " +        
                                    " nomeCompleto varchar(255) not null, " +             
                                    " primary key (codigo))"
                ,"jdbc:mysql://localhost/gastos","Tabela pessoa criada com sucesso.");
            
            
            if(eIgual("login",tablesName) == false) 
              
                func.cria(  "create table login " +
                                        "(codigoPessoa double not null references pessoa(codigo) , " +        
                                        " usuario varchar(255) not null, " +        
                                        " senha varchar(255) not null, " + 
                                        " poderes varchar(20) not null, " +        
                                        " primary key ( codigoPessoa, usuario, senha, palavraSecreta))" 
                    ,"jdbc:mysql://localhost/gastos", "Tabela login criada com sucesso.");
          
            
            if (eIgual("entradaCapital",tablesName) == false)  
              
                func.cria(  "create table entradaCapital " +
                                    "(" +        
                                        " codigoPessoa double not null references pessoa(codigo) ," + 
                                        " mes double not null," +        
                                        " ano double not null  , " +       
                                        " valor double not null  , " +            
                                        " primary key (codigoPessoa, mes,ano))"
                ,"jdbc:mysql://localhost/gastos", "Tabela entradaCapital criada com sucesso.");
          
            if (eIgual("meta",tablesName) == false)
              
                func.cria(  "create table meta " +
                                    "(codigo double not null auto_increment  , " +        
                                        " mes double not null," +        
                                        " ano double not null  , " +       
                                        " valor double not null  , " +  
                                        " codigoPessoa double not null references pessoa(codigo) ," +        
                                        " primary key (codigo))"
                ,"jdbc:mysql://localhost/gastos", "Tabela meta criada com sucesso.");
          
            if (eIgual("divida",tablesName) == false)
              
                func.cria(  "create table divida " +
                                    "(codigo double not null auto_increment  , " +        
                                        " codigoPessoa double not null references pessoa(codigo) ," +               
                                        " valor double not null , " +   
                                        " dataVence date not null ," +  
                                        " descricao varchar(255) not null , "  +      
                                        " primary key (codigo,codigoPessoa))"
                ,"jdbc:mysql://localhost/gastos", "Tabela divida criada com sucesso.");
          
          
            if (eIgual("gasto",tablesName) == false)  
              
                func.cria(  "create table gasto " +
                                    "(codigo double not null auto_increment  , " +        
                                        " codigoPessoa double not null references pessoa(codigo) ," + 
                                        " data date not null  , " +         
                                        " descricao varchar(255) not null  , " +     
                                        " desconto double not null , " +  
                                        " valor double not null, " +           
                                        " primary key (codigo,codigoPessoa))"
                ,"jdbc:mysql://localhost/gastos", "Tabela gasto criada com sucesso.");
            
            
            if (eIgual("item",tablesName) == false)   
             
                func.cria(  "create table item " +
                                    "(codigoGasto double not null  references gasto(codigo) , " +        
                                        " codigoCatalogo double not null references catalogo(codigo) , " + 
                                        " quantidade double not null , " +      
                                        " total double not null  , " +       
                                        " primary key (codigoGasto,codigoCatalogo))"
                ,"jdbc:mysql://localhost/gastos", "Tabela item criada com sucesso.");
           
            
             if (eIgual("fornecedor",tablesName) == false)
                
                func.cria(  "create table fornecedor " +
                                    "(codigo double not null  auto_increment , " +        
                                        " descricao varchar(255) not null , " + 
                                        " local varchar(255) not null , " +      
                                        " primary key (codigo))"
                ,"jdbc:mysql://localhost/gastos", "Tabela fornecedores criada com sucesso.");
            
            
            JOptionPane.showMessageDialog(null, " Processo de tratamento do banco de dados gastos completado com sucesso. Passando para a tela de login, aguarde ....", "System Message", JOptionPane.INFORMATION_MESSAGE); 
       
             
    } 
    

    
    public Inicio() {
        
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        new Funcoes().executeTimer(jtxtDataHora, "dd/MM/yyyy hh:mm:ss");
        
        JOptionPane.showMessageDialog(null, "Processo de tratamento do banco de dados gastos ..... ", "System Message", JOptionPane.INFORMATION_MESSAGE);

        
        if(testeConexao() == false) 
            
            func.cria("create database gastos","jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull", "Banco de dados gastos criado com sucesso.");
        
        
        
        System.out.println();
       
        System.out.println();
                 
        System.out.println();
        
        System.out.println();
        
        
          
        tratarTabelas();
        
        
          
        System.out.println();
        
        System.out.println();
           
        System.out.println();
        
        System.out.println();
        
        /*
            
        if(func.getDataAtual().before(func.converter("17-12-2018")) == false)  {
        
                    JOptionPane.showMessageDialog(null, " Período expirado. ", "System Message", JOptionPane.INFORMATION_MESSAGE);
                    
                 
                    System.exit(0);
        
        }
        
       */
        
        
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
        jlBoasVindas = new javax.swing.JLabel();
        jlObjetivo = new javax.swing.JLabel();
        jlObjetivo1 = new javax.swing.JLabel();
        jtxtDataHora = new javax.swing.JTextField();
        jmbMenu = new javax.swing.JMenuBar();
        jmIniciar = new javax.swing.JMenu();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de apresentação");
        setName("frmApresentacao"); // NOI18N

        jspFundo.setBackground(new java.awt.Color(255, 255, 51));
        jspFundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 12, true));
        jspFundo.setForeground(new java.awt.Color(255, 51, 0));

        jlBoasVindas.setBackground(new java.awt.Color(102, 0, 153));
        jlBoasVindas.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jlBoasVindas.setForeground(new java.awt.Color(0, 153, 153));
        jlBoasVindas.setText("Bem vindo(a) ao programa  doug");

        jlObjetivo.setBackground(new java.awt.Color(102, 0, 153));
        jlObjetivo.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jlObjetivo.setForeground(new java.awt.Color(0, 153, 153));
        jlObjetivo.setText("Controle de gastos caseiro");

        jlObjetivo1.setBackground(new java.awt.Color(102, 0, 153));
        jlObjetivo1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jlObjetivo1.setForeground(new java.awt.Color(0, 153, 153));
        jlObjetivo1.setText("Controle de dívidas caseira");

        jtxtDataHora.setEditable(false);
        jtxtDataHora.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jtxtDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0), 5), "Data e Hora atual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 48))); // NOI18N

        javax.swing.GroupLayout jpBaseLayout = new javax.swing.GroupLayout(jpBase);
        jpBase.setLayout(jpBaseLayout);
        jpBaseLayout.setHorizontalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jlBoasVindas))
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlObjetivo1)
                            .addComponent(jlObjetivo)))
                    .addGroup(jpBaseLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jpBaseLayout.setVerticalGroup(
            jpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlBoasVindas)
                .addGap(68, 68, 68)
                .addComponent(jlObjetivo)
                .addGap(64, 64, 64)
                .addComponent(jlObjetivo1)
                .addGap(199, 199, 199)
                .addComponent(jtxtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jspFundo.setViewportView(jpBase);

        jmbMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 10, true));

        jmIniciar.setBackground(new java.awt.Color(255, 0, 51));
        jmIniciar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 5, true));
        jmIniciar.setForeground(new java.awt.Color(0, 102, 0));
        jmIniciar.setText("Iniciar");
        jmIniciar.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmIniciarMouseClicked(evt);
            }
        });
        jmbMenu.add(jmIniciar);

        jmSair.setBackground(new java.awt.Color(255, 0, 51));
        jmSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 5, true));
        jmSair.setForeground(new java.awt.Color(0, 102, 0));
        jmSair.setText("Sair");
        jmSair.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jmbMenu.add(jmSair);

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

    private void jmIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmIniciarMouseClicked
           // Vai para a tela de Login.
        
        Login.main(args);
        
        this.dispose();
        
        
    }//GEN-LAST:event_jmIniciarMouseClicked

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        // Sai da aplicação.
        
        System.exit(0);
        
    }//GEN-LAST:event_jmSairMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlBoasVindas;
    private javax.swing.JLabel jlObjetivo;
    private javax.swing.JLabel jlObjetivo1;
    private javax.swing.JMenu jmIniciar;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JPanel jpBase;
    private javax.swing.JScrollPane jspFundo;
    private javax.swing.JTextField jtxtDataHora;
    // End of variables declaration//GEN-END:variables
}
