public class Banana implements GroceryProduct {
    private double price;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Banana [price=" + price + "]";
    }
}