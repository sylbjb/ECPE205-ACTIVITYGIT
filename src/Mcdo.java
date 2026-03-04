public class Mcdo {
    String foods;
    int prices;
    int amount;

    public Mcdo(String foods, int prices, int amount) {
        this.foods = foods;
        this.prices = prices;
        this.amount = amount;
    }
    public static void dislplay(){
        System.out.println("This is a branch of Mcdo");
    }
    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
