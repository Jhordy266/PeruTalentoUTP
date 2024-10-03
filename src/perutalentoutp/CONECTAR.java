/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package perutalentoutp;
import java.sql.*;


/**
 *
 * @author Franco RM
 */
public class CONECTAR {
    
static String url= "jdbc:mysql://localhost:3306/base2";
static String user= "root";
static String pass= "FRANCORM";
    

public static Connection conectarbase(){

Connection con=null;
try
    {
        con=DriverManager.getConnection(url,user,pass);
            System.out.println("BASE DE DATOS CONECTADA SATISFACTORIAMENTE");                 
    }catch (SQLException e)
      {
          e.printStackTrace();
           System.out.println("BASE DE DATOS NO CONECTADA");
      }  
 return con;
 
 
    
}
}