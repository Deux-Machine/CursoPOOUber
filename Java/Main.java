

class Main {
    
    public static void main(String[] args) {

        Car car = new Car("PHQ81F", new Account("Sebastian Alvarez", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("LQK220", new Account("Daniel Lopez", "ALA202" ));
        car2.passenger = 5;
        car.printDataCar();
        
    }
}
