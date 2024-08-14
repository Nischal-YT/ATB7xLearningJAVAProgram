package August.ex_10082024;

public class RealTimeInheritance {
    public static void main(String[] args) {
        Baseclass t1 = new Testcase1();
        t1.setBrowser("opera", true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}
class Testcase1 extends Baseclass {
    // TestCase is A Type of BaseCalss - Single Inheritance
    Testcase1(){
        super(); // DC of Parent
        this.setBrowser("edge",true);
    }
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}

class Baseclass{
    Baseclass(){
        System.out.println("DC - BaseClass");
    }
    Baseclass(String b){
        System.out.println("CC - BaseClass");
    }
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth){
            this.browser = browser;
        }else{
            System.out.println("Not Allowed !!");
        }

    }
    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}
