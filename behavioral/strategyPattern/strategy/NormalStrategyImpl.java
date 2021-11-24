package behavioral.strategyPattern.strategy;

public class NormalStrategyImpl implements BillingStrategy {

    // Normal billing strategy (unchanged price)
    @Override
    public Double getActPrice(Double rawPrice) {
        return rawPrice;
    }
}
