package Exercise3;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // toString method to represent Person as a String
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
