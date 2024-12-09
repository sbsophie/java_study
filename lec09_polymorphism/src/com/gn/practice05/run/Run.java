package com.gn.practice05.run;

import com.gn.practice05.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.turnOn();
		c1.turnOff();
		c1.speedUp();
		c1.speedDown();
	}
}
