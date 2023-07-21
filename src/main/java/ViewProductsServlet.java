import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@WebServlet(name = "ViewProductsServlet", urlPatterns = "/products")
//public class ViewProductsServlet extends HttpServlet {
//
//}
@WebServlet("/products")
public class ViewProductsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        // Use the factory to get the dao object
        Products productsDao = DaoFactory.getProductsDao();
        // Use a method on the dao to get all the products
        List<Product> products = productsDao.all();
        // Pass the data to the jsp
        request.setAttribute("products", products);
        request.getRequestDispatcher("/products/index.jsp").forward(request, resp);
    }
}
