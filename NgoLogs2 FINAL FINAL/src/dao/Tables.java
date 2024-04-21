/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author srishtiparulekar
 */
public class Tables {
    public static void main(String[] args) {
        try{
            
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            //st.executeUpdate("CREATE TABLE person(userID int PRIMARY KEY AUTO_INCREMENT,fname varchar(15) NOT NULL,lname varchar(15) NOT NULL,email varchar(50) NOT NULL,phono varchar(40),dob varchar(30), address varchar(40) NOT NULL,username varchar(15) NOT NULL,userpassword varchar(15) NOT NULL,userrole varchar(10) DEFAULT 'User');");
//            st.executeUpdate("INSERT INTO person(fname, lname, email, phono, dob, address, username, userpassword, userrole) VALUES ('Srishti','Parulekar','srishtiparulekar@gmail.com','90990123','17-04-2004','Thane','root','@Lofi','Admin')");
//            st.executeUpdate("INSERT INTO person(fname, lname, email, phono, dob, address, username, userpassword, userrole) VALUES ('Tanvi','Sontakke','tanvi@gmail.com','904234567','24-03-2004','Nagpur','tanvivi','pass123','Admin')");
//            st.executeUpdate("INSERT INTO person(fname, lname, email, phono, dob, address, username, userpassword, userrole) VALUES ('Soumili','Biswas','soumili@gmail.com','423415654','31-07-2004','Kolkata','soumilili','pass789','Admin')");

            JOptionPane.showMessageDialog(null,"Table Created Successfully.");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
}