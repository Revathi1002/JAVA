import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public  class EMPLOYEE {
    public static void main(String[]args) throws Exception {
        String url="jdbc:mysql://localhost:3306/demo";
        String username="root";
        String password="Revathi@2002";
        String sql="insert into EMPLOYEE (ename,dept,salary) values (?,?,?)";
        Connection con= DriverManager.getConnection(url,username,password);
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"Lakshmi");
        ps.setString(2,"CS");
        ps.setDouble(3,45000);
        int n=ps.executeUpdate();
        System.out.println("inserted successfully");
        ps.close();
        con.close();
    }
}

