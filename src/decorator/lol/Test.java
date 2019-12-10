package decorator.lol;

public class Test {
    public static void main(String[] args) {
        Hero yasso = new Yasso("亚索");

        Skills skills = new Skills(yasso);

        Skills q = new Q(skills, "斩钢闪");
        q.learnSkills();
        System.out.println("-----1------分割线----------");
        Skills e = new E(q, "风盾");
        e.learnSkills();
        System.out.println("-----2------分割线----------");
        Skills w = new W(e, "踏前斩");
        w.learnSkills();
        System.out.println("-----3------分割线----------");
        Skills r = new R(w, "狂风绝熄斩");
        r.learnSkills();
        System.out.println("-----4------分割线----------");

    }
}
