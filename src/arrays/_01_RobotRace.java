package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	// 1. make a main method
public static void main(String[] args) {
	boolean finish = false;

	Robot[] rs = new Robot[5];
	Random r = new Random();		
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.
for (int i = 0; i < rs.length; i++) {
	rs[i] = new Robot("mini");
	rs[i].setSpeed(4);
	rs[i].setY(550);
	rs[i].setX((100 * i) + 50);
}
	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.
while (!finish) {
	
	

for (int i = 0; i < rs.length; i++) {
	int ran = r.nextInt(50);
	int ran2 = r.nextInt(20);
	rs[i].move(ran);
	rs[i].turn(ran2);
	if (rs[i].getY() >= 600) {
		finish = true;
		System.out.println("Robot " + (i + 1) + " won.(Throws Party)");
		break;
	}
}
}
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
}