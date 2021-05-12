package com.sainttheana.pythonlike.environment;

public interface Environment
{
    public void put(String name, Object value);
	
	public Object get(String name);
	
	public void putNew(String name, Object value);
	
	public Environment where(String name);
	
	public void setOuter(Environment e);
}

