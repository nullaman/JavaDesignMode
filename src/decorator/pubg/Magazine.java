package decorator.pubg;

/**
 * 扩容弹夹实现类，继承扩容弹夹抽象类
 */
public class Magazine extends AbstractMagazine {

    public Magazine(Gun gun) {
        super(gun);
    }

    @Override
    public void fire() {
        System.out.println("突突突···开火*40");
    }
}
