function Car(){
    this.id;
    this.license;
    this.drive;
    this.passenger;
}
Car.prototype.printDataCar =  function () {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)

}