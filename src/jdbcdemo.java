import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcdemo {
    public static void main(String[]args) throws Exception{
        String url="jdbc:mysql://localhost:3306/jfsjd00002";
        String username="root";
        String password="Revathi@2002";
        String sql="insert into learner (name,age) value (?,?)";
        Connection con=DriverManager.getConnection(url,username,password);
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"Bhargavi");
        ps.setInt(2,17);
        int n=ps.executeUpdate();
        System.out.println("inserted successfully");
        ps.close();
        con.close();
    }
}
