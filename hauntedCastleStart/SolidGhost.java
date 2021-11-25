import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

/**
 * Class SolidGhost
 * A solid ghost in the castle.
 * 
 * @author Olaf Chitil
 * @version 4/2/2020
 */

public class SolidGhost extends Ghost
{
    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public SolidGhost(Room loc, String desc)
    {
        super(loc, desc);
    }
        
    /**
     * Go to a random neighbouring room.
     * If there is no neighbour, then stay in current room.
     * @param rooms all rooms available - actually ignored
     */
    public void goRandom(List<Room> rooms)
    {
        List<Room> canGo = new LinkedList();
        Room location = this.getLocation();
        
       for (Direction d : Direction.values()){
        Room ex = location.getExit(d);
        if (ex != null){
            canGo.add(ex);
        }
        int randomIndex = (int) (Math.random() * canGo.size());
        this.move(canGo.get(randomIndex));
        }
    }
}
