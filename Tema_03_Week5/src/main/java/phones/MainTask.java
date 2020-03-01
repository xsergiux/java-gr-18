package phones;

import behavior.Phone;
import phones.Samsung_Galaxy_S6;

/**
 * Requirements
 *
 * All phones offer the following behavior:
 * - you can create new contacts
 * - you can see existing contacts
 * - you can send a text message
 * - you can see all messages for a specific contact
 * - you can make a call
 * - you can see all calls history
 *
 *
 * Implement a phone hierarchy where:
 * - A phone can be of certain manufacters and it can have a specific model (Phone - Samsung - SamsungGalaxyS6)
 * - properties wich cannot change: battery life (in number of hours)
 * - properties that are configurable: color, material
 * - properties that are instance specific: imei
 *
 * Behavior:
 *  - a message can have maximum 500 chars
 *  - every time a message is send an hour is taken from the battery life
 *  - every time a call is made two hours are taken from the battery life
 *
 * API:
 *   Phone phone= new Samsung(); // shouldn't compile
 *        Phone phone = new SamsungGalaxy6();
 *
 *        phone.addContact("1", "phone number", "fist name", "last name");
 *        phone.addContact("2", "phone number", "fist name", "last name");
 *        phone.listContacts();
 *
 *        // send a message to the first contact from the previous listed
 *         // max number of characters - 100
 *        phone.sendMessage("phone number", "message content");
 *        phone.listMessages("phone number");
 *
 *         // send a message to the second contact from the previous listed
 *        phone.call("phone number");
 *        phone.viewHistory();
 *
 * Tasks:
 * - implement the classes, abstract classes and interfaces according to the given information
 * - create at least 2 phone brands with 2 models for each
 * - create 2 new contacts
 * - send a message to the first contact
 * - make a call to the second contact
 */

public class MainTask {
    public static void main(String[] args) {
        Phone phone = new Samsung_Galaxy_S6();
        phone.addContact("1", "0755555555", "Cosmin Ionel", "Burla");
        phone.addContact("2", "0733333333", "Nichita", "Sortan");

        System.out.println("Your current contacts are: ");
        phone.listContacts();

        phone.sendMessage("0755555555", "Felicitari pentru absolvirea Scolii Informale de IT!" +
                " Punctajul pe care l-ai obtinut este maxim-ul!!!");

        System.out.println("\nMessages received:");
        phone.listMessages("0755555555");

        phone.call("0733333333");

        System.out.println("\nView History: ");
        phone.viewHistory();

        Phone anotherPhone = new Nokia_Sand_2("Green", "Iron");



    }
}
