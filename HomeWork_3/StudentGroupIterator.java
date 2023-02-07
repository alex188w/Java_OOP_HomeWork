import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

	private int index = -1;
	private StudentGroup studentGroup;

	public StudentGroupIterator(StudentGroup studentGroup) {
		this.studentGroup = studentGroup;
	}

	@Override
	public boolean hasNext() {
		return index < studentGroup.getSize()-1;
	}

	@Override
	public Student next() {
		++index;
		return studentGroup.get(index);
	}
}