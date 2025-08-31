// Name: Kenji Nakanishi | Course: COP 3330C | Date: 1/30/2025
// Program description: I am a big fan of the Toyota car model Prius, I own two prii(term for plural) according to
// the Toyota team after they did the survey on the plural term for prius in 2011, February 20.
// Prius with its original settings and the Prius V which stands for versatility,
// This program will perform inheritance and polymorphism. Interface "Model" has been added and by
// utilizing implements and extends I was able to modify the desired performance in other class.
// Prius mentioned that plural form of prius is prii
//Source: https://pressroom.toyota.com/toyota-announces-the-plural-of-prius/

public class CarApp {
    public static void main(String[] args) {

        // Instantiate objects of the child classes,(5 different objects)
        //In this case, I have declared different year version of the Prius V and C with its price, year built
        // and the acceleration it gets.
        Prius_V prius_v = new Prius_V("Prius model V", 26550, 2011, 10.2);
        Prius_V prius_v2 = new Prius_V("Prius model V2", 30935, 2016, 10.3);
        Prius_V prius_v3 = new Prius_V("Prius model V3", 30935, 2017, 10.2);
        Prius_C prius_c = new Prius_C("Prius model C", 18950, 2012, 11.3);
        Prius_C prius_c2 = new Prius_C("Prius model C2", 20630, 2019, 11.5);

        //Array section:
        // Declared the array of type Prius and named prii (since this is the plural name)
        // defined 5 different objects that previously assigned its values.
        Prius[] prii = {prius_v, prius_v2,prius_v3,prius_c, prius_c2};


        // Utilized the loop keyword "for" with the combination of prius : prii, which will go each values
        // Tried to make it more creative by adding a design of a car before each report.
        // The following print section will include toString method in an easy format.
        // variant, msrp, and depending on each model how old are they and how far can it go in 10 seconds.
        System.out.println("*******************************FULL REPORT*******************************");
        for (Prius prius : prii){
            System.out.println("    ______");
            System.out.println("   /|_||_\\`.__");
            System.out.println("  (  o  o  o  )");
            System.out.println("   `-(_)--(_)-'");
            System.out.println(prius.toString());
            System.out.println(prius.variant());
            System.out.println(prius.MSRP());
            System.out.println("Your car is manufactured in " + prius.year);
            System.out.println("This vehicle is " +  prius.ageyears() + " years old now.");
            System.out.println("This Version of prius can go up to " + prius.distance() + " meters of distance in 10 seconds.");
            System.out.println("***********************************PRIUS**********************************");
        }
    }
}