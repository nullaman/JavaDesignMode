package factory.method;

/**
 * 大学生学雷锋 - 继承工厂接口
 */
public class Undergraduate implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new LeiFeng();
    }

}
