class RandomTicketGenerator {

    static TicketType randomTickets() {
        return TicketType.values()
                [(int) (Math.random() * TicketType.values().length)];
    }
}
