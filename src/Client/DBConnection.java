/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 2105247816
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Successful");
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("Connection Fail" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/group_db";
        try {
            DBConnection = (Connection) DriverManager.getConnection(url, "root", "");
            System.out.println("Database Connected");
        }
        catch (SQLException se) {
            System.out.println("No Database " + se);
        }
        return DBConnection;
    }

public static Connection getConnection(){

    Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/group_db", "root", "");
                 
    }  catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
    return con;
}
}
