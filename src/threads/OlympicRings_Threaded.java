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
	timmy.setPenWidth(5);
	tammy.setSpeed(100);
	tammy.hide();
	tammy.setPenWidth(5);
	sammy.setSpeed(100);
	sammy.hide();
	sammy.setPenWidth(5);
	pammy.setSpeed(100);
	pammy.hide();
	pammy.setPenWidth(5);
	wammy.setSpeed(100);
	wammy.hide();
	wammy.setPenWidth(5);
	Thread r1 = new Thread(()->{
		timmy.penDown();
		timmy.hide();
		timmy.setPenColor(Color.BLUE);
		for (int i = 0; i <360; i++) {
			timmy.move(2);
			timmy.turn(2);
		}
		
	});
	Thread r2 = new Thread(()->{
		tammy.penDown();
		tammy.hide();
		tammy.setPenColor(Color.YELLOW);
		for (int i = 0; i < 360; i++) {
			tammy.move(2);
			tammy.turn(2);
		}
		
	});
	Thread r3 = new Thread(()->{
		sammy.penDown();
		sammy.hide();
		sammy.setPenColor(Color.BLACK);
		for (int i = 0; i < 360; i++) {
			sammy.move(2);
			sammy.turn(2);
		}
		
	});
	Thread r4 = new Thread(()->{
		pammy.penDown();
		pammy.hide();
		pammy.setPenColor(Color.GREEN);
		for (int i = 0; i <360; i++) {
			pammy.move(2);
			pammy.turn(2);
		}
	});
	Thread r5 = new Thread(()->{
		wammy.penDown();
		wammy.hide();
		wammy.setPenColor(Color.RED);
		for (int i = 0; i <360; i++) {
			wammy.move(2);
			wammy.turn(2);
		}
	});
			
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
}
}


