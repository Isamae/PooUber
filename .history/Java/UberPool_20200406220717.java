
public class UberPool {
    String brand;
    String model;
    public UberPool(String license,Account driver,String brand ,String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}