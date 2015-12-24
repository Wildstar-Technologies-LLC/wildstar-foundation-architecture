package com.wildstartech.wfa.relationship;

public interface Relationship<P,S> {
//***** primaryEntity
  public void setPrimaryEntity(P primary);
  public P getPrimaryEntity();

  //***** secondaryEntity
  public void setSecondaryEntity(S secondary);
  public S getSecondaryEntity();
}
