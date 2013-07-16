package exp.model;

/**
 * A turn direction.
 */
public class TurnDirection extends Direction {

    private final TurnType turnType;
    
    private final boolean tollroad;
    
    public TurnDirection(final TurnType turnType, final String location, final boolean tollroad, 
    		final double distanceInMiles, final double distanceInMinutes) {
        super(location, distanceInMiles, distanceInMinutes);
        this.turnType = turnType;
        this.tollroad = tollroad;
    }

    public TurnType getTurnType() {
        return turnType;
    }
    
    public boolean isTollroad() {
    	return tollroad;
    }
    
    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        if(TurnType.U_TURN != turnType) {
        	result.append("turn ");
        } 
        result.append(turnType.getDisplayLabel())
              .append(" onto ");
        if (isTollroad()) {
        	result.append("tollroad ");
        }
        result.append("'")
        	  .append(getLocation())
              .append("' in ")
              .append(getDistanceInMiles())
              .append(" miles or ")
              .append(getDistanceInMinutes())
              .append(" minutes");
        return result.toString();
    }

    /**
     * A builder for constructing turn directions.
     */
    public static class TurnDirectionBuilder implements DirectionBuilder {

        private String location;

        private double distanceInMiles;

        private double distanceInMinutes;

        private TurnType turnType;

        private boolean tollroad;
        
        @Override
		public TurnDirection build() {
            return new TurnDirection(turnType, location, tollroad, distanceInMiles, distanceInMinutes);
        }

        public TurnDirectionBuilder turn(final TurnType turnType) {
            this.turnType = turnType;
            return this;
        }

        public TurnDirectionBuilder onto(final String location) {
            this.location = location;
            return this;
        }

        public TurnDirectionBuilder tollroad() {
        	this.tollroad = true;
        	return this;
        }
        
        @Override
		public TurnDirectionBuilder in_miles(final double distanceInMiles) {
            this.distanceInMiles = distanceInMiles;
            return this;
        }

        @Override
		public TurnDirectionBuilder in_minutes(final double distanceInMinutes) {
            this.distanceInMinutes = distanceInMinutes;
            return this;
        }

    }
}