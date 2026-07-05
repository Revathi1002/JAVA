package doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcdoctor {
    public static void main(String[]args) throws Exception{
        String url="jdbc:mysql://localhost:3306/doctor";
        String username="root";
        String password="Revathi@2002";
        String sql="insert into doctor (Did,Dname,Dspeclaization) value (?,?,?)";
        Connection con=DriverManager.getConnection(url,username,password);
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,3);
        ps.setString(2,"Vandana");
        ps.setString(3,"cardiologist");
        int n=ps.executeUpdate();
        System.out.println("inserted successfully");
        ps.close();
        con.close();
    }
}

