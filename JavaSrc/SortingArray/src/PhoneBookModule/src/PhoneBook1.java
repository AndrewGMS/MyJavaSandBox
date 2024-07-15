import java.util.HashMap;
import java.util.Map;

public class PhoneBook1 {
    private Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        this.contacts.put(name, phoneNumber);
    }

    public String findPhoneNumber(String name) {
        return this.contacts.get(name);
    }
}
