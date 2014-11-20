/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class SteepleChaseRacer extends Racer {
	
	public SteepleChaseRacer(int y) {
      super(y);
   }

	@Override
	public void jumpRight() {
        turnLeft();
        int n = 0;
        while(!rightIsClear()) {
            move();
            n++;
        }
        turnRight();
        move();
        turnRight();
        for(int k = 1; k <= n; k++) {
            move();
        }
        turnLeft();
        
	}

}
