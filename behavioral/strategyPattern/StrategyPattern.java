package behavioral.strategyPattern;

import behavioral.strategyPattern.strategy.HappyHourStrategy;
import behavioral.strategyPattern.strategy.NormalStrategyImpl;

public class StrategyPattern {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(new NormalStrategyImpl());

        // Normal billing
        firstCustomer.add(1.0, 2);

        // Start Happy Hour
        firstCustomer.setStrategy(new HappyHourStrategy());
        firstCustomer.add(0.8, 1);

        // New Customer
        Customer secondCustomer = new Customer(new HappyHourStrategy());
        secondCustomer.add(0.8, 1);

        // The Customer pays
        firstCustomer.printBill();

        // End Happy Hour
        secondCustomer.setStrategy(new NormalStrategyImpl());
        secondCustomer.add(1.3, 2);
        secondCustomer.add(2.5, 1);
        secondCustomer.printBill();
    }
}
