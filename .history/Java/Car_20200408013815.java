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
        this.passegenger = passegenger;
    }

    /**
     * @return the passegenger
     */
    public Integer getPassegenger() {
        return passegenger;
    }
}