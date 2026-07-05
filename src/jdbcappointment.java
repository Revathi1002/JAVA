package appointment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcappointment {
    public static void main(String[]args) throws Exception{
        String url="jdbc:mysql://localhost:3306/doctor";
        String username="root";
        String password="Revathi@2002";
        String sql="insert into appointment (Aid,Adate,Did,Pid) values (?,?,?,?)";
        Connection con=DriverManager.getConnection(url,username,password);
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,3);
        ps.setString(2,"2-06-2026");
        ps.setInt(3,1);
        ps.setInt(4,1);
        int n=ps.executeUpdate();
        System.out.println("inserted successfully");
        ps.close();
        con.close();
    }
}
