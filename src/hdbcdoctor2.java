
package doctor;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class hdbcdoctor2 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/doctor";
        String username = "root";
        String password = "Revathi@2002";
        String sql = "update doctor set Dname=?,Dspeclaization=? where Did=?";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "Keerthi");
        ps.setString(2, "neurologist");
        ps.setInt(3, 1);
        int n = ps.executeUpdate();
        System.out.println(n + "doctor data updated successfully");
    }
}

