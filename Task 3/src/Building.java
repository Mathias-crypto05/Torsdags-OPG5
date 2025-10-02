import java.util.ArrayList;

public class Building {
    // 3.d - Private fields
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    // 3.e - Constructor
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // 3.f - Getters
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    // 3.f - Setters
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
