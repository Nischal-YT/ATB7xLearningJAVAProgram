package August.ex_10082024.encap;

public class Lab180 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        // set the balance
        // admin
    amit.setBal(10000,false);
        System.out.println(amit.getName());
        System.out.println(amit.getBal(false));

        // Write a code to connect with mySQL
        //  Admin
        boolean IsAdmin = true;

    ICICIBank admin = new ICICIBank("admin", 500);
    admin.setBal(400,true);
        System.out.println(admin.getName());
        System.out.println(admin.getBal(IsAdmin));
    }
}
