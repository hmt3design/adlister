import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Harry on 1/30/17.
 */

@WebServlet(name = "GuestbookServlet", urlPatterns = "/guestbook")
public class GuestbookServlet extends HttpServlet {

    public String lastPost;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "Welcome to the Guest book");
        request.getRequestDispatcher("guestbook.jsp").forward (request, response)
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// when getting values from named forms, use request.getParameter("namedParameter")
        lastPost = request.getParameter("comment");
        request.setAttribute("lastPost", lastPost);
        request.getRequestDispatcher("guestbook.jsp").forward(request, response);
    }
}

