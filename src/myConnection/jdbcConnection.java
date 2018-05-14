package myConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcConnection {

    public static Connection connectionMethod(){

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String reg, url, user, pass;

        reg = "oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@localhost:1521:orcl";
        user = "GraduationGuideline";
        pass = "Oracle_1";

        try
        {
            Class.forName(reg);
            c = DriverManager.getConnection(url, user, pass);
        }

        catch (Exception e)
        {

        }

        return c;

    }
}
