package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Model.AttendanceService;
import Model.Student;
import View.AttendancePercentView;
import View.AttendancePercentView25;
import View.AttendanceView;

public class Controller {

    public void controllerRun(List<Student> listStudents, Integer reportingPeriod) {

        Map<String, Integer> attendancePercent = new HashMap<>();

        System.out.println("Выберите какое действие нужно выполнить (Введите число от 1 до 3): " +
                "\n1. Сохранить информацию о посещаемости студентов в файл File.txt" +
                "\n2. Отобразить в консоли всех студентов и их ежедневную посещаемость из файла" +
                "\n3. Отобразить в консоли список студентов, отсортированный по убыванию посещаемости" +
                "\n4. Отобразить в консоли список студентов, посещаемость которых менее 25%" +
                "\n0. Выход из программы" +
                "\n>>> ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i;
            try {
                i = scanner.nextInt();
                if (i == 1)
                    new AttendanceService().fileWriter(listStudents);
                if (i == 2)
                    new AttendanceView().fileReader();
                if (i == 3)
                    new AttendancePercentView().attendancePercent(listStudents, attendancePercent, reportingPeriod);
                if (i == 4)
                    new AttendancePercentView25().attendancePercent25(attendancePercent);
                if (i == 0) {
                    System.out.println("Выход из программы.");
                    return;
                }
            } catch (Exception ex) {
                System.out.println("Некорректное значение, повторите ввод. Число должно быть от 1 до 4");
            }
        }
    }
}
