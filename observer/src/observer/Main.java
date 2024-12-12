package observer;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Customer customer1 = new Customer("Lucas");
        Customer customer2 = new Customer("Isabela");
        Customer customer3 = new Customer("Yasmin");

        store.addObserver(customer1);
        store.addObserver(customer2);

        store.newProductAvailable("iPhone 15 Pro Max");

        store.removeObserver(customer1);
        store.addObserver(customer3);

        store.newProductAvailable("MacBook Pro M3");
    }
}
