import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Pickcolor", urlPatterns = "/pickcolor")

public class PickColorServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("pickcolor.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String color = request.getParameter("color");
        String redirectURL = "viewcolor?color=" + color;

        response.sendRedirect(redirectURL);
    }

}
