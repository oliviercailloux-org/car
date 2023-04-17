package io.github.oliviercailloux.exercices.car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarTests {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(CarTests.class);

	@Test
	void testDefaultPaint() throws Exception {
		ImmutablePerson driver = new ImmutablePerson("name", 10);
		Car car = new SimpleCar(driver);
		assertTrue(car.isBlack());
	}

	@Test
	void testPaint() throws Exception {
		ImmutablePerson driver = new ImmutablePerson("name", 10);
		Car car = new SimpleCar(driver);
		car.paintWhite();
		assertFalse(car.isBlack());
		car.paintWhite();
		assertFalse(car.isBlack());
		car.paintBlack();
		assertTrue(car.isBlack());
	}

	@Test
	void testDrive() throws Exception {
		ImmutablePerson driver = new ImmutablePerson("name", 10);
		Car car = new SimpleCar(driver);
		car.drive(2);
		assertEquals(20, car.getTotalTraveledDistance());
		car.drive(3);
		assertEquals(50, car.getTotalTraveledDistance());
	}

	@Test
	void testSwap() throws Exception {
		ImmutablePerson driver = new ImmutablePerson("Miss Fast & Furious", 50);
		ImmutablePerson passenger = new ImmutablePerson("Mister Peaceful", 10);
		Car car = new SimpleCar(driver);
		car.setPassenger(passenger);
		car.swap();
		car.drive(2);
		assertEquals(20, car.getTotalTraveledDistance());
		car.swap();
		car.drive(3);
		assertEquals(170, car.getTotalTraveledDistance());
	}
}
