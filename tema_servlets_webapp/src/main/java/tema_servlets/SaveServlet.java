package tema_servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/SaveServlet")
public class SaveServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // a logging can be stored somewhere

        // log.info, log.debug, log.error
        // System.out.println => info (replace)
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String number = request.getParameter("number");
        String position = request.getParameter("position");

        TeamPlayer teamPlayer = TeamPlayer.builder()
                .playerName(name)
                .playerNumber(number)
                .playerPosition(position)
                .build();

        System.out.println(teamPlayer);

        out.println("<h2> Hello! " + teamPlayer + "!</h2>");
    }
}
