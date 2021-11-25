/**
 * Class Player
 * A single object represents the single player.
 * 
 * @author Olaf Chitil and dhrue raja
 * @version 16/2/2020
 */

public class Player extends Character
{
    private Room goal;
    private int timeLimit = 12; // sets move limit to 12
    
    /**
     * Constructor, taking start room and goal room.
     * Pre-condition: start location is not null.
     */
    public Player(Room start, Room goal)
    {
        super(start);
        this.goal = goal;
    }
    
    /**
     * Check whether time limit has been reached.
     */
    public boolean isAtTimeLimit(int time)
    {
        // checks if the player has reached the time limit of 12 moves 
        if ( timeLimit == time){
            return true;
        }
        else{
        return false; 
        }
    }
    
    /**
     * Check whether goal has been reached.
     */
    public boolean isAtGoal()
    {
        
        // checks if the player is at the goal of the game 
       if (getLocation() != goal){
       return false;
    }
       return true;
    }
    
    /**
     * Return a description.
     */
    public String toString()
    {
        return "you";
    }
}
