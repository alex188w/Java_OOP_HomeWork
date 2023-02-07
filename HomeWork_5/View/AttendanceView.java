package View;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AttendanceView {
    public void fileReader() {
        System.out.println("Список всех студентов и их ежедневную посещаемость из файла: ");
        try (FileReader fr = new FileReader("file.txt")) {
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
}
