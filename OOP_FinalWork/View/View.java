package View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Model.Contact;
import Model.Phonebook;
import Presenter.Presenter;

public class View {

    public static void ButtonClick() {

        Phonebook currentBook = new Phonebook();
        Presenter presenter = new Presenter();

        Map<String, String> communication1 = new HashMap<>();
        Map<String, String> communication2 = new HashMap<>();
        Map<String, String> communication3 = new HashMap<>();
        Map<String, String> communication4 = new HashMap<>();

        communication1.put("Телефон", "8234456");
        communication1.put("Адрес", "Космонавтов 55");
        communication2.put("Телефон", "834589");
        communication2.put("Email", "micha@mail.ru");
        communication2.put("Адрес VK", "vk.com/micha");
        communication2.put("Телеграмм", "@micha");
        communication3.put("Адрес", "Восточная 78");
        communication3.put("Телефон", "8237899");
        communication3.put("Email", "alyans@mail.ru");
        communication3.put("Адрес VK", "vk.com.alyans");
        communication4.put("Адрес", "Набережная 55");

        Contact contacts1 = new Contact("Иван", "Иванов", communication1);
        Contact contacts2 = new Contact("Михаил", "Светлов", communication2);
        Contact contacts3 = new Contact("Магазин", "Альянс", communication3);
        Contact contacts4 = new Contact("Отель", "Солнечный", communication4);

        currentBook.add(contacts1);
        currentBook.add(contacts2);
        currentBook.add(contacts3);
        currentBook.add(contacts4);
        presenter.fileWriter(currentBook);
        System.out.println("Информация о контактах сохранена в файл");

        try (Scanner scanner = new Scanner(System.in, "cp866")) {
            while (true) {
                System.out.println(
                        "1 - просмотреть список контактов с детальной иформацией из телефонной книги\n"
                                + "2 - просмотреть список контактов: имя (вид контрагента), фамилия (название контрагента)\n"
                                + "3 - просмотреть один выбранный контакт с детальной информацией\n"
                                + "4 - добавить контакт: имя (вид контрагента), фамилия (название контрагента)\n"
                                + "5 - удалить контакт\n"
                                + "6 - добавить новый способ связаться с контрагентом\n"
                                + "7 - удалить способ связаться с контрагентом");
                String key = scanner.nextLine();
                switch (key) {
                    case "1":
                        System.out.println(
                                "\nСписок контрагентов из телефонной книги (файла .db), с подробной информацией:\n");
                        presenter.loadFromFile();
                        break;
                    case "2":
                        System.out.println("Список контрагентов из телефонной книги (имя, фамилия):");
                        presenter.outputAllfullName(currentBook);
                        break;
                    case "3":
                        System.out.println("Введите имя (вид) контрагента:");
                        String firstName = scanner.nextLine();
                        System.out.println("Введите фамилию (название) контрагента:");
                        String lastName = scanner.nextLine();
                        Contact findContact = new Contact(firstName, lastName, null);
                        presenter.findContact(currentBook, findContact);
                        break;
                    case "4":
                        System.out.println("Введите имя (вид) контрагента, которого хотите добавить:");
                        String firstName1 = scanner.nextLine();
                        System.out.println("Введите фамилию (название) контрагента, которого хотите добавить:");
                        String lastName1 = scanner.nextLine();
                        presenter.addContact(currentBook, firstName1, lastName1);
                        System.out.println("Данный контакт добавлен в телефонную книгу:");
                        presenter.fileWriter(currentBook);
                        presenter.outputAllfullName(currentBook); // для тестирования программы
                        break;
                    case "5":
                        System.out.println("Введите имя (вид) контрагента, которого хотите удалить:");
                        String firstName2 = scanner.nextLine();
                        System.out.println("Введите фамилию (название) контрагента, которого хотите удалить:");
                        String lastName2 = scanner.nextLine();
                        Contact delContact = new Contact(firstName2, lastName2, null);
                        presenter.removeContact(currentBook, delContact);
                        System.out.println("Данный контакт удален из телефонной книги:\n");
                        presenter.outputAllfullName(currentBook); // для тестирования программы
                        break;
                    case "6":
                        System.out.println("Введите имя (вид) контрагента, для которого хотите добавить способ связи:");
                        String firstName3 = scanner.nextLine();
                        System.out.println(
                                "Введите фамилию (название) контрагента, для которого хотите добавить способ связи:");
                        String lastName3 = scanner.nextLine();
                        Contact addContact = new Contact(firstName3, lastName3, null);
                        System.out.println("Введите способ связи, котторый хотите добавить:");
                        String nameCommunication = scanner.nextLine();
                        System.out.println("Введите значение, номер, котторый хотите добавить:");
                        String viewCommunication = scanner.nextLine();
                        presenter.addCommunication(currentBook, addContact, nameCommunication, viewCommunication);
                        presenter.fileWriter(currentBook);
                        System.out.println("Данный вид связи добавлен в данный контакт:");
                        // presenter.printPhonebook(currentBook); // для тестирования прошраммы
                        break;
                    case "7":
                        System.out.println("Введите имя (вид) контрагента, у которого хотите удалить способ связи:");
                        String firstName4 = scanner.nextLine();
                        System.out.println(
                                "Введите фамилию (название) контрагента, у которого хотите удалить способ связи:");
                        String lastName4 = scanner.nextLine();
                        Contact delContact1 = new Contact(firstName4, lastName4, null);
                        System.out.println("Введите способ связи, котторый хотите удалить:");
                        String delCommunication = scanner.nextLine();
                        presenter.removeCommunication(currentBook, delContact1, delCommunication);
                        System.out.println("Данный способ связи удален из контакта:\n");
                        // presenter.printPhonebook(currentBook); // для тестирования прошраммы
                        break;
                    default:
                        presenter.fileWriter(currentBook);
                        System.out.println("Такой команды нет, выход из программы");
                        return;
                }
            }
        }        
    }
}
