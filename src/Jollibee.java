public class Jollibee {
    String foods;
    int quantity;
    double price;

    public Jollibee(String foods, int quantity, double price) {
        this.foods = foods;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
