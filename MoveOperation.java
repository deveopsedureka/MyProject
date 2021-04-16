package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class MoveOperation {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		
		do {
			
			Robot robot=new Robot();
			Random random=new Random();
			robot.mouseMove(random.nextInt(400), random.nextInt(400));
			Thread.sleep(0x15f90L);
			
			
		}while(true);
		
	}

}
