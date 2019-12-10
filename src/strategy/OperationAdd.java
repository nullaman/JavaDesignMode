package strategy;

/**
 * 涨价
 */
public class OperationAdd implements Strategy {
    /**
     * @param price 价钱
     * @param add   涨价
     * @return
     */
    @Override
    public double doOperation(double price, double add) {
        return price + add;
    }
}
