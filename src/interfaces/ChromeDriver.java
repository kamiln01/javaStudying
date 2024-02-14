package interfaces;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Chrome is running.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Object found in Chrome.");
    }
}
