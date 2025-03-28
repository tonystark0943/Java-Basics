package a2;
import java.util.Scanner;

class Car1 {
    private String model;
    private int year;

    public void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}

public class q1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.setDetails("Toyota", 2020);
        Car1 car2 = new Car1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the model & year of the car: ");
        String model = sc.nextLine(); int year = sc.nextInt();
        car2.setDetails(model, year);

        car1.displayDetails();
        car2.displayDetails();
        
        if (car1.getYear() > car2.getYear()) {
            System.out.println("\nThe newer car is: " + car1.getModel());
        } else if (car1.getYear() < car2.getYear()) {
            System.out.println("\nThe newer car is: " + car2.getModel());
        } else {
            System.out.println("\nBoth cars are of the same year.");
        }

        sc.close();
    }
}

