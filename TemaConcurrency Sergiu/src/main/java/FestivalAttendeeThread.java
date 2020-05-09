public class FestivalAttendeeThread extends Thread {

    private final FestivalGate gate;
    private TicketType ticketT;

    FestivalAttendeeThread(TicketType ticketT, FestivalGate gate){
        this.ticketT = ticketT;
        this.gate = gate;
    }

    public void run() {
        try {
            sleep(900);
            synchronized (gate){
                gate.addToQueue(ticketT);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
