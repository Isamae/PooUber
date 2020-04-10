<?php
    require_once("Account.php");
    require_once("Car.php");
    $car = new Car("QWEQ", new Account("Diego Montesdeoca","ANND123"));
    $car->passenger =4;
    $car->printDataCar();

?>