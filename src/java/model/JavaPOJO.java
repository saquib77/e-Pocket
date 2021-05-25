package model;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaPOJO {
    String url = "jdbc:mysql://localhost:3306/ePocketDB";
    String uname = "root";
    String pass = "Saquib@77";
    public Statement createConnection() throws ClassNotFoundException,SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Statement st = DriverManager.getConnection(url, uname, pass).createStatement();
            return st;
    }
    public boolean insertData(Statement st,String qry) throws SQLException{
            return st.execute(qry);
    }
    public ResultSet selectData(Statement st,String qry) throws SQLException{
            return st.executeQuery(qry);
    }
    public int updateData(Statement st,String qry) throws SQLException{
            return st.executeUpdate(qry);
    }
}
