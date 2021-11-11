/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author dhyey
 */

import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon(){
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qems","root","13102002");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
