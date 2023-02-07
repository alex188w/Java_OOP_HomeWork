package Task1;

public class FingerprintUnlock implements Unlocker<String> {

    private String pin;

    public FingerprintUnlock(String pin) {
        this.pin = pin;
    }

    @Override
    public boolean checkUnlock(String arg) {
        return arg.equals(pin);
    }
}
