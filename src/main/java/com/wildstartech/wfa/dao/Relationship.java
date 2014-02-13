package com.wildstartech.wfa.dao;


public interface Relationship extends WildObject {
	//***** primaryEntity
	public void setPrimaryEntity(WildObject primary);
	public WildObject getPrimaryEntity();

	//***** secondaryEntity
	public void setSecondaryEntity(WildObject secondary);
	public WildObject getSecondaryEntity();
}