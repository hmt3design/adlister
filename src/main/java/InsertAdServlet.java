import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Harry on 2/2/17.
 */
@WebServlet(name = "InsertAdServlet", urlPatterns = "/ads/new")
public class InsertAdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads ads = DaoFactory.getAdsDao();
        Ad ad = new Ad(0, request.getParameter("title"), request.getParameter("description"));
        ads.insert(ad);
        response.sendRedirect("/ads/show?id=" + ad.getId());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(request, response);
    }
}
