package com.honsoft.web.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SpringContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Handling context re-freshed event. ");
		
		System.out.println(" beans count in applicationContext: "+event.getApplicationContext().getBeanDefinitionCount());
		
		String[] beanNames = event.getApplicationContext().getBeanDefinitionNames();
		for (String beanName : beanNames)
			System.out.println(beanName);
		
		if (event.getApplicationContext().getParent() != null)
			System.out.println(" beans count in parent applicationContext: "+event.getApplicationContext().getParent().getBeanDefinitionCount());
	}
}