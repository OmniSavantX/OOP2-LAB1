/**
 * @author Bill Glinton
 * Admission Number:097292
 * Email:tom.omuom@strathmore.edu
 */

/**
 * This is the Main class of the program
 * The MultiplicationTable Class is called during the program's execution to print
 * the Multiplication Table of numbers between ranges
 */

//Main Class
public class Main {
    //Main Method
    public static void main(String[] args) {
        System.out.println("\n===========================================");
        System.out.println("\nAuthor:Bill Glinton\n");
        System.out.println("Admission Number: 097292\n");
        System.out.println("Email          : tom.omuom@strathmore.edu \n");
        System.out.println("==========================================================================\n");
        System.out.println(" Java Multiplication Table\n");
        System.out.println("==========================================================================\n");

        //The MultiplicationTable class is called in Creation of first MultiplicationTable object
        MultiplicationTable FirstMultiplicationNumber = new MultiplicationTable(3, 17, 25);
        //The PrintTable() Method of the MultiplicationTable class is called to
        //print the multiplication table of 3 between 17 and 25
        System.out.println(FirstMultiplicationNumber.printTable());

        //The MultiplicationTable class is called in Creation of first MultiplicationTable object
        MultiplicationTable SecondMultiplicationNumber = new MultiplicationTable(17, 3, 49);
        //The PrintTable() Method of the MultiplicationTable class is called to
        //print the multiplication table of 3 between 17 and 25
        System.out.println(SecondMultiplicationNumber.printTable());

        //The MultiplicationTable class is called in Creation of first MultiplicationTable object
        MultiplicationTable ThirdMultiplicationNumber = new MultiplicationTable(0, 1, 5);
        //The PrintTable() Method of the MultiplicationTable class is called to
        //print the multiplication table of 3 between 17 and 25
        System.out.println(ThirdMultiplicationNumber.printTable());

        System.out.println("           T H E      E N D                                                    \n");
        System.out.println("===============================================================================\n");
        
    }
}
