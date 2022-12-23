class Driver extends Account {
    public Driver(String name, String document, String email, String password){
        super(name, document, email, password);
    }
    void printDataUser(){
        System.out.println("Doucment driver: " + document + " Nme Driver: " + name + " E-mail: " + email + "Password" + password);
    }
}
