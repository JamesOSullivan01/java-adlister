import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SendViewAndProcessGuess", urlPatterns = "/guess")

public class SendViewAndProcessGuess extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int min = 0;
        int max = 3;
        int random =  (int)Math.floor(Math.random() * (max - min + 1) + min);

        String number = request.getParameter("number");
        int parsedNumber = Integer.parseInt(number);

        String redirectURL;
        if (parsedNumber == random) {
            redirectURL = "/results-correct";
        } else {
            redirectURL = "/results-incorrect";
        }
        response.sendRedirect(redirectURL);


    }


}
