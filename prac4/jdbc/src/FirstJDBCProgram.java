import java.sql.*;
public class FirstJDBCProgram{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/neeraj","root","Neeraj@20");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student1");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));

	PreparedStatement stmt1 = con.prepareStatement("insert into student1 values (?,?)");
	stmt1.setInt(1,4);
	stmt1.setString(2,"mahesh");
	int i = stmt1.executeUpdate();
	System.out.println(i + "Records inserted..");

	while(rs.next())
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));

            con.close();
        }catch(Exception e){
            System.out.println(e);}
    }
}