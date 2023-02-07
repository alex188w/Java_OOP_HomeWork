import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.Student;
import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Иванов", LocalDate.of(2023, 01, 8), false));
        listStudents.add(new Student("Иванов", LocalDate.of(2023, 01, 9), true));
        listStudents.add(new Student("Иванов", LocalDate.of(2023, 01, 10), true));
        listStudents.add(new Student("Иванов", LocalDate.of(2023, 01, 11), true));
        listStudents.add(new Student("Иванов", LocalDate.of(2023, 01, 12), true));
        listStudents.add(new Student("Петров", LocalDate.of(2023, 01, 8), true));
        listStudents.add(new Student("Петров", LocalDate.of(2023, 01, 9), true));
        listStudents.add(new Student("Петров", LocalDate.of(2023, 01, 10), true));
        listStudents.add(new Student("Петров", LocalDate.of(2023, 01, 11), false));
        listStudents.add(new Student("Петров", LocalDate.of(2023, 01, 12), false));
        listStudents.add(new Student("Сидоров", LocalDate.of(2023, 01, 8), false));
        listStudents.add(new Student("Сидоров", LocalDate.of(2023, 01, 9), false));
        listStudents.add(new Student("Сидоров", LocalDate.of(2023, 01, 10), false));
        listStudents.add(new Student("Сидоров", LocalDate.of(2023, 01, 11), false));
        listStudents.add(new Student("Сидоров", LocalDate.of(2023, 01, 12), true));

        int reportingPeriod = 5; // количество дней отчетного периода = 5
        new Controller().controllerRun(listStudents, reportingPeriod);
    }
}
