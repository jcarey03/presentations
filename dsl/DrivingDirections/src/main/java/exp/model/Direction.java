package exp.model;

/**
 * Represents the abstract notion of a direction.
 */
public abstract class Direction {

    private final String location;
    
    private final double distanceInMiles;

    private final double distanceInMinutes;

    public Direction(final String location, final double distanceInMiles, final double distanceInMinutes) {
        this.location = location;
        this.distanceInMiles = distanceInMiles;
        this.distanceInMinutes = distanceInMinutes;
    }

    public String getLocation() {
        return location;
    }
    
    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    public double getDistanceInMinutes() {
        return distanceInMinutes;
    }

}