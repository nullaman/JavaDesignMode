package factory.easy;

/**
 * 工厂类
 */
public class AnimalFactory {
    public static Animal createAnimal(String animal) {
        switch (animal) {
            case "fish":
                return new Fish();
            case "bird":
                return new Bird();
            case "people":
                return new People();
            default:
                return null;
        }
    }
}
