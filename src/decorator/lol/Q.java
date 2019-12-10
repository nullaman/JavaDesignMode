package decorator.lol;

/**
 * 技能Q
 */
public class Q extends Skills {

    private String skillName;

    public Q(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q:" + skillName);
        super.learnSkills();
    }
    
}
