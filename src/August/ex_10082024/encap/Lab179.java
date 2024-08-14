package August.ex_10082024.encap;
///////////////Encapsulation Fixed/////////////////////////////////

// *** The data members username and password are control by getter and setters(which are public in nature) ****////
public class Lab179 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin = new VWOLogin1("admin", "password123");
        System.out.println(vwoLogin.getUsername());
        vwoLogin.setUsername("nischal");
        System.out.println(vwoLogin.getUsername());
        // Write a code to Auth
        // Pramod - isAuth = true
        vwoLogin.setPassword("1234",true);
    }
}

class VWOLogin1 {
    ////Data members///////
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean IsAuth) {
        if(IsAuth){
            this.password = password;
        }
        else{
            System.out.println("NotAllowed!!");
        }

    }

    public VWOLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

