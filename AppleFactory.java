import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppleFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        Apple apple = new Apple();
        double price = readPriceFromDatabase("apples.txt");
        apple.setPrice(price);
        return apple;
    }

    private double readPriceFromDatabase(String filename) {
        double price = 0.0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            if (line != null) {
                price = Double.parseDouble(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return price;
    }
}