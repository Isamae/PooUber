import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String, ArrayList<String>> typeCarAccepted ;
    ArrayList<String> seatsMaterial;
    public UberVan(String license,Account driver,
    Map<String, ArrayList<String>> typeCarAccepted,
    ArrayList<String> seatsMaterial
    ){
        super(license, driver);
        this.seatsMaterial = seatsMaterial;
        this.typeCarAccepted =typeCarAccepted;
    }

}