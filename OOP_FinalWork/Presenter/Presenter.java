package Presenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Model.Contact;
import Model.Phonebook;

public class Presenter {
    Phonebook currentBook;

    public Presenter() {
        currentBook = new Phonebook();
    }

    public void loadFromFile() {
        try (FileReader fr = new FileReader("data.db")) {
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileWriter(Phonebook currentBook) {

        try (FileWriter writer = new FileWriter("data.db", false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getContact(i);
                writer.write((i + 1) + ". " + contact + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void findContact(Phonebook currentBook, Contact findContact) {
        int count = 0;
        for (int i = 0; i < currentBook.count(); i++) {

            Contact contact = currentBook.getContact(i);
            if (contact.equals(findContact) == true) {
                System.out.println("Вы искали контакт:\n" + contact);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Такого контакта нет\n");
    }

    public void outputAllfullName(Phonebook currentBook) {
        for (int i = 0; i < currentBook.count(); i++) {
            Contact contact = currentBook.getContact(i);
            System.out.println(contact.getFullName());
        }
    }

    public void addContact(Phonebook currentBook, String firstName, String lastName) {
        Map<String, String> communication = new HashMap<>();
        communication.put(null, null);
        Contact contact = new Contact(firstName, lastName, communication);
        currentBook.add(contact);
    }

    public void addCommunication(Phonebook currentBook, Contact addContact, String nameCommunication,
            String viewCommunication) {
        int count = 0;
        for (int i = 0; i < currentBook.count(); i++) {
            Contact contact = currentBook.getContact(i);
            if (contact.equals(addContact)) {
                contact.getCommunication().put(nameCommunication, viewCommunication);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Такого контакта нет\n");
    }

    public void removeContact(Phonebook currentBook, Contact delContact) {
        int count = 0;
        for (int i = 0; i < currentBook.count(); i++) {
            Contact contact = currentBook.getContact(i);
            if (contact.equals(delContact)) {
                currentBook.remove(contact);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Такого контакта нет\n");
    }

    public void removeCommunication(Phonebook currentBook, Contact delContact, String delCommunication) {
        int count = 0;
        for (int i = 0; i < currentBook.count(); i++) {
            Contact contact = currentBook.getContact(i);
            if (contact.equals(delContact)) {
                contact.getCommunication().keySet().removeIf(k -> k.equals(delCommunication));
                count++;
            }
        }
        if (count == 0)
            System.out.println("Такого способа связи нет\n");
    }

    public void printPhonebook(Phonebook currentBook) {
        System.out.println("\nСписок контрагентов с подробной информацией из телефонной книги:\n");
        for (int i = 0; i < currentBook.count(); i++) {
            Contact contact = currentBook.getContact(i);
            System.out.println(contact);
        }
    }
}
