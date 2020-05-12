/**
 * @author Bill Glinton
 * Admission Number : 097292
 * Email            : tom.omuom@strathmore.edu
 */
public class YearRange {
    //Attributes
    int firstDivisor;
    int secondDivisor;
    int firstYear;
    int secondYear;
    int rangeType;

    //Constructors
    public YearRange( int min, int max){
        firstYear = min;
        secondYear = max;
    }

    //Getters
    public int getFirstDivisor(){
        return firstDivisor;
    }
    public int getSecondDivisor(){
        return secondDivisor;
    }
    public int getFirstYear(){
        return firstYear;
    }
    public int getSecondYear(){
        return secondYear;
    }
    public int getRangeType(){
        return rangeType;
    }

    //Setters
    public void setFirstDivisor(int newFirstDivisor){
        this.firstDivisor = newFirstDivisor;
    }
    public void setSecondDivisor(int newSecondDivisor){
        this.secondDivisor = newSecondDivisor;
    }
    public void setFirstYear(int newFirstYear){
        this.firstYear = newFirstYear;
    }
    public void setSecondYear(int newSecondYear){
        this.secondYear = newSecondYear;
    }
    public void setRangeType(int newRangeType){
        this.rangeType = newRangeType;
    }

    //Method to Print years Depending on RangeType
    public int printYears(){
        if (rangeType == 1){
            System.out.println("=========================================================================================================");
            System.out.println("=========================================================================================================");
            //Get all years Divisible by 14 and 20
            for (int j = firstYear; j <= secondYear; j++){
                if (j % firstDivisor == 0 && j % secondDivisor == 0){//Checks whether the number is divisible by 14
                    System.out.println(j);
                }
            }
            System.out.println("=========================================================================================================");
            System.out.println("=========================================================================================================");

        } else if(rangeType == 2){
            System.out.println("=========================================================================================================");
            System.out.println("=========================================================================================================");
            //Get all leap years
            for(int j = firstYear; j <= secondYear; j++){
                if(j % 4 == 0){//Checks whether the year is a Leap Year
                    System.out.println(j);
                }
            }
            System.out.println("=========================================================================================================");
            System.out.println("=========================================================================================================");

        } else if(rangeType == 3){
            System.out.println("=========================================================================================================");
            System.out.println("=========================================================================================================");
            //Get all Olympic Years Divisible by 3
            for(int j = firstYear; j <= secondYear; j++){
                if(j % 4 == 0 && j % firstDivisor == 0){
                    System.out.println(j);
                }
            }
            System.out.println("=========================================================================================================");
            System.out.println("=========================================================================================================");
        }else{
            System.out.println("====== END ======");
        }
        return 0;
    }

}