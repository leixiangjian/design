package com.design.pattern.singleton.syn;

public class SingletonSyn {
	private static SingletonSyn demo;
	private SingletonSyn(){};
	public static synchronized SingletonSyn getInstance(){
		if(null == demo){
			demo = new SingletonSyn();
		}
		return demo;
	}
}
