package August_ex_04082024_Constructor.hasA.ex;

public class Car {
    // Aggregation - hasA
    protected void StartTheCar(){
        new Engine().start();
        new Tyres().rolling();
    }
}
