package behavioral.strategyPattern;

import behavioral.strategyPattern.strategy.BillingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Double> drinks;

    private BillingStrategy strategy;


    public Customer(BillingStrategy strategy) {
        this.drinks = new ArrayList<>();
        this.strategy = strategy;
    }

    public void add(Double price, int quantity) {
        this.drinks.add(this.strategy.getActPrice(price * quantity));
    }

    public void printBill() {
        Double totalPrice = this.drinks.stream().reduce(Double::sum).orElse(0D);
        System.out.printf("Total price: %f%n", totalPrice);
        this.drinks.clear();
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
