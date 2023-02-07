import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int index = 0;
    private StudentGroup studentGroup;

    public GroupListIterator(int index, StudentGroup studentGroup) {
        this.index = index;
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.getSize();
    }

    @Override
    public Student next() {
        return studentGroup.get(index++);
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Student previous() {
        return studentGroup.get(--index);
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public int previousIndex() {
        return index;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Student student) {

    }

    @Override
    public void add(Student student) {

    }
}
