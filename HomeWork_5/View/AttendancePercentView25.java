package View;

import java.util.Map;

public class AttendancePercentView25 {
    public void attendancePercent25(Map<String, Integer> attendancePercent) {
        System.out.println("Следующие студенты имеют посещаемость менее 25%:");
        int count = 0;
        for (var item : attendancePercent.entrySet()) {
            if (item.getValue() < 25) {
                System.out.println("Студент: " + item.getKey() + " - посещаемость: " + item.getValue() + "%");
            count++;
            }
        }
        if (count == 0) System.out.println("Таких студентов нет");
    }
        
}
