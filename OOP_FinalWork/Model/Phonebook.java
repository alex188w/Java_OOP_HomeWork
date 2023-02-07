package Model;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts;
    public int size;

    @Override
    public String toString() {
        return "Phonebook:" + "\n" + contacts + "\n";
    }

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public void add(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    // read
    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // dell
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }

    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public int count() {
        return contacts.size();
    }

}
