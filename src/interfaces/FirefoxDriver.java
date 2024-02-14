package interfaces;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Firefox is running.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Object found in Firefox.");
    }
}
