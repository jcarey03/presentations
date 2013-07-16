package exp.model;

/**
 * An arrival direction.
 */
public class ArrivalDirection extends Direction {

    public ArrivalDirection(final String location, final double distanceInMiles, 
    		final double distanceInMinutes) {
        super(location, distanceInMiles, distanceInMinutes);
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("arrive at destination '")
        	  .append(getLocation())
              .append("' in ")
              .append(getDistanceInMiles())
              .append(" miles or ")
              .append(getDistanceInMinutes())
              .append(" minutes");
        return result.toString();
    }
    
    /**
     * A builder for constructing arrival directions.
     */
    public static class ArrivalDirectionBuilder implements DirectionBuilder {

        private String location;

        private double distanceInMiles;

        private double distanceInMinutes;

        @Override
		public ArrivalDirection build() {
            return new ArrivalDirection(location, distanceInMiles, distanceInMinutes);
        }

        public ArrivalDirectionBuilder arrive(final String location) {
            this.location = location;
            return this;
        }
        
        @Override
		public ArrivalDirectionBuilder in_miles(final double distanceInMiles) {
            this.distanceInMiles = distanceInMiles;
            return this;
        }

        @Override
		public ArrivalDirectionBuilder in_minutes(final double distanceInMinutes) {
            this.distanceInMinutes = distanceInMinutes;
            return this;
        }
    }
}