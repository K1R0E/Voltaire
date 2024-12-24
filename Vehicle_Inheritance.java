package vehiclee;


class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println(brand + " vehicle starts.");
    }
}


class Car extends Vehicle {
    private int seats;

    public Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }


    public int getSeats() {
        return seats;
    }

    public void drive() {
        System.out.println(getBrand() + " car with " + seats + " seats drives at " + getSpeed() + " km/h.");
    }
}


class SportsCar extends Car {
    private boolean turboEnabled;

    public SportsCar(String brand, int speed, int seats, boolean turboEnabled) {
        super(brand, speed, seats);
        this.turboEnabled = turboEnabled;
    }


    public boolean isTurboEnabled() {
        return turboEnabled;
    }

    public void race() {
        String turboStatus = turboEnabled ? "with turbo" : "without turbo";
        System.out.println(getBrand() + " sports car races " + turboStatus + " at " + getSpeed() + " km/h.");
    }
}


public class Vehicle_Inheritance {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari", 320, 2, true);
        sportsCar.start();
        sportsCar.drive();
        sportsCar.race();
    }
}
