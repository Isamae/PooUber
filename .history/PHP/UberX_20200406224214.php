<?php
require_once("Car.php");
    class UberX extends Car{
        public $brand;
        public $model;

        public function __construct($license,Account $driver,$brand,$model){
            parent::__construct($license,$driver);
            $this->brand = $brand;
            $this->model = $model;

        }
        
    }
?>