/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagment;

import java.sql.*;

/**
 *
 * @author hp
 */
public class Dataconfig {
    public static Connection connect() {
        Connection con = null;
        try {
            // Replace these connection details with your own
            String url = "jdbc:mysql://localhost:3306/Hospitaldb";
            String username = "root";
            String password = "";
            // Establish the connection
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Database connection failed: " + ex.getMessage());
        }
        return con;
    }
    
}
