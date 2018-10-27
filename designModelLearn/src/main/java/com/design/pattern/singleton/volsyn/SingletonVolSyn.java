package com.design.pattern.singleton.volsyn;


public class SingletonVolSyn {
	private static volatile SingletonVolSyn demo;
	private SingletonVolSyn(){};
	public static SingletonVolSyn getInstance(){
		if(null == demo){
			synchronized(SingletonVolSyn.class){
				demo = new SingletonVolSyn();
			}
		}
		return demo;
	}
}
