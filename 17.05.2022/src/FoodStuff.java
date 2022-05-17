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

    public static void sayAllParams(FoodStuff said) {
        System.out.println(said.getFoodName() + ", " + said.getBrandName() + ", " + said.getTypeOfFood() + ", " + said.getMass() + ", " + said.getPrice());
    }

    public static void declareAll(FoodStuff[] declaration) {
        for (int i = 0; i < declaration.length; i++) {
            sayAllParams(declaration[i]);
        }
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
        if (this.foodName == null || this.foodName.isEmpty()) this.foodName = "Unknown";
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
        if (this.typeOfFood == null ||this.typeOfFood.isEmpty()) this.foodName = "Unknown";
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
        if (this.brandName == null ||this.brandName.isEmpty()) this.brandName = "Unknown";
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
