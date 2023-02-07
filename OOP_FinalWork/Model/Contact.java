package Model;

import java.util.Map;

public class Contact implements ContactName, ContactCommunication{

    private String firstName;
    private String lastName;
    private Map<String, String> communication;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    public Map<String, String> getCommunication() {
        return communication;
    }
    
    public Contact(String firstName, String lastName, Map<String, String> communication) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.communication = communication;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact) obj;
        return this.firstName.equals(t.firstName)
                && this.lastName.equals(t.lastName);
    }   

    @Override
    public String toString() {
        return "Contact: name = " + getFirstName() + ", lastName = " + getLastName() + "\ncommunication: " + getCommunication() + "\n";
    }
}