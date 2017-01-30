import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/hello"})
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        response.setContentType("text/html");
//        PrintWriter writer= response.getWriter();
//        String name = request.getParameter("name");
//        if (name != null) {
//            writer.println("<h1>Hello, " + name + "!");
//        } else {
//            writer.println("<h1>Hello, World!</h1>");
//        }
        request.setAttribute("message", "Hello, World");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
