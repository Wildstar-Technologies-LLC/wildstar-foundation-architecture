package com.wildstartech.wfa.party;

import com.wildstartech.wfa.WFAException;

/**
 * A party is either an individual or some other entity.
 * 
 * @author Derek Berube, Wildstar Technologies, LLC.
 * @version 0.1, 2015-01-05
 *
 */
public interface Party <T extends WFAException> {
  /** 
   * Returns the name or label that describes the party.
   */
  public void getName();
  /**
   * Sets the name or label that describes the party.
   * @param name The value to use as the label for the party.
   * @throws An exception if the specified name is too long.
   */
  public void setName(String name) throws T;
  
  /**
   * Indicates what type of <code>Party</code> the current object is.
   * @return The <code>Class</code> that represents the current party.
   */
  public Class<?> getType();
}
