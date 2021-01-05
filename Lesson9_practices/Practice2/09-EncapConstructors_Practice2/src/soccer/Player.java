/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class Player {
    
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;//It is very important to add the this keyword cause you cannot assign a variable to itself
    //the this keyword comes from the constructor method always.
    }
    public Player() {  }

    
    /* Practice 9-2. Add the constructor here */
    

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
}
