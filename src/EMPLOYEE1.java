import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EMPLOYEE1{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "Revathi@2002";
        String sql = "select * from EMPLOYEE";

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }

}
