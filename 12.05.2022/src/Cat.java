public class Cat {

    private String name;
    private double weight;
    private int age;
    private String color;
    private String adress;

    public Cat(String name){
        this.name = name;
        this.weight = 4;
        this.age = 1;
        this.color = "Unknown";
        this.adress = null;
    }

    public Cat(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Unknown";
        this.adress = null;
    }

    public Cat(String name, int age){
        this.name = name;
        this.weight = 4;
        this.age = age;
        this.color = "Unknown";
        this.adress = null;
    }

    public Cat(double weight, String color){
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.color = color;
        this.adress = null;
    }

    public Cat(double weight, String color, String adress){
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.color = color;
        this.adress = adress;
    }

    public Cat(String name, double weight, int age, String color, String adress) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
