public class BeginsWith implements IsGood<String> {

    private String userString;

    public BeginsWith(String userString) {
        this.userString = userString;
    }

    @Override
    public boolean isGood(String arg) {
        return arg.startsWith(userString);
    }

}
