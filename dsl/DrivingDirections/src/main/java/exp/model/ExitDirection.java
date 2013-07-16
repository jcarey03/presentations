package exp.model;

/**
 * An exit direction.
 */
public class ExitDirection extends Direction {

    private final String exit;

    public ExitDirection(final String exit, final String location, 
    		final double distanceInMiles, final double distanceInMinutes) {
        super(location, distanceInMiles, distanceInMinutes);
        this.exit = exit;
    }

    public String getExit() {
        return exit;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("exit at '")
              .append(exit)
              .append("' to merge onto '")
        	  .append(getLocation())
              .append("' in ")
              .append(getDistanceInMiles())
              .append(" miles or ")
              .append(getDistanceInMinutes())
              .append(" minutes");
        return result.toString();
    }

    /**
     * A builder for constructing exit directions.
     */
    public static class ExitDirectionBuilder implements DirectionBuilder {

        private String location;
        
        private double distanceInMiles;

        private double distanceInMinutes;

        private String exit;

        @Override
		public ExitDirection build() {
            return new ExitDirection(exit, location, distanceInMiles, distanceInMinutes);
        }

        public ExitDirectionBuilder exit(final String exit) {
            this.exit = exit;
            return this;
        }

        public ExitDirectionBuilder onto(final String location) {
            this.location = location;
            return this;
        }

        @Override
		public ExitDirectionBuilder in_miles(final double distanceInMiles) {
            this.distanceInMiles = distanceInMiles;
            return this;
        }

        @Override
		public ExitDirectionBuilder in_minutes(final double distanceInMinutes) {
            this.distanceInMinutes = distanceInMinutes;
            return this;
        }
    }
}