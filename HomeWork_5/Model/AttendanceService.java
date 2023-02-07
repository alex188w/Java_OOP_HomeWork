package Model;

import java.io.IOException;
import java.util.List;
import java.io.FileWriter;

public class AttendanceService {

    public void fileWriter(List<Student> args) {
        try (FileWriter nFile = new FileWriter("file.txt", false)) {
            for (Student entry : args) {
                nFile.write(entry + "\n");
            }
            nFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Информация о посещаемости студентов в файл File.txt сохранена");
    }
}
