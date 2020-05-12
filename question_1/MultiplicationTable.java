/**
 * @author Bill Glinton
 * Admission Number: 097292
 * Email           : tom.omuom@strathmore.edu
 */

/**
 * The Written program prints multiplication tables of 
 * a number from range to range
 */
public class MultiplicationTable {
    //Attributes
    int multiplication_number;//Multiplication Number
    int minimum_range;//Lowest value 
    int maximum_range;//Highest Value

    // Constructor
    public MultiplicationTable(int num, int min, int max) {
        multiplication_number = num;
        minimum_range = min;
        maximum_range = max;
    }

    // Getters
    public int getMultiplication_Number() {
        return multiplication_number;
    }

    public int getMinimum_Range() {
        return minimum_range;
    }

    public int getMaximum_Range() {
        return maximum_range;
    }

    // Setters
    public void setMultiplication_Number(int newMultiplicationNumber) {
        this.multiplication_number = newMultiplicationNumber;
    }

    public void setMinimumR_Range(int newMinimumRange) {
        this.minimum_range = newMinimumRange;
    }

    public void setMaximum_Range(int newMaximumRange) {
        this.maximum_range = newMaximumRange;
    }

    // Method to print the Multiplication Table
    public String printTable() {
        System.out.println("================================================================================\n");
        System.out.println("    Printing the Multiplcation Table of " + multiplication_number + " between "
                + minimum_range + " and " + maximum_range + "\n");
        System.out.println("================================================================================\n");
        for (int j = minimum_range; j <= maximum_range; j++) {
            System.out.println(multiplication_number + " X " + j + " = " + multiplication_number * j + "\n");
        }
        String string = "\n=================================================================================\n";
        return string;
    }

}
