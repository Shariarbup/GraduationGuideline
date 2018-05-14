package Admin;

import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "AdminLogInServlet", urlPatterns = "/adminlogin")
public class AdminLogInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String uname=request.getParameter("admin_id");
        String pass=request.getParameter("password");

        PrintWriter writer=response.getWriter();

        Connection conn = myConnection.jdbcConnection.connectionMethod();
        String sql, admin_id, admin_pass;

        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            sql = "SELECT ADMIN_NAME, ADMIN_PASS FROM   ADMIN_LOGIN";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

           /* admin_id = rs.getString("admin_name");
            admin_pass = rs.getString("admin_pass");*/

           while(rs.next()) {
               if (uname.equals(rs.getString("admin_name")) && pass.equals(rs.getString("admin_pass"))) {

                   response.sendRedirect("adminChoice.jsp");
               } else {
                   writer.println("Invalid user/ password");
               }
           }
        }
        catch (Exception e){}

    }
}
