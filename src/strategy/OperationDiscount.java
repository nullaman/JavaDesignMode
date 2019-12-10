package strategy;

/**
 * 打折
 */
public class OperationDiscount implements Strategy {
    /**
     * @param price    价钱
     * @param discount 折扣
     * @return
     */
    @Override
    public double doOperation(double price, double discount) {
        return price * discount;
    }
}
