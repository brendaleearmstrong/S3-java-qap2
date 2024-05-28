package Exercise3;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    // Accessor methods
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    // Charge method
    public void charge(Money amount) {
        if (balance.getAmount() + amount.getAmount() <= creditLimit.getAmount()) {
            balance.add(amount);
        } else {
            System.out.println("Error: Credit limit exceeded.");
        }
    }

    // Payment method
    public void payment(Money amount) {
        balance.subtract(amount);
    }
}
