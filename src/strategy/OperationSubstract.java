package strategy;

/**
 * 降价
 */
public class OperationSubstract implements Strategy {
    /**
     * @param price     价钱
     * @param substract 减价
     * @return
     */
    @Override
    public double doOperation(double price, double substract) {
        return price - substract;
    }
}
