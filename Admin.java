

public class Admin extends Person {
    private String username;
    private String password;
    private String email;
    private String FirstName;
    private String LastName;
    private static int adminnumber;
    private String Name;

    public Admin(String FirstName,String LastName,String Username,String password,String email){
          super(FirstName,LastName,Username,password,email);
          this.FirstName = FirstName;
          this.LastName = LastName;
          this.username = Username;
          this.password = password;
          this.email = email;
          this.Name = FirstName+" "+LastName;
        adminnumber++;
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
        return adminnumber;
    }
    @Override
    public String toString(){
        return "Admin "+ username+"with AdminNumber "+adminnumber;
    }
}
