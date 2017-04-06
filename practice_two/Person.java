/**
 * Created by yidafu on 17-4-6.
 */
public class Person {
    private String name;
    private String ages;
    private String gender;

    public Person() {
        this.name   = "无名";
        this.ages   = "没有设置";
        this.gender = "没有设置";

    }

    //其他构造方法略

    public Person(String name, String ages, String gender) {
        this.name   = name;
        this.ages   = ages;
        this.gender = gender;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getAges() {
        return this.ages;
    }

    public String getGender() {
        return this.gender;
    }

    public String getInfo() {
        return "姓名：" + this.name + "，年龄：" + this.ages + "，性别：" + this.gender;
    }
}
