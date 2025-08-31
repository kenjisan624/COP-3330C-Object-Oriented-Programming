//Child Class: Prius_C: In this class as well, I am using the keyword extends which allow us
// to inherit methods from another class.
public class Prius_C extends Prius{
    //In addition, we used the super() to call the constructors
    public Prius_C (String name, double price, int year, double acceleration) {
        super(name, price, year, acceleration);

    }
    // Interestingly, We have implemented in parent class(Prius) the Model, and this child (Prius_C) has the
    // extended keyword meaning the override can be done here as well to the interface Model.
    // This override will modify the Model interface content for Prius_V only.

    // Variant method, I have added the released date and place after user input the specific
    // name of the car
    @Override
    public String variant() {
        return getName() + " was released in March of 2012 in United States.";
    }

    //MSRP method: I am adding the sentence to make it clear the value of the product using both the name
    // and the price.
    @Override
    public String MSRP(){
        return getName() + " had a original MSRP of $" + getPrice() + " dollars.";
    }


    //Customized Method

    // AgeYear: directly declaring the number of the current year as 2025 and subtracting
    // the year of the car input by the user giving us the years old of the vehicle.
    @Override
    public int ageyears() {// how toget the year
        return 2025 - year;
    }

    //Distance:As stated in the Prius.java, here I am declaring the number 10 which indicates
    //seconds. For an easy comprehension, Car starts at 0 km/s, thus multiplying by 10 seconds.
    @Override
    public double distance(){
        return acceleration * 10;
    }

    // Overridden to String by adding C model information
    @Override
    public String toString(){
    return"C model Information [name= " + getName()+ " , price= " + getPrice() + "]";
    }
}