import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах:
Просто текст:
Иван Иванов=4.8
Мария Кузнецова=5.0
Степан Кузьмин=3.6

JSON:
{
"Иван Иванов": 4.8,
"Мария Кузнецова": 5.0,
"Степан Кузьмин": 3.6
}

XML:
<?xml version="1.0" encoding="utf-8" ?>
<students>
<student>
<name>Иван Иванов</name>
<grade>4.8</grade>
</student>
<student>
<name>Мария Кузнецова</name>
<grade>5.0</grade>
</student>
<student>
<name>Степан Кузьмин</name>
<grade>3.6</grade>
</student>
</students>
     */
    public static void main(String[] args) {
        Map<String, Double> table = new HashMap<>();
        table.put("Иван Иванов", 4.8);
        table.put("Мария Кузнецова", 5.0);
        table.put("Степан Кузьмин", 3.6);
        

        WriterTXT file1 = new WriterTXT();
        file1.FileWriter(table);

        WriterXML file2 = new WriterXML();
        file2.FileWriter(table);

        WriterJSON file3 = new WriterJSON();
        file3.FileWriter(table);

    }
}
    
