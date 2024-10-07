
/**
 * 
 * The Vehicle class will be used to check the amount of fuel left in a
 * vehicle after traveling a certain distance. The class should have the instance variable
 * <code> tankSize </code> to store the initial size of the tank and the instance variable
 * <code> mpg </code> to store the initial miles per gallon of the vehicle. 
 * Set to zero the instance variable <code> fuelInTank </code> that is used to store the
 * initial amount of fuel in a tank. Complete all of the methods that are given below.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle
{
    // instance variables
    private double tankSize;
    private int mpg;
    private double fuelInTank; 
   
    

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(int mpg, double tankSize)
    {
        // TODO
        
    }
    
    /**
     * Returns the miles that this vehicle can drive based on how much fuel is left
     * in the tank and the mpg.
     */
    public int milesLeftOnTank(){
        // TODO
        return 0;  // delete this line of code
    }
    
    /**
     * Mutator method that reduces the amount of fuel in tank based
     * on the number of miles driven and the mpg. 
     * 
     * @param miles the number of miles to drive
     */
    public void drive(int miles){
        // TODO
        
    }
    
    /**
     * A mutator method that fills up the tank and
     * also returns the number of gallons it took to fill it up. 
     */
    public double fillItUp(){
        // TODO
        return 0.0; // delete this line of code
        
    }
    
    /**
     * Accessor method that returns the mpg of this vehicle.
     */
    public int getMilesPerGallon(){
        // TODO
        return 0; // delete this line of code
       
    }
    
    /**
     * Accessor method that returns the tank size (in gallons) of this vehicle.
     */
    public double getTankSize(){
        // TODO
        return 0.0; // delete this line of code
    }
    
    /**
     * Returns a String representation of this vehicle in the following format:
     * "Miles per Gallon: mpg
     *  Fuel Tank Capacity: tank size
     *  "
     */
    @Override
    public String toString(){
        // TODO
        return ""; // delete this line of code
    }
        
}
