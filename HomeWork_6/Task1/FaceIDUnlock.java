package Task1;

public class FaceIDUnlock implements Unlocker<String> {

    private String pin;

    public FaceIDUnlock(String pin) {
        this.pin = pin;
    }

    @Override
    public boolean checkUnlock(String arg) {
        return arg.equals(pin);
    }

}
