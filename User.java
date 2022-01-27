//package Crypto.Code.CO225_Cryptocurrency_Auction_Management_System.codes;

public class User extends Person{
    private String username;
    private String password;
    private String email;
    private String FirstName;
    private String LastName;
    private String Name;
    private static int Usernumber;
    private int CurrentMoney;

    public User(String FirstName,String LastName,String Username,String password,String email){
        super(FirstName,LastName,Username,password,email);
        this.username = Username;
        this.password = password;
        this.email = email;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Name=FirstName+" "+LastName;
        CurrentMoney = 0;
        Usernumber++;
    }
//    @Override
//    public void setUsername(String name){
//        this.username = name;
//    }
//    @Override
//    public void setPassword(String password){
//        this.password = password;
//    }
//    @Override
//    public void setEmail(String email){
//        this.email = email;
//    }
//    @Override
//    public String getEmail(){
//        return email;
//    }
//    @Override
//    public String getUsername(){
//        return username;
//    }
//    @Override
//    public String getFirstName(){
//        return FirstName;
//    }
//    @Override
//    public String getName(){
//        return Name;
//    }
//    @Override
//    public String greet(Person admin){
//        return "Hello "+admin.getFirstName();
//    }
    @Override
    public int getNumber(){
        return Usernumber;
    }
    @Override
    public void setCurrentMoney(int Currentmoney){
        this.CurrentMoney=Currentmoney;
    }
    @Override
    public int getCurrentMoney(){
        return CurrentMoney;
    }
    @Override
    public String toString(){
        return "User "+ username+" with user Number "+ Usernumber;
    }
}
