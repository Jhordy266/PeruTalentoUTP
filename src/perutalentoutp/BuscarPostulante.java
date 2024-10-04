/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perutalentoutp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarPostulante {

    // Configuración de la conexión a la base de datos
    private static final String DB_URL = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10735060";
    private static final String DB_USER = "sql10735060";
    private static final String DB_PASSWORD = "7aYJyJh5zI";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre a buscar: ");
        String nombreABuscar = scanner.nextLine();

        buscarPostulanteEnBaseDatos(nombreABuscar);
    }

    public static void buscarPostulanteEnBaseDatos(String nombre) {
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Establecer conexión a la base de datos
            conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Crear la consulta SQL
            String consulta = "SELECT * FROM DB_POSTULANTESVF3F WHERE nombre = ?";
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, nombre);

            // Ejecutar la consulta
            rs = ps.executeQuery();

            // Mostrar los resultados
            if (rs.next()) {
                int ID_COD = rs.getInt("ID_COD");
                String universidad = rs.getString("universidad");
                int Exp_Gral = rs.getInt("Exp_Gral");

                System.out.println("Postulante encontrado:");
                System.out.println("ID_COD: " + ID_COD);
                System.out.println("Nombre: " + nombre);
                System.out.println("universidad: " + universidad);
                System.out.println("Exp_Gral: " + Exp_Gral);
            } else {
                System.out.println("Postulante no encontrado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar conexiones y liberar recursos
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}