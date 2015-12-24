package com.wildstartech.wfa.dto;

import java.util.Set;

public interface Entity {
   /**
    * Returns the name of the entity.
    * @return The label assigend to the entity expressed as a <code>String</code>. 
    */
   public String getName();
   public void setName(String name);
   
   /**
    * Returns the properties contained in this object.
    * @return 
    */
   public Set<Property> getProperties();
   /**
    * Returns the names of properties contained in this object.
    * @return 
    */
   public Set<String> getPropertyNames();
}
