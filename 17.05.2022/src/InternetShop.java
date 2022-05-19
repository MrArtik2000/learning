public class InternetShop extends Shop {
    private User[] userList;

    public InternetShop(FoodStuff[] foodStuffs, User[] userList) {
        super(foodStuffs);
        this.userList = userList;
    }

}
