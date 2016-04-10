/*
 * Copyright (c) 2001 - 2016 Wildstar Technologies, LLC.
 *
 * This file is part of Wildstar Foundation Architecture.
 *
 * Wildstar Foundation Architecture is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * Wildstar Foundation Architecture is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Wildstar Foundation Architecture.  If not, see 
 * <http://www.gnu.org/licenses/>.
 * 
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the 
 * GNU General Public License cover the whole combination.
 * 
 * As a special exception, the copyright holders of this library give you 
 * permission to link this library with independent modules to produce an 
 * executable, regardless of the license terms of these independent modules, 
 * and to copy and distribute the resulting executable under terms of your 
 * choice, provided that you also meet, for each linked independent module, the
 * terms and conditions of the license of that module. An independent module is
 * a module which is not derived from or based on this library. If you modify 
 * this library, you may extend this exception to your version of the library, 
 * but you are not obliged to do so. If you do not wish to do so, delete this 
 * exception statement from your version.
 * 
 * If you need additional information or have any questions, please contact:
 *
 *      Wildstar Technologies, LLC.
 *      63 The Greenway Loop
 *      Panama City Beach, FL 32413
 *      USA
 *
 *      derek.berube@wildstartech.com
 *      www.wildstartech.com
 */
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
