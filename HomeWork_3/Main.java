import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    /* 1.
     * Класс Группа содержит в себе коллекцию Студентов. По группе можно
     * перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной
     * работы). Остальные задачи надстраиваются поверх неё.
     * 2.
     * Создайте класс GroupListIterator, который позволяет перемещаться по группе в
     * обоих направлениях. Он реализует интерфейс ListIterator<Student>.
     * Добавьте в Группу метод listIterator (), который позволяет начать итерацию с
     * помощью GroupListIterator.
     * 3.
     * Создайте класс ReverseIterator, который работает как итератор по группе в
     * обратном направлении:
     * • Он отслеживает текущую позицию в переборе
     * • Он изначально выставлен на конечную позицию
     * • Он движется справа налево
     * Проверьте, как он работает.
     */
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Иванов", LocalDate.of(2002, 10, 19), 4.9f));
        listStudents.add(new Student("Петров", LocalDate.of(2001, 12, 12), 5.0f));
        listStudents.add(new Student("Сидоров", LocalDate.of(1999, 1, 13), 3.1f));
        listStudents.add(new Student("Васильев", LocalDate.of(2005, 11, 19), 4.5f));
        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        
        // Задача 3.
        System.out.println("\nВ обратном направлении - ReverseIterator:"); 
        Iterator<Student> it =  studentGroup.reversIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
        // или так:
        for (Iterator<Student> iter = studentGroup.reversIterator(); iter.hasNext(); ) {
            Student student = iter.next();
            System.out.println(student);
        }

        // Задача 2.
        GroupListIterator groupListIterator = new GroupListIterator(0, studentGroup);
		System.out.println(studentGroup.iterator().next()); 

		System.out.println("\nРабота итератора слева направо:"); 
		while (groupListIterator.hasNext()) {
			System.out.println(groupListIterator.next());
		}

		System.out.println("\nРабота итератора справа налево :"); 
		while (groupListIterator.hasPrevious()) {
			System.out.println(groupListIterator.previous());
        }
    }  
} 