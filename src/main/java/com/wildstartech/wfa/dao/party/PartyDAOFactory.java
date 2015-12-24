package com.wildstartech.wfa.dao.party;

import com.wildstartech.wfa.dao.WildDAOFactory;
import com.wildstartech.wfa.party.Party;

/**
 * Used to return a concrete <code>PartyDAO</code> implementation.
 * @author Derek Berube, Wildstar Technologies, LLC.
 *
 */
public class PartyDAOFactory extends
    WildDAOFactory<PartyDAO, Party, PersistentParty> {
}