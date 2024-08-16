package August.ex_11082024.ex_interface.ex2;

public interface Engine {
    void startEngine();

    void stopEngine();

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();
    void m3();
//   void m4(){
//       System.out.println("Not possible"); //complete method
//   }
}

