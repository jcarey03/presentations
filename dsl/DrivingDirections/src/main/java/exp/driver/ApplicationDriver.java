package exp.driver;

import exp.model.ArrivalDirection;
import exp.model.DirectionList;
import exp.model.ExitDirection;
import exp.model.TurnDirection;
import exp.model.TurnType;

public class ApplicationDriver {

    public static void main(final String... args) {

        final DirectionList directions = new DirectionList();

        TurnDirection turnDirection;
        ExitDirection exitDirection;
        ArrivalDirection arrivalDirection;

        turnDirection = new TurnDirection(TurnType.LEFT, "11th Ave", false, 2.3, 4);
        directions.add(turnDirection);

        turnDirection = new  TurnDirection(TurnType.RIGHT, "Hwy 13", false, 9.4, 11);
        directions.add(turnDirection);

        turnDirection = new TurnDirection(TurnType.SLIGHT_RIGHT, "I-95",true, 3.7, 4);
        directions.add(turnDirection);

        exitDirection = new ExitDirection("10A", "Frontage Road", 60, 55);
        directions.add(exitDirection);

        turnDirection = new TurnDirection(TurnType.U_TURN, "13th Street", false, 0.3, 1);
        directions.add(turnDirection);

        arrivalDirection = new ArrivalDirection("Burger King", 0.2, 4);
        directions.add(arrivalDirection);

        System.out.println(directions);
    }

}