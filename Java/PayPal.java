class PayPal extends Payment{
    String Sucursal;
    String email;

    public PayPal(Integer id, String Sucursal, String email){
        super(id);
        this.Sucursal = Sucursal;
        this.email = email;
    }
}
