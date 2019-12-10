package proxy;

/**
 * 小明想送礼物给 女神红红
 */
public class XiaoMing implements Gifts {

    private Girl girl;

    XiaoMing(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void flower() {
        System.out.println(girl.getName() + "，送你花花~");
    }

    @Override
    public void chocolate() {
        System.out.println(girl.getName() + "，送你巧克力~");
    }

}
