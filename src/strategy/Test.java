package strategy;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        CashContext cashContext = new CashContext();

        // 根据不同的情况，调用不同的算法
        cashContext.setStrategy(new OperationAdd());
        // 涨价：110.0
        System.out.println("涨价：" + cashContext.executeStrategy(100, 10));

        cashContext.setStrategy(new OperationDiscount());
        // 打折：80.0
        System.out.println("打折：" + cashContext.executeStrategy(100, 0.8));

        cashContext.setStrategy(new OperationSubstract());
        // 降价：90.0
        System.out.println("降价：" + cashContext.executeStrategy(100, 10));
//        Comparator
//     在Java的集合框架中，经常需要通过构造方法传入一个比较器Comparator，或者创建比较器传入Collections的静态方法中作为方法参数，进行比较排序等，使用的是策略模式。
//
//     在该比较架构中，Comparator就是一个抽象的策略；一个类实现该结构，并实现里面的compare方法，该类成为具体策略类；Collections类就是环境角色，他将集合的比较封装成静态方法对外提供api。

    }
}
