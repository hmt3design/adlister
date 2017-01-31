/**
 * Created by Harry on 1/31/17.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // make a list of the ad objects
        List<Ad> ads = DaoFactory.getAdsDao().all();

        //assign that variable to the data sent to the view
        request.setAttribute("ads", ads);

        //render the view
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }
}