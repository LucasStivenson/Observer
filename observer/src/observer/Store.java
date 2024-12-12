package observer;
import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String product; 
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(product);
        }
    }
    
    public void newProductAvailable(String product) {
        this.product = product;
        System.out.println("Loja: Novo produto disponível - " + product);
        notifyObservers();
    }
}
