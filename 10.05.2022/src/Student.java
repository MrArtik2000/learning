public class Student {
    private int age;
    private String name;
    private String speciality;

    public Student(int paramAge, String paramName, String speciality) {
        age = paramAge;
        name = paramName;
        this.speciality = speciality;
    }
    public void printInfo() {
        System.out.println("I'am " + name + ", my age " + age + ". And my speciality is " + speciality);
    }
}
