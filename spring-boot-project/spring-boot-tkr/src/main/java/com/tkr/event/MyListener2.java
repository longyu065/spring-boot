package com.tkr.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyListener2 {

	@EventListener
	@Order(3)
	public void li(MyEvent myEvent){
		System.out.println("-----2--------");
		System.out.println("------2---"+myEvent.count);
	}

}
