package proxy;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("红红");

        Proxy proxy = new Proxy(girl);

        proxy.flower();
        proxy.chocolate();

    }
}
