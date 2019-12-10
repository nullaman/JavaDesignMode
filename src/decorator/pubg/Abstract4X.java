package decorator.pubg;

/**
 * 四倍镜抽象类，实现四倍镜接口
 */
public abstract class Abstract4X implements Aim4X {

    private Gun gun;

    public Abstract4X(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void fire() {
        gun.fire();
    }

}
