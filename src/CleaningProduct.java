import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * Herb Everett
 */
public class CleaningProduct extends Product implements Chemical{

    private String chemicalName;
    private String hazards;
    private String precautions;
    private String firstAid;
    private ArrayList<String> uses;

    public CleaningProduct(String name, int sku, double price, String chemicalName, String hazards, String precautions, String firstAid, ArrayList<String> uses) {
        super(name, sku, price);
        this.chemicalName = chemicalName;
        this.hazards = hazards;
        this.precautions = precautions;
        this.firstAid = firstAid;
        this.uses = uses;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public String getHazards() {
        return hazards;
    }

    public void setHazards(String hazards) {
        this.hazards = hazards;
    }

    public String getPrecautions() {
        return precautions;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }

    public String getFirstAid() {
        return firstAid;
    }

    public void setFirstAid(String firstAid) {
        this.firstAid = firstAid;
    }

    public ArrayList<String> getUses() {
        return uses;
    }

    public void setUses(ArrayList<String> uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return "CleaningProduct{" +
                "Product info=" + super.toString() +
                "chemicalName='" + chemicalName + '\'' +
                ", hazards='" + hazards + '\'' +
                ", precautions='" + precautions + '\'' +
                ", firstAid='" + firstAid + '\'' +
                ", uses=" + uses +
                '}';
    }
}
