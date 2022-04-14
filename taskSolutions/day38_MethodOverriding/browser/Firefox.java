package day38_MethodOverriding.browser;

public class Firefox extends Browser {
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }
}
