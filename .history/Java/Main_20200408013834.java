class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberx = new UberX("AMQ123", new Account("Andres Herrera", "AND123"),"Mazda","Alfa");
        uberx.setPassegenger(4);
        uberx.printDataCar();
    }
}