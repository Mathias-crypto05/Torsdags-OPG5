public class Customer {
    // 1.a - private felter
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    // 1.b + 1.c - konstruktør med navn og brugernavn
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++;
        this.id = counter;
    }

    // 1.d - toString metode til pæn udskrift
    @Override
    public String toString() {
        return "Kunde ID: " + id + "\n" +
                "Navn: " + firstName + " " + lastName + "\n" +
                "Brugernavn: " + username;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}