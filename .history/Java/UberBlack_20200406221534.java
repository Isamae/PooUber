import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted ;
    ArrayList<String> seatsMaterial;
    public UberBlack(String license,Account driver,
    Map<String, ArrayList<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial
    ){
        super(license, driver);
        this.seatsMaterial = seatsMaterial;
        this.typeCarAccepted =typeCarAccepted;
    }

}