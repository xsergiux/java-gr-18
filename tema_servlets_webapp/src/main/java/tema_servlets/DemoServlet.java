package tema_servlets;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    private String name;

    public void init(ServletConfig servletConfig){
        name = servletConfig.getInitParameter("name");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1 style=\"color:#FDFEFE\";> Welcome to " + name + " page! </h1>\n"+
                "<body style=\"size:1040px;height:960px;background:url('https://i.pinimg.com/originals/ae/84/5f/ae845f180b8527287a2832dc230540b3.jpg') no-repeat; background-size: cover\">\n");
//notite  "<style> body { background-image: url('https://i.pinimg.com/originals/ae/84/5f/ae845f180b8527287a2832dc230540b3.jpg');}</style>");

    }

}
