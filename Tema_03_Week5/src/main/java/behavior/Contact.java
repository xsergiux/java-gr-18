package behavior;

public class Contact {
    private String position;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String position, String phoneNumber, String firstName, String lastName) {
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "position='" + position + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
