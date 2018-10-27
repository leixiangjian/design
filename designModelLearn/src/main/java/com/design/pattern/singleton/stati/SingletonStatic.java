package com.design.pattern.singleton.stati;


public class SingletonStatic {
	private static SingletonStatic demo = new SingletonStatic();
	private SingletonStatic(){};
	public static SingletonStatic getInstance(){
		return demo;
	}
}
