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
package com.wildstartech.wfa;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PassphraseEncryptor {
   private static final String _CLASS=PassphraseEncryptor.class.getName();
   private static final Logger logger=Logger.getLogger(_CLASS);
   
   //***** Utility Methods
   /**
    * Take the key and convert it into a 128-bit key that can be 
    * used for encrypting/decrypting using the AES algorithm.
    * 
    * @param passphrase The passphrase to 
    * @return A 128-bit byte array containing the hash of the specified
    * passphrase.
    */
   private byte[] getKey(String passphrase) {
      logger.entering(_CLASS, "getKey(String)",passphrase);
      byte[] keyValue=null;
      MessageDigest md=null;
      
       if ((passphrase != null) && (!passphrase.isEmpty())) {
          // Cannot generate a key if the passphrase is empty.
          try {
             md=MessageDigest.getInstance("SHA-256");
             md.update(passphrase.getBytes());
             keyValue=md.digest();
          } catch (NoSuchAlgorithmException ex) {
             logger.log(Level.SEVERE, "Unable to Obtain Hashing Algorithm", ex);
          } // END try/catch
       } else {
          logger.severe("Passphrase is required.");          
       } // END if ((passphrase != null) && (!passphrase.isEmpty()))
      
      logger.exiting(_CLASS, "getKey(String)",keyValue);
      return keyValue;
   }
   /**
    * Encrypts the specified text using the specified passphrase.
    * 
    * @param passphrase The key to be used when encrypting the text.
    * @param clearText The text to be encrypted.
    * @return The encrypted text.
    */
   public String encrypt(String passphrase, String clearText) {
      logger.entering(_CLASS,"encrypt(String,String)", 
            new Object[] {passphrase,clearText});
      byte[] keyValue=null;
      String cipherText="";
      
      keyValue=getKey(passphrase);
      
      
      logger.exiting(_CLASS, "encrypt(String,String)",cipherText);
      return cipherText;
   }
   
   /**
    * Decrypts the specified cipherText using the specified key.
    * 
    * @param passphrase The key used to decrypt the encrypted text
    * @param cipherText The encrypted text that is to be decrypted
    * using the specified passphrase.
    * @return The decrypted text.
    */
   public String decrypt(String passphrase, String cipherText) {
      logger.entering(_CLASS,"decrypt(String,String)", 
            new Object[] {passphrase,cipherText});
      String clearText="";
      
      logger.exiting(_CLASS, "decrypt(String,String)",clearText);
      return clearText;
   }
}