

public class CreateAccount {
    public static void main(String[] args){
        Person TestUser = new User("Haritha","Gunarathna","harithamindaka","testuserpassword","haritha@gmail.com");
        Person Admin = new Admin("AdminName","AdminLastName","adminadmin","adminPassword","adminemail");

        System.out.println(TestUser.getNumber());
        System.out.println(Admin.getNumber());
        System.out.println(TestUser);
    }
}
