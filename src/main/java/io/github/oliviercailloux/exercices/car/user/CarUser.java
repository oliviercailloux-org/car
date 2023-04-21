package io.github.oliviercailloux.exercices.car.user;

import io.github.oliviercailloux.exercices.car.ImmutablePerson;

public class CarUser {
	public static void main(String[] args) {
		MemorizerCar car = new MemorizerCar(new ImmutablePerson("name", 10));
		car.drive(1);
		car.drive(2);
		car.drive(5);
		car.getTotalTraveledDistance();
		// 10
		car.getFirstPosition();
		car.getSecondPosition();
		car.getThirdPosition();
	}
}
