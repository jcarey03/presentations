package exp.model;

/**
 * Types of turns.
 */
public enum TurnType {

   LEFT("left"),
   SHARP_LEFT("sharp left"),
   SLIGHT_LEFT("slight left"),
   RIGHT("right"),
   SHARP_RIGHT("sharp right"),
   SLIGHT_RIGHT("slight right"),
   U_TURN("U-turn");

   private final String displayLabel;

   TurnType(final String displayLabel) {
       this.displayLabel = displayLabel;
   }

   public String getDisplayLabel() {
       return displayLabel;
   }
   
   public static TurnType valueOfByDisplayLabel(final String displayLabel) {
	   for(final TurnType turnType : values()) {
		   if(turnType.getDisplayLabel().equals(displayLabel)) {
			   return turnType;
		   }
	   }
	   return null;
   }
}
