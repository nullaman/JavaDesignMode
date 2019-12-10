package decorator.pubg;

/**
 * 扩容弹夹抽象类，继承枪接口
 */
public abstract class AbstractMagazine implements Gun {

    private Gun gun;

    public AbstractMagazine(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void fire() {
        gun.fire();
    }
}
