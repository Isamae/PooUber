<?php
require_once("Account.php");
    class Car {
        public $id;
        public $license;
        public $driver;
        public $passengenger;

        public function __construct($license,Account $driver){
            $this->license =$license;
            $this->driver =$driver;

        }
        public function printDataCar(){
            print "License :".$this->license "\n";
            print "Name Driver:".$this->driver->name;
        }
    }
?>