package decorator.lol;

/**
 * 具体英雄 - 亚索
 */
public class Yasso implements Hero {

    /**
     * 英雄名称
     */
    private String name;

    public Yasso(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能。");
    }
    
}
