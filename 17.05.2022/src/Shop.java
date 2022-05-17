public class Shop {
    private FoodStuff[] foodStuffs;

    public Shop(FoodStuff[] foodStuffs) {
        this.foodStuffs = foodStuffs;
    }

    public Shop() {
    }

    public FoodStuff getFoodStuffByFoodName(String foodName) {
        FoodStuff result = null;
        for (int i = 0; i < this.foodStuffs.length; i++) {
            if (foodName.equals(foodStuffs[i].getFoodName())) result = foodStuffs[i];
            if (result != null) break;
        }
        return result;
    }

    public FoodStuff[] getFoodStuffByBrandName(String brandName) {
        FoodStuff[] result = new FoodStuff[];
        int j = 0;

        return result;
    }
    public int brandCounter(String brandName) {

        for (int i = 0; i < this.foodStuffs.length; i++) {
            if (brandName.equals(foodStuffs[i].getBrandName())) {
                result[j] = foodStuffs[i];
                j++;
            }
        }
    }

}
