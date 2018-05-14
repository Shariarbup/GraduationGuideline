package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test {

    public static void main (String args []){

        Scanner in = new Scanner (System.in);


        Connection conn = myConnection.jdbcConnection.connectionMethod();
        String sql, admin_id, admin_pass, uname, pass;

        System.out.println ("Name:");
        uname = in.nextLine();
        System.out.println ("pass:");
        pass = in.nextLine();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            sql = "SELECT ADMIN_NAME, ADMIN_PASS FROM   ADMIN_LOGIN";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

           /* admin_id = rs.getString("admin_name");
            admin_pass = rs.getString("admin_pass");*/
           while (rs.next()){

               if(uname.equals(rs.getString("admin_name")) && pass.equals(rs.getString("admin_pass")))
               {

                   System.out.println ("Ball OK");
               }
               else{
                   System.out.println ("Name:");

               }

           }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    }


