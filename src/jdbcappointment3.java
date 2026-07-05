package appointment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcappointment3 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/doctor";
        String username = "root";
        String password = "Revathi@2002";
        String sql = "delete from appointment where Aid=?";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 3);
        int n = ps.executeUpdate();
        System.out.println(n + "appointment data deleted successfully");
    }
}
