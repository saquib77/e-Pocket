package BusinessLogic;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.JavaPOJO;
public class Registration {
    public int registerUser(String fname,String lname,String email,String password,String phnum,String city_name,String state_name,String country_name,String gender,String que,String ans){
        JavaPOJO JP = new JavaPOJO();
        try{
            Statement uidst = JP.createConnection();
            String fetchedId = "select MAX(uid) from user_master";
            ResultSet rsuid = JP.selectData(uidst, fetchedId);
            int uid=0;
            if(rsuid.next()){
                uid = rsuid.getInt(1);
            } else uid = uid+1;
            Statement stmt = JP.createConnection();
            String fetchedId1 = "select city_id from city where(city_name="+ city_name +")";
            ResultSet rsuid1 = JP.selectData(stmt, fetchedId1);
            int code=91;
            if(rsuid1.next()){
                code = rsuid1.getInt(1);
            }else code = code+1;
            Statement fstmt = JP.createConnection();
            String qry1 = "insert into user_master(uid,firstname,lastname,phone_num,city_id,email,gender,que,ans)values("+uid+","+fname+","+lname+","+phnum+","+code+","+email+","+gender+","+que+","+ans+")";
            if(JP.insertData(fstmt, qry1)){
                return 1;
            }
        }catch(ClassNotFoundException | SQLException e){
            return 0;
            //e.printStackTrace();
        }
        return -1;
    }
}
