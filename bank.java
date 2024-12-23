package Bank;

class Account{
    public String name;
    protected String email;
    private String password;//to acces them in java there are getters and setters 
    //getters
    public void printName(){
        System.out.println(name);
    }
    public String getPassword(){
        setPassword("randomPass");
        return this.password;
    }
    //getters
    private void setPassword(String pass){
         this.password=pass;
    }
}
public class bank {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="Sahil";
        a1.email="sahilpatilkmp@gmail.com";
        // a1.setPassword("rutvik007");
        System.out.println(a1.getPassword());
        a1.printName();
    }
}
