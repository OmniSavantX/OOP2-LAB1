/**
 * @author Bill Glinton
 * Admission Number: 097292
 * Email           : tom.omuom@strathmore.edu
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n========================================================================================================");
        System.out.println("=================== A Building report written in Java ==================================================");
        System.out.println("=================== Author: Bill Glinton              ==================================================");
        System.out.println("=================== Admission No: 097292              ==================================================");
        System.out.println("========================================================================================================\n");
        System.out.println("========================================================================================================");
        System.out.println("=================== Start of Report ====================================================================");
        System.out.println("========================================================================================================");

        Building firstBuilding = new Building();
        firstBuilding.setBuildingName("Britam");
        firstBuilding.setBuildingColor("White");
        firstBuilding.setBuildingFloors(32);
        firstBuilding.setRoomsFloor(5);
        firstBuilding.printBuilding();

        Building secondBuilding = new Building();
        secondBuilding.setBuildingName("UAP Towers");
        secondBuilding.setBuildingColor("Cream");
        secondBuilding.setBuildingFloors(33);
        secondBuilding.setRoomsFloor(5);
        secondBuilding.printBuilding();

        Building thirBuilding = new Building();
        thirBuilding.setBuildingName("Times Towers");
        thirBuilding.setBuildingColor("Cream");
        thirBuilding.setBuildingFloors(38);
        thirBuilding.setRoomsFloor(5);
        thirBuilding.printBuilding();

        Building fourthBuilding = new Building();
        fourthBuilding.setBuildingName("KICC");
        fourthBuilding.setBuildingColor("Brown");
        fourthBuilding.setBuildingFloors(32);
        fourthBuilding.setRoomsFloor(4);
        fourthBuilding.printBuilding();

        Building UAP = new Building();
        UAP.setBuildingName("Social Security House");
        UAP.setBuildingColor("White");
        UAP.setBuildingFloors(28);
        UAP.setRoomsFloor(4);
        UAP.printBuilding();

        System.out.println("========================================================================================================");
        System.out.println("=================== End of Report ======================================================================");
        System.out.println("========================================================================================================");
        
    }
}