package BusinessLogic;
import controller.userSetDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import model.JavaPOJO;
import model.SendMail;
import model.User;

public class Registration implements Business{
    public String businessLogic(HttpServletRequest request){
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String phnum = request.getParameter("phnum");
        String city_name = request.getParameter("city_name");
        String state_name = request.getParameter("state_name");
        String country_name = request.getParameter("country_name");
        String gender = request.getParameter("gender");
        String que = request.getParameter("que");
        String ans = request.getParameter("ans");
        String res;
        User user = new User(fname,lname,email,password,city_name,state_name,country_name,que,ans,gender,0,phnum);
        userSetDB usd = new userSetDB(JavaPOJO.getConnection());
        int flag = usd.saveUser(user);
        if(flag==1) res = "done";
        else if(flag==2) res="exist";
        else res="error";
        return res;
    }
}
