package exceptionHandling;

public class ErrorDemo {
	public void findA() {
		findB();
	}
    public void findB() {
    	findA();
    }
}
