package Model;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate date;
    private Boolean attendance;
    
    public Student(String name, LocalDate date, Boolean attendance) {
        this.name = name;
        this.date = date;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public Boolean getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", date = " + date + ", attendance = " + attendance + "]";
    }

}
