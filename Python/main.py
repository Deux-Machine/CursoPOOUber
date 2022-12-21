from Car import Car
from Account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("PHQ81F", Account("Sebastian Alvarez", "SOL321"))
    print(vars(car))
    print(vars(car.driver))