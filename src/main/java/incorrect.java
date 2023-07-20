import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "incorrect", urlPatterns = "/results-incorrect")
public class incorrect extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "You Lose!");
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }

}
