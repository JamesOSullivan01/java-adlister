import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")

public class PizzaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        String sauce = request.getParameter("sauce");
//        String Crust = request.getParameter("crust");
//        String size = request.getParameter("size");

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String sauce = request.getParameter("sauce");
        String crust = request.getParameter("crust");
        String size = request.getParameter("size");
        String toppings = request.getParameter("toppings");

        System.out.println("sauce = " + sauce);
        System.out.println("Crust = " + crust);
        System.out.println("size = " + size);
        System.out.println("toppings = " + toppings);

    }
}
