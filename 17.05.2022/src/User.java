public class User {
    private String name;
    private String email;
    private String password;
    private FoodStuff[] basket;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static void sayAllParams(User said) {
        System.out.println(said.getName() + ", " + said.getEmail() + ", " + said.getPassword());
    }

    public static void declareAll(User[] declaration) {
        for (int i = 0; i < declaration.length; i++) {
            sayAllParams(declaration[i]);
        }
    }

    public FoodStuff[] getBasket() {
        return basket;
    }

    public void setBasket(FoodStuff[] basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
