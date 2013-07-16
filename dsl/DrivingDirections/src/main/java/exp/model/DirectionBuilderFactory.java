package exp.model;

import exp.model.ArrivalDirection.ArrivalDirectionBuilder;
import exp.model.ExitDirection.ExitDirectionBuilder;
import exp.model.TurnDirection.TurnDirectionBuilder;

/**
 * A factory for building different types of directions.
 */
public class DirectionBuilderFactory {

	public static ExitDirectionBuilder exit(final String exit) {
        final ExitDirectionBuilder builder = new ExitDirectionBuilder();
        builder.exit(exit);
        return builder;
    }

    public static TurnDirectionBuilder turn(final TurnType turnType) {
        final TurnDirectionBuilder builder = new TurnDirectionBuilder();
        return builder.turn(turnType);
    }

    public static ArrivalDirectionBuilder arrive(final String location) {
        final ArrivalDirectionBuilder builder = new ArrivalDirectionBuilder();
        return builder.arrive(location);
    }

}

	
