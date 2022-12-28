class Tarjeta  extends Payment {
    String NombreTarjeta;
    Integer NumeroTarjeta;
    Integer cvv;
    String fechaVencimiento;

    public Tarjeta(Integer id, String NombreTarjeta, Integer NumeroTarjeta, Integer cvv, String fechaVencimiento) {
        super(id);
        this.NombreTarjeta = NombreTarjeta;
        this.NumeroTarjeta = NumeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;


    }
}
