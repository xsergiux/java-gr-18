package behavior;

public interface Phone {

    void addContact(String position, String phoneNumber, String firstName, String lastName);

    void listContacts();

    void sendMessage(String phoneNumber, String message);

    void listMessages(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory();

}
