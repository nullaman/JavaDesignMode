package decorator.pubg;

/**
 * 8倍类，继承8倍抽象类
 */
public class End8X extends Abstract8X {

    public End8X(Gun gun) {
        super(gun);
    }

    @Override
    public void aim4X() {
        System.out.println("8X--->4X");
    }

    @Override
    public void aim8X() {
        System.out.println("最终的8X");
    }
}
