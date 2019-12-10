package decorator.pubg;

public class Test {
    public static void main(String[] args) {
        System.out.println("【获取：M416】");
        Gun m416 = new M416();
        System.out.println("--------分割线---------");

        System.out.println("【上弹开火！】");
        m416.fire();
        System.out.println("--------分割线---------");

        System.out.println("【获取：扩容弹夹】");
        m416 = new Magazine(m416);
        m416.fire();
        System.out.println("--------分割线---------");

        System.out.println("【获取：虚假的4倍】");
        Aim4X aim4X = new Ostensible4X(m416);
        aim4X.aim4X();
        aim4X.fire();
        System.out.println("--------分割线---------");

        System.out.println("【获取：虚假的4倍】");
        aim4X = new Real4X(m416);
        aim4X.aim4X();
        aim4X.fire();
        System.out.println("--------分割线---------");

        System.out.println("【获取：8X】");
        Aim8X aim8X = new End8X(aim4X);
        aim8X.aim8X();
        aim8X.aim4X();
        aim8X.fire();
        System.out.println("--------分割线---------");
    }
}
