/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer.event;

/**
 *
 * @author Administrator
 */
public class Goal extends GameEvent {
    
    public Goal(){
       
    }
    @Override
    public String toString() {
        return "GOAL! ";
    }
     
    @Override
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new Kickoff()};
        return theEvent;
    }
    
    @Override
    public boolean changePlayer() {
        return false;
    }
    
    @Override
    public boolean changeTeam() {
        return false;
    }
    
    
    // Little bit of a hack maybe as ballPos not used.
    public void setBallPos(int ballPos) {
       //super.setBallPos(100);
        super.ballPos = 100;
    }
     
}
