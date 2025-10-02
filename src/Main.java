import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1.e - opretter ArrayList med kunder
        ArrayList<Customer> customers = new ArrayList<>();

        // Tilføjer kunder (både med og uden mellemtrin)
        Customer c1 = new Customer("Mathias", "Rasmussen", "M_Rasmussen");
        Customer c2 = new Customer("Morten", "Helander", "M_Helander");
        customers.add(c1);
        customers.add(c2);

        // 1.f - kalder printCustomers
        printCustomers(customers);
    }

    // 1.f - static metode til at printe alle kunder
    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
