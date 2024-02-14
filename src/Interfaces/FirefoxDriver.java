package Interfaces;

public class FirefoxDriver implements WebDriver {
    public FirefoxDriver() {
    }

    public void get() {
        System.out.println("Firefox is running.");
    }

    public void findElementBy() {
        System.out.println("Object found in Firefox.");
    }
}