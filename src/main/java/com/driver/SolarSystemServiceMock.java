package com.driver;

public class SolarSystemServiceMock implements SolarSystemService {
	public double getDistanceFromSun(String planetName) {
		// Mocking the external service's method call for testing purposes
		switch (planetName.toLowerCase()) {
			case "earth":
				return 150; // Mocked distance for Earth (in million kms)
			case "mars":
				return 228; // Mocked distance for Mars (in million kms)
			// Add more cases for other planets as needed
			default:
				throw new IllegalArgumentException("Unknown planet: " + planetName);
		}
	}
}