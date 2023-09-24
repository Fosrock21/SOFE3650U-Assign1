public class GroceryStore {
    public static void main(String[] args) {
        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProductFactory appleFactory = new AppleFactory();

        GroceryProduct banana = bananaFactory.createProduct();
        GroceryProduct apple = appleFactory.createProduct();

        System.out.println(banana);
        System.out.println(apple);
    }
}
