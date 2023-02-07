package View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Student;

public class AttendancePercentView {

    public void attendancePercent(List<Student> listStudents, Map<String, Integer> attendancePercent, Integer reportingPeriod) {
        Map<String, Integer> attendance = new HashMap<>();
        int dateVisit = 0;
        for (Student student : listStudents) {
            if (attendance.containsKey(student.getName()) == true) {
                if (student.getAttendance() == true) {
                    dateVisit = attendance.get(student.getName());
                    attendance.put(student.getName(), dateVisit + 1);
                }
            } else {
                if (student.getAttendance() == true) {
                    attendance.put(student.getName(), 1);
                } else attendance.put(student.getName(), 0);
            }
            
            for (var item : attendance.entrySet()) {
                attendancePercent.put(item.getKey(), item.getValue() * 100 / reportingPeriod);
           }
        }

        System.out.println("Список студентов, отсортированный по убыванию посещаемости в % (вверху самые посещающие): ");
        attendancePercent.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

}
