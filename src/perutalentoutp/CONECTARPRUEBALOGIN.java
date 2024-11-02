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
public class CONECTARPRUEBALOGIN {
    
static String url= "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10742054";
static String user= "sql10742054";
static String pass= "c2HfX6vUVE";
    

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

public static void main(String[] args) {
        
        Connection con = conectarbase();
    }



}
