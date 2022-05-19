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
        FoodStuff[] result = new FoodStuff[this.brandCounter(brandName)];
        int j = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {
            if (this.foodStuffs[i].getBrandName().equals(brandName)) {
                result[j] = this.foodStuffs[i];
                j++;
            }
        }
        return result;
    }

    public int brandCounter(String brandName) {
        int result = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {

            if (brandName.equals(foodStuffs[i].getBrandName())) {
                result ++;
            }
        }
        return result;
    }


    public FoodStuff[] getFoodStuffByTypeOfFood(String typeOfFood) {
        FoodStuff[] result = new FoodStuff[this.typeOfFoodCounter(typeOfFood)];
        int j = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {
            if (this.foodStuffs[i].getTypeOfFood().equals(typeOfFood)) {
                result[j] = this.foodStuffs[i];
                j++;
            }
        }
        return result;
    }

    public int typeOfFoodCounter(String typeOfFood) {
        int result = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {

            if (typeOfFood.equals(foodStuffs[i].getTypeOfFood())) {
                result ++;
            }
        }
        return result;
    }


    public FoodStuff[] getFoodStuffPriceRange(double minPrice, double maxPrice) {
        FoodStuff[] result = new FoodStuff[this.priceRangeCounter(minPrice, maxPrice)];
        int j = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {
            if (this.foodStuffs[i].getPrice() >= minPrice && this.foodStuffs[i].getPrice() <= maxPrice) {
                result[j] = this.foodStuffs[i];
                j++;
            }
        }
        return result;
    }

    public int priceRangeCounter(double minPrice, double maxPrice) {
        int result = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {

            if (this.foodStuffs[i].getPrice() >= minPrice && this.foodStuffs[i].getPrice() <= maxPrice) {
                result ++;
            }
        }
        return result;
    }


    public FoodStuff[] getFoodStuffMassRange(double minMass, double maxMass) {
        FoodStuff[] result = new FoodStuff[this.massRangeCounter(minMass, maxMass)];
        int j = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {
            if (this.foodStuffs[i].getMass() >= minMass && this.foodStuffs[i].getMass() <= maxMass) {
                result[j] = this.foodStuffs[i];
                j++;
            }
        }
        return result;
    }

    public int massRangeCounter(double minMass, double maxMass) {
        int result = 0;
        for (int i = 0; i < this.foodStuffs.length; i++) {

            if (this.foodStuffs[i].getMass() >= minMass && this.foodStuffs[i].getMass() <= maxMass) {
                result ++;
            }
        }
        return result;
    }



}
