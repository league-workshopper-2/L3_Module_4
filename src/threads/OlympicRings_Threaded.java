package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot timmy = new Robot(600, 500);
	Robot tammy = new Robot(680, 550);
	Robot sammy = new Robot(760, 500);
	Robot pammy = new Robot(840, 550);
	Robot wammy = new Robot(920, 500);
	
	
	timmy.setSpeed(100);
	timmy.hide();
	tammy.setSpeed(100);
	tammy.hide();
	sammy.setSpeed(100);
	sammy.hide();
	pammy.setSpeed(100);
	pammy.hide();
	wammy.setSpeed(100);
	wammy.hide();
	Thread r1 = new Thread(()->{
		timmy.penDown();
		timmy.hide();
		timmy.setPenColor(Color.BLUE);
		for (int i = 0; i <360; i++) {
			timmy.move(1);
			timmy.turn(1);
		}
		
	});
	Thread r2 = new Thread(()->{
		tammy.penDown();
		tammy.hide();
		tammy.setPenColor(Color.YELLOW);
		for (int i = 0; i < 360; i++) {
			tammy.move(1);
			tammy.turn(1);
		}
		
	});
	Thread r3 = new Thread(()->{
		sammy.penDown();
		sammy.hide();
		sammy.setPenColor(Color.BLACK);
		for (int i = 0; i < 360; i++) {
			sammy.move(1);
			sammy.turn(1);
		}
		
	});
	Thread r4 = new Thread(()->{
		pammy.penDown();
		pammy.hide();
		pammy.setPenColor(Color.GREEN);
		for (int i = 0; i <360; i++) {
			pammy.move(1);
			pammy.turn(1);
		}
	});
	Thread r5 = new Thread(()->{
		wammy.penDown();
		wammy.hide();
		wammy.setPenColor(Color.RED);
		for (int i = 0; i <360; i++) {
			wammy.move(1);
			wammy.turn(1);
		}
	});
			
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
}
}


