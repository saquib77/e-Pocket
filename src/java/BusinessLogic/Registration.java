package BusinessLogic;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import model.JavaPOJO;
import java.util.Random;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Registration implements Business {
    @Override
    public String businessLogic(HttpServletRequest request){
        String fname=request.getParameter("firstname");
        String lname=request.getParameter("lastname");
        String email=request.getParameter("email");
        String phnum=request.getParameter("phnum");
        String pwd=request.getParameter("pass");
        String city_name=request.getParameter("city_name");
        String state_name=request.getParameter("state_name");
        String country_name=request.getParameter("country_name");
        String gender=request.getParameter("gender");
        String que=request.getParameter("que");
        String ans=request.getParameter("ans");
        try{
            JavaPOJO JP = new JavaPOJO();
            Statement uidst = JP.createConnection();
            String fetchedId = "select MAX(uid) from user_master";
            ResultSet rsuid = JP.selectData(uidst, fetchedId);
            int uid=0;
            if(rsuid.next()){
                uid = rsuid.getInt(1);
            }
            uid = uid+1;
            Statement stmt = JP.createConnection();
            String fetchedId1 = "select MAX(country_code) from user_master";
            ResultSet rsuid1 = JP.selectData(stmt, fetchedId1);
            int code=0;
            if(rsuid1.next()){
                uid = rsuid1.getInt(1);
            }
            code = code+1;
            
            Statement fstmt = JP.createConnection();
            String qry1 = "insert into user_master(uid,firstname,lastname,phone_num,city_id,email,gender,que,ans)values("+uid+","+fname+","+lname+","+phnum+","+code+","+email+","+gender+","+que+","+ans+")";
            if(JP.insertData(fstmt, qry1)){
                
            }
        }catch(ClassNotFoundException | SQLException e){
            return e+"Exception";
        }
        return null;
    }
}

