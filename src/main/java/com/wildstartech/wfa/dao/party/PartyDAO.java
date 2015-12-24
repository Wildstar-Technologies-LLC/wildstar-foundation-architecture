package com.wildstartech.wfa.dao.party;

import com.wildstartech.wfa.dao.WildDAO;
import com.wildstartech.wfa.party.Party;

public interface PartyDAO extends WildDAO<Party, PersistentParty> {
  /**
   * Returns a reference to a <code>Party</code> with the specified name.
   * @param name The value to be used when searching the persistent datastore
   * for a particular <code>Party</code> instance.
   * @return An instance of the <code>Party</code> interface that is currently
   * assigned the name specified by the <code>name</code> parameter.
   */
  public Party findByName(String name);
}