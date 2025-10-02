public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        // Print the coffee menu
        for (String coffee : cafe.getCoffeeMenu()) {
            System.out.println(coffee);
        }
    }
}
