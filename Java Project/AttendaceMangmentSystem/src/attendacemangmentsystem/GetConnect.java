/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendacemangmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class GetConnect {
      private static Connection con = null;
      public static Connection getConnection(){
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancems", "root", "root");
             //    System.out.println("Coonection successful");
         }catch(Exception e){
             e.printStackTrace();
         }
          return con;
       }
}
