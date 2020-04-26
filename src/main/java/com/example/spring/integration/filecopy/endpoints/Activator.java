package com.example.spring.integration.filecopy.endpoints;

public interface Activator<T> {
	
	public void handleMessage(T input);

}
