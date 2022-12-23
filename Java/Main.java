class Main {
    
    public static void main(String[] args) {

        System.out.println("Inicializado");

        System.out.println("CAR");
        Car car = new Car("PHQ81F", new Account("Sebastian Alvarez", "AND123", "sebas@gmail.com", "53427"));
        car.passenger = 4;
        car.printDataCar();

        System.out.println("UBERX");
        UberX uberx = new UberX("RES312", new Account("Daniel Lopez", "END987", "Daniel@gmail.com", "29834"), "Twingo", "Negro");
        uberx.printDataUberX();

        System.out.println("USUARIO");
        User user = new User("Pedro Rua", "92637482", "prua@gmail.com", "000000");
        user.printDataUser();
    }
}
