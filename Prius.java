//Parent Class: Prius
//This will serve as the superclass where I have declared the data types name, price,year, and acceleration.
// Implemented the interface model which contains two methods: Variant and MSRP
public abstract class Prius implements Model {
// Attributes declared as protected;
// 3 data types included: String for naming,
// double is sometimes marketing team uses 23999.99 as strategy and decimal numbers usage
// int for a whole number as the year is, and double for acceleration since decimal is needed for precise unit.

protected String name;
protected double price;
protected int year;
protected double acceleration;

// Constructor with has each attributes
    public Prius (String name, double price, int year, double acceleration){
        this.name = name;
        this.price = price;
        this.year = year;
        this.acceleration = acceleration;
    }

    // Getters and setters: Organized by get and set order.
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price = price;}
    public int getYear(){return year;}
    public void setYear(int year){this.year = year;}
    public double getAcceleration(){return acceleration;}
    public void setAcceleration(double acceleration){this.acceleration = acceleration;}

    // Customized Methods:
    // Age Years: By subtracting current year (2025), we can obtain the information on how old the car is.
    // example: 2024 Toyota prius will be 2025 - 2024 = 1 year old car.
    public abstract int ageyears();

    // Distance: With the calculation set as acceleration * 10 seconds.
    // We can calculate how far does it go in meters.
    public abstract double distance();

    //Overriding the toString method to return different result than the hash code.
    // This make more meaningful for us that we are not used to hexadecimal code.
    @Override
    public  String toString(){
    return "Car Information [name= " + name + " , price= " + price + "]";
    }
}


