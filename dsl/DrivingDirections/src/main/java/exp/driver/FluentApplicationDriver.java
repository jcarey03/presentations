package exp.driver;

import static exp.model.DirectionBuilderFactory.arrive;
import static exp.model.DirectionBuilderFactory.exit;
import static exp.model.DirectionBuilderFactory.turn;
import static exp.model.TurnType.LEFT;
import static exp.model.TurnType.RIGHT;
import static exp.model.TurnType.SLIGHT_RIGHT;
import static exp.model.TurnType.U_TURN;
import exp.model.DirectionList;

public class FluentApplicationDriver {

    public static void main(final String... args) {

        final DirectionList directions = new DirectionList();

        directions.add(
            turn(LEFT).onto("374 Cardinal Lane").in_miles(2.3).in_minutes(4),
            turn(RIGHT).onto("Hwy 13").in_miles(9.4).in_minutes(11),
            turn(SLIGHT_RIGHT).onto("I-95").tollroad().in_miles(3.7).in_minutes(4),
            exit("10A").onto("Frontage Road").in_miles(60).in_minutes(55),
            turn(U_TURN).onto("13th Street").in_miles(.3).in_minutes(1),
            arrive("Burger King").in_miles(.2).in_minutes(4)
        );

        System.out.println(directions);
    }

}