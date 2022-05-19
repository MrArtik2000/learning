public class RunMethod {
    public static void main(String[] args) {
        FoodStuff item1 = new FoodStuff("Pizza", "medium", "McDonalds", 16.99, 640);
        FoodStuff item2 = new FoodStuff("CheeseBurger", "large", "McDonalds", 6.49, 230);
        FoodStuff item3 = new FoodStuff("Coca-Cola", "medium", "CocaCola", 3.74, 1000);

        FoodStuff[] pack = new FoodStuff[3];

        pack[0] = item1;
        pack[1] = item2;
        pack[2] = item3;

        User[] userList = new User[3];

        userList[0] = new User("name1", "email1", "password1");
        userList[1] = new User("name2", "email2", "password2");
        userList[2] = new User("name3", "email3", "password3");

        Shop sh1 = new InternetShop(pack, userList);

        System.out.println();
        System.out.println(">--------Catalogue declaration--------<");
        FoodStuff.declareAll(pack);

//        System.out.println();
//        System.out.println(">--------Users declaration--------<");
//        User.declareAll();

        System.out.println();
        System.out.println(">--------Search by food name--------<");
        FoodStuff.sayAllParams(sh1.getFoodStuffByFoodName("Pizza"));

        System.out.println();
        System.out.println(">--------Search by brand name--------<");
        FoodStuff.declareAll(sh1.getFoodStuffByBrandName("McDonalds"));

        System.out.println();
        System.out.println(">--------Search by type of food--------<");
        FoodStuff.declareAll(sh1.getFoodStuffByTypeOfFood("medium"));

        System.out.println();
        System.out.println(">--------Search by price range--------<");
        FoodStuff.declareAll(sh1.getFoodStuffPriceRange(2, 10));

        System.out.println();
        System.out.println(">--------Search by mass range--------<");
        FoodStuff.declareAll(sh1.getFoodStuffMassRange(500, 1000));
    }
}
