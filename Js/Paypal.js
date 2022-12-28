class PayPal extends Payment {

    constructor(id, sucursal, email) {
        super(id);
        this.sucursal = sucursal;
        this.email = email;

    } 
}