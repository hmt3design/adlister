import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/hello"})
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Object counter = request.getParameter("counter");
        int count;

        if (counter != null) {
            count = Integer.parseInt((String) counter);
            count++;
        } else {
            count = 1;
        }
        request.setAttribute("counter", count);

        response.setContentType("text/html");
        PrintWriter writer= response.getWriter();
        String name = request.getParameter("name");
        if (name != null) {
            writer.println("<h1>Hello, " + name + "!");
        } else {
            writer.println("<h1>Hello, World!</h1>");
        }



    }
}
