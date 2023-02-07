import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    /**
     * Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
     * boolean isGood (T item);
     * Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
     * Создайте следующие детские классы:
     * • IsEven — ему дают целое число, он одобряет его, если оно чётное
     * • IsPositive — ему дают целое число, он одобряет его, если оно положительное
     * • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы
     * A
     * • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он
     * проверяет, что она начинается с того, что он запомнил
     * 
     * Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и
     * одобрятель IsGood.
     * Функция возвращает новую коллекцию, куда входят только одобренные элементы из
     * коллекции.
     * Продемонстрируйте, что это работает.
     */
    public static void main(String[] args) {
        IsEven approverEven = new IsEven();
        IsPositive approverPositive = new IsPositive();
        BeginsWith approverBeginsWith = new BeginsWith("Иван");
        BeginsWithA approverBeginsWithA = new BeginsWithA();

        Random rnd = new Random();
        List<Integer> intList = new ArrayList<>(Arrays.asList(rnd.nextInt(-99, 99), rnd.nextInt(-99, 99),
                rnd.nextInt(-99, 99), rnd.nextInt(-99, 99), rnd.nextInt(-99, 99)));
        List<String> stringList = new ArrayList<>(
                Arrays.asList("Иванов", "Петров", "Сидоров", "Лобанов", "Артемьев"));

        System.out.println("Исходные коллекции (для проверки)");
        System.out.println(intList);
        System.out.println(stringList);

        System.out.println("Коллекции, после \"одобрения IsGood\": ");
        Iterable<Integer> result1 = filter(intList, approverEven);
        Iterable<Integer> result2 = filter(intList, approverPositive);
        Iterable<String> result3 = filter(stringList, approverBeginsWith);
        Iterable<String> result4 = filter(stringList, approverBeginsWithA);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public static <T> List<T> filter(List<T> lst, IsGood<T> approver) {
        List<T> newLst = new ArrayList<>();
        for (T it : lst) {
            if (approver.isGood(it)) // если элемент it из apprower проверен isGood = true, то...
                newLst.add(it);
        }
        return newLst;
    }

}