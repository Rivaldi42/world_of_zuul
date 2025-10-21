import java.util.*;

class Room {
    private String description;
    private Map<String, Room> exits;

    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    public String getShortDescription() {
        return description;
    }

    public String getExitString() {
        StringBuilder returnString = new StringBuilder("Exits: ");
        for (String exit : exits.keySet()) {
            returnString.append(exit).append(" ");
        }
        return returnString.toString();
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }
}
