import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet {

    protected void doGet(HttpServletResponse resp, HttpServletRequest req) throws ServletException, IOException {
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);

    }
}
