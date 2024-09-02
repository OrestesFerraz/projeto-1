package br.com.projeto_1.dao;
import java.sql.*;
public class ConexaoDAO {
    public static Connection con = null;
      
    public ConexaoDAO(){
        
    }
    
       public static void ConnectDB() { 
            try{
                String dsn = "projetolpa_01";
                String user = "root";
                String senha = "";
                
          
                DriverManager.registerDriver(new org.postgresql.Driver());
                
                String url = "jdbc:mysql://localhost:3306/" + dsn;
                
                con = DriverManager.getConnection(url, user, senha);
                
                con.setAutoCommit(false);
                
                if(con == null){
                    System.out.println("erro ao abrir o banco");
                }
            }
           catch (Exception e){
               
               System.out.println("Problema ao abrir a base de dados!"+
                       e.getMessage());
           }
    }
       
       public static void CloseDB() {
           
           try{
               con.close();
           }
           catch (Exception e){
               
               System.out.println("Problema ao fechar a base de dados!"+
                       e.getMessage());
           }           
           }  
}//fecha classe;
