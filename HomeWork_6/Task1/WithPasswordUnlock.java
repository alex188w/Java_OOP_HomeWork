package Task1;

public class WithPasswordUnlock implements Unlocker<Integer> {

    private int pin;

    public WithPasswordUnlock(int pin) {
        this.pin = pin;
    }

    @Override
    public boolean checkUnlock(Integer arg) {
        return arg.equals(pin);
    }

}
