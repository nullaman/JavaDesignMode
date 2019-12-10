package decorator.pubg;

/**
 * M416类，继承枪接口
 */
public class M416 implements Gun {
    @Override
    public void fire() {
        System.out.println("突突突···开火*30");
    }
}
