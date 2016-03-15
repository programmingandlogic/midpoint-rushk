
import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// precondition: Karel is in bottom left hand corner (1,1), facing East, the world is clear of beepers
	//postcondition: Karel is in the middle of world on first avenue (1, y)atop it's beeper

	public void run() {
		
		int w = 0;
		
		while( frontIsClear() ) {
			move();
			w++;
			}
		
		System.out.println ( "width :" + w );
		
		turnLeft();
		turnLeft();
		
		for (int i = 0; i < w/2; i++) {
			move();
			}
			
		putBeeper();
	}
}


