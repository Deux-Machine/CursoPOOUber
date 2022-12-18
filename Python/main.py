from Car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "PHQ81F"
    car.driver = "Freddy"
    print(vars(car))

    car2 = Car()
    car2.license = "CUCA69"
    car2.driver = "El putas"
    print(vars(car2))