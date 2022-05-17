public class FoodStuff {

    private String foodName;
    private String typeOfFood;
    private String brandName;
    private double price;
    private double mass;

    public FoodStuff() {

    }

    public FoodStuff(String foodName, String typeOfFood, String brandName, double price, double mass) {
        this.setFoodName(foodName);
        this.setTypeOfFood(typeOfFood);
        this.setBrandName(brandName);
        this.setPrice(price);
        this.setMass(mass);
    }

    public void setFoodName(String foodName) {
        if (foodName.isEmpty()) this.foodName = foodName; else this.foodName = "Unknown";
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood.isEmpty()) this.typeOfFood = typeOfFood; else this.typeOfFood = "Unknown";
    }

    public void setBrandName(String brandName) {
        if (brandName.equals("")) this.brandName = brandName; else this.brandName = "Unknown";
    }

    public void setPrice(double price) {
        if (price > 0) this.price = price; else this.price = 999.99;
    }

    public void setMass(double mass) {
        if (mass > 0) this.mass = mass; else this.mass = 999;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }

    public double getMass() {
        return mass;
    }
}
