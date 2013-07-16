package exp.model;

/**
 * Defines a builder for creating <code>Direction</code> instances.
 */
public interface DirectionBuilder {

	/** 
	 * @return the built <code>Direction</code> instance
	 */
    Direction build();
    
    /**
     * Sets the distance in miles until reaching the target location.
     * 
     * @param distanceInMiles the distance in miles
     * 
     * @return this builder
     */
    DirectionBuilder in_miles(double distanceInMiles);

    /**
     * Sets the time in minutes until reaching the target location.
     * 
     * @param distanceInMinutes the distance in minutes
     * 
     * @return this builder
     */
    DirectionBuilder in_minutes(double distanceInMinutes);
}
