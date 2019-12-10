package factory.easy;

public class Test {
    public static void main(String[] args) {
        Animal fish = AnimalFactory.createAnimal("fish");
        // 调用方法
        fish.run(); //输出结果: 鱼在水中游泳
    }
}
