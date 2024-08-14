package August.ex_10082024.superthiskeyword;

public class Lab184 {

}
class student extends person{
    // is A relation - inheritance
    @Override
    void message(){
        System.out.println("I am a student message");
    }
    void display(){
        super.message();
    }
}

    class person{
        void message(){
            System.out.println("I am a person message");
        }
    }

