
package model;
import BusinessLogic.Business;
import javax.servlet.http.HttpServletRequest;

public class Login implements Business {
    public String businessLogic(HttpServletRequest request){
        return "Login Class";
    }
}
