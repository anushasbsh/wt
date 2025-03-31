import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MySrv")
public class MySrv extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>A Servlet</title></head>");
            out.println("<body>");

            String username = request.getParameter("uname");
            String password = request.getParameter("pwd");

            if (Objects.equals(username, "user") && Objects.equals(password, "pswd")) {
                out.println("<h1>Welcome, " + username + "!</h1>");
            } else {
                out.println("<h1>Registration success</h1>");
                out.println("<a href='./index.html'>Click for Home page</a>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
