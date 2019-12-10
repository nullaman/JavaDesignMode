package factory.method;

public class Test {
    public static void main(String[] args) {
        IFactory volunteer = new Volunteer();
        LeiFeng heiHei = volunteer.createLeiFeng();
        System.out.println("志愿者学雷锋");
        heiHei.doRice();
        heiHei.doSweep();
        heiHei.doWash();

        System.out.println("---------分割线----------");

        System.out.println("大学生学雷锋");
        IFactory undergraduate = new Undergraduate();
        LeiFeng xiaoMing = undergraduate.createLeiFeng();
        xiaoMing.doRice();
        xiaoMing.doSweep();
        xiaoMing.doWash();

        LeiFeng hongHong = undergraduate.createLeiFeng();
        hongHong.doRice();
        hongHong.doSweep();
        hongHong.doWash();
    }
}
