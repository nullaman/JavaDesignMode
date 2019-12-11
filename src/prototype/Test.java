package prototype;

import java.time.LocalDate;

/**
 * 引用方式 和 clone()对比
 */
public class Test {
    public static void main(String[] args) {
        Resume resume = new Resume();
        resume.setDate(LocalDate.now().minusMonths(1).toString());
        resume.setName("aman");
        resume.setContent(999 + "企业");
        System.out.println(resume);

        int i = 0;
        while (i < 10) {
            System.out.println("=======================");
            i++;
            resume.clone();
            resume.setContent(String.valueOf(i));
            System.out.println(resume);
        }
//
//        Resume AAA = resume;
//        System.out.println("===========【 1 】============");
//        System.out.println("resume:|||" + resume);
//        System.out.println("AAA:   |||" + AAA);
//
//        System.out.println("===========【 2 】============");
//        // ！！！更改任意一个，都会改变 ！！！
//        //Resume.setContent("????????");
//        AAA.setContent("????????");
//        System.out.println("resume:|||" + resume);
//        System.out.println("AAA:   |||" + AAA);
//
//        System.out.println("===========【 3 】============");
//        Resume clone = (Resume) resume.clone();
//        System.out.println("resume:|||" + resume);
//        System.out.println("AAA:   |||" + AAA);
//        System.out.println("clone: |||" + clone);
//
//        System.out.println("===========【 4 】============");
//        clone.setContent("clone嘻嘻嘻嘻");
//        System.out.println("resume:|||" + resume);
//        System.out.println("AAA:   |||" + AAA);
//        System.out.println("clone: |||" + clone);

    }
}
