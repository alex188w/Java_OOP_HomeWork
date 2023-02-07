package Task2;

import java.util.ArrayList;

public class MutableList<T> extends AbstractList<T> {

    public MutableList() {
        this.lst = new ArrayList<>();
    }

    @Override
    public void lstPrint() {
        System.out.println(lst);
    }

    @Override
    public void getInt(int i) {
        System.out.println(lst.get(i));
    }

    @Override
    public void getSize() {
        System.out.println(lst.size());
    }

    public void addInList(T i) {
        lst.add(i);
    }

    public void removeInList(T i) {
        lst.remove(i);
    }
}
