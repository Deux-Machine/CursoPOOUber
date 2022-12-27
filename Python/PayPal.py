from Payment import Payment
from Account import Account

class PayPal(Payment):
    referencia = str
    sucursal = str

    def __init__(self, id, sucursal, email):
        super.__init__(id, email)
        self.sucursal = sucursal
