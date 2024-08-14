package August.ex_10082024.poly.methodoveridding;

public class Lab182 {
    ///Run Time Polymorphism///
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
        h1.bike();

        Dog d1 = new Dog();
        d1.bark();

    /// this can access only overridden functions ///
        Dog dog_ref = new Hound();
        dog_ref.bark();

        //dog_ref.bike(); not possible beacuse the dog dont even know the bike function

    }
}
