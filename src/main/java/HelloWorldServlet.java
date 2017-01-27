import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        Object counter = req.getParameter("counter");
        int count;

        if (counter != null) {
            count = Integer.parseInt((String) counter);
            count++;
        } else {
            count = 1
        }

        req.setAttribute("counter", count);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();



    }
}
