public class Car {
    public String brand, model;
    public Integer year, przebieg;

    public Car(){

    }

    public void drive() {
        System.out.println("Brum brum");
    }
    public void stop() {
        System.out.println("Stopping.");
    }
    public void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year of production: " + year);
        System.out.println("Kilometers: " + przebieg);
    }

    public Car(String brand, String model, Integer year, Integer przebieg){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.przebieg = przebieg;
        info();
    }
}
