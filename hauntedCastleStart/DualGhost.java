/**
 * Class DualGhost
 * A dual ghost in the castle.
 * 
 * @author Olaf Chitil and Dhrue Raja
 * @version 16/2/2020
 */

public class DualGhost extends Ghost
{
    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public DualGhost(Room loc, String desc)
    {
        super(loc, desc);
        loc.dual();
       
    }
    
    public void move(Room loc)
    {
        this.getLocation().dual();
        super.move(loc);
        this.getLocation().dual();
    }
}
