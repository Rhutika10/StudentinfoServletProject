import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/displayinfo")
public class DisplayInformation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();



        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String age = req.getParameter("age");

        out.print("<h2>User Details</h2>");
        out.println("Name :" +name + "<br>");
        out.println("Email :" +email + "<br>");
        out.println("Age :" +age + "<br>");

    }
}


