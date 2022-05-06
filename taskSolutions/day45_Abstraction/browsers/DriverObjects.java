package day45_Abstraction.browsers;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver("Google Chrome");
        chromeDriver.getBrowserName();
        chromeDriver.findElement("test1");
        chromeDriver.findElements("test2");
        chromeDriver.executeScript("test.sh");
        chromeDriver.get("https://github.com");
        chromeDriver.getTitle();
        chromeDriver.takeScreenshot();
        chromeDriver.close();
        chromeDriver.quit();


        EdgeDriver edgeDriver = new EdgeDriver("Microsoft Edge");
        edgeDriver.getBrowserName();
        edgeDriver.findElement("test1");
        edgeDriver.findElements("test2");
        edgeDriver.executeScript("test.sh");
        edgeDriver.get("https://github.com");
        edgeDriver.getTitle();
        edgeDriver.takeScreenshot();
        edgeDriver.close();
        edgeDriver.quit();

        FirefoxDriver firefoxDriver = new FirefoxDriver("Mozilla Firefox");
        firefoxDriver.getBrowserName();
        firefoxDriver.findElement("test1");
        firefoxDriver.findElements("test2");
        firefoxDriver.executeScript("test.sh");
        firefoxDriver.get("https://github.com");
        firefoxDriver.getTitle();
        firefoxDriver.takeScreenshot();
        firefoxDriver.close();
        firefoxDriver.quit();

        OperaDriver operaDriver = new OperaDriver("Opera");
        operaDriver.getBrowserName();
        operaDriver.findElement("test1");
        operaDriver.findElements("test2");
        operaDriver.executeScript("test.sh");
        operaDriver.get("https://github.com");
        operaDriver.getTitle();
        operaDriver.takeScreenshot();
        operaDriver.close();
        operaDriver.quit();

        SafariDriver safariDriver = new SafariDriver("Apple Safari");
        safariDriver.getBrowserName();
        safariDriver.findElement("test1");
        safariDriver.findElements("test2");
        safariDriver.executeScript("test.sh");
        safariDriver.get("https://github.com");
        safariDriver.getTitle();
        safariDriver.takeScreenshot();
        safariDriver.close();
        safariDriver.quit();
    }
}
