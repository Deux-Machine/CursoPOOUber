<?php 
require_once('Payment.php');
class Tarjeta extends Payment {
    public $id;
    public $NombreTarjeta;
    public $NumeroTarjeta;
    public $cvv;
    public $fechaVencimiento;

    public function __construct($id, $NombreTarjeta, $NumeroTarjeta, $cvv, $fechaVencimiento) {
        parent::__construct($id);
        $this -> $NombreTarjeta = $NombreTarjeta;
        $this -> $NumeroTarjeta = $NumeroTarjeta;
        $this -> $cvv = $cvv;
        $this. $fechaVencimiento = $fechaVencimiento;
    }
}

?>