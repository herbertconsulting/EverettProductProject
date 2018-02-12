import java.util.ArrayList;
import java.util.Date;

public interface Edible {

    public Date getExpDate();
    public void setExpDate(Date expDate);
    public int getServingSize();
    public void setServingSize(int servingSize);
    public int getCaloriesPerServing();
    public void setCaloriesPerServing(int caloriesPerServing);
    public ArrayList<String> getAllergens();
    public void setAllergens(ArrayList<String> allergens);

}
