import java.util.ArrayList;
import java.util.List;

class Bank {
    private String code;
    private String address;
    private List<ATM> atms = new ArrayList<>();

    public void maintains() {
    }

    public void manageATM(ATM atm) {
        atms.add(atm);
    }
}
