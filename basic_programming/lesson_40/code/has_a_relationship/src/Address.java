public class Address {
    String city;
    String country;
    String street;
    int houseNumber;

    public Address(String city, String country, String street, int houseNumber) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "city='" + city +
             ", country='" + country +
             ", street='" + street +
             ", houseNumber=" + houseNumber;
    }
}
