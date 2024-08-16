package August.ex_11082024.RealLIFEex;

public class Chrome extends BaseClass{

    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome .....,         // This is code releted to chrome only\n");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the Chrome .....,         // This is code releted to chrome only\n");
        return "";
    }
}
