package patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcpatient {
    public static void main(String[]args) throws Exception{
        String url="jdbc:mysql://localhost:3306/doctor";
        String username="root";
        String password="Revathi@2002";
        String sql="insert into patient (Pid,Pname,Pdisease) values (?,?,?)";
        Connection con=DriverManager.getConnection(url,username,password);
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,5);
        ps.setString(2,"Lakshmi");
        ps.setString(3,"fever");
        int n=ps.executeUpdate();
        System.out.println("inserted successfully");
        ps.close();
        con.close();
    }
}