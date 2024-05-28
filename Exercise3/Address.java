package Exercise3;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    // Constructor
    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    // toString method
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode;
    }
}
