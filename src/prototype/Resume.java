package prototype;

/**
 * 简历类 - 实现Cloneable,重写clone()
 */
public class Resume implements Cloneable {

    private String date;
    private String name;
    private String content;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Object clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    @Override
    public String toString() {
        return this.getName() + "，在【" + this.getDate() + "】在【" + this.getContent() + "】干活。";
    }

}
