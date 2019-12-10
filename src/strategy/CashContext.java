package strategy;

/**
 * 执行的策略类
 */
public class CashContext {

    private Strategy strategy;

    CashContext() {

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double num1, double num2) {
        return strategy.doOperation(num1, num2);
    }
}
