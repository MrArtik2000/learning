public class Person {

    private boolean sex;
    private int age;
    private String name;
    private double tall;

    public Person(boolean sex, int age, String name, double tall) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.tall = tall;

    }

    public boolean getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getTall() {
        return tall;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
}
