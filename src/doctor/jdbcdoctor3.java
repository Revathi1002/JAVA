package doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcdoctor3 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/doctor";
        String username = "root";
        String password = "Revathi@2002";
        String sql = "delete from doctor where Did=?";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 2);
        int n = ps.executeUpdate();
        System.out.println(n + "doctor data deleted successfully");
    }
}
