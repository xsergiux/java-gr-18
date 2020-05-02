/**
 * Festival Statistics
 * Every Festival has a gate, where people have to show their tickets.
 * Write an application where every person (client) is represented by a special Thread that is instantiated with random ticket data. Possible ticket types: full, full-vip, free-pass, one-day, one-day-vip
 * FestivalGate gate = new FestivalGate();
 * TicketType ticketType = // this should be enum value randomly generated.
 * FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
 * Every attendee validates the ticket, and the ticket-data is kept is a queue.
 * Meanwhile, every 5 seconds a FestivalStatisticsThread wakes up and reads the new data from the gate and generates statistics:
 *
 * e.g
 * 100 people entered
 * 57 people have full tickets
 * 30 have free passes
 * 3 have full VIP passes
 * 10 have one-day passes
 * 0 have one-day VIP passes
 *
 * FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);
 * statsThread.start();
 */
public class MainFestival {
    public static void main(String[] args) {


        FestivalGate gate = new FestivalGate();

        FestivalStatisticsThread begin = new FestivalStatisticsThread(gate);
        begin.start();

        double enteredAttendee = Math.ceil(Math.random() * 1300);
        for (int i = 0; i < enteredAttendee; i++) {
            FestivalAttendeeThread attendee = new FestivalAttendeeThread(RandomTicketGenerator.randomTickets(), gate);
            attendee.start();
            try {
                attendee.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
