package observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String product) {
        System.out.println("Cliente " + name + " foi notificado: Produto disponível - " + product);
    }
}
