/*
 * Copyright (c) 2001 - 2014 Wildstar Technologies, LLC.
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
package com.wildstartech.wfa.dao;

import java.util.logging.Logger;

public class UserContextDAOFactory 
extends WildDAOFactory<UserContextDAO,UserContext, UserContext> {
  private static final String _CLASS=UserContextDAOFactory.class.getName();
  private static final Logger logger=Logger.getLogger(_CLASS);
  
   /**
    * Provides a convenient mechanism for authenticating.
    * 
    * <p>The <code>authenticate(String,String)</code> method of the 
    * <code>UserContextDAOFactory</code> is a convenience method that allows 
    * users of the API to obtain an authenticated <code>UserContext</code>
    * with a minimum number of steps.  Without this method, users would have
    * to do something similar to the following to "log in".</p>
    * <pre>
    * UserContext ctx=null;
    * UserContextDAO dao=null;
    * UserContextDAOFactory factory=null;
    * 
    * factory=new UserContextDAOFactory();
    * dao=factory.getDAO();
    * ctx=dao.create();
    * ctx.setUserName("MyName");
    * ctx.setPassword("SecretPassword");
    * ctx.authenticate();
    * </pre>
    * <p>Rather than have to write the nine lines of code listed above, this
    * method allows users to obtain an authenticated <code>UserContext</code> in
    * four lines of code.</p>
    * <pre>
    * UserContext ctx=null;
    * UserContextDAOFactory factory=null;
    * 
    * factory=new UserContextDAOFactory();
    * ctx=factory.authenticate("MyName","SecretPassword");
    * </pre> 
    * 
    * @param name The user name that should be used when accessing the 
    * persistent datastore.
    * @param password The password for the account identified by the value 
    * passed to the name parameter.
    * @return An authenticated <code>UserContext</code> if the specified
    * credentials are valid.  Otherwise, a <code>null</code> value is returned.
    * @throws DAOException
    */
   public static UserContext authenticate(String name, String password) 
       throws DAOException {
     logger.entering(_CLASS,"authenticate(String,String",
         new Object[] {name,password});
     boolean authenticated=false;
     String msg=null;
     UserContext ctx=null;
     UserContextDAO dao=null;
     UserContextDAOFactory factory=null;
     
     factory=new UserContextDAOFactory();
     dao=factory.getDAO();
     if ((name != null) && (name.length() > 0)) {
       ctx=dao.create();
       ctx.setUserName(name);
       ctx.setPassword(password);
       authenticated=ctx.authenticate();
       if (!authenticated) {
         msg="Authentication failed.";
         logger.severe(msg);
         ctx=null;
         throw new AuthenticationException("Authentication failed.");
       }
     } else {
       msg="The username was null or blank.";
       logger.severe(msg);
       throw new AuthenticationException("The username was null or blank.");
     }
     logger.exiting(_CLASS, "authenticate(String,String)",ctx);
     return ctx;
   }
}
