/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doug;


import java.sql.*;

import java.text.*;

import java.awt.event.ActionListener;


import javax.swing.*;



/**
 *
 * @author DouglasFerreirag
 */
public class Funcoes {
    
    private static  Connection conn;
  
    private static PreparedStatement preparedStmt;
    
    public Object getTipoUsuario(String user){ // Retorna qual tipo de usuário o dado usuário é.
        
        String parametro[][] = new String[1][2];
        
        parametro[0][0] = "String";
        
        parametro[0][1] = user;
      
        
        return retornar("SELECT poderes  "
                                + " FROM login"
                                + " WHERE  ( usuario =  ? )", "poderes", parametro);
        
    }
    
    
    public  void setaCodigo(javax.swing.JTextField txtCod, String sql, String retorno){ // Pega o último código (caso inserido) e soma um. Caso a tabela não tiver código inicia do 1.
        
        double cod = 0;

        
        if(retornar(sql,retorno,null) != null) 
            
            cod = (Double)retornar(sql,retorno,null); 
        
        
        cod += 1 ;

        
        txtCod.setText(Double.toString(cod));
        
        
        
    }
    
    
    public  void executeTimer(javax.swing.JTextField txtTemp, String format){ // Executa um timer mostrando data e hora.
        
        Timer timer;
        
        ActionListener action = new ActionListener() {
              
			public void actionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent e) {
                            
				txtTemp.setText( convertData(getDataAtual(), format));
			}
		};
          
		timer = new javax.swing.Timer(1000, action);
                
		timer.start();
        
    }
    
    public static java.sql.Date getDataAtual() { // Pega a data atual através do sistema e retorna.
        
		java.sql.Date data = new java.sql.Date(System.currentTimeMillis());  
               
                return data;
	}
    
    public static String convertData(java.sql.Date data, String formato){ // Converte uma data de java.sql.date para string.
       
          
          if(data != null)
 
             return(new SimpleDateFormat(formato).format(data));
          
          return null;
          
    } 
    
    public  Date converter(String dataStr) { // Converte uma string para date.
        
        
      
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        
        Date data = null;
        
        try {
            
            data = new Date(format.parse(dataStr).getTime());
            
        } catch (ParseException ex) {
            
            System.out.println(ex);
            
        }
        
        return data;
       
    }
    
    public void executa(String query, String[][] parametro, String mensagem){ // Executa comandos de remoção atualização, inserção e update. 
       
            conn = null;
           
            preparedStmt= null;
            
            int k = 1;
           
            try
               
            {
                // Create the mysql database connection.
                
                Class.forName("org.gjt.mm.mysql.Driver");
                
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gastos", "root", "");
                
               
                // Create the mysql  statement.
                
                preparedStmt = conn.prepareStatement("use gastos");
                
                preparedStmt.execute();
                
                preparedStmt = conn.prepareStatement(query);
               
                
               
                    

                    for (int i = 0 ; i < parametro.length; i++){
                  
                        
                                            switch(parametro[i][0]) {
                            
                            
                                                    case "String": {
                                
                                                            preparedStmt.setString(k, parametro[i][1]);
                              
                                                            k+=1;
                                
                                                            break;
                                        
                                                    }
                            
                                                    case "Date": {
                                                         
                                
                                                            preparedStmt.setDate(k, converter(parametro[i][1] )); 
                               
                                                            k+=1; 
                                                       
                                
                                                            break;
                                
                                                    }
                            
                                                    default :{
                                
                                                            preparedStmt.setDouble(k, Double.parseDouble(parametro[i][1]) );
                               
                                                            k+=1;
                                
                                                            break;
                                
                                                    }
                            
                            
                                            }
                        
                                    }
                    
          
 
                // Execute the preparedstatement.
                
                preparedStmt.execute();
                
                JOptionPane.showMessageDialog(null,mensagem, "System Message", JOptionPane.INFORMATION_MESSAGE);
       
                conn.close();
                
            }
           
            catch (Exception e)
                
            {
                    System.err.println("Got an exception! ");
                   
                    System.err.println(e.getMessage());
                    
            }
        
    } 
    
   public void cria(String query, String url, String mensagem){
        //Executa a query para criação do banco de dados gastos. 
        
           
        conn = null;
        
        Statement stmt = null;
        
        try {
            
                    conn = DriverManager.getConnection(url, "root", "");
                   
                    stmt = conn.createStatement();
                   
                    stmt.executeUpdate(query);
                   
                    stmt.close();
                    
                    conn.close();
                   
                    JOptionPane.showMessageDialog(null,mensagem, "System Message", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                   
                    e.printStackTrace();
                  
            }
       
        
    }  
    
   public  Object retornar (String consulta, String retorno, String[][] parametro){//Usado para retornar algum dado do banco de dados.
       
        
        Object resultado = null;
       
       conn = null;
       
       PreparedStatement stmt = null;
       
       
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gastos", "root", "");
            
            stmt = this.conn.prepareStatement(consulta);

            if(parametro != null) {
           
                    int k = 1;

                    for (int i = 0 ; i < parametro.length; i++){
                           
                            for (int j = 0; j < 2; j++){
                    
                                    if(j == 0) {
                        
                                            switch(parametro[i][j]) {
                            
                            
                                                    case "String": {
                                
                                                            stmt.setString(k, parametro[i][1]);
                              
                                                            k+=1;
                                
                                                            break;
                                        
                                                    }
                          
                                                    case "Date": {
                                
                                                            stmt.setDate(k, converter(parametro[i][1]) );
                               
                                                            k+=1;
                                
                                                            break;
                                
                                                    }
                            
                                                    default :{
                                
                                                            stmt.setDouble(k, Double.parseDouble(parametro[i][1]) );
                               
                                                            k+=1;
                                
                                                            break;
                                
                                                    }
                            
                            
                                            }
                        
                                    }
                    
                        
                            }    
                       
               
                    }
             
            }
            
            ResultSet rs = stmt.executeQuery();

            rs.next();
            
           
            resultado = rs.getObject(retorno);
            
           
            rs.close();
            
            stmt.close();
        
            conn.close();
            
        } catch (SQLException ex) {
         
            return resultado;
           
        }
        
	

          return resultado;
        
    }
    
    public double round(double value) { // Arredonda um dado número e retorna o resultado.
       
        double number = value * 100;
        
        number = Math.round(number);
        
        number = number / 100;
  
        return number;

      
   }

     
    
}
