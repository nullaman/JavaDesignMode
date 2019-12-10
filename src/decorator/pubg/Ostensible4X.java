package decorator.pubg;

/**
 * 虚假的四倍镜类，继承四倍镜抽象类
 */
public class Ostensible4X extends Abstract4X {

    public Ostensible4X(Gun gun) {
        super(gun);
    }

    @Override
    public void aim4X() {
        System.out.println("装上了虚假的4倍，描边枪法。");
    }
}
