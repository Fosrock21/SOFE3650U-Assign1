import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BananaFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        Banana banana = new Banana();
        double price = readPriceFromDatabase("bananas.txt");
        banana.setPrice(price);
        return banana;
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