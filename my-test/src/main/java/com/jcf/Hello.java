package com.jcf;

import com.config.MyApplicationListener;

public class Hello {

	public MyApplicationListener getMyApplicationListener() {
		return myApplicationListener;
	}

	public void setMyApplicationListener(MyApplicationListener myApplicationListener) {
		this.myApplicationListener = myApplicationListener;
	}

	MyApplicationListener myApplicationListener;

	public void sayHello(){
		System.out.println(myApplicationListener);
		System.out.println("hello spring!!");
	}



}
