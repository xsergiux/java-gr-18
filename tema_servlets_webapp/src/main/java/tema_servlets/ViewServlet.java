package tema_servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> FC Barcelona Players </h1>");

        List<TeamPlayer> playerList = new ArrayList<>();
        playerList.add(new TeamPlayer(1, "Marc-André ter Stegen", "1", "Goalkeeper"));
        playerList.add(new TeamPlayer(2, "Neto", "13", "Goalkeeper"));
        playerList.add(new TeamPlayer(3, "Iñaki Peña", "26", "Centre-Back"));
        playerList.add(new TeamPlayer(4, "Clément Lenglet", "15", "Centre-Back"));
        playerList.add(new TeamPlayer(5, "Samuel Umtiti", "23", "Centre-Back"));
        playerList.add(new TeamPlayer(6, "Gerard Piqué", "3", "Centre-Back"));
        playerList.add(new TeamPlayer(7, "Ronald Araújo", "33", "Centre-Back"));
        playerList.add(new TeamPlayer(8, "Jordi Alba", "18", "Left-Back"));
        playerList.add(new TeamPlayer(9, "Júnior Firpo", "24", "Left-Back"));
        playerList.add(new TeamPlayer(10, "Sergi Roberto", "20", "Right-Back"));
        playerList.add(new TeamPlayer(11, "Nélson Semedo", "2", "Right-Back"));
        playerList.add(new TeamPlayer(12, "Sergio Busquets", "5", "Defensive Midfield"));
        playerList.add(new TeamPlayer(13, "Frenkie de Jong", "21", "Central Midfield"));
        playerList.add(new TeamPlayer(14, "Arthur", "8", "Central Midfield"));
        playerList.add(new TeamPlayer(15, "Ivan Rakitic", "4", "Central Midfield"));
        playerList.add(new TeamPlayer(16, "Arturo Vidal", "22", "Central Midfield"));
        playerList.add(new TeamPlayer(17, "Riqui Puig", "28", "Central Midfield"));
        playerList.add(new TeamPlayer(18, "Ansu Fati", "31", "Left Winger"));
        playerList.add(new TeamPlayer(19, "Lionel Messi", "10", "Right Winger"));
        playerList.add(new TeamPlayer(20, "Ousmane Dembélé", "11", "Right Winger"));
        playerList.add(new TeamPlayer(21, "Antoine Griezmann", "17", "Second Striker"));
        playerList.add(new TeamPlayer(22, "Luis Suárez", "9", "Centre-Forward"));
        playerList.add(new TeamPlayer(23, "Martin Braithwaite", "13", "Centre-Forward"));

        out.println("<body style=\"size:1040px;height:960px;background:url('https://img.wallpapersafari.com/desktop/1920/1080/6/86/4UsAn9.jpg') " +
                "no-repeat; background-size: cover\">\n");
        out.println("<table border='1', width='100%'>");

        out.println("<tr>" +
                "<th>Player Name</th>" +
                "<th>Player Number</th>" +
                "<th>Player Position</th>" +
                "<th>Edit Line</th>" +
                "<th>Delete Line</th>" +
                "</tr>");

        for (TeamPlayer teamPlayer : playerList) {
            out.println("<tr>" +
                    "<td>" + teamPlayer.getPlayerName() + "</td>" +
                    "<td>" + teamPlayer.getPlayerNumber() + "</td>" +
                    "<td>" + teamPlayer.getPlayerPosition() + "</td>" +
                    "<td><a href='EditServlet?id=" + teamPlayer.getId() + "'>EDIT</a></td>" +
                    "<td><a href='DeleteServlet?id=" + teamPlayer.getId() + "'>DELETE</a></td>" +
                    "</tr>");
        }

        out.println("</table>");

    }

}
