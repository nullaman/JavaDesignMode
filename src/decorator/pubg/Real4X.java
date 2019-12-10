package decorator.pubg;

/**
 * 真实的四倍镜类，继承四倍镜抽象类
 */
public class Real4X extends Abstract4X {

    public Real4X(Gun gun) {
        super(gun);
    }

    @Override
    public void aim4X() {
        System.out.println("装上了真实的4倍，突突突百发百中。");
    }
}
