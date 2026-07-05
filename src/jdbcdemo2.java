import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

    public class jdbcdemo2 {
        public static void main(String[] args) throws Exception {
            String url = "jdbc:mysql://localhost:3306/jfsjd00002";
            String username = "root";
            String password = "Revathi@2002";
            String sql = "update learner set name=?,age=? where id=?";
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Keerthi");
            ps.setInt(2, 14);
            ps.setInt(3, 5);
            int n = ps.executeUpdate();
            System.out.println(n + "learners data updated successfully");
        }
    }
