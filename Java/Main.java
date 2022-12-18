class Main {
    
    public static void main(String[] args) {

        Car car = new Car();
        car.license = "PHQ81F";
        car.driver = "Sebastian Alvarez";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "LQK220";
        car2.driver = "Daniel Lopez";
        car2.passenger = 5;
        car.printDataCar();
        
    }
}
