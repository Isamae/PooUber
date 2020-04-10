<?php
    require_once("Account.php");
    require_once("Car.php");
    require_once("UberX.php");
    $uberX = new Car("QWEQ", new Account("Diego Montesdeoca","ANND123"),"Chevrolet","SpartS");
    $uberX->passenger =4;
    $uberX->printDataCar();

?>