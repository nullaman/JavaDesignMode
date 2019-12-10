package factory.easy;

public class People implements Animal {
    @Override
    public void run() {
        System.out.println("人在地上走");
    }
}
