package August.ex_11082024.ex_interface;

public class Important_Interview {
    public static void main(String[] args) {
        // I i = new I(): ///not possible
    }
}
interface I{} ///it is a valid
class A{} ///   concrete class
class B{} /// concrete class
abstract class C{}  /// non concrete class
class Test1 extends  A{} /// single inheritance it is valid Ok?
class Test2 extends B{} /// single inheritance it is valid
// class Test3 extends A,B{} /// not ok because of  Multiple Inheritance
class Test0 implements I{} //// valid
interface I1{ } ///// valid
interface I2{} ///// valide
class Test4 implements I1,I2{} ///possible ****** multiple Inheritance with interface
class Test5 extends A implements I1,I2{} ////possible
//class Test6 implements I1 extends A{}//// not possible
//interface I3 extends A{} ///// interface cannot extend anything not possible
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{} //// possible
//interface I7  extends C{}