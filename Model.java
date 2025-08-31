//Interface file,
public interface Model {
// declare at least 2 methods that all implementing

// classes must override.
    // Variant method: Will display the specific model of the car to the screen.
    // It will return the name user input.
    String variant();

    // MSRP method: It will display the initial launch price to the user.
    //MSRP stands for Manufacturer Suggested retail price.
    String MSRP();
}