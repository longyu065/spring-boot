package com.tkr.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EventRegister  {

	@Autowired
	ApplicationContext applicationContext;

	public void register(){
		applicationContext.publishEvent(new MyEvent(this));
	}

}

