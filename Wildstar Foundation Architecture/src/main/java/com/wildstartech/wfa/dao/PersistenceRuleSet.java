package com.wildstartech.wfa.dao;

import com.wildstartech.wfa.dao.UserContext;
import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.dao.WildObject;
import com.wildstartech.wfa.rules.Result;

public interface PersistenceRuleSet<D extends WildDAO<T, W>, T, W extends WildObject> {

  /**
   * Returns a reference to the data access object used by this ruleset.
   * @return
   */
  public D getDAO();
  /**
   * Apply the registered rules against the specified <code>WildObject</code>.
   * @param ruleset The <code>RuleSet</code> context in which the rule is being
   * applied. 
   * @param ctx The <code>UserContext</code> that should be considered when 
   * applying the rule.
   * @param wildObject The target against which the rule will be applied.
   * @return
   */
  public Result<W> evaluate(UserContext ctx, W wildObject);
  
  /**
   * Registers the persistence rule with the <code>RuleSet</code>.
   * @param rule The rule that should be added as a member of the 
   * <code>RuleSet</code>.
   * @return Returns true if the rule was successfully registered with the 
   * <code>RuleSet</code>.
   */
  public boolean add(PersistenceRule<D, T, W> rule);
}