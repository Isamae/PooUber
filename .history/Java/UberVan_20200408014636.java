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

    public UberVan(String license,Account driver){
        super(license, driver);
    }

    @Override
    public void setPassegenger(Integer passegenger) {
        if(passegenger ==6){
            this.passegenger = passegenger;
        }
        else{
            System.out.println("Agregar Dato");
        }
    }
}