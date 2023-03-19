import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJd {
public static void main(String[] args) throws Exception{ 
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:Mysql://localhost:3306/sam","root","root");
     Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select *from customer");
while(rs.next()) {
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
}

PreparedStatement ps = con.prepareStatement("insert into customer values (?,?,?,?)");
		ps.setInt(1,6);
		ps.setString(2,"Amol"); 
		ps.setString(3,"Kolkata");
		ps.setInt(4,16);
		int c=ps.executeUpdate();
		System.out.println(c+" record inserted"); 
PreparedStatement pu = con.prepareStatement("update customer set cname=? where cid=?");
		pu.setInt(1,6);
		pu.setString(2,"Arjun");
		int d=pu.executeUpdate();
		System.out.println(d+" record updated");
PreparedStatement pd = con.prepareStatement("delete from customer where cid=?");
		pd.setInt(1,2);
		int e=pd.executeUpdate();
		System.out.println(e+" record deleted");
		con.close();
		}
}
