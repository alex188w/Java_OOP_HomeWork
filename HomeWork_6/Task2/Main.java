package Task2;

public class Main {
    public static void main(String[] args) {

        ImmutableList immutableList = new ImmutableList();
        immutableList.lstPrint();
        immutableList.getInt(3);
        immutableList.getSize();
        System.out.println();

        MutableList<String> mutableList = new MutableList<>();
        mutableList.addInList("Honda");
        mutableList.addInList("BMV");
        mutableList.addInList("Mazda");
        mutableList.addInList("Toyota");
        
        mutableList.lstPrint();
        mutableList.getInt(2);
        mutableList.removeInList("Toyota");
        mutableList.getSize();
        mutableList.lstPrint();
    }
}
