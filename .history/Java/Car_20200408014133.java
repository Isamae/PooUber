class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + " Name Driver: " + driver.name +" Pageros: " +passegenger);
    }

    /**
     * @param passegenger the passegenger to set
     */
    public void setPassegenger(Integer passegenger) {
        if(passegenger ==4){
            this.passegenger = passegenger;
        }
        else{
            System.out.println("Agregar Dato");
        }
    }

    /**
     * @return the passegenger
     */
    public Integer getPassegenger() {

        return passegenger;
    }
}