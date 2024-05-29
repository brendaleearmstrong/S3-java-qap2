package Exercise3;

public class Money {
    private double amount;

    // Constructor
    public Money(double amount) {
        this.amount = amount;
    }

    public Money(Money other) {
        this.amount = other.amount;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return Double.compare(money.amount, amount) == 0;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }

    // compareTo method
    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }

    // Add method
    public void add(Money other) {
        this.amount += other.amount;
    }

    // Subtract method
    public void subtract(Money other) {
        this.amount -= other.amount;
    }
}
