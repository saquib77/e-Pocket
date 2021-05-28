package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.JavaPOJO;
public class Registration {
    public String registerUser(String fname,String lname,String email,String password,String phnum,String city_name,String state_name,String country_name,String gender,String que,String ans){
        JavaPOJO JP = new JavaPOJO();
        try{
            //Getting UID
            Statement uidst = JP.createConnection();
            String fetchedId = "select MAX(uid) from user_master";
            ResultSet rsuid = JP.selectData(uidst, fetchedId);
            int uid=0;
            if(rsuid.next()){
                uid = rsuid.getInt(1);
            } else uid = uid+1;
            
            //Getting CITY_ID
            Statement ctid = JP.createConnection();
            String cityqry = "select MAX(city_id) from city";
            ResultSet ct = JP.selectData(ctid, cityqry);
            int citycode=91;
            if(ct.next()){
                citycode = ct.getInt(1);
            }else citycode = citycode+1;
            
            //Getting STATE_ID
            Statement stateid = JP.createConnection();
            String stateqry = "select MAX(state_id) from city";
            ResultSet st = JP.selectData(stateid, stateqry);
            int stateID=0;
            if(st.next()){
                stateID = st.getInt(3);
            }else stateID = stateID+1;
            
            //Getting COUNTRYCODE
            Statement countryid = JP.createConnection();
            String countryqry = "select MAX(country_code) from country";
            ResultSet cont = JP.selectData(countryid, countryqry);
            int countID=0;
            if(cont.next()){
                countID = cont.getInt(1);
            }else countID = countID+1;
            
            //Inserting Country,State,City,Login,&User Data
            Statement countryData = JP.createConnection();
            Statement logData = JP.createConnection();
            Statement stateData = JP.createConnection();
            Statement cityData = JP.createConnection();
            Statement userData = JP.createConnection();
            
            String countryQry = "insert into country(country_code,country_name)values("+countID+","+country_name+")";
            String logQry = "insert into login_master(email,password,status)values("+email+","+password+","+0+")";
            String stateQry = "insert into state(state_id,state_name,country_name)values("+stateID+","+state_name+","+country_name+")";
            String cityQry  =  "insert into city(city_id,city_name,state_id)values("+citycode+","+city_name+","+stateID+")";
            String userQry = "insert into user_master(uid,firstname,lastname,phone_num,city_id,email,gender,que,ans)values("+uid+","+fname+","+lname+","+phnum+","+citycode+","+email+","+gender+","+que+","+ans+")";
            
            if(JP.insertData(countryData, countryQry) && JP.insertData(logData, logQry) && JP.insertData(stateData, stateQry) && JP.insertData(cityData, cityQry) && JP.insertData(userData, userQry) ){
                SendMail sm = new SendMail();
                String ml = sm.sendEmail(email);
                if(ml.equals("succsess")) return "/Login";
            }
        }catch(ClassNotFoundException | SQLException e){
            return "/error";
            //e.printStackTrace();
        }
        return "/Registration";
    }
}
