import java.util.List;
import java.util.Collections;
import java.util.Random;
/**
 * Class Ghost
 * A ghost in the castle.
 * 
 * @author Olaf Chitil and dhrue raja
 * @version 16/2/2020
 */

public class Ghost extends Character
{
    private String description;

    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public Ghost(Room loc, String desc)
    {
        super(loc);
        // setting the description
        this.description = desc;
    }

    /**
     * Return the description.
     */
    public String toString()
    {
        return description; 
    }

    /**
     * Go to a random room.
     * @param rooms all rooms available
     * Pre-condition: the list is not empty.
     */
    public void goRandom(List<Room> rooms)
    {
        Random rand = new Random();
        Room r = rooms.get(rand.nextInt(rooms.size())); // rooms is list of rooms, picks random number is length of room list and chooses random room
        this.move(r);
        
       
    }
}
