package August.ex_10082024.superthiskeyword;

import java.sql.SQLOutput;

public class Lab183 {
    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.
    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }
}
class Car extends vehicle{
    private int max_speed = 281;

    Car(){
        super(10); // Constructor Chaining
        System.out.println("Default constructor of Car");
    }


    public void display(){
        System.out.println("Car speed is -> "+ this.max_speed);        ///this - same class
        System.out.println("Vehicle speed is --> "+ super.max_speed); ///super - parent
        super.message();
        this.message();
    }

    @Override
    void message(){
        System.out.println("Hello vehicle");
    }
}


class vehicle{
    public int max_speed = 180;

    vehicle(){
        System.out.println("Default constructor of vehicle");
    }
    vehicle(int a){
        System.out.println("Parameterised constructor of vehicle");
    }

    void message(){
        System.out.println("Hello vehicle");
    }

    void message(int a){
        System.out.println("Hello vehicle");
    }
}
