
abstract public class Person {
    private String username;
    private String password;
    private String email;
    private String FirstName;
    private String LastName;
    private String Name;

    public Person(String FirstName,String LastName,String Username,String password,String email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.username = Username;
        this.password = password;
        this.email = email;
        this.Name = FirstName+" "+LastName;
    }

//    abstract String getUsername();
//    abstract String getEmail();
//    abstract void setUsername(String name);
//    abstract void setPassword(String password);
//    abstract void setEmail(String email);
//    abstract String getFirstName();
//    abstract String getName();
//    abstract String greet(Person p);
//    abstract int getNumber();

    public void setUsername(String name){
        this.username = name;
}

    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public String getUsername(){
        return username;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getName(){
        return Name;
    }
    abstract public int getNumber();

    public void setCurrentMoney(int CurrentMoney){
        System.err.println("This is not a user!!");
    }
    public int getCurrentMoney(){
        return -1;
    }

    public String greet(){
        return "Hello "+ getFirstName();
    }
}
