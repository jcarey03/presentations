package exp.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The state collected during script evaluation.
 */
public class ProgramState {

	private final Map<String, Double> variables = new HashMap<>();
	
	private final Map<String, Double> constants = new HashMap<>();
	
	private double evaluationResult = 0;
	
	public ProgramState(final Map<String, Double> constants) {
		// initialize constants
		if(constants != null) {
			for(final Map.Entry<String, Double> entry : constants.entrySet()) {
				if(entry.getValue() == null) {
					throw new IllegalArgumentException(String.format("Constant '%s' may not have null value.", entry.getKey()));
				}
				this.constants.put(entry.getKey(), entry.getValue());
			}
		}
	}
	
	/**
	 * Returns the value associated with the given variable identifier.
	 * 
	 * @param variable the variable identifier
	 * 
	 * @return the value
	 * 
	 * @throws UndeclaredVariableException if the variable has not been declared
	 */
	public double getValue(final String variable) throws UndeclaredVariableException {
		if(constants.containsKey(variable)) {
			return constants.get(variable);
		} else if(variables.containsKey(variable)) {
			return variables.get(variable);
		} else {
			throw new UndeclaredVariableException(String.format("Variable '%s' has not been declared.", variable));
		}
	}
	
	/**
	 * Declares the given variable with the given value.
	 * 
	 * @param variable the variable identifier
	 * @param value the value
	 * 
	 * @throws ExistingDeclarationException if the variable has already been declared
	 */
	public void declareVariable(final String variable, final double value) throws ExistingDeclarationException {
		if(constants.containsKey(variable)) {
			throw new ExistingDeclarationException(String.format("Variable '%s' conflicts with defined constants.", variable));
		} else if(variables.containsKey(variable)) {
			throw new ExistingDeclarationException(String.format("Variable '%s' is already defined.", variable));
		} else {
			variables.put(variable, value);
		}
	}

	/**
	 * Updates the value of the given variable.
	 * 
	 * @param variable the variable identifier
	 * @param value the new value
	 * 
	 * @throws UndeclaredVariableException if the variable has not been declared
	 */
	public void updateVariable(final String variable, final double value) throws UndeclaredVariableException {
		if(variables.containsKey(variable)) {
			variables.put(variable, value);
		} else {
			throw new UndeclaredVariableException(String.format("Variable '%s' has not been declared.", variable));
		}
	}
	
	public double getEvaluationResult() {
		return evaluationResult;
	}

	public void setEvaluationResult(final double evaluationResult) {
		this.evaluationResult = evaluationResult;
	}
 
}
