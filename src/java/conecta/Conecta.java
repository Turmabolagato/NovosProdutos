/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jojo
 */
package conecta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conecta {
   final private String USER="root";
   final private String PASSWORD="";
   final private String URL="jdbc:mysql://localhost:3306/atividade";
   private Connection con;
   private Statement st;
   private ResultSet rs;
   
   public void conectar(){
       try {
           con=DriverManager.getConnection(URL, USER, PASSWORD);
           st=con.createStatement();
           System.out.println("Sucesso!");
       } catch (SQLException e) {
           System.out.println("Falha ao conectar!");
       }
 
     }
   
   public void desconectar(){
       try {
           st.close();
           con.close();
       } catch (SQLException e) {
           System.out.println("Falha ao desconectar");
       }
   }

 public void inserir(String nome, float preco) {
        try {
            st.executeUpdate("INSERT INTO produto(nome,preco) VALUES (' " +nome+"  ',' "+preco+")");
        } catch (SQLException e) {
            System.out.println("Falha ao inserir \n" + e.getMessage());
        }

    }
}