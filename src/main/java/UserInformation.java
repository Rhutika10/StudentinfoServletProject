import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userinfo")
public class UserInformation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<h2>User Info Form</h2>");
        out.println("<form action='displayinfo' method='post'>");
        out.println("Name  <input type='text' name='name'><br><br>");
        out.println("Email  <input type='email' name='email'><br><br>");
        out.println("Age  <input type='number' name='age'><br><br>");

        out.println("<input type='submit' value='submit'>");
        out.println("</form>");
    }

}

//

