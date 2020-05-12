/**
 * @author Bill Glinton
 * Admission Number: 097292
 * Email           : tom.omuom@strathmore.edu
 */
public class Building {
    String buildingName;//Name of the building
    int buildingFloors;//Number of Floors
    int roomsFloor;//Number of rooms per floor
    String buildingColor;//Colour
    
    //Getters
    public String getBuildingName(){
        return buildingName;
    }
    public int getBuildingFloors(){
        return buildingFloors;
    }
    public int getRoomsFloor(){
        return roomsFloor;
    }
    public String getColor(){
        return buildingColor;
    }
    public int getBuildingRooms(){
        return roomsFloor*buildingFloors;
    }

    //Setters
    public void setBuildingName(String newBuildingName){
        this.buildingName = newBuildingName;
    }
    public void setBuildingFloors(int newBuildingFloors){
        this.buildingFloors = newBuildingFloors;
    }
    public void setRoomsFloor(int newRoomsFloor){
        this.roomsFloor = newRoomsFloor;
    }
    public void setBuildingColor(String newBuildingColor){
        this.buildingColor = newBuildingColor;
    }

    //Method to print details of a building
    public void printBuilding(){
        String[] building = {buildingName, buildingColor};
        System.out.println("\n"+building[0]+" is a "+building[1]+" coloured building and has "+getBuildingRooms()+" rooms.\n");
    }
}