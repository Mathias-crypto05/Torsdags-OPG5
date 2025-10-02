import java.util.ArrayList;

public class Main {

    // 3.j - Count total number of lamps in building
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    // 3.j - Count total number of windows in building
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    // 3.j - Count total number of rooms in building
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    // 3.k - Check if building is "normal"
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }

    public static void main(String[] args) {
        // 3.g - Create at least three Room objects
        Room livingRoom = new Room(3, 2);
        Room kitchen = new Room(2, 1);
        Room bedroom = new Room(1, 2);

        // 3.h - Add the rooms to a collection
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(livingRoom);
        roomList.add(kitchen);
        roomList.add(bedroom);

        // 3.i - Instantiate a new Building with the rooms
        Building normalBuilding = new Building(roomList, 2); // normal building
        Building weirdBuilding = new Building(roomList, 10); // "anormal" building

        // Print basic building info
        System.out.println("Normal Building Info:");
        System.out.println("Number of floors: " + normalBuilding.getNumberOfFloors());
        System.out.println("Number of rooms: " + normalBuilding.getRooms().size());

        // Print each room's details
        for (int i = 0; i < normalBuilding.getRooms().size(); i++) {
            Room r = normalBuilding.getRooms().get(i);
            System.out.println("Room " + (i + 1) + ": "
                    + r.getNumberOfLamps() + " lamps, "
                    + r.getNumberOfWindows() + " windows");
        }

        // Test 3.j methods
        System.out.println("\nTotal lamps in normal building: " + countLampsInBuilding(normalBuilding));
        System.out.println("Total windows in normal building: " + countWindowsInBuilding(normalBuilding));
        System.out.println("Total rooms in normal building: " + countRoomsInBuilding(normalBuilding));

        // Test 3.k - isNormal()
        System.out.println("\nIs normal building normal? " + isNormal(normalBuilding)); // true
        System.out.println("Is weird building normal? " + isNormal(weirdBuilding));     // false
    }
}
