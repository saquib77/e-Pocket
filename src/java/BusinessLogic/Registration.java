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
    public String businessLogic(HttpServletRequest request){
        String fname=request.getParameter("firstname");
        String lname=request.getParameter("lastname");
        String email=request.getParameter("email");
        String phnum=request.getParameter("phnum");
        String pwd=request.getParameter("password");
        String city_id=request.getParameter("city_id");
        String state=request.getParameter("state");
        String city_name=request.getParameter("");
        String gender=request.getParameter("gender");
        String que=request.getParameter("que");
        String ans=request.getParameter("ans");
        try{
            JavaPOJO JP = new JavaPOJO();
            Statement uidst = JP.createConnection();
            String fetchedId = "select MAX(uid) from user_table";
            ResultSet rsuid = JP.selectData(uidst, fetchedId);
            int uid=0;
            if(rsuid.next()){
                uid = rsuid.getInt(1);
            }
            uid = uid+1;
            String qry = "insert into user_master(uid,firstname,lastname,phone_num,city_id,email,gender)values("+uid+","+fname+","+lname+","+phnum+","+city_id+","+state+")";
        }catch(Exception e){
            return e+"Exception";
        }
        return null;
    }
}

