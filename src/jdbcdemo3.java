
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcdemo3 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/jfsjd00002";
        String username = "root";
        String password = "Revathi@2002";
        String sql = "delete from learner where id=?";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 3);
        int n = ps.executeUpdate();
        System.out.println(n + "learners data deleted successfully");
    }
}
