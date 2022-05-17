public class RunMethod {
    public static void main(String[] args) {
        FoodStuff item1 = new FoodStuff("Pizza", "medium", "McDonalds", 16.99, 640);
        FoodStuff item2 = new FoodStuff("CheeseBurger", "large", "McDonalds", 6.49, 230);
        FoodStuff item3 = new FoodStuff("Coca-Cola", "medium", "CocaCola", 3.74, 1000);

        FoodStuff[] pack = new FoodStuff[3];

        pack[0] = item1;
        pack[1] = item2;
        pack[2] = item3;

        Shop sh1 = new Shop(pack);

        for (int i = 0; i < pack.length; i++) FoodStuff.sayAllParams(pack[i]);

        System.out.println();

        FoodStuff.sayAllParams(sh1.getFoodStuffByFoodName("Pizza"));

        System.out.println();

        FoodStuff.declareAll(sh1.getFoodStuffByBrandName("McDonalds"));
    }
}
