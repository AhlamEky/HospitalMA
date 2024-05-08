/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hospitalmanagment;
import javax.swing.*;

public class HospitalManagment {
//hello bonjour
     public static void main(String[] args) {
        // Create and display the login interface
        SwingUtilities.invokeLater(() -> {
           login login = new login();
           login.setVisible(true);
        });
        }
     }
