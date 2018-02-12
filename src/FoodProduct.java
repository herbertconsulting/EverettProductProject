import java.util.ArrayList;
import java.util.Date;

/**
 * Herb Everett
 */
public class FoodProduct extends Product implements Edible{

    private java.util.Date expDate;
    private int servingSize;
    private int caloriesPerServing;
    private ArrayList<String> allergens;

    public FoodProduct(String name, int sku, double price, Date expDate, int servingSize, int caloriesPerServing, ArrayList<String> allergens) {
        super(name, sku, price);
        this.expDate = expDate;
        this.servingSize = servingSize;
        this.caloriesPerServing = caloriesPerServing;
        this.allergens = allergens;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "Product info=" + super.toString() +
                "expDate=" + expDate +
                ", servingSize=" + servingSize +
                ", caloriesPerServing=" + caloriesPerServing +
                ", allergens=" + allergens +
                '}';
    }
}
