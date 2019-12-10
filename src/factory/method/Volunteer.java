package factory.method;

/**
 * 志愿者学雷锋 - 继承工厂接口
 */
public class Volunteer implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new LeiFeng();
    }

}
