package decorator.lol;

public class E extends Skills {

    private String skillName;

    public E(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能E:" + skillName);
        super.learnSkills();
    }
}
