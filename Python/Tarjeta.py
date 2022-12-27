from Payment import Payment

class Tarjeta(Payment):
    NombreTarjeta = str
    NumeroTarjeta = str
    cvv = int
    fechaVencimiento = str

    def __init__(self, NombreTarjeta, NumeroTarjeta, cvv, fechaVencimiento):
        super.__init__(id)
        self.NombreTarjeta = NombreTarjeta
        self.NumeroTarjeta = NumeroTarjeta
        self.cvv = cvv
        self.fechaVencimiento = fechaVencimiento