/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.backend;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
/**
 *
 * @author manavhirey
 */
public class DbConnection {

    /**
     * @param args the command line arguments
     */
    private static final String url = "jdbc:mysql://localhost:3306/finalProject";;
    private static Connection conn;
    
    private Connection createConnection() {
        String username = "root";
        String password = "root1234";
        
        Connection conn = null;

        try {
            conn =
               DriverManager.getConnection(url, username, password);
               System.out.println("Database connected!");;

            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public static Connection getConn() {
        return conn;
    }
    
}
