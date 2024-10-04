import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String address;
    private String dob;
    private List<DebitCard> debitCards = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    public void owns(DebitCard card) {
        debitCards.add(card);
    }

    public void owns(Account account) {
        accounts.add(account);
    }
}
