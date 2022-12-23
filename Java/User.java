class User  extends Account {
    public User(String name, String document, String email, String password){
        super(name, document, email, password);
    }
    void printDataUser(){
        System.out.println("Doucment Usuario: " + document + " Nme Driver: " + name + " E-mail: " + email + " Password: " + password);
    }
}
