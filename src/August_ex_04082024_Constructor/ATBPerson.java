package August_ex_04082024_Constructor;

public class ATBPerson {
    String name;
    long phone;

    // DC
    ATBPerson() {
        System.out.println("Object is created!");
    }

    ATBPerson(String nameGiven){
        this.name = nameGiven;
        // This current class.
    }

    ATBPerson(String nameGiven,long phoneNumber){
        this.name = nameGiven;
        this.phone = phoneNumber;
    }
}