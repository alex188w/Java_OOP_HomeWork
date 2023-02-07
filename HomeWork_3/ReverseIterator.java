import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {
    private int index;
    private StudentGroup student;

    public ReverseIterator(StudentGroup student) {
        this.student = student;
        this.index = student.getSize();
    }

    @Override
    public boolean hasNext() {
        return index > 0;
    }

    @Override
    public Student next() {
        --index;
        return student.get(index);
    }
}
