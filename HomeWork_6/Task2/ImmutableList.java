package Task2;

import java.util.ArrayList;

public class ImmutableList extends AbstractList<Integer> {

    public ImmutableList() {
        this.lst = new ArrayList<>();
        lst.add(3);
        lst.add(7);
        lst.add(5);
        lst.add(12);
        lst.add(35);
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
}
