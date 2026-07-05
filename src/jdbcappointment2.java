package appointment;

import java.sql.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcappointment2 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/doctor";
        String username = "root";
        String password = "Revathi@2002";
        String sql = "update appointment set Adate=?,Pid=?,Did=? where Aid=?";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "02-06-2026");
        ps.setInt(2, 1);
        ps.setInt(3, 1);
        ps.setInt(4,2);
        int n = ps.executeUpdate();
        System.out.println(n + "appointment data updated successfully");
    }
}

