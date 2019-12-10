package decorator.pubg;

/**
 * 8倍抽象类，实现8倍接口
 */
public abstract class Abstract8X implements Aim8X {

    private Gun gun;

    public Abstract8X(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void fire() {
        gun.fire();
    }
}
