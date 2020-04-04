package com.tkr.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {


	int count = 0;

	public MyEvent(Object source) {
		super(source);
		this.count++;
	}

}
