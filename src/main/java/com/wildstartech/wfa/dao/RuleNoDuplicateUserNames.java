package com.wildstartech.wfa.dao;

import java.util.logging.Logger;

import com.wildstartech.wfa.rules.Rule;
import com.wildstartech.wfa.rules.RuleException;

public class RuleNoDuplicateUserNames implements Rule<PersistentUser> {
  private static final String _CLASS=RuleNoDuplicateUserNames.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
  @Override
  public PersistentUser apply(PersistentUser user) {
    logger.entering(_CLASS,"apply(User)",user);
    PersistentUser updatedUser=null;
    UserDAO dao=null;
    String msg=null;
    
    if (user != null) {
      dao=new UserDAOFactory().getDAO();      
    } else {
      msg="User parameter object is null.";
      logger.warning(msg);
      throw new RuleException(
          RuleException.Level.ERROR,
          "userName",
          "User parameter object is null.");
    } // END if (user != null)
    logger.exiting(_CLASS,"apply(User)",updatedUser);
    return updatedUser;
  }

}
