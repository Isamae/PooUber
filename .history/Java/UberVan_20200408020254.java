import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String, ArrayList<String>> typeCarAccepted ;
    ArrayList<String> seatsMaterial;
    protected Integer passegenger;

    public UberVan(final String license, final Account driver, final Map<String, ArrayList<String>> typeCarAccepted,
            final ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.seatsMaterial = seatsMaterial;
        this.typeCarAccepted = typeCarAccepted;
    }

    public UberVan(final String license, final Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassegenger(final Integer passegenger) {
        if(passegenger ==6){
            this.passegenger = passegenger;
        }
        else{
            this.passegenger = passegenger;
        }        
    }
}