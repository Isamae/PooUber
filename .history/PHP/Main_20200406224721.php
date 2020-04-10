<?php
    require_once("Account.php");
    require_once("Car.php");
    require_once("UberX.php");
    $car = new Car("QWEQ", new Account("Diego Montesdeoca","ANND123"));
    $car->passenger =4;
    $car->printDataCar();

?>