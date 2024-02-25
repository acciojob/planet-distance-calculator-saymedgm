package com.driver;

public class PlanetDistanceCalculator {
    private final SolarSystemService solarSystemService;

    public PlanetDistanceCalculator(SolarSystemService solarSystemService) {
        this.solarSystemService = solarSystemService;
    }

    public double getDistance(String planetName) {
        return solarSystemService.getDistanceFromSun(planetName);
    }

    public double calculateRelativeDistance(String planet1, String planet2) {
        double distance1 = getDistance(planet1);
        double distance2 = getDistance(planet2);

        // Calculate relative distance (simple example)
        return Math.abs(distance1 - distance2);
    }
}