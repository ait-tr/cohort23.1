public class Person {
    private String personName;
    private Address address;

    public Person(String personName, Address address) {
        this.personName = personName;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
