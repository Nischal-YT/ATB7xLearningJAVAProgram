package August.accessModifiers.Criminal;

import August.accessModifiers.Police.Cop;

public class Theif {

    public static void main(String[] args) {
        Cop c = new Cop(100);
        //System.out.println(c.gun); because gun in private
        // c.canIShoot();             because canIshoot is protected
    }
}
