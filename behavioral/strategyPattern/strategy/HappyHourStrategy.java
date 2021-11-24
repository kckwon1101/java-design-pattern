package behavioral.strategyPattern.strategy;

public class HappyHourStrategy implements BillingStrategy {

    // Strategy for Happy hour (50% discount)
    @Override
    public Double getActPrice(Double rawPrice) {
        return rawPrice * 0.5;
    }
}
