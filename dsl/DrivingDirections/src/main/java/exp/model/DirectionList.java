package exp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * An ordered list of directions.
 */
public class DirectionList {

    private final List<Direction> directions = new ArrayList<Direction>();

    public DirectionList() {}

    public void add(final Direction... directions) {
        this.directions.addAll(Arrays.asList(directions));
    }

    public void add(final DirectionBuilder... builders) {
        for(final DirectionBuilder builder : builders) {
            add(builder.build());
        }
    }

    /**
     * @return an unmodifiable list of directions
     */
    public List<Direction> getDirections() {
        return Collections.unmodifiableList(directions);
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        for(final Direction direction : getDirections()) {
            result.append(direction.toString()).append("\n");
        }
        return result.toString();
    }

}
