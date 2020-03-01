package behavior;

public class Message {
    private static final int MaximumSMSCharacters = 500;
    private String phoneNumber;
    private String message;

    public Message(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;

        if (message.length() > MaximumSMSCharacters) {
            System.out.println("Your message shouldn't contain more than 500 characters");
            return;
        }
    }

    public String getMessage() {
        return message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Message{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }


}
