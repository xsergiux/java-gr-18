import java.util.*;

public class FestivalGate {

    List<TicketType> queue = new LinkedList<>();

    public void addToQueue(TicketType ticketT) {
        queue.add(ticketT);
    }

    public LinkedList<TicketType> getQueue() {
        return (LinkedList<TicketType>) queue;
    }
}
