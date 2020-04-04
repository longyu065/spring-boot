package com.tkr.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyListener  {

	@EventListener
	@Order(2)
	public void listen(MyEvent myEvent){
		System.out.println(myEvent.count);
		System.out.println("--触发了事件--");
	}
}
