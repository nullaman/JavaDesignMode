package decorator.lol;

public class R extends Skills {

    private String skillName;

    public R(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能R:" + skillName);
        super.learnSkills();
    }
}
