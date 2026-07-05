package patient;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcpatient1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/doctor";
        String username = "root";
        String password = "Revathi@2002";
        String sql = "select * from patient";

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }

}
