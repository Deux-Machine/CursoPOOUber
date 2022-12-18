class Main {
    
    public static void main(String[] args) {

        Car Car = new Car();
        Car.license = "PHQ81F";
        Car.driver = "Sebastian Alvarez";
        Car.passenger = 4;
        System.out.println("Car License: "+ Car.license);

        Car car2 = new Car();
        car2.license = "LQK220";
        car2.driver = "Daniel Lopez";
        car2.passenger = 5;
        System.out.println("Car License: "+ car2.license);
        
    }
}
