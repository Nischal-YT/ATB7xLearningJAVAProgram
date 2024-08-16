package August.ex_11082024.ex_interface;

public class Lab193 {
    public static void main(String[] args) {
        Car c  = new Car();
        c.start();
        c.m1();
    }
}

interface Eng{
    void start();
    ////default is used when we have to use that m1 for all the functions or methods

    default void m1(){
        System.out.println("Old M1");
    }

    default void suite(){
        System.out.println("wear suite");
    }
}

interface GearBox extends Eng{
    void gear();

}

interface Keys extends GearBox{
    void openCar();
}



class Car implements Keys {

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void gear() {

    }

    @Override
    public void openCar() {

    }
}
