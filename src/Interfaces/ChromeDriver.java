package Interfaces;

public class ChromeDriver implements WebDriver {
    public ChromeDriver() {
    }

    public void get() {
        System.out.println("Chrome is running.");
    }

    public void findElementBy() {
        System.out.println("Object found in Chrome.");
    }
}