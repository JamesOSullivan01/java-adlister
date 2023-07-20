import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "correct", urlPatterns = "/results-correct")

public class correct extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "You Won!");
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }
}
