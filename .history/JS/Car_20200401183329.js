function Car(license,drive){
    this.id;
    this.license =license;
    this.drive  =drive;
    this.passenger;
}
Car.prototype.printDataCar =  function () {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)

}