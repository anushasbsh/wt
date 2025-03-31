import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationServletTwo extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve parameters from the previous page
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String profession = request.getParameter("profession");
        String email = request.getParameter("email");
        String cell = request.getParameter("cell");

        // Set the content type and prepare output
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display collected details
        out.println("<html><body bgcolor='wheat'>");
        out.println("<center>");
        out.println("<h1>REGISTRATION SUCCESSFUL!</h1>");
        out.println("<h2>Here are your details:</h2>");
        out.println("<table border='1' cellpadding='5' cellspacing='0'>");
        out.println("<tr><td><b>Name:</b></td><td>" + name + "</td></tr>");
        out.println("<tr><td><b>Password:</b></td><td>" + password + "</td></tr>");
        out.println("<tr><td><b>Profession:</b></td><td>" + profession + "</td></tr>");
        out.println("<tr><td><b>Email:</b></td><td>" + email + "</td></tr>");
        out.println("<tr><td><b>Phone:</b></td><td>" + cell + "</td></tr>");
        out.println("</table>");
        out.println("<br><br><a href='register.html'>Go to Home</a>");
        out.println("</center>");
        out.println("</body></html>");

        // Close the writer
        out.close();
    }
}
