<?php 
require_once('Payment.php');
class PayPal extends Payment {
    public $id;
    public $referencia;
    public $sucursal;

    public function __construct($id, $referencia, $sucursal) {
        parent::__construct($id);
        $this -> $sucursal = $sucursal;
        $this -> $referencia = $referencia;
    }
}

?>