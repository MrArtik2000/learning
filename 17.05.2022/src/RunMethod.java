public class RunMethod {
    public static void main(String[] args) {
        FoodStuff item1 = new FoodStuff("Pizza", "medium", "Pingvin", 16.99, 640);
        FoodStuff item2 = new FoodStuff("CheeseBurger", "large", "McDonalds", 6.49, 230);
        FoodStuff item3 = new FoodStuff("Coca-Cola", "medium", "CocaCola", 3.74, 1000);

        System.out.println(item1.getFoodName() + ", " + item1.getBrandName() + ", " + item1.getTypeOfFood() + ", " + item1.getMass() + ", " + item1.getPrice());
        System.out.println(item2.getFoodName() + ", " + item2.getBrandName() + ", " + item2.getTypeOfFood() + ", " + item2.getMass() + ", " + item2.getPrice());
        System.out.println(item3.getFoodName() + ", " + item3.getBrandName() + ", " + item3.getTypeOfFood() + ", " + item3.getMass() + ", " + item3.getPrice());
    }
}
