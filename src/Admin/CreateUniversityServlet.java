package Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "CreateUniversityServlet", urlPatterns = "/createUniversityprofile")
public class CreateUniversityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter w = response.getWriter();


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;


        try{

            conn = myConnection.jdbcConnection.connectionMethod();
            w.println("Start");
            sql = "INSERT INTO UNI_OFFICIAL_INFORMATION ("
                    +"FULL_NAME, SHORT_NAME, UNI_TYPE, UNI_CATEGORY, ESTABLISHED_DATE, UNI_LOCATION,"
                    +"DIVISION, MOTTO, CHANCELLOR, VC, CAMPUS_AREA, CONTACT, WEBSITE)"
                    +"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            w.println ("Before");
            ps = conn.prepareStatement(sql);

            w.println("After");

            ps.setString(1, request.getParameter("full_name"));
            ps.setString(2, request.getParameter("short_name"));
            ps.setString(3, request.getParameter("type"));
            ps.setString(4, request.getParameter("category"));
            ps.setString(5, request.getParameter("est_date"));
            ps.setString(6, request.getParameter("location"));
            ps.setString(7, request.getParameter("division"));
            ps.setString(8, request.getParameter("motto"));
            ps.setString(9, request.getParameter("chancellor"));
            ps.setString(10, request.getParameter("vc"));
            ps.setString(11, request.getParameter("campus"));
            ps.setString(12, request.getParameter("contact"));
            ps.setString(13, request.getParameter("website"));

            ps.executeUpdate();

            w.println ("Data has been inserted Successfully");


        }
        catch (Exception e){

            //w.println(e.printStackTrace());
            e.printStackTrace();
        }
    }
}
