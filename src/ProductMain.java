import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Herb Everett
 */
public class ProductMain {

    public static void main(String[] args) throws FileNotFoundException{

        File fileInput = new File("src/FoodProduct.txt");
        Scanner fp = new Scanner(fileInput);

        String name;
        String sku;
        double price;

        Date expDate = new Date();
        int refrigerationTemperature;
        int servingSize;
        int caloriesPerServing;

        ArrayList allergens = new ArrayList<String>();

        while (fp.hasNextLine()) {

            String line = fp.nextLine();
            String[] productSpec = line.split(",");
            name = productSpec[0];
            sku = productSpec[1];
            price = Double.parseDouble(productSpec[2]);

            String testDate = productSpec[3];
            DateFormat formatter = new SimpleDateFormat("MM/yyyy");

            try {
                expDate = formatter.parse(testDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            refrigerationTemperature = Integer.parseInt(productSpec[4]);
            servingSize = Integer.parseInt(productSpec[5]);
            caloriesPerServing = Integer.parseInt(productSpec[6]);

            if (productSpec.length > 5) {
                for (int i=7; i < productSpec.length; i++) {
                    allergens.add(productSpec[i]);
                }
            }

            System.out.println(name + " "
            + sku + " "
            + price + " "
            + expDate + "\n"
            + refrigerationTemperature + " "
                    + servingSize + " "
                    + caloriesPerServing + " "
                    + allergens + "\n \n");

        }
        fp.close();


        File fileInput2 = new File("src/CleaningProduct.txt");
        Scanner cp = new Scanner(fileInput2);

        String name2;
        String sku2;
        double price2;
        String chemicalName;
        String hazards;
        String precautions;
        String firstAid;

        ArrayList uses = new ArrayList<String>();

        while (cp.hasNextLine()) {
            String line = cp.nextLine();
            String[] chemSpec = line.split(",");
            name2 = chemSpec[0];
            sku2 = chemSpec[1];
            price2 = Double.parseDouble(chemSpec[2]);
            chemicalName = chemSpec[3];
            hazards = chemSpec[4];
            precautions = chemSpec[5];
            firstAid = chemSpec[6];

            if (chemSpec.length > 5) {
                for (int i=7; i < chemSpec.length; i++) {
                    uses.add(chemSpec[i]);
                }
            }
            System.out.println(name2 + " "
                    + sku2 + " "
                    + price2 + " "
                    + chemicalName + "\n"
                    + hazards + " "
                    + precautions + " "
                    + firstAid + " "
                    + uses + "\n \n");


        }

        cp.close();


    }
}
