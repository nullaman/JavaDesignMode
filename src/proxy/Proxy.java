package proxy;

/**
 * 代理类，相当于我，帮小明送
 */
public class Proxy implements Gifts {

    private XiaoMing xiaoMing;

    // ！！！注意！！！
    Proxy(Girl girl) {
        this.xiaoMing = new XiaoMing(girl);
    }

    @Override
    public void flower() {
        xiaoMing.flower();
    }

    @Override
    public void chocolate() {
        xiaoMing.chocolate();
    }

}
