package com.tkr;

import com.tkr.event.EventRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	ApplicationContext applicationContext;
	public static void main(String[] args) {
		ConcurrentHashMap a = new ConcurrentHashMap();
		SpringApplication.run(App.class);
	}

	@Override
	public void run(String... args) throws Exception {
		EventRegister bean = this.applicationContext.getBean(EventRegister.class);
		bean.register();
		bean.register();
		bean.register();
		bean.register();
		bean.register();
	}
}
