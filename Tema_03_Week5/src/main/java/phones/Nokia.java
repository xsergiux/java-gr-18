package phones;

import behavior.Contact;
import behavior.Message;
import behavior.Phone;

import java.util.ArrayList;
import java.util.List;

public class Nokia implements Phone {
    private int consumptionOfBattery = 0;
    private String color;
    private String material;
    private final int batteryLife;
    private final String imei;

    private List<Message> messages = new ArrayList<Message>();
    private List<Contact> listContacts = new ArrayList<Contact>();
    private List<String> calls = new ArrayList<String>();

    public Nokia(String color, String material, int batteryLife,  String imei) {
        this.color = color;
        this.material = material;
        this.batteryLife = batteryLife;
        this.imei = imei;

    }

    public void addContact(String position, String phoneNumber, String firstName, String lastName) {
        listContacts.add(new Contact(position, phoneNumber, firstName, lastName));
    }

    public void listContacts() {
        for (Contact contact : listContacts) {
            System.out.println(contact);
        }
    }

    public void sendMessage(String phoneNumber, String message) {
        if (consumptionOfBattery >= batteryLife) {
            System.out.println("You don't have any more battery do send the message");
        }

        Message newMessage = new Message(phoneNumber, message);
        if (newMessage.getPhoneNumber() != null && newMessage.getMessage() != null) {
            messages.add(newMessage);
            consumptionOfBattery += 1;
        }
    }

    public void listMessages(String phoneNumber) {
        for (Message message : messages) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(message);
            }
        }
    }

    public void call(String phoneNumber) {
        if (consumptionOfBattery + 1 >= batteryLife) {
            System.out.println("Attention! You don't have enough battery do make another call");
        }

        calls.add(phoneNumber);
        consumptionOfBattery += 2;
    }

    public void viewHistory() {
        for (String call : calls) {
            System.out.println(call);
        }
    }
}
