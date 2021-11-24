package behavioral.strategyPattern.strategy;

public interface BillingStrategy {

    Double getActPrice(Double rawPrice);
}
