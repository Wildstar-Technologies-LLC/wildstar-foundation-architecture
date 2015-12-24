package com.wildstartech.wfa.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A <code>RuleSet</code> 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2014-02-22
 *
 * @param <K> The type of object against which the rule will be applied.
 */
public class RuleSet<K> {
	private static final String _CLASS=RuleSet.class.getName();
	private static final Logger logger=Logger.getLogger(_CLASS);
	
	private List<Rule<K>> rules=null;
	
	public RuleSet() {
		logger.entering(_CLASS,"RuleSet()");
		this.rules=new ArrayList<Rule<K>>();
		logger.exiting(_CLASS,"RuleSet()");
	}
	
	public void addRule(Rule<K> rule) {
		logger.entering(_CLASS,"addRule(Rule<K>)",rule);
		if (!this.rules.contains(rule)) {
			this.rules.add(rule);
		} else {
			// The rule is already present in the ruleset.
			logger.warning("The rule is already present in the ruleset");
		} // END if (!this.rules.contains(rule))
		logger.exiting(_CLASS,"addRule(Rule<K>)");
	}

	public void removeRule(Rule<K> rule) {
		logger.entering(_CLASS,"removeRule(Rule<K>)",rule);
		if (this.rules.contains(rule)) {
			this.rules.remove(rule);
		} else {
			// The rule is not present in the ruleset.
			logger.warning("The rule is not present in the ruleset");
		} // END if (this.rules.contains(rule))
		logger.exiting(_CLASS,"removeRule(Rule<K>)");		
	}

	/**
	 * Evaluates each of the <code>Rule<code> objects contained in the 
	 * <code>RuleSet</code> against the specified <code>K</code> object.
	 * 
	 * <p>If the object passed as a parameter to the <code>evaluate</code>
	 * method is <code>null</code> then none of the rules will be evaluated.</p>
	 */
	public Result evaluate(K object) {
		logger.entering(_CLASS,"evaluate(K)",object);
		Result result=null;;
		RuleException exception=null;
		
		result=new Result();
		if (object == null) {
			// The object passed to the RuleSet is null.
			exception = new RuleException(
					RuleException.Level.ERROR,
					"",
					"A null value was passed to the RuleSet.");
			result.addException(exception);
		} else {
			for (Rule<K> rule: this.rules) {
				try {
					rule.apply(object);
				} catch (RuleException ex) {
					logger.log(Level.INFO,"RuleException thrown.",ex);
					result.addException(ex);
				} // END try/catch
			} // END for (Rule<User> rule: this.rules)
		} // END if (object == null) 
		logger.exiting(_CLASS,"evaluate(K)",result);
		return result;
	}
}
