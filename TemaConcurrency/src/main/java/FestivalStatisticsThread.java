import java.util.LinkedList;

public class FestivalStatisticsThread extends Thread {

    private final FestivalGate gate;

    FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    public void run() {
        LinkedList<TicketType> queue;
        while (true) {
            synchronized (gate) {
                queue = gate.getQueue();
            }
            if (!queue.isEmpty()) {
                System.out.println(Rainbow.ANSI_CYAN + "\n########## FESTIVAL GATE ENTRANCE MONITORING ##########\n" + Rainbow.ANSI_YELLOW
                        + queue.size() + " people entered!\n" + Rainbow.ANSI_PURPLE
                        + queue.stream().filter(t -> t == TicketType.full).count() + " have FULL passes!\n"
                        + queue.stream().filter(t -> t == TicketType.full_vip).count() + " have FULL VIP passes!\n"
                        + queue.stream().filter(t -> t == TicketType.free_pass).count() + " have FREE passes!\n"
                        + queue.stream().filter(t -> t == TicketType.one_day).count() + " have ONE DAY passes!\n"
                        + queue.stream().filter(t -> t == TicketType.one_day_vip).count() + " have ONE DAY VIP passes!\n");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
