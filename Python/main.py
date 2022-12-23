from Car import Car
from Account import Account
from UberX import UberX
from User import User

if __name__ == "__main__":
    print("Inicializando informacion de vehiculos")
    
    print("Car")
    car = Car("PHQ81F", Account("Sebastian Alvarez", "SOL321","lamas@gmail.com", "1234"))
    print(vars(car))
    print(vars(car.driver))

    print("UberX")
    uberX = UberX("ZAP386", Account("Daniel Perro", "ITV653", "zapata@gmail.com", "tuconejita"), "Prado", "No se de carros")
    print(vars(uberX))
    print(vars(uberX.driver))

    print("User")
    user = User("Sebastian Alvarez", "RES2400", "alvarezsebas552@gmail.com", "12385")
    print(vars(user))
