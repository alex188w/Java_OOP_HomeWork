package Task1;

public class Main {
    public static void main(String[] args) {
        WithPasswordUnlock approverPin = new WithPasswordUnlock(12);
        FingerprintUnlock approverFing = new FingerprintUnlock("qwe");
        FaceIDUnlock approverFace = new FaceIDUnlock("ert");
        Mode choiseMode = new Mode(1);

        int checkMode = 1;
        System.out.println("Выберите режим телефона: <<1>> - включение телефона");
        if (choiseMode.getMode() == checkMode) {
            System.out.println("Телефон включен");
        }

        int pin = 12;
        String fing = "qwe";
        String face = "ert5";

        checkUnlocker(approverPin, pin);
        checkUnlocker(approverFing, fing);
        checkUnlocker(approverFace, face);
    }

    private static <T> void checkUnlocker(Unlocker<T> approver, T pin) {
        if (approver.checkUnlock(pin) == true) {
            System.out.println("Телефон разблокирован");
        } else
            System.out.println("Телефон не разблокирован, неверный Pin");
    }
}
